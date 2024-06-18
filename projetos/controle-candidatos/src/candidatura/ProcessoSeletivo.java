package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String [] candidatos = {"João", "Maria", "Pedro", "Augusto", "Antonio"};
    for (String candidato: candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato (String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando) {
        tentativasRealizadas++;
      } else {
        System.out.println("Contato realizado com sucesso");
      }
    } while (continuarTentando && tentativasRealizadas < 3);

    if (atendeu) {
      System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "° TENTATIVA");
    } else {
      System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato);
    }
  }

  static boolean atender() {
    return new Random().nextInt(3)==1;
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
