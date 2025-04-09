import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        String[] k = {"a", "b", "c"};
//        String[] v = {"aaa", "bbb", "cake"};

        String[] k = { "c"};
        String[] v = { "cake"};


        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < k.length; i++) {
            map.put(k[i], v[i]);
        }

        Map<String, String> res = CodingBat.mapAB3(map);

        System.out.println(res);

    }


}
