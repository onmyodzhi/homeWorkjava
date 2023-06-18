import java.util.*;

public class HW3 {
    public static void main(String[] args) {
//        List<Integer> list = createIntegerList(10); // дан произвольный список целых чисел
//
//        System.out.println(list);
//
//        delEvenNumbers(list); //удаление четных чисел
//
//
//        Integer max = Collections.max(list); // нахождение максимального значения
//        System.out.println(max);
//
//
//        Integer min = Collections.min(list); // нахождение минимального значения
//        System.out.println(min);
//
//        average(list);


    }

    public static void average(List<Integer> list){
        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        sum /= list.size();
        System.out.println(sum);
    }

    public static void delEvenNumbers(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static List createIntegerList(int listSile) {
        List<Integer> list = new ArrayList<>(listSile);

        Random random = new Random();
        for (int i = 0; i < listSile; i++) {
            list.add(random.nextInt(0, 10));
        }
        return list;
    }

}