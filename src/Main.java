import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "Hi";
        int n = 3;

        StringBuilder stringRepeat = new StringBuilder();
        for(int i = 0; i < n; i++) {
            stringRepeat.append(str);
        }

        System.out.println(stringRepeat);

    }

}
