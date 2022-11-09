package assembly;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Assembly {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(100);
        list.add("100");
        list.add("가나다라");
        System.out.println(list);
        System.out.println(list.get(0));
    }
} // end class
