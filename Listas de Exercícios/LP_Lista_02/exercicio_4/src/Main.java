import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        double nota1;
        double nota2;


        System.out.println("Digite a primeira nota:");
        nota1= in.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2= in.nextDouble();
        double media=(nota1+nota2)/2;

        System.out.println("A media das notas é"+ media);

        if(media>=5) {

            System.out.println("Passou de ano");
        }else{
            System.out.println("Reprovado!");
        }

    }

}