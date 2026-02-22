import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        double A, B, C, delta;

        // Entrada de dados
        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();

        // Cálculo do delta
        delta = B * B - 4 * A * C;

        // Verificação do número de raízes reais
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
        } else if (delta == 0) {
            System.out.println("A equação possui uma única raiz real");
        } else {
            System.out.println("A equação possui duas raízes reais");
        }

        sc.close();
    }
}
