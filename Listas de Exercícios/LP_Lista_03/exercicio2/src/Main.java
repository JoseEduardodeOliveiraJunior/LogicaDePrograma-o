import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        int N1;

        System.out.println("Digite seu primeiro numero:");
        N1= in.nextInt();
        int N2;
        System.out.println("Digite seu segundo numero:");
        N2= in.nextInt();
        if (N1>N2){

            System.out.println("O seu" + N1+ "é maior que" +N2);

        }

        else{
            System.out.println("O seu" +N2+ "é maior que" +N1);
        }

    }
}
