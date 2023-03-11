import java.util.Arrays;   
import java.util.Collections; 

public class Main {
     
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 10, 14, 16, 20};
        // Arrays.sort(tab, Collections.reverseOrder());
        // System.out.println("Array order: " +Arrays.toString(tab)); 

        // int sum = 0;
        // for(int i=0; i < tab.length - 1; i++ ) {
        //     sum += tab[i] - tab[i + 1];
        // }
        Arrays.sort(arr);

        int sum = 0;
        // for(int i=arr.length; i > 1; i-- ) {
        //     sum += arr[i-1] - arr[i - 2];
        //     System.out.println("Resultat: " + sum);
        // }

        sum = arr[arr.length-1] - arr[0];
         System.out.println("Resultat: " + sum);
    }
}