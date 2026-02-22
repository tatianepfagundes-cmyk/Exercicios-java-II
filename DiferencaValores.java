import java.util.Scanner;

public class DiferencaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int diferenca;

        if (valor1 > valor2) {
            diferenca = valor1 - valor2;
        } else if (valor2 > valor1) {
            diferenca = valor2 - valor1;
        } else {
            diferenca = 0;
        }

        System.out.println("A diferença é: " + diferenca);

        scanner.close();
    }
}
