import java.util.Scanner;


public class Operators {
    static Scanner sc = new Scanner(System.in);

    static void Wingard(){
        float budget = sc.nextFloat();
        int part_count = sc.nextInt();
        float price = sc.nextFloat();

        budget *= 0.9f;
        if(part_count > 150){
            budget -= part_count * price * 0.9f;
        }
        else{
            budget -= part_count * price;
        }

        if(budget >= 0){
            System.out.println("Action");
            System.out.printf("Wingard starts filming with %.2f leva left", budget);
        }
        else{
            System.out.println("Not enough money");
            System.out.printf("Wingard needs %.2f leva more", budget*(-1));
        }
    }

    static void Shapes(){
        String shape = sc.nextLine();
        switch (shape){
            case "square":
                float side = sc.nextFloat();
                System.out.printf("Square with face %.3f", side * side);
                break;
            case "rectangle":
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                System.out.printf("Rectangle with face %.3f", a * b);
                break;
            case "circle":
                float radius = sc.nextFloat();
                System.out.printf("Circle with face %.3f", radius * radius * 3.1415);
                break;
            case "triangle":
                float hyp = sc.nextFloat();
                float height = sc.nextFloat();
                System.out.printf("Triangle with face %.3f", hyp * height / 2);
                break;
            default:
                System.out.println("Invalid shape");
                break;
        }
    }
    static int Fac(int n){

        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;

    }
    static void Fact(){
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(Fac(N)*Fac(K)/Fac(N-K));

    }

    static void Ex_16(){
        boolean st = true;
        while(st){
            int N = sc.nextInt();
            if(N >= 1 && N % 5 == 0){
                st = false;
            }
            else{System.out.println("Invalid number");}
        }
    }
    static void Ex_15(){
        System.out.print("Въведете час (0-23): ");
        int hour = Integer.parseInt(sc.nextLine());

        System.out.print("Въведете минути (0-59): ");
        int minutes = Integer.parseInt(sc.nextLine());

        // Добавяне на 15 минути
        minutes += 15;

        if (minutes >= 60) {
            minutes -= 60;
            hour += 1;
        }

        if (hour >= 24) {
            hour = 0;
        }

        System.out.printf("Часът след 15 минути ще бъде: %d:%02d%n", hour, minutes);
    }
    static void Ex_14(){
        boolean st = true;
        while(st){
            int N = sc.nextInt();
            if(N % 10 == 0){
                st = false;
            }
            else{System.out.println("Invalid number");}
        }
    }

    static void Ex_13(){
        boolean st = true;
        while(st){
            String smth = sc.nextLine();
            if(smth == "Stop"){
                st = false;
            }
            else{System.out.println(smth);}
        }
    }

    static void Ex_12(){
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            sum += temp;
        }
        System.out.println(sum);
    }

    static void Ex_11() {
        int n = sc.nextInt();
        int smallest = 100;
        int biggest = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (smallest < temp) {
                smallest = temp;
            } else if (biggest < temp) {
                biggest = temp;
            }

        }
    }
    static void Ex_10(){
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i % 5 == 0 && i % 7 == 0){
                System.out.println(i);
            }
        }
    }

    static void Ex_9(){
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i % 3 == 0 && i % 7 == 0){
                System.out.println(i);
            }
        }
    }

    static void Ex_8(){
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            System.out.println(i);
        }
    }

    static void Ex_7(){
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }
    static void Ex_6(){
        boolean st = true;
        while(st){
            int N = sc.nextInt();
            if(N >= 100 && N <= 200){
                st = false;
            }
            else{System.out.println("Invalid number");}
        }
    }

    static void Ex_5(){
        boolean st = true;
        while(st){
            int N = sc.nextInt();
            if(N >= -100 && N <= 100){
                st = false;
                System.out.println("Yes");
            }
            else{System.out.println("No");}
        }
    }

    static void Ex_4(){
        String day = sc.nextLine();

        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Working day");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    static void Ex_3(){
        int n = sc.nextInt();

        switch (n){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Error"); break;

        }
    }

    static void Ex_2(){
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    static void Ex_1(){
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n < m){
            System.out.println(n);
        }
        else{
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Wingard();
//        Shapes();
//        Fact();
//        Ex_16();
//        Ex_15();
//        Ex_8();

    }
}
