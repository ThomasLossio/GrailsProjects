package helloworld

class JSON {

	String nome, email;
	Date dataDeNascimento;
	int numeroDaSorte
    static constraints = {
    	nome size: 3..15, blank:false, unique: true
    }
}
