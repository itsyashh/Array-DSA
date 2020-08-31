package LearnArray;
import java.util.Scanner;

public class SpanOfArray {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // finding max value in array
            
            if(arr[i] > max){
                max = arr[i];
            }
            // finding minimum value in array
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
