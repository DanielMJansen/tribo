package tribo;
//Interface com controle de permissões do gerente e do funcionário.
public interface ControlaPermissao {
    //Permissão para cadastrar clientes com receitas
    public boolean getPermissaoCadastraCliente();
//Permissão de cadastrar produto
    public boolean getPermissaoCadastra();
//Permissão de remover funcionário do sistema/login
    public boolean getPermissaoRemoveFuncionario();
//Permissão para consultar preço do produto/remedio
    public boolean getPermissaoConsultaPreco();
//Permissão para remover produto/remédio
    public boolean getPermissaoRemove();
//Permissão para vender produtos
    public boolean getPermissaoVenda();
//Permissão para criar login de funcionário/gerente
    public boolean getPermissaoCriaLogin();

}
