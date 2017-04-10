package tribo;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {
public String nome;
public Float preco;
public int codigo;
public boolean vendacontrolada;
String[] produtos = new String[300];
Scanner leia = new Scanner(System.in);

public String CadastraProduto(){ 
    System.out.println("Qual o nome do produto? (diferente de vazio).");   
    nome = leia.nextLine();
    System.out.println("Qual o preço do produto? (maior que 0).");
    preco = leia.nextFloat();
    System.out.println("Qual o código do produto? (diferente de vazio).");
    codigo = leia.nextInt();
    System.out.println("Se for medicamento, é necessário receita?");
    vendacontrolada = leia.nextBoolean();
    
    
    
}   
}
