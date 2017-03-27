
package tribo.s.work;

public class Gerente extends Funcionario {

    public Gerente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean getPermissaoVenda() {
        return true;
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
