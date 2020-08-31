package LearnArray;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int [] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        int D = scn.nextInt();
        rotate(arr,D);
        display(arr);
    }

    public static void display(int [] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void reverse(int [] arr, int li, int ri){

        while (li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }
    public static void rotate(int [] arr, int D){
        D = D % arr.length;
        if(D < 0){
            D = D +arr.length;
        }

        reverse(arr, 0, arr.length -D -1 );
        reverse(arr, arr.length - D, arr.length -1);
        reverse(arr,0,arr.length-1);

    }

}
