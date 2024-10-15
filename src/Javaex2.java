import java.util.Scanner;
import java.util.Random;

public class Javaex2 {
    static void print(String message) {
        System.out.println(message);
    }

    static int[] RandomGen(int a, int b){
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(b);
            if(arr[i] < a){
                i = 0;
            }
        }
//        int rand1 = (int)rand.nextInt(b);
        return arr;
    }

    static void printnumb(int i){
//        int i = 0;
        if(i == 101){
            return;
        }
        System.out.println(i);
        i++;

        printnumb(i);
    }
    static int[] buble_sort(int[] arr){ // only one for-loop is allowed
        boolean swap = false;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap = true;
            }

            if(swap){
                i = -1; // for-loop increments afterward to 0 and not to 1
                swap = false;
            }
        }
//        for(int i = 0; i < arr.length; i++){System.out.println(arr[i]);}
        return arr;
    }

    public static void main(String[] args) {
        print("Hello world");
        boolean swap = false;

        int[] arr = {10,3,1,2,4,5,3,10,41};
        arr = buble_sort(arr);
        for(int i = 0; i < arr.length; i++){System.out.println(arr[i]);}

//        printnumb(1);
//        int[] arr = new int[10];
//        arr = RandomGen(3,20);
//        for(int i = 0; i < arr.length; i++){System.out.println(arr[i]);}
    }
}
