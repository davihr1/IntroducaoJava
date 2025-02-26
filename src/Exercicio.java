import java.util.Scanner;

import static java.lang.System.out;

public class Exercicio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        out.println("Digite  um valor da nota 1: ");
        nota1 = input.nextDouble();

        out.println("Digite  um valor da nota 2: ");
        nota2 = input.nextDouble();

        out.println("Digite  um valor da nota 3: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) /3;

        out.println("A média da sua nota é: " + media );

        if (media >= 7 ) {
            out.println("Aprovado");
        } else if (media <=4) {
            out.println("Reprovado");
        } else {
            out.println("Final");
        }
    }
}
