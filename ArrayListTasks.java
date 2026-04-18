import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {

        //1 birinci tapşırıq
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        System.out.println(list);

        //2 ikinci tapşırıq
        for (String color : list) {
            System.out.println(color);
        }

        //3 üçüncü tapşırıq
        list.add(0, "Black");
        System.out.println(list);

        //4 dördüncü tapşırıq
        System.out.println(list.get(2));

        //5 beşinci tapşırıq
        list.set(1, "White");
        System.out.println(list);

        //6 altıncı tapşırıq
        if (list.size() > 2) {
            list.remove(2);
        }
        System.out.println(list);

        //7 yeddinci tapşırıq
        System.out.println(list.contains("Blue"));

        //8 səkkizinci tapşırıq
        Collections.sort(list);
        System.out.println(list);

        //9 doqquzuncu tapşırıq
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);

        //10 onuncu tapşırıq
        Collections.shuffle(list);
        System.out.println(list);

        //11 on birinci tapşırıq
        Collections.reverse(list);
        System.out.println(list);

        //12 on ikinci tapşırıq
        List<String> subList = list.subList(0, Math.min(2, list.size()));
        System.out.println(subList);

        //13 on üçüncü tapşırıq
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("White");
        list3.add("Black");
        for (String e : list3) {
            System.out.println(list.contains(e) ? "Yes" : "No");
        }

        //14 on dördüncü tapşırıq
        if (list.size() > 1) {
            Collections.swap(list, 0, 1);
        }
        System.out.println(list);

        //15 on beşinci tapşırıq
        ArrayList<String> joined = new ArrayList<>();
        joined.addAll(list);
        joined.addAll(list3);
        System.out.println(joined);

        //16 on altıncı tapşırıq
        ArrayList<String> cloned = (ArrayList<String>) list.clone();
        System.out.println(cloned);

        //17 on yeddinci tapşırıq
        list3.clear();
        System.out.println(list3);

        //18 on səkkizinci tapşırıq
        System.out.println(list3.isEmpty());

        //19 on doqquzuncu tapşırıq
        list.trimToSize();

        //20 iyirminci tapşırıq
        list.ensureCapacity(20);

        //21 iyirmi birinci tapşırıq
        if (list.size() > 1) {
            list.set(1, "Purple");
        }
        System.out.println(list);

        //22 iyirmi ikinci tapşırıq
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}