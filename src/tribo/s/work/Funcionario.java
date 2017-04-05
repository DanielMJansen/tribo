package tribo;

public class Funcionario implements ControlaPermissao {

    private String login, senha;

    public String getLogin() {
        return this.login;
    }

    public Funcionario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    @Override
    public boolean getPermissaoVenda() {
        return true;
    }

    @Override
    public boolean getPermissaoCadastraCliente() {
        return true;
    }

    @Override
    public boolean getPermissaoRemoveFuncionario() {
        return false;
    }

    @Override
    public boolean getPermissaoConsultaPreco() {
        return true;
    }

    @Override
    public boolean getPermissaoCadastra() {
        return false;
    }

    @Override
    public boolean getPermissaoRemove() {
        return false;
    }

    @Override
    public boolean getPermissaoCriaLogin() {
        return false;
    }

    boolean logar(String login, String senha) {
        return this.login.equals(login)
                && this.senha.equals(senha);
    }
}
