package candidatura;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    analizarCandidato(1900.0);
    analizarCandidato(2000.0);
    analizarCandidato(2100.0);
    selecaoDeCandidatos();
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
