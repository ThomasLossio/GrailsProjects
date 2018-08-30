package helloworld

import helloworld.Cliente
import grails.converters.JSON

class JSONController {

	def listatudo() {
			render Cliente.list() as JSON			
	}

	def listaporid() {
		try {
			def c = Cliente.get(params.id)

			if (c != null){
				render c as JSON			
			}
			
		}
		catch(Exception e) {
			
		}
		finally {
			render ('ID / Parametro nao reconhecido')
		}
		

	}

	def listapornome() {
		def c = Cliente.findByNome(params.nome)

		if(c!=null){
			render c as JSON

		} else {
			render ('Nome/Parametro nao encontrado')
		}
		
//		if (c != null){
//			render c as JSON			
//		} else {
//			render('Não existe');
//		}
	}	

	def create(){
		
		def c = new Cliente(params);
		c.save()

		render('Salvo!')
		
		//render('Oi ' + params.nome)
		//render('Oi ' + params.email)
		//render('Oi ' + params.numeroDaSorte)

	}

	def remove(){
		
	}

    def index() { 


    	render Cliente.list() as JSON

//    	render(view:"json", model: [clientes: lista])

    }
}
