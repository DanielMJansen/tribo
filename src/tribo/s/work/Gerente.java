package tribo;

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
}
