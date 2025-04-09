import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Digite a primeira raiz: ");
        double x1;
         x1=in.nextDouble();
        System.out.print("Digite a segunda raiz: ");
        double x2;
        x2=in.nextDouble();


        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;


        System.out.printf("A equação do segundo grau é: %.1fx² ", a);

        if (b >= 0) System.out.printf("+ %.1fx ", b);
        else System.out.printf("- %.1fx ", Math.abs(b));

        if (c >= 0) System.out.printf("+ %.1f = 0\n", c);
        else System.out.printf("- %.1f = 0\n", Math.abs(c));


    }
}

