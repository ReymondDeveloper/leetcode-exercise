import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] k = {"a", "b"};
        String[] v = {"Hi", "There"};

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < k.length; i++) {
            map.put(k[i], v[i]);
        }

        Map<String, String> res = CodingBat.mapAB(map);
        System.out.println(res);

    }


}
