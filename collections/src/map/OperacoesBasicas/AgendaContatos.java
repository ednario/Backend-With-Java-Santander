package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContato;

  public AgendaContatos() {
    this.agendaContato = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer numero) {
    this.agendaContato.put(nome, numero);
    System.out.println("Contato " + nome + " adicionado com sucesso.");
  }

  public void removerContato(String nome) {
    if(!agendaContato.isEmpty()) {
      this.agendaContato.remove(nome);
      System.out.println("Contato " + nome + " removido com sucesso.");
    } else {
      System.out.println("Agenda de contatos vazia.");
    }
  }

  public void listarContatos() {
    for(Map.Entry<String, Integer> contato : agendaContato.entrySet()) {
      System.out.println("Nome: " + contato.getKey() + " - Telefone: " + contato.getValue());
    }
  }

  public void buscarContato(String nome) {
    if(agendaContato.containsKey(nome)) {
      System.out.println("Pesquisa por Nome: " + nome + " - Telefone: " + agendaContato.get(nome));
    } else {
      System.out.println("Contato não encontrado.");
    }
  }

  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();

    agenda.adicionarContato("João", 123456789);
    agenda.adicionarContato("Maria", 987654321);
    agenda.adicionarContato("José", 456789123);

    agenda.listarContatos();

    agenda.removerContato("Maria");

    agenda.listarContatos();

    agenda.buscarContato("José");
  }
}
