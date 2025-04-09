import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double v_i;
        double ace;
        double time;

        System.out.print("Coloque a velocidade inicial:");
        v_i = in.nextDouble();
        System.out.print("Coloque a aceleração :");
        ace = in.nextDouble();
        System.out.print("Coloque o tempo:");
        time = in.nextDouble();

        double vf = v_i + ace * time;

        System.out.print("A sua velocidade final é:" + vf + "m/s");
    }
}