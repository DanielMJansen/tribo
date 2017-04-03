package tribo.s.work;

import java.util.Scanner;
import java.util.ArrayList;

public class tribo {

    private ArrayList<Funcionario> funcionarios;

    void montaListaFuncionarios() {
        funcionarios = new ArrayList();
        funcionarios.add(new Funcionario("usuario1", "senha1"));
        funcionarios.add(new Funcionario("usuario2", "senha2"));
        funcionarios.add(new Funcionario("usuario3", "senha3"));
        funcionarios.add(new Gerente("admin1", "admin1"));

    }

    Funcionario autenticaFuncionario() {
        Scanner console = new Scanner(System.in);

        System.out.println("Digite o nome de usuário:");
        String nome = console.nextLine();
        System.out.println("Digite a senha do usuário:");
        String senha = console.nextLine();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.logar(nome, senha)) {
                return funcionario;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        tribo x = new tribo();
        x.montaListaFuncionarios();
        Funcionario usuario = x.autenticaFuncionario();
        while (usuario == null) {
            System.out.println("Funcionario e/ou senha não existem :(");
            usuario = x.autenticaFuncionario();
        }
        System.out.println("O que você deseja fazer?" + usuario.getLogin());
        int escolha = 0;
        do {
            if (usuario.getPermissaoCadastra()) {
                System.out.println("1 - Cadastrar produto.");
            }
            if (usuario.getPermissaoCadastraCliente()) {
                System.out.println("2 - Cadastrar cliente.");
            }
            if (usuario.getPermissaoRemove()) {
                System.out.println("3 - Remover produtos.");
            }
            if (usuario.getPermissaoRemoveFuncionario()) {
                System.out.println("4 - Remover funcionário.");
            }
            if (usuario.getPermissaoVenda()) {
                System.out.println("5 - Vender produto.");
            }
            if (usuario.getPermissaoConsultaPreco()) {
                System.out.println("6 - Consultar preço de produto.");
            }
            if (usuario.getPermissaoCriaLogin()) {
                System.out.println("7 - Criar login de novo funcionário/gerente.");     
            }
            System.out.println("8 - Sair do programa.");
        
        }while (escolha != 8);
        
    }
    }
   
