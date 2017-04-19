package tribo;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean getPermissaoVenda() {
        return false;
    }

    @Override
    public boolean getPermissaoRemoveFuncionario() {
        return true;
    }

    @Override
    public boolean getPermissaoConsultaPreco() {
        return false;
    }

    @Override
    public boolean getPermissaoCadastraCliente() {
        return false;
    }

    @Override
    public boolean getPermissaoCadastra() {
        return true;
    }

    @Override
    public boolean getPermissaoRemove() {
        return true;
    }

    @Override
    public boolean getPermissaoCriaLogin() {
        return true;
    }

    public void CadastraFuncionario(ArrayList<Funcionario> funcionarios) {
        String leia;
        do {
            leia = Util.pedeStringNaoVazia("Você deseja criar o login de um funcionário simples(1) ou um gerente(2)?");
        } while (!leia.equals("1") && !leia.equals("2"));
        
        String login = Util.pedeStringNaoVazia("Digite o login do funcionário/gerente");
        String senha = Util.pedeStringNaoVazia("Digite a senha do funcionário/gerente");
        
        if (leia == "1") {
            funcionarios.add(new Funcionario(login, senha));
        } else if (leia == "2") {
            funcionarios.add(new Gerente(login, senha));
        } else {
            System.out.println("Mensagem inserida incorreta, tente novamente.");
        }
    }

}
