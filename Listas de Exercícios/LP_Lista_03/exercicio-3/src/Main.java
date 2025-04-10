import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite a primeira nota: ");
        Scanner in = new Scanner(System.in);
        double number1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");

        double number2 = in.nextDouble();
        double media= (number1 + number2) / 2;

        if(media> 50){
            System.out.println("Aprovado! Sua média foi: " +media);
        }
        else{
            System.out.println("Reprovado! Sua média foi: " +media);
        }
    }
}