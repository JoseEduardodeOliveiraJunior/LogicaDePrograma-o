//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                int[] vetor = {1, 2, 3, 4, 5}; // Declaração e inicialização do vetor
                int aux; // Variável auxiliar

                // Inversão do vetor
                for (int i = 0; i < vetor.length / 2; i++) {
                    aux = vetor[i];
                    vetor[i] = vetor[vetor.length - 1 - i];
                    vetor[vetor.length - 1 - i] = aux;
                }


                for (int valor : vetor) {
                    System.out.print(valor + " ");
                }
            }
        }

