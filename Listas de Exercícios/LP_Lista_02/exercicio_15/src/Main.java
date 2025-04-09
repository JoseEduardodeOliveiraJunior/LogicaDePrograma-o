import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Qual é o raio do cilindro: ");
        double raio = in.nextDouble();
        System.out.print("Qual é a altura do cilindro: ");
        double alt = in.nextDouble();
        double area = (Math.PI *  Math.pow(raio, 2));

        double volume=area * alt;

        System.out.printf("O volume do cilindro é: %.2f unidades cúbicas.\n", volume);


    }
}
