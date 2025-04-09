import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double n1;


        System.out.print("Coloque sua primeira nota");
        double n2;
        System.out.print("Coloque sua segunda nota");


        Scanner in= new Scanner(System.in);
        n1=in.nextDouble();
        n2=in.nextDouble();

        double peso1= n1*1;
        double peso2=n2*2;

        double media = (peso1 + peso2)/(1+2);

        System.out.print("A sua media foi:"+media);
    }
}