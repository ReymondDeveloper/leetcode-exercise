import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num ;

        do{

            System.out.println("Choose Your Destination");
            System.out.println(" 1 All Data");
            System.out.println(" 2 Search Postal Code");
            System.out.println(" 3 Exit");
            num = sc.nextInt();

            switch (num) {
                case 1 :
                    System.out.println();
                    DestinationWithPostalCode.GeneratePostalCode();
                    break;
                case 2 :
                    System.out.println();
                    System.out.println(" Input Postal Code ");
                    num = sc.nextInt();
                    DestinationWithPostalCode.GetPostalCode(num);
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("Thank You For Using My Application Bye !!");
                    break;
            }
        }while (true);

    }

}
