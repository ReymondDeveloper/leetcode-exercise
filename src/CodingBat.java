import java.util.Map;

public class CodingBat {


    public static Map<String, String> mapShare(Map<String, String > map) {

        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.remove("c");
        } else {
            map.remove("c");
        }
        return map;

    }

}
