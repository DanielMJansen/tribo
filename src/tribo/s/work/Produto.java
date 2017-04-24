package tribo;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String nome, codigo;
    private Float preco;
    private boolean vendacontrolada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isVendacontrolada() {
        return vendacontrolada;
    }

    public void setVendacontrolada(boolean vendacontrolada) {
        this.vendacontrolada = vendacontrolada;
    }

    public void CadastraProduto(ArrayList<Produto> produtos) {

        nome = Util.pedeStringNaoVazia("Qual o nome do produto? (diferente de vazio).");
        preco = Util.PedePrecoMaiorQueZero("Qual o preço do produto? (maior que 0).");
        codigo = Util.pedeStringNaoVazia("Qual o código do produto? (diferente de vazio).");
        System.out.println("Se for medicamento, é necessário receita? Digite true para sim e false para não");
        vendacontrolada = new Scanner(System.in).nextBoolean();
        produtos.add(this);
        System.out.println("Produto cadastrado com sucesso.");
    }

}

