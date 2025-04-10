import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;
        System.out.println("Digite seu numero:");
        number= in.nextInt();

        if (number%2==0){

            System.out.println("O seu numero é par ");

        }
    else{
            System.out.println("o seu numero é impar");
        }

    }
}