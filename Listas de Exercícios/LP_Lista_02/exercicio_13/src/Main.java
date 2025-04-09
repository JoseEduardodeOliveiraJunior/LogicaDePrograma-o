import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double cm;


        System.out.print("Coloque a medida em Cm:");


        Scanner in= new Scanner(System.in);
        cm=in.nextDouble();


        double area= 3.14*(Math.pow(cm,2));


        System.out.print("O valor da area é:"+area);
    }
}