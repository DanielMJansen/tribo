package tribo;

import java.util.Scanner;

public class Util {

    static String pedeStringNaoVazia(String mensagem) {
        String entrada = "";
        do {
            System.out.println(mensagem);
            entrada = new Scanner(System.in).nextLine().trim();
        } while (entrada.isEmpty());
        return entrada;
    }

    static float PedePrecoMaiorQueZero(String mensagem) {
        float preco = 0;
        do {
            System.out.println(mensagem);
            preco = new Scanner(System.in).nextFloat();
        } while (preco <= 0);
        return preco;
    }

    static int pedeCodigo(String mensagem) {
        int codigo = 0;
        System.out.println(mensagem);
        codigo = new Scanner(System.in).nextInt();
        return codigo;

    }
}
