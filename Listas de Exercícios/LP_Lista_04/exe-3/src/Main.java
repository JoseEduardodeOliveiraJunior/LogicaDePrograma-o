public class Main {
    public static void main(String[] args) {
        String div4 = "";
        for (int i = 1; i < 200; i++)
            if (i % 4 == 0)
                if(i < 196){
                    div4 += i + ", ";
                }
                else {
                    div4 += i;
                }System.out.println(div4);

            }

        }



