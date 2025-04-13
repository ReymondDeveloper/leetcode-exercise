import java.awt.List;
import java.util.*;

public class DestinationWithPostalCode {



    static String[] destination = {"Palawaan","Romblon","Boracay"};
    static Map<String, Integer> map = new HashMap<>();

    public static void GeneratePostalCode() {
        Set<Integer> unique = new HashSet<>();
        Random random = new Random();
        map.clear();
        for(String des : destination) {
            int con;
            do{
                con = random.nextInt(1,100);
            }while (unique.contains(con));

            unique.add(con);
            map.put(des, con);
        }
        GetAll();
    }


    public static void GetAll() {
        for(Map.Entry<String,Integer> mapUnique: map.entrySet()){
            System.out.println("City : " + mapUnique.getKey() + " Postal Code : " + mapUnique.getValue());
        }
        System.out.println();
    }

    public static void GetPostalCode(int postalCode) {
        boolean isTrue = false;

        for(Map.Entry<String, Integer > postalCodeUnique : map.entrySet()){
            if(postalCodeUnique.getValue() == postalCode){
                System.out.println(" City : " + postalCodeUnique.getKey());
                isTrue = true;
            }
        }

        if(!isTrue) {
            System.out.println("Postal Code Not Found");
        }

        System.out.println();
    }




}
