import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaLab, notaSemestral, notaExame, media;
        String conceito;

        System.out.print("Digite a nota do trabalho de laboratório: ");
        notaLab = sc.nextDouble();

        System.out.print("Digite a nota da avaliação semestral: ");
        notaSemestral = sc.nextDouble();

        System.out.print("Digite a nota do exame final: ");
        notaExame = sc.nextDouble();

        // Cálculo da média ponderada
        media = (notaLab * 2 + notaSemestral * 3 + notaExame * 5) / 10;

        // Verificação do conceito
        if (media >= 8 && media <= 10) {
            conceito = "A";
        } else if (media >= 7) {
            conceito = "B";
        } else if (media >= 6) {
            conceito = "C";
        } else if (media >= 5) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Média ponderada: " + media);
        System.out.println("Conceito: " + conceito);

        sc.close();
    }
}
