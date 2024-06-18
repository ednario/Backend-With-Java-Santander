package candidatura;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    imprimirSelecionados();
  }

  static void imprimirSelecionados () {
    String [] candidatos = {"João", "Maria", "Pedro", "Augusto", "Antonio"};

    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for (int i = 0; i < candidatos.length; i++) {
      System.out.println("O candidato de n " + (i + 1) + " é " + candidatos[i]);
    }

    System.out.println("Forma alternativa de imprimir a lista de candidatos");

    for (String candidato: candidatos) {
      System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
    }
  }

  static void selecaoDeCandidatos () {
    String [] candidatos = {"João", "Maria", "Pedro", "Augusto", "Antonio", "Febrero", "Miguel", "Março", "Cristiano", "Rafael"};

    int candidatosSelecionados = 0;
    int candidatoAtual = 0; 
    double salarioBase = 2000.0;

    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " pretende o salaírio de R$" + salarioPretendido + ".");

      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }
  
  static double valorPretendido () {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analizarCandidato (double salarioPretendido) {
    double salarioBase = 2000.0;

    if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA CANDIDATO");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA CANDIDATO E APRESENTAR CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS");
    }
  }
}
