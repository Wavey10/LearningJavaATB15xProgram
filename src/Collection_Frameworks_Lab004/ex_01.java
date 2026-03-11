package Collection_Frameworks_Lab004;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex_01 {

    public static void main(String[] args) {

        List<String> groceries = new ArrayList<>();
        groceries.add("Milk");
        groceries.add("Banana");
        groceries.add("Bread");

        System.out.println(groceries.get(0));

        Set<String> stickers = new HashSet<>();
        stickers.add("Spider");
        stickers.add("Luffy");
        stickers.add("Spider");
        System.out.println(stickers.size());


    }
}
