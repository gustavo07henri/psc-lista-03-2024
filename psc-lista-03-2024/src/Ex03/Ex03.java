package Ex03;

import java.util.Scanner;

public class Ex03 {
    /*Escreva um algoritmo que resolva uma equação de segundo grau, realizando a
    verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do
    discriminante (delta).
    a. Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de
    zero, apresentar a mensagem "Coeficientes informados incorretamente.".
    b. Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero,
    deverá ser impressa a mensagem: "Essa é uma equação de primeiro grau" e deverá
    ser informado o valor da raiz real da equação.
    c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: "Esta
    equação não possui raízes reais".
    d. Caso o discriminante seja zero, apresentar a mensagem "Esta equação possui duas
    raízes reais iguais. " e informar o valor das raízes da equação.
    e. Caso o discriminante seja maior que zero, apresentar a mensagem "Esta equação possui duas
    raízes reais iguais. " e informar o valor das raízes da equação.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double delta, x1, x2, equacao_primeiro_grau;


        System.out.println("Vamos resolver a equação (Ax²+Bx+C) em que você fornecera o valor de A, B e C.");
        System.out.print("Forneça um valor para A: ");
        a = input.nextInt();
        System.out.print("Forneça um valor para B: ");
        b = input.nextInt();
        System.out.print("Forneça um valor para C: ");
        c = input.nextInt();

        delta = (b*b)-4*a*c;

        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);

        if((a == 0 ) && (b == 0) && (c != 0)){
            System.out.println("Coeficientes informados incorretamente.");
            
        } else if ((a == 0) && (b != 0)) {
            System.out.println("Essa é uma equação de primeiro grau");
            equacao_primeiro_grau = c / b;
            System.out.printf("A raiz desta equação é %.2f", equacao_primeiro_grau);

        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
            
        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais. ");
            System.out.printf("Em que a raiz da equação é %2.2f", x1);


        }else if (delta > 0){
            System.out.println("Esta equação possui duas raízes reais diferentes. ");
            System.out.printf("Em que as raises da equação são para X1 %2.2f e para X2 %2.2f", x1, x2);
        }

        input.close();


    }
}
