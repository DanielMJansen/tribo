package tribo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class tribo {

    private static ArrayList<Funcionario> funcionarios = new ArrayList();
    private ArrayList<Produto> produtos = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();

    void montaListaFuncionarios() {
        funcionarios.add(new Funcionario("bob", "esponja"));
        funcionarios.add(new Gerente("Duda", "1"));
        funcionarios.add(new Gerente("Dani", "2"));
        funcionarios.add(new Gerente("Nath", "3"));
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

    public void iniciar() {
        Scanner leia = new Scanner(System.in);
        Funcionario usuario = autenticaFuncionario();
        while (usuario == null) {
            System.out.println("Funcionario e/ou senha não existem :(");
            usuario = autenticaFuncionario();
        }

        System.out.println("O que você deseja fazer? " + usuario.getLogin());
        int escolha = 0;
        do {
            try {
                //chamada da permissão para cadastrar produtos            
                if (usuario.getPermissaoCadastra()) {
                    System.out.println("1 - Cadastrar produto.");
                }
                //chamada da permissão para cadastrar clientes com receita          
                if (usuario.getPermissaoCadastraCliente()) {
                    System.out.println("2 - Cadastrar cliente.");
                }
                //chamada da permissão para remover produtos          
                if (usuario.getPermissaoRemove()) {
                    System.out.println("3 - Remover produtos.");
                }
                //chamada da permissão para cadastrar funcionário/gerente
                if (usuario.getPermissaoCriaLogin()) {
                    System.out.println("4 - Criar login de novo funcionário/gerente.");
                }
                //chamada da permissão para remover funcionários          
                if (usuario.getPermissaoRemoveFuncionario()) {
                    System.out.println("5 - Remover funcionário.");
                }
                //chamada da permissão para vender produtos
                if (usuario.getPermissaoVenda()) {
                    System.out.println("6 - Vender produto.");
                }
                //chamada da permissão para consultar preço do produto      
                if (usuario.getPermissaoConsultaPreco()) {
                    System.out.println("7 - Consultar preço de produto.");
                }
                System.out.println("8 - Sair do programa.");

                escolha = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Você digitou algo incompatível."
                        + "Tente usando um dos números da lista:");
                //leia.nextInt();
            }
            if (escolha < 1 || escolha > 8) {
                System.out.println("O valor informado está fora da faixa de números, escolha 1 à 8.");
            }
            switch (escolha) {
                case 1: {
                    if (usuario.getPermissaoCadastra()) {
                        System.out.println("Cadastrando produto.");
                        Produto novoProduto = new Produto();
                        novoProduto.CadastraProduto(produtos);
                    } else {
                        System.out.println("Você não tem permissão para cadastrar produto.");
                    }
                    break;
                }
                case 2: {
                    if (usuario.getPermissaoCadastraCliente()) {
                        System.out.println("Cadastrando cliente.");
                        Cliente novoCliente = new Cliente();
                        novoCliente.CadastraCliente(clientes);
                    } else {
                        System.out.println("Você não tem permissão para cadastrar cliente.");
                    }
                    break;
                }
                case 3: {
package tribo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class tribo {

    private static ArrayList<Funcionario> funcionarios = new ArrayList();
    private ArrayList<Produto> produtos = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();

    void montaListaFuncionarios() {
        funcionarios.add(new Funcionario("bob", "esponja"));
        funcionarios.add(new Gerente("Duda", "1"));
        funcionarios.add(new Gerente("Dani", "2"));
        funcionarios.add(new Gerente("Nath", "3"));
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

    public void iniciar() {
        Scanner leia = new Scanner(System.in);
        Funcionario usuario = autenticaFuncionario();
        while (usuario == null) {
            System.out.println("Funcionario e/ou senha não existem :(");
            usuario = autenticaFuncionario();
        }

        System.out.println("O que você deseja fazer? " + usuario.getLogin());
        int escolha = 0;
        do {
            try {
                //chamada da permissão para cadastrar produtos            
                if (usuario.getPermissaoCadastra()) {
                    System.out.println("1 - Cadastrar produto.");
                }
                //chamada da permissão para cadastrar clientes com receita          
                if (usuario.getPermissaoCadastraCliente()) {
                    System.out.println("2 - Cadastrar cliente.");
                }
                //chamada da permissão para remover produtos          
                if (usuario.getPermissaoRemove()) {
                    System.out.println("3 - Remover produtos.");
                }
                //chamada da permissão para cadastrar funcionário/gerente
                if (usuario.getPermissaoCriaLogin()) {
                    System.out.println("4 - Criar login de novo funcionário/gerente.");
                }
                //chamada da permissão para remover funcionários          
                if (usuario.getPermissaoRemoveFuncionario()) {
                    System.out.println("5 - Remover funcionário.");
                }
                //chamada da permissão para vender produtos
                if (usuario.getPermissaoVenda()) {
                    System.out.println("6 - Vender produto.");
                }
                //chamada da permissão para consultar preço do produto      
                if (usuario.getPermissaoConsultaPreco()) {
                    System.out.println("7 - Consultar preço de produto.");
                }
                System.out.println("8 - Sair do programa.");

                escolha = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Você digitou algo incompatível."
                        + "Tente usando um dos números da lista:");
                //leia.nextInt();
            }
            if (escolha < 1 || escolha > 9) {
                System.out.println("O valor informado está fora da faixa de números, escolha 1 à 8.");
            }
            switch (escolha) {
                case 1: {
                    if (usuario.getPermissaoCadastra()) {
                        System.out.println("Cadastrando produto.");
                        Produto novoProduto = new Produto();
                        novoProduto.CadastraProduto(produtos);
                    } else {
                        System.out.println("Você não tem permissão para cadastrar produto.");
                    }
                    break;
                }
                case 2: {
                    if (usuario.getPermissaoCadastraCliente()) {
                        System.out.println("Cadastrando cliente.");
                        Cliente novoCliente = new Cliente();
                        novoCliente.CadastraCliente(clientes);
                    } else {
                        System.out.println("Você não tem permissão para cadastrar cliente.");
                    }
                    break;
                }
                case 3: {
                    if (usuario.getPermissaoRemove()) {
                        System.out.println("Removendo produto.");
                        String resposta = Util.pedeStringNaoVazia("Qual produto você deseja remover?");
                        if (resposta.equals("bob"))
                            produtos.remove("bob");
                    } else {
                        System.out.println("Você não tem permissão para remover produto.");
                    }
                    break;
                }
                case 4: {
                    if (usuario.getPermissaoCriaLogin()) {
                        // cast?
                        if (Gerente.class.isInstance(usuario)) {
                            ((Gerente) usuario).CadastraFuncionario(funcionarios);
                        }
                        System.out.println("Criando login para funcionário/gerente.");
                    } else {
                        System.out.println("Você não tem permissão para criar login.");
                    }
                    break;
                }
                case 5: {
                    if (usuario.getPermissaoRemoveFuncionario()) {
                        System.out.println("Removendo funcionário/gerente.");
                    } else {
                        System.out.println("Você não tem permissão para remover funcionário e ou gerente.");
                    }
                    break;
                }
                case 6: {
                    if (usuario.getPermissaoVenda()) {
                        System.out.println("Vendendo produto.");
                    } else {
                        System.out.println("Você não tem permissão para vender produto.");
                    }
                    break;
                }
                case 7: {
                    if (usuario.getPermissaoConsultaPreco()) {
                        System.out.println("Consultando preços.");
                    } else {
                        System.out.println("Você não tem permissão para consultar preços.");
                    }
                    break;
                }
                case 9: {
                    for(Produto pro : produtos) {
                        pro.getNome();
                        pro.getPreco();
                        pro.getCodigo();
                        System.out.println("O nome do produto é" + " " + pro.getNome());
                        System.out.println(pro.getPreco() +" " + "Reais");
                        System.out.println("O codigo do produto é" + " " + pro.getCodigo());
                    }
                    
                }
            }

        } while (escolha != 8);
    }

    public static void main(String[] args) {
        tribo x = new tribo();
        x.montaListaFuncionarios();
        x.iniciar();
    }

}

