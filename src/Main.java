import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        map.put("ice cream", "cherry");
        map.put("spinach", "dirt");

        Map<String, String > answer = CodingBat.topping2(map);


        for(Map.Entry<String, String> a: answer.entrySet()){
            System.out.println(a.getKey() + " " + a.getValue());
        }

    }

}
