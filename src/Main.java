import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        Solution s = new Solution();
        Map<String, String> result = s.mapShare(map);
        System.out.println(result);
    }






}
