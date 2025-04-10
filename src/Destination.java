import java.util.*;

public class Destination {


    static String[] location = {"Pasig","Quezon","Malabon","Batanggas"};
    static Map<String,Integer> map = new HashMap<>();

    public static void generateCityNumber() {
        Set<Integer> unique = new HashSet<>();
        Random random = new Random();
        map.clear();

        for(String loc: location) {
            int container;
            do{
                container = random.nextInt(101);
            }while (unique.contains(container));

            unique.add(container);
            map.put(loc, container);
        }   
        ListAll();
    }

    public static void ListAll() {
        if(map.isEmpty()) {
            System.out.println("Please generate cities first (Click Option 2)");
        } else {
            for (Map.Entry<String, Integer> entry: map.entrySet()) {
                System.out.println(" - "  + entry.getKey() + " "  + entry.getValue());
            }
        }
        System.out.println();
    }

    public static void findCitiesByNumber(int number){
        boolean found = false;

        for(Map.Entry<String, Integer> findNumber: map.entrySet()) {
            if(findNumber.getValue() == number) {
                System.out.println(" - " + findNumber.getKey());
                found = true;
            }
        }
        if(!found) {
            System.out.println(" No city found in the number " + number);
        }
        System.out.println();
    }
}
