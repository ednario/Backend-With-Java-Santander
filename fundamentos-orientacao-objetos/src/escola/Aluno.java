package escola;

public class Aluno {
	String nome;
	int idade;

   protected void setNome(String nome) {
    if (nome == "") {
      throw new IllegalArgumentException("O nome deve ser informado");
    }
    this.nome = nome;
  }

  protected String getNome() {
    return nome;
  }

  protected void setIdade(int idade) {
    if (idade < 18) {
      throw new IllegalArgumentException("Voce tem que ser maior de idade");
    }
    this.idade = idade;
  }

  protected int getIdade() {
    return idade;
  }

}
