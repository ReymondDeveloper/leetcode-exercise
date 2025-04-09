import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] letter = { "b", "c", "d"};
        String[] name = { "bymax", "christian", "dave"};

        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < letter.length; i++) {
            map.put(letter[i], name[i]);
        }
        Map<String, String> res = CodingBat.mapShare(map);

        System.out.println(res);

    }


}
