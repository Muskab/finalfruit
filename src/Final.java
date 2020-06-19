import java.util.Scanner;

public class Final {
    public static void main(String [] Args){
        Scanner ff = new Scanner (System.in);
        String [] fruties = new String[10];
        System.out.println("Enter fruits [10]: ");
        for(int f = 0; f < 10; f++){
            fruties[f] = ff.next();

            }

        System.out.print("original:");
        for(int f = 0; f < (fruties.length); f++) {

            System.out.println(fruties[f]);
        }

        // going to try accending order!

        String fru = "";
        String [] fafa = new String [10];
        for (int f = 0; f < (fruties.length -1) ; f++){
            for (int m = 0; m < (fruties.length -f) -1; m ++ ){
                if (fruties[m].compareToIgnoreCase(fruties[m+1]) > 0) {
                    fru = fruties[m];
                    fruties[m] = fruties[m + 1];
                    fruties[m + 1] = fru;
                }



                }
            }
        System.out.println("accending order");
        for(int f = 0; f < (fruties.length); f ++){
            System.out.println(fruties[f]);
        }

        // going to try Decending order!

        System.out.println("Decending order");
        for(int f = fruties.length -1; f >= 0; f--){
            System.out.println(fruties [f]);
        }
        }


    }







