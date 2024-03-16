package Ex06;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    /*Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número aleatório.
    O algoritmo deve validar qual é o menor e o maior número informado pelo teclado,
    para que independente da ordem que o usuário digite os números, consiga realizar o sorteio.
    Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que ele é par.
    Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e que ele é um número ímpar.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero_1, numero_2, menor, maior, numero_aleatorio;

        System.out.println("Este programa criara um número aleatório entre um range de dois números inseridos, e dirá se ele é par ou impar.");
        System.out.print("Insira o primeiro número: ");
        numero_1 = input.nextInt();
        System.out.print("Insira o segundo número: ");
        numero_2 = input.nextInt();

        maior = Math.max(numero_1, numero_2);
        menor = Math.min(numero_1, numero_2);

        Random gerador = new Random();
        numero_aleatorio = gerador.nextInt(menor, maior);

        System.out.printf("O número %d gerado", numero_aleatorio);
        System.out.println(((numero_aleatorio % 2) == 1)? " é impar." : " é par.");

        input.close();


    }
}
