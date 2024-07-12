package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProtudos {
  private Map<Integer, Produto> produtos;

  public EstoqueProtudos() {
    this.produtos = new HashMap<>();
  }

  public void adicionarProduto(Produto produto, int quantidade) {
    produtos.put(quantidade, produto);
  }

  public void exibirProdutos() {
    for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
      System.out.println(entry.getKey() + " - Quantidade: " + entry.getValue());
    }
  }

  public double calculaValorTotalEstoque() {
    double total = 0;

    if (!produtos.isEmpty()) {
      for (Produto p : produtos.values()) {
        total += p.getPreco() * p.getQuantidade();
      }
      return total;
    }
    return total;
  }

  public Produto obterProdutoMaisCaro() {
    Produto maisCaro = null;
    double maiorPreco = 0;
    
    if (!produtos.isEmpty()) {
      for (Produto p : produtos.values()) {
        if (p.getPreco() > maiorPreco) {
          maiorPreco = p.getPreco();
          maisCaro = p;
        }
      }
    } 
    return maisCaro;
  }

  public static void main(String[] args) {
    Produto p1 = new Produto("Arroz", 5.0, 10);
    Produto p2 = new Produto("Feijão", 7.0, 5);
    Produto p3 = new Produto("Macarrão", 3.0, 15);

    EstoqueProtudos estoque = new EstoqueProtudos();
    estoque.adicionarProduto(p1, 10);
    estoque.adicionarProduto(p2, 5);
    estoque.adicionarProduto(p3, 15);

    estoque.exibirProdutos();
    System.out.println("Valor total do estoque: " + estoque.calculaValorTotalEstoque());
    System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
  }
}
