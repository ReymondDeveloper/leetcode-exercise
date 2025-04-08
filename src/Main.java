import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Selection : " );

        int i;
        do{
            System.out.println("1 Select Location");
            System.out.println("2 List Of City");
            System.out.println("3 Exit ");
            System.out.print("-> ");
            i = sc.nextInt();
            switch (i){
                case 1:
                    if(Destination.map.isEmpty()) {
                        System.out.println("Please generate cites first (Option 2) ");
                        break;
                    }
                    System.out.print("Enter a number to search for : ");
                    int num = sc.nextInt();
                    Destination.findCitiesByNumber(num);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("City Of Manila");
                    Destination.generateCityNumber();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
            }
        }while (i != 3);


    }


}
