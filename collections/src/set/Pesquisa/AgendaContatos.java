package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(Contato contato) {
    contatosSet.add(contato);
    System.out.println("Contato adicionado: " + contato);
  }

  public void exibirContatos() {
    for (Contato contato : contatosSet) {
      System.out.println(contato);
    }
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosEncontrados = new HashSet<>();
    for (Contato contato : contatosSet) {
      if (contato.getNome().startsWith(nome)) {
        contatosEncontrados.add(contato);
      }
    }
    System.out.println("Contatos encontrados: " + contatosEncontrados.size());
    return contatosEncontrados;
  }

  public void atualizarNumeroContato(String nome, int telefone) {
    Contato contatoAtualizado = null;

    for (Contato contato : contatosSet) {
      if (contato.getNome().equalsIgnoreCase(nome)) {
        contato.setTelefone(telefone);
        contatoAtualizado = contato;
        System.out.println("Contato atualizado: " + contatoAtualizado);
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();

    Contato contato1 = new Contato("João", 123456789);
    Contato contato2 = new Contato("Maria", 987654321);
    Contato contato3 = new Contato("José", 456789123);

    agenda.adicionarContato(contato1);
    agenda.adicionarContato(contato2);
    agenda.adicionarContato(contato3);

    agenda.exibirContatos();

    agenda.pesquisarPorNome("Jo");
    agenda.pesquisarPorNome("Ma");

    agenda.atualizarNumeroContato("João", 987654321);
    agenda.exibirContatos();
  }
}
