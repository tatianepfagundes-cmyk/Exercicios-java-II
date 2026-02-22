
import java.util.Scanner;

public class DivisiveisPor2e3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3, valor4;

        // Entrada de dados
        System.out.print("Digite o valor 1: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = sc.nextInt();

        System.out.print("Digite o valor 3: ");
        valor3 = sc.nextInt();

        System.out.print("Digite o valor 4: ");
        valor4 = sc.nextInt();

        // Verificação e saída
        if (valor1 % 2 == 0 && valor1 % 3 == 0) {
            System.out.println(valor1 + " é divisível por 2 e 3");
        }

        if (valor2 % 2 == 0 && valor2 % 3 == 0) {
            System.out.println(valor2 + " é divisível por 2 e 3");
        }

        if (valor3 % 2 == 0 && valor3 % 3 == 0) {
            System.out.println(valor3 + " é divisível por 2 e 3");
        }

        if (valor4 % 2 == 0 && valor4 % 3 == 0) {
            System.out.println(valor4 + " é divisível por 2 e 3");
        }

        sc.close();
    }
}
