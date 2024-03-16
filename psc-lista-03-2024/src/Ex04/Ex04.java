package Ex04;

import java.util.Scanner;

public class Ex04 {
    /*Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador
    de operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o primeiro valor lido seja:
    a. 1: calcular e imprimir o perímetro do círculo.
    b. 2: calcular e imprimir a área do círculo.
    c. 3: calcular e imprimir o volume da esfera.
    Se o primeiro valor lido for diferente desses três valores possíveis,
    imprimir uma mensagem de erro, informando que o código da operação é inválido.
    OBS:
    Perímetro de um círculo: 2 π r
    Área de um círculo: π r²
    Volume de uma esfera: 4/3 π r³
    em que π = 3,141592 e r é o raio da circunferência.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int escolha;
        double raio, volume, area, perimetro;

        System.out.println("1: calcular perímetro do círculo.\n2: calcular  do círculo.\n3: calcular o volume da esfera.");
        System.out.print("Insira uma das opções listadas acima: ");
        escolha = input.nextInt();
        System.out.print("Insira o valor do raio do circulo em cm: ");
        raio = input.nextDouble();

        switch (escolha){
            case 1:
                perimetro = raio * 2 * Math.PI;
                System.out.printf("O perímetro de um circulo com raio de %.2f cm é %.2f cm.", raio, perimetro);
                break;
            case 2:
                area = (Math.pow(raio, 2) * Math.PI);
                System.out.printf("A área de um circulo com raio de %.2f cm é %.2f cm².", raio, area);
                break;
            case 3:
                volume = Math.pow(raio, 3) * Math.PI * (4.0 / 3.0);
                System.out.printf("O volume de um circulo com raio de %.2f cm é %.2f cm³.", raio, volume);
                break;
            default:
                System.out.println("Está opção é inválida.");
                break;
        }

        input.close();


    }
}
