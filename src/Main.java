import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("a","aa");
        map.put("b","bb");
        map.put("c", "asd");
        Map<String, String> ans = CodingBat.mapAB4(map);
        for(Map.Entry<String, String> answer : ans.entrySet()){
            System.out.println(answer.getKey() + "  " + answer.getValue());
        }

    }

}
