package tribo;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    public void CadastraCliente(ArrayList<Cliente> clientes) {
        nome = Util.pedeStringNaoVazia("Qual o nome do cliente? (diferente de vazio).");
        endereco = Util.pedeStringNaoVazia("Qual o endereço do cliente? (diferente de vazio).");
        cpf = Util.pedeStringNaoVazia("Qual o CPF do cliente?");
        telefone = Util.pedeStringNaoVazia("Qual o telefone do cliente?");
        clientes.add(this);
        System.out.println("Cliente cadastrada com sucesso.");
    }
}
