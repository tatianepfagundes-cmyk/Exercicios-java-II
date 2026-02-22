import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        double A, B, C;

        // Entrada de dados
        System.out.print("Digite o valor do lado A: ");
        A = sc.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        B = sc.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        C = sc.nextDouble();

        // Verificação se os lados formam um triângulo
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            System.out.println("Os lados formam um triângulo");
        } else {
            System.out.println("Os valores informados não podem formar um triângulo");
        }

        sc.close();
    }
}
