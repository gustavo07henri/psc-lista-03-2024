package Ex05;

import java.util.Scanner;

public class Ex05 {
    /*Escrever um algoritmo que leia a partir do teclado dois números reais e um dos símbolos de operação: + , - , * , / ou ^ .
    O algoritmo deve retornar o resultado da operação. Caso o símbolo informado seja diferente dos símbolos preestabelecidos,
    o algoritmo deve apresentar uma mensagem de erro, informando que o símbolo da operação é inválido.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double numero_1, numero_2, resultado, expoente;
        String operador;

        System.out.println("Este programa irá fazer um calculo entre dois números com o operador escolhido");
        System.out.println("Digite um dos operadores abaixo.\n + ==> para adição.\n - ==> para subtração.\n * ==> para multiplicação.\n / ==> para divisão.\n ^ para potenciação. ");
        operador = input.next();

        switch (operador){
            case "+":
                System.out.print("Forneça o primeiro número: ");
                numero_1 = input.nextInt();
                System.out.print("Forneça o segundo número: ");
                numero_2 = input.nextInt();
                resultado = numero_1 + numero_2;
                System.out.printf("%.2f + %.2f = %.2f", numero_1, numero_2, resultado);
                break;
            case "-":
                System.out.print("Forneça o primeiro número: ");
                numero_1 = input.nextInt();
                System.out.print("Forneça o segundo número: ");
                numero_2 = input.nextInt();
                resultado = numero_1 - numero_2;
                System.out.printf("%.2f - %.2f = %2f", numero_1, numero_2, resultado);
                break;
            case "*":
                System.out.print("Forneça o primeiro número: ");
                numero_1 = input.nextInt();
                System.out.print("Forneça o segundo número: ");
                numero_2 = input.nextInt();
                resultado = numero_1 * numero_2;
                System.out.printf("%.2f * %.2f = %.2f", numero_1, numero_2, resultado);
                break;
            case "/":
                System.out.print("Forneça o primeiro número: ");
                numero_1 = input.nextInt();
                System.out.print("Forneça o segundo número: ");
                numero_2 = input.nextInt();
                resultado = numero_1 / numero_2;
                System.out.printf("%.2f / %.2f = %.2f", numero_1, numero_2, resultado);
                break;
            case "^":
                System.out.print("Forneça  a base da potencia: ");
                numero_1 = input.nextInt();
                System.out.print("Informe o valor para o expoente da potência: ");
                expoente = input.nextDouble();
                resultado = Math.pow(numero_1, expoente);
                System.out.printf("%.2f ^ %.2f = %.2f", numero_1, expoente, resultado);
                break;
            default:
                System.out.println("ERRO");
                System.out.println("Símbolo de operação invalida.");
        }

        input.close();


    }
}
