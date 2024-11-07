import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Comparator;

public class Arrays_ex {

    static Scanner sc = new Scanner(System.in);
    static int[] arr = {2,7,4,3,2,6};
//    static int[] arr = {1,2,3,3,2,1};
    static String[] str_arr = {"car", "var", "mar", "hello", "car"};

    public static void zad1() {
        System.out.println("Making an array with the numbers from one to ten and printing it:");

        int[] arr = new int[10];
        for (int i = 0; i <= 9; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public static void zad2() {
        System.out.println("Enter 5 integers and I'll print the median value of them.");

        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter integer #" + i);
            arr[i] = Integer.parseInt(sc.nextLine());
            sum += arr[i];
        }

        double median = (double) sum / arr.length;
        System.out.println("The median of all elements is " + median);
    }

    public static double zad3(double[] arr) {
        double biggest = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (biggest < arr[i]) biggest = arr[i];
        }

        return biggest;
    }

    public static int zad4(int[] arr) {
        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void zad5() {
        String[] arr = {"Huawei", "Apple", "Samsung", "Sony"};

        Arrays. sort(arr, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(arr));
    }

    public static void zad6(int[] arr, int toSearch) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == toSearch) {
                System.out.println("The element was found at index " + i);
                return;
            }
        }

        System.out.println("The element was not found.");
    }

    public static void zad7(double[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (double num: arr) {
            if (num < 0) {
                negative++;
            } else if (num > 0) {
                positive++;
            } else {
                zero++;
            }
        }

        System.out.printf("The amount of positive numbers is %d, negative: %d, and zeroes: %d\n", positive, negative, zero);
    }

    public static void zad8(int[] arr1, int[] arr2) {
        for (int num1: arr1) {
            for (int num2: arr2) {
                if (num1 == num2) System.out.println("Found matching element: " + num1);
            }
        }
    }

    public static void zad9(int[] arr) {
        int n;
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            n = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = n;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void ex10(){
        int n = sc.nextInt();
        int[] newarr = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != n){
                newarr[count] = arr[i];
                count++;
            }
        }

        for(int i = 0; i < newarr.length; i++){
            System.out.print(newarr[i] + " ");
        }

    }

    static void ex11(){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static boolean ex12(){
        for(int i = 0; i < str_arr.length; i++){
            for(int j = i + 1; j < str_arr.length; j++){
                if(str_arr[i].equals(str_arr[j])){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean ex13(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }

    static void ex14(){
        int k = sc.nextInt();
        int[] next_arr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(k + i > arr.length - 1){
                next_arr[k + i - arr.length] = arr[i];
            }
            else{
                next_arr[i + k] = arr[i];
            }
        }

        for(int i = 0; i < next_arr.length; i++){
            System.out.print(next_arr[i] + " ");
        }
    }

    static void ex15(){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }

    static void ex16(){
        int[] arr2 = {4,5,6,7,8,9};
//        int c = arr.length + arr2.length;
//        int[] arr3 = new int[c];
//        for(int i = 0; i < arr.length; i++){
//            arr3[i] = arr[i];
//        }
//        for(int i = 0; i < arr2.length; i++){
//
//            arr3[arr.length + i] = arr2[i];
//        }

        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr) {
            if (Arrays.stream(arr2).anyMatch(x -> x == num)) {
                intersectionSet.add(num);
            }
        }

        Integer[] unionArray = unionSet.toArray(new Integer[0]);
        Integer[] intersectionArray = intersectionSet.toArray(new Integer[0]);





        for(int i = 0; i < unionArray.length; i++){
            System.out.print(unionArray[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < intersectionArray.length; i++){
            System.out.print(intersectionArray[i] + " ");
        }
    }
    public static void main(String[] args) {
//        ex10();
//        ex11();
//        System.out.println("Duplicates are: " + ex12());
//        System.out.println("Is palindrom: " + ex13());
//        ex14();
//        ex15();
        ex16();
    }
}
