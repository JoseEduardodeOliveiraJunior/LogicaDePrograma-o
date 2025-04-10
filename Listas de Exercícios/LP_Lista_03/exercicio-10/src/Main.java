import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int number1;
    int number2;
    int number3;

        System.out.println("Digite seu primeiro numero:");
        number1= in.nextInt();

        System.out.println("Digite seu segundo numero:");
        number2= in.nextInt();

        System.out.println("Digite seu terceiro numero:");
        number3= in.nextInt();


        if(number1<number2 && number2<number3){
           System.out.println( number1 + " < " + number2 + " < " + number3);
        }
         else if (number1 < number3 && number3 < number2){
        System.out.println(number1 + ", " + number3 + ", " + number2);
        } else if (number2 < number1 && number1 <  number3) {
        System.out.println(number2 + ", " + number1 + ", " + number3);
        } else if (number2 < number3 && number3 < number1) {
        System.out.println(number2 + ", " + number3 + ", " + number1);
        } else if (number3 < number1 && number1 <  number2) {
        System.out.println(number3 + ", " + number1 + ", " + number2);
        } else if (number3 < number2 && number2 < number1) {
            System.out.println(number3 + ", " + number2 + ", " + number1);
        }else{
                System.out.println("Indefinido");
            }
    }

    }

