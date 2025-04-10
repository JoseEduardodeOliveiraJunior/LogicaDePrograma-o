import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        double N1;
        double N2;

        System.out.println("Coloque a primeira nota:");
        N1= in.nextDouble();
        System.out.println("Coloque a segunda nota:");
        N2= in.nextDouble();

        double media= (N1+N2)/2;

        System.out.println("A sua Media é"+media);

        if(media>=50){
            System.out.println("Aprovado");
            System.exit(0);
        }
        else if (media<50){
            System.out.println("Voce ficou de recuperação!");

        }

        double P_r;
        System.out.println("Qual foi a nota da prova sua recuperação:");
        P_r= in.nextDouble();
        double media2= (media+P_r)/2;
        System.out.println("Sua segunda media foi"+media2);

        if (media2>=50){
            System.out.println("Aprovado!");

        }
        else {
            System.out.println("Reprovado");
        }
    }
}