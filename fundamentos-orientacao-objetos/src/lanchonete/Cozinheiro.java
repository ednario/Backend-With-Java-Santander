package lanchonete;

public class Cozinheiro {
  private String nome;
  private int idade;

  // Construtor
  public Cozinheiro(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
  }

  // Método para preparar uma refeição
  public void prepararRefeicao(String prato) {
      System.out.println(nome + " está preparando um delicioso " + prato);
  }

  // Método para verificar a disponibilidade de ingredientes
  public boolean verificarIngredientes(String ingrediente) {
      // Lógica para verificar se o ingrediente está disponível
      // (simulando com um retorno aleatório)
      return Math.random() < 0.5;
  }

  // Método para lavar os utensílios de cozinha
  public void lavarUtensilios() {
      System.out.println(nome + " está lavando os utensílios de cozinha.");
  }

  // Método principal para testar a classe
  public static void main(String[] args) {
      Cozinheiro chef = new Cozinheiro("Gordon Ramsay", 45);
      chef.prepararRefeicao("Risoto de cogumelos");
      boolean temIngredientes = chef.verificarIngredientes("cogumelos");
      if (temIngredientes) {
          System.out.println("Os ingredientes estão disponíveis!");
      } else {
          System.out.println("Está faltando algum ingrediente.");
      }
      chef.lavarUtensilios();
  }
}
