package LearnArray;
import java.util.Scanner;

public class ReversAnArray {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        reverse(arr);
        Display(arr);

    }

    public static void Display(int [] arr){
        for(int val : arr){
            System.out.println(val);
        }
    }

    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

}
