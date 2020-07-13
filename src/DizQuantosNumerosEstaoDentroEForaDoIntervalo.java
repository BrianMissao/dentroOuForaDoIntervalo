import java.util.Scanner;

public class DizQuantosNumerosEstaoDentroEForaDoIntervalo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int quantidadeDeNumerosAAnalizar = obterQuantidadeDeNumerosAAnalizar("Digite quantos números serão lidos:");
        analisarNumeros(quantidadeDeNumerosAAnalizar);
    }

    private static int obterQuantidadeDeNumerosAAnalizar(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }

    private static void analisarNumeros(int quantidadeDeNumerosAAnalizar) {
        int numeroDigitadoPeloUsuario = 0;
        int in = 0;
        int out = 0;
        System.out.println(quantidadeDeNumerosAAnalizar + " números serão analizados\nDigite cada número separado por enter:");
        for (int analizado = 1; analizado <= quantidadeDeNumerosAAnalizar; analizado++) {
            numeroDigitadoPeloUsuario = scanner.nextInt();
            if (numeroDigitadoPeloUsuario >= 10 && numeroDigitadoPeloUsuario <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in\n" + out + " out");
    }

}
