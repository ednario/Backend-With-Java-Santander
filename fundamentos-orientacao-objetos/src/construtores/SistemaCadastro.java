package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("Marcos", "123456789", "RUA DAS MARIAS");
		
		//definimos o endereço de marcos
		// marcos.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?

    // marcos.setNome("Marcos");
    // marcos.setCpf("123456789");
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereco());
	}
}
