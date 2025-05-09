//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                int[][] matriz = {
                        {2, 4, 1},
                        {3, 1, 5},
                        {7, 2, 6}
                };


                int determinante =
                        matriz[0][0] * matriz[1][1] * matriz[2][2]
                                + matriz[0][1] * matriz[1][2] * matriz[2][0]
                                + matriz[0][2] * matriz[1][0] * matriz[2][1]
                                - matriz[0][2] * matriz[1][1] * matriz[2][0]
                                - matriz[0][0] * matriz[1][2] * matriz[2][1]
                                - matriz[0][1] * matriz[1][0] * matriz[2][2];


                System.out.println("Determinante da matriz: " + determinante);
            }
        }

