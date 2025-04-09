import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Digite o coeficiente A:");
        a= in.nextDouble();
        System.out.println("Digite o coeficiente B:");
        b= in.nextDouble();
        System.out.println("Digite o coeficiente C:");
        c= in.nextDouble();

        double disc=(-b*-b)+(-4)*(-a)*(-c);

        System.out.println("O discriminante é:"+disc);

        double raiz=(Math.sqrt(disc));

        double x1=((-b)+raiz)/(2*a);
        double x2=((-b)-raiz)/(2*a);

        System.out.println("A solução final da equação é "+x1+" e "+x2);
    }


}