package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
  private Set<Produto> produtosSet;

  public CadastroProduto() {
    this.produtosSet = new HashSet<>();
  }

  public void adicionarProduto(Produto produto) {
    produtosSet.add(produto);
    System.out.println("Produto adicionado: " + produto);
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosOrdenados = new TreeSet<>(produtosSet);
    System.out.println("Produtos ordenados por nome: " + produtosOrdenados);
    return produtosOrdenados;
  }

  public Set<Produto> exibirPorPreco() {
    Set<Produto> produtosOrdenados = new TreeSet<>(new ComparatorPorPreco());
    produtosOrdenados.addAll(produtosSet);
    System.out.println("Produtos ordenados por preço: " + produtosOrdenados);
    return produtosOrdenados;
  }

  public static void main(String[] args) {
    CadastroProduto cadastro = new CadastroProduto();
    cadastro.adicionarProduto(new Produto(1, "Notebook", 2500.0, 10));
    cadastro.adicionarProduto(new Produto(2, "Smartphone", 1500.0, 20));
    cadastro.adicionarProduto(new Produto(3, "Tablet", 1200.0, 15));
    cadastro.adicionarProduto(new Produto(4, "Smartwatch", 800.0, 5));
    cadastro.adicionarProduto(new Produto(5, "Smart TV", 3500.0, 8));
    cadastro.exibirProdutosPorNome();
    cadastro.exibirPorPreco();
  }
}
