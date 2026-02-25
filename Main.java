import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] i = {1,1,34,2,6,23,5,3};
        Integer target = 5;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < i.length; j++) {
            int complement = target - i[j];

            if (map.containsKey(complement)) {
                System.out.println("Index: " + map.get(complement) + " and " + j);
                return;
            }

            map.put(i[j], j);
        }

        System.out.println("Not Found");
    }
    }
