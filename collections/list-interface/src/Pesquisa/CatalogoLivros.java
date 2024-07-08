package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  // atributos
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    Livro livro = new Livro(titulo, autor, anoPublicacao);
    livroList.add(livro);
  }

  public List<Livro> pesquisarPorAutor(String autor) {
   List<Livro> livrosPorAutor = new ArrayList<>();
   if(!livroList.isEmpty()){
    for (Livro livro : livroList) {
      if (livro.getAutor().equals(autor)) {
        livrosPorAutor.add(livro);
      }
    }
   }
   return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if(!livroList.isEmpty()){
      for (Livro livro : livroList) {
        if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
          livrosPorIntervaloAnos.add(livro);
        }
      }
    }
    return livrosPorIntervaloAnos;
  }

  public String pesquisarPorTitulo(String titulo) {
    String resultado = "";
    if(!livroList.isEmpty()){
      for (Livro livro : livroList) {
        if (livro.getTitulo().equals(titulo)) {
          resultado = livro.toString();
          break;
        }
      }
    }
    return resultado;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros();
    catalogo.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
    catalogo.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
    catalogo.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
    catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
    catalogo.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
    
    System.out.println(catalogo.pesquisarPorAutor("J. R. R. Tolkien"));
    System.out.println(catalogo.pesquisarPorIntervaloAnos(1900, 1950));
    System.out.println(catalogo.pesquisarPorTitulo("O Pequeno Príncipe"));
  }
}
