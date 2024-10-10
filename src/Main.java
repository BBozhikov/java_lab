import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    static void ex1(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    static void ex2(){
        int x = sc.nextInt();
        System.out.println(x * x);
    }

    static void ex3(){

        double inches = Double.parseDouble(sc.nextLine());
        double cm = 2.54;

        double total = inches * cm;
        System.out.printf("%.2f",total);

    }

    static void ondesk3(){
        String name = sc.nextLine();

        System.out.println(name);
    }

    static void ondesk8(){
        String name = sc.nextLine();
        int years = Integer.parseInt(sc.nextLine());
        String city = sc.nextLine();

        System.out.printf("You are %s, %d years old from %s", name, years, city);
    }

    static void ondesk9(){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("******");
        System.out.println("*******"); // made with pain because we are not supposed to use for-loop yet
    }

    static void ex4(){
        double rate = 1.79549;
        double usd = Double.parseDouble(sc.nextLine());

        double lev = usd * rate;

        System.out.printf("LEVS: %.2f", lev);
    }

    static void ex5(){
        double rads = Double.parseDouble(sc.nextLine());
        double degrees = rads * 180 / Math.PI;

        System.out.println(Math.round(degrees));
    }

    static void ex6(){
        String name = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        int time = count * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, time, count);

    }

    static void ex7(){
        int dog_count = Integer.parseInt(sc.nextLine());
        int others = Integer.parseInt(sc.nextLine());

        double total = dog_count * 2.50 + others * 4;

        System.out.printf("%.2f leva", total);
    }

    static void ex8(){
        double square = Double.parseDouble(sc.nextLine());

        double first = square * 7.61;
        double discount = 0.18 * first;
        double total = first - discount;

        System.out.printf("The final price is: %.2f lv\n", total);
        System.out.printf("The discount is: %.2f lv", discount);
    }

    static void ex9(){
        double deposited = Double.parseDouble(sc.nextLine());
        int duration = Integer.parseInt(sc.nextLine());
        double API = Double.parseDouble(sc.nextLine());
        API = API / 100;

        double sum = deposited + duration * ((deposited * API) / 12);

        System.out.println(sum);
    }

    static void ex10(){
        int pages = Integer.parseInt(sc.nextLine());
        double time_per_page = Double.parseDouble(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        double total_hours = pages * time_per_page;
        double hours_a_day = days * 24 / total_hours;

        System.out.println(hours_a_day * 60);
    }

    static void ex11(){
        int cake = Integer.parseInt(sc.nextLine());
    }
    public static void main(String[] args) {

        // ex2();
        // ex3();
        // ondesk3();
        // ondesk8();
        // ondesk9();
        // ex4();
        ex10();


    }
}

