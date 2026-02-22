import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, salarioReajustado;

        // Entrada de dados
        System.out.print("Digite o salário do funcionário: ");
        salario = sc.nextDouble();

        // Processamento / decisão
        if (salario < 5000) {
            salarioReajustado = salario + (salario * 0.3); // aumento de 30%
        } else {
            salarioReajustado = salario; // salário permanece o mesmo
        }

        // Saída
        System.out.println("O salário reajustado é: " + salarioReajustado);

        sc.close();
    }
}
