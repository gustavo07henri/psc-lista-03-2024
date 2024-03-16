package Ex02;

import java.util.Scanner;

public class Ex02 {
    /*Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces, sucos e refrigerantes.
    O algoritmo deve calcular o menor número de notas que deve ser dado de troco para um pagamento efetuado.
    O algoritmo deve ler o valor da compra e o valor pago.
    Se o valor pago for menor que o valor da compra, a máquina deve apresentar uma mensagem,
    informando que a quantia paga é insuficiente para realizar a compra.
    A máquina aceita apenas notas de R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.
    Exemplo:
    Valor pago: R$ 100,00
    Valor da compra: R$ 23,00
    Troco: R$ 77,00
    Notas de R$ 50,00: 1
    Notas de R$ 20,00: 1
    Notas de R$ 10,00: 0
    Notas de R$ 5,00: 1
    Notas de R$ 2,00: 1
    Notas de R$ 1,00: 0
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor_pago, compra, troco;
        int  comparacao = 0, nota50 = 0, nota20 = 0, nota10 = 0 , nota5 = 0, nota2 = 0, nota1 = 0;


        System.out.print("Insira o valor da compra R$ ");
        compra = input.nextDouble();
        System.out.print("Insira o valor pago R$ ");
        valor_pago = input.nextDouble();

        troco = valor_pago - compra;

        if (valor_pago < compra){
            System.out.println("Valor insuficiente para realizar compra.");
        } else if (troco == 0) {
            System.out.println("Você não tem troco.");
        } else if(valor_pago > troco){
            while (comparacao != troco){

                if (comparacao + 50 <= troco){
                    comparacao += 50;
                    nota50 ++;

                } else if (comparacao + 20 <= troco){
                    comparacao += 20;
                    nota20 ++;

                }else if (comparacao + 10 <= troco) {
                    comparacao += 10;
                    nota10 ++;

                }else if (comparacao + 5 <= troco) {
                    comparacao += 5;
                    nota5 ++;

                }else if (comparacao + 2 <= troco) {
                    comparacao += 2;
                    nota2 ++;

                }else if (comparacao + 1 <= troco) {
                    comparacao += 1;
                    nota1 ++;
                }


            }
            System.out.printf("Seu troco é R$ %.2f \n", troco);
            System.out.println("Notas de R$ 50,00:" + nota50);
            System.out.println("Notas de R$ 20,00:" + nota20);
            System.out.println("Notas de R$ 10,00:" + nota10);
            System.out.println("Notas de R$ 5,00:" + nota5);
            System.out.println("Notas de R$ 2,00:" + nota2);
            System.out.println("Notas de R$ 1,00:" + nota1);
        }



        input.close();


    }
}
