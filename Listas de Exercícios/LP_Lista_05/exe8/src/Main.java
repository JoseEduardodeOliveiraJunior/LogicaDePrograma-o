//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                int[][] matriz = {
                        {10, 2, 3, 4, 5},
                        {6, 20, 8, 9, 10},
                        {11, 12, 30, 14, 15},
                        {16, 17, 18, 40, 20},
                        {21, 22, 23, 24, 50}
                };

                System.out.println("Diagonal principal da matriz:");

                for (int i = 0; i < 5; i++) {
                    System.out.print(matriz[i][i] + " ");
                }
            }
        }



