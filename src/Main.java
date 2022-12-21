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
        float total = (moeda11 + moeda50 + moeda25 + moeda10 + moeda05 + moeda01);
        float totalup = (float) Math.ceil(total);
        float totaldown = (float) Math.floor(total);
        float trocoup = (totalup - total);
        float trocodown = (total - totaldown);

        //Resultados
        System.out.println();

        if (moeda1 > 1) {
            System.out.print("Você tem " + moeda1 + " moedas de 1 Real, no total de ");
            System.out.printf ("%.2f Reais.", moeda11);
            System.out.println();
        } else if (moeda1 == 1) {
            System.out.println("Você tem uma moeda de 1 Real");
        }
        if (moeda2 > 1) {
            System.out.print("Você tem " + moeda2 + " moedas de 50 Centavos, no total de ");
            System.out.printf ("%.2f Reais.", moeda50);
            System.out.println();
        } else if (moeda2 == 1) {
            System.out.println("Você tem uma moeda de 50 Centavos");
        }
        if (moeda3 > 1) {
            System.out.print("Você tem " + moeda3 + " moedas de 25 Centavos, no total de ");
            System.out.printf ("%.2f Reais.", moeda25);
            System.out.println();
        } else if (moeda3 == 1) {
            System.out.println("Você tem uma moeda de 25 Centavos");
        }
        if (moeda4 > 1) {
            System.out.print("Você tem " + moeda4 + " moedas de 10 Centavos, no total de ");
            System.out.printf ("%.2f Reais.", moeda10);
            System.out.println();
        } else if (moeda4 == 1) {
            System.out.println("Você tem uma moeda de 10 Centavos");
        }
        if (moeda5 > 1) {
            System.out.print("Você tem " + moeda5 + " moedas de 5 Centavos, no total de ");
            System.out.printf ("%.2f Reais.", moeda05);
            System.out.println();
        } else if (moeda5 == 1) {
            System.out.println("Você tem uma moeda de 5 Centavos");
        }
        if (moeda6 > 1) {
            System.out.print("Você tem " + moeda6 + " moedas de 1 Centavo, no total de ");
            System.out.printf ("%.2f Reais.", moeda01);
            System.out.println();
        } else if (moeda6 == 1) {
            System.out.println("Você tem uma moeda de 1 Centavo");
        }
        if (total > 0) {
            System.out.printf("No total você tem um total de %.2f Reais.", total);
            System.out.println();
            System.out.printf("Para o troco é melhor se você retirar pelo menos %.2f Centavos,", trocodown);
            System.out.printf("ou conseguir mais %.2f Centavos.", trocoup);
        }
    }
}