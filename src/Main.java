import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int cand = 0;

        int[] nums = {2,1,1,1,2};


        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                cand = nums[i];
            }

            if(cand==nums[i]){
                count++;
                System.out.println("Add " + count );
            } else {
                count--;
                System.out.println("Minus " + count );
            }

        }

        System.out.println(cand);
    }

}
