import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double km;

        System.out.print("Coloque seu km:");

        Scanner in= new Scanner(System.in);
        km=in.nextDouble();

        double mi_la=km/1.6;

        System.out.print("sua milha é:"+mi_la);

    }
}