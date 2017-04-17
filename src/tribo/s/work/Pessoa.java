package tribo;

import java.util.Scanner;

public class Pessoa {

    String nome;
    String endereco;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public Scanner getLeia() {
        return leia;
    }

    String telefone;
    String cpf;
    Scanner leia = new Scanner(System.in);



}
