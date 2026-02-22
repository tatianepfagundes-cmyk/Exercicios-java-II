import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3, menor;

        // Entrada de dados
        System.out.print("Digite o valor 1: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = sc.nextInt();

        System.out.print("Digite o valor 3: ");
        valor3 = sc.nextInt();

        // Inicialmente considera-se valor1 como menor
        menor = valor1;

        // Comparar com valor2
        if (valor2 < menor) {
            menor = valor2;
        }

        // Comparar com valor3
        if (valor3 < menor) {
            menor = valor3;
        }

        // Saída
        System.out.println("O menor valor informado é: " + menor);

        sc.close();
    }
}
