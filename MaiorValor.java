mport java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3, maior;

        // Entrada de dados
        System.out.print("Digite o valor 1: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = sc.nextInt();

        System.out.print("Digite o valor 3: ");
        valor3 = sc.nextInt();

        // Inicialmente considera-se valor1 como maior
        maior = valor1;

        // Comparar com valor2
        if (valor2 > maior) {
            maior = valor2;
        }

        // Comparar com valor3
        if (valor3 > maior) {
            maior = valor3;
        }

        // Saída
        System.out.println("O maior valor informado é: " + maior);

        sc.close();
    }
}

