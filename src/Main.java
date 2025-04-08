import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        String[] name = {"Mark", "Paul", "Jacob", "Santos",};
        int[] age = {33, 30, 25, 45};

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], age[i]);
        }

        for(Map.Entry<String, Integer > details: map.entrySet()) {
            System.out.println("Name : "  + details.getKey() +  ", Age : " + details.getValue());
        }

    }


}
