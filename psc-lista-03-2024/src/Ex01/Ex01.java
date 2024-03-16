package Ex01;

import java.util.Scanner;

public class Ex01 {

    /*
    1. Escreva um algoritmo que leia 3 números a partir do teclado. O algoritmo deve apresentar:
    a. O maior número.
    b. O menor número.
    c. A média aritmética dos três números.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2 , num3, maior_1, maior_final, menor_1, menor_final, media;

        System.out.println("Este programa irá apresentar o maior, menor e média entre 3 números.");
        System.out.print("Insira o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Insira o segundo número: ");
        num2 = input.nextDouble();
        System.out.print("Insira o terceiro número: ");
        num3 = input.nextDouble();

        maior_1 = Math.max(num1, num2);
        maior_final = Math.max(maior_1, num3);
        menor_1 = Math.min(num1, num2);
        menor_final= Math.min(menor_1, num3);
        media = (num1 + num2 + num3) / 3;

        System.out.printf("O maior número entre os três é %.0f.\n", maior_final);
        System.out.printf("O menor número entre os três é %.0f.\n", menor_final);
        System.out.printf("A média entre os três é %.0f.\n", media);

        input.close();


    }
}