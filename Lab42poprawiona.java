import java.util.Random;

public class Lab42poprawiona {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        int z = 0;

         do {z++;

             Random random = new Random();
             i  = random.nextInt(10);
             System.out.println(i);

            Random random1 = new Random();
            j = random1.nextInt(10);
            System.out.println(j);

             Random random2 = new Random();
             k = random2.nextInt(10);
             System.out.println(k);
         } while (i != 7 || k !=7 || j != 7);

        System.out.println("ilość losowań: " + z);



        if (i == 7 && k==7 && j == 7) {
            System.out.println("wygrana");

        } else {
            System.out.println("Spróbuj jeszcze raz");
         }



        }

    }




