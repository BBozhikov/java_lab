import java.util.Scanner;

public class LoopsMethods {

    static void Ex(){
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        if(seats[row][column] == 0){
            System.out.println("Free");
        }
        else{
            System.out.println("Sold");
        }
        // for(int i = 0; i < seats.length; i++){
        //     for(int y = 0; y < seats[i].length; y++){

        //     }
        // }
    }
    public static void main(String[] args) {
        int[ ] nums = {3, 8, 5, 2};
        int res = 0;
        for(int x: nums) {
            if(x > res) {
                res = x;
            }
        }

        System.out.println(res);
    }
}
