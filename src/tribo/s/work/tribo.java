package tribo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

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
        Scanner leia = new Scanner(System.in);
        Funcionario usuario = x.autenticaFuncionario();
        while (usuario == null) {
            System.out.println("Funcionario e/ou senha não existem :(");
            usuario = x.autenticaFuncionario();
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

                        } else {
                            System.out.println("Você não tem permissão para cadastrar produto.");
                        }
                        break;
                    }
                    case 2: {
                        if (usuario.getPermissaoCadastraCliente()) {
                            System.out.println("Cadastrando cliente.");
                        } else {
                            System.out.println("Você não tem permissão para cadastrar cliente.");
                        }
                        break;
                    }
                    case 3: {
                        if (usuario.getPermissaoRemove()) {
                            System.out.println("Removendo produto.");
                        } else {
                            System.out.println("Você não tem permissão para remover produto.");
                        }
                        break;
                    }
                    case 4: {
                        if (usuario.getPermissaoCriaLogin()) {
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
                }

            }
            while (escolha != 8);
        }
    
    }
