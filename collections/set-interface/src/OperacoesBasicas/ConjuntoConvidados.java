package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(Convidado convidado) {
    convidadosSet.add(convidado);
    System.out.println("Convidado " + convidado.getNome() + " adicionado com sucesso.");
  }

  public void removerConvidado(int codigoConvite) {
    if (!convidadosSet.isEmpty()) {
      for (Convidado convidado : convidadosSet) {
        if (convidado.getCodigoConvite() == codigoConvite) {
          convidadosSet.remove(convidado);
          System.out.println("Convidado " + convidado.getNome() +  " removido com sucesso.");
          break;
        }
      }
    } else {
      System.out.println("Não há convidados na lista.");
    }
  }

  public void contarConvidados() {
    System.out.println("Número de convidados: " + convidadosSet.size());
  }

  public void listarConvidados() {
    if (!convidadosSet.isEmpty()) {
      for (Convidado convidado : convidadosSet) {
        System.out.println(convidado);
      }
    } else {
      System.out.println("Não há convidados na lista.");
    }
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    Convidado convidado1 = new Convidado("João", 1);
    Convidado convidado2 = new Convidado("Maria", 2);
    Convidado convidado3 = new Convidado("José", 3);
    Convidado convidado4 = new Convidado("Ana", 4);
    Convidado convidado5 = new Convidado("Carlos", 4);

    conjuntoConvidados.adicionarConvidado(convidado1);
    conjuntoConvidados.adicionarConvidado(convidado2);
    conjuntoConvidados.adicionarConvidado(convidado3);
    conjuntoConvidados.adicionarConvidado(convidado4);
    conjuntoConvidados.adicionarConvidado(convidado5);

    conjuntoConvidados.contarConvidados();
    conjuntoConvidados.listarConvidados();

    conjuntoConvidados.removerConvidado(3);
    conjuntoConvidados.removerConvidado(5);

    conjuntoConvidados.contarConvidados();
    conjuntoConvidados.listarConvidados();
  }
}
