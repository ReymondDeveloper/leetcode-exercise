import java.util.Map;

public class CodingBat {

//    public static Map<String,String > mapAB3 (Map<String,String> map) {
//
//        if(!map.containsKey("b") && !map.containsKey("a") ) {
//            return map;
//        }
//        if(!map.containsKey("b") ) {
//            map.put("b", map.get("a"));
//        }
//        if(!map.containsKey("a"))
//            map.put("a", map.get("b"));
//        return map;
//
//    }

    public static Map<String, String> topping2(Map<String,String> map){
        if(map.containsKey("ice cream")) map.put("yogurt", map.get("ice cream"));
        if(map.containsKey("spinach")) map.replace("spinach","nuts");
        return map;
    }



}
