import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1=1;
        int n2=2;
        int n3=3;
        int n4=4;
        int n5=5;
        int n6=6;
        int n7=7;

        System.out.println("escolha um numero da semana:");
        int number= in.nextInt();

        if (n1==number){
            System.out.println("Domingo");
        } else if (n2==number) {
            System.out.println("Segunda");
        }
        else if (n3==number) {
            System.out.println("Terça-Feira");
        }
        else if (n4==number) {
            System.out.println("Quarta-Feira");
        }
        else if (n5==number) {
            System.out.println("Quinta-Feira");
        }
        else if (n6==number) {
            System.out.println("Sexta-Feira");
        }
        else if (n7==number) {
            System.out.println("Sabado");
        }
        else{
            System.out.println("Valor invalido");
        }
    }
}