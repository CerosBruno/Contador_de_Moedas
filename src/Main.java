import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Contador de Moedas");

        //Insersão de texto
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de Moedas de 1 Real: ");
        int moeda1 = teclado.nextInt();
        System.out.print("Digite o número de Moedas de 50 Centavos: ");
        int moeda2 = teclado.nextInt();
        System.out.print("Digite o número de Moedas de 25 Centavos: ");
        int moeda3 = teclado.nextInt();
        System.out.print("Digite o número de Moedas de 10 Centavos: ");
        int moeda4 = teclado.nextInt();
        System.out.print("Digite o número de Moedas de 5 Centavos: ");
        int moeda5 = teclado.nextInt();
        System.out.print("Digite o número de Moedas de 1 Centavo: ");
        int moeda6 = teclado.nextInt();

        //Cálculos
        float moeda50 = (float) (moeda2 * 0.5);
        float moeda25 = (float) (moeda3 * 0.25);
        float moeda10 = (float) (moeda4 * 0.1);
        float moeda05 = (float) (moeda5 * 0.05);
        float moeda01 = (float) (moeda6 * 0.01);
        float moeda11 = (float) (moeda1);
        float ttotal = (moeda11 + moeda50 + moeda25 + moeda10 + moeda05 + moeda01);
        float total = (moeda11 + moeda50 + moeda25 + moeda10 + moeda05 + moeda01);

        int n100 = (int) Math.floor (total/100);
        total = total%100;
        int n50 = (int) Math.floor (total/50);
        total = total%50;
        int n20 = (int) Math.floor (total/20);
        total = total%20;
        int n10 = (int) Math.floor (total/10);
        total = total%10;
        int nn5 = (int) Math.floor (total/5);
        total = total%5;
        int nn2 = (int) Math.floor (total/2);
        total = total%2;
        float resto = total;



//        float n100 = (float) Math.floor (total/100);
//        float n50 = (float) Math.floor ((total%100)/50);
//        float n20 = (float) Math.floor ((total%50)/20);
//        float n10 = (float) Math.floor (((total%50) - (total%20))/10);
//        float nn5 = (float) Math.floor ((total%10)/5);
//        float nn2 = (float) Math.floor ((total%5)/2);
//        float resto = (total%5) - (total%2);


        //Resultados
        System.out.println();
        if (moeda1 > 1) {
            System.out.print("Você tem " + moeda1 + " moedas de 1 Real, no total de ");
            System.out.printf ("%.2f Reais. %n", moeda11);
        } else if (moeda1 == 1) {
            System.out.println("Você tem uma moeda de 1 Real");
        }
        if (moeda2 > 1) {
            System.out.print("Você tem " + moeda2 + " moedas de 50 Centavos, no total de ");
            System.out.printf ("%.2f Reais. %n", moeda50);
        } else if (moeda2 == 1) {
            System.out.println("Você tem uma moeda de 50 Centavos");
        }
        if (moeda3 > 1) {
            System.out.print("Você tem " + moeda3 + " moedas de 25 Centavos, no total de ");
            System.out.printf ("%.2f Reais. %n", moeda25);
        } else if (moeda3 == 1) {
            System.out.println("Você tem uma moeda de 25 Centavos");
        }
        if (moeda4 > 1) {
            System.out.print("Você tem " + moeda4 + " moedas de 10 Centavos, no total de ");
            System.out.printf ("%.2f Reais. %n", moeda10);
        } else if (moeda4 == 1) {
            System.out.println("Você tem uma moeda de 10 Centavos");
        }
        if (moeda5 > 1) {
            System.out.print("Você tem " + moeda5 + " moedas de 5 Centavos, no total de ");
            System.out.printf ("%.2f Reais. %n", moeda05);
        } else if (moeda5 == 1) {
            System.out.println("Você tem uma moeda de 5 Centavos");
        }
        if (moeda6 > 1) {
            System.out.print("Você tem " + moeda6 + " moedas de 1 Centavo, no total de ");
            System.out.printf ("%.2f Reais. %n", moeda01);
        } else if (moeda6 == 1) {
            System.out.printf("Você tem uma moeda de 1 Centavo. %n");
            System.out.println("-----");
        }
        if (moeda1 > 0) {
            System.out.printf("No total você tem um total de %.2f Reais.", ttotal);
            System.out.println();
            System.out.println("-----");
            System.out.println("O troco ideal é:");
            if (n100 >= 1) {
                System.out.printf("%d Notas de 100 Reais. %n", n100);
            }
            if (n50 >= 1) {
                System.out.printf("%d Notas de 50 Reais. %n", n50);
            }
            if (n20 >= 1) {
                System.out.printf("%d Notas de 20 Reais. %n", n20);
            }
            if (n10 >= 1) {
                System.out.printf("%d Notas de 10 Reais. %n", n10);
            }
            if (nn5 >= 1) {
                System.out.printf("%d Notas de 5 Reais.  %n", nn5);
            }
            if (nn2 >= 1) {
                System.out.printf("%d Notas de 2 Reais.  %n", nn2);
            }
            if (resto > 0) {
                System.out.printf("Pode colocar R$%.2f de volta no cofrinho.", resto);
            }
        }
    }
}