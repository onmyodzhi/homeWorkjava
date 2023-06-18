import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class HW4 {
    public static void main(String[] args) {

        parseIntToLinkedList(convertAndMultiplyNumber(createDeque(3), createDeque(3)));// А можно что-нибудь по сложнее?!?!?!?
    }

    public static LinkedList<Character> parseIntToLinkedList(String numberFoConvert){
        String strFoConvertToLinkedList = numberFoConvert + "";

        LinkedList<Character> listConversion = new LinkedList<>();
        for (int i = 0; i < strFoConvertToLinkedList.length(); i++) {
            listConversion.add(strFoConvertToLinkedList.charAt(i));
        }
        System.out.println(listConversion);

        return listConversion;
    }

    public static String convertAndMultiplyNumber(Deque<Integer> dequeFirst, Deque<Integer>dequeSecond){

        StringBuilder firstNumbers = new StringBuilder();
        StringBuilder secondNumbers =  new StringBuilder();

        int sizeFirstDeque = dequeFirst.size();
        int sizeSecondDeque = dequeSecond.size();

        for (int i = 0; i < sizeFirstDeque ; i++) {
            firstNumbers.append(dequeFirst.removeLast().toString());
        }
        System.out.println(firstNumbers);

        for (int i = 0; i < sizeSecondDeque; i++) {
            secondNumbers.append(dequeSecond.removeLast().toString());
        }
        System.out.println(secondNumbers);

        int result = Integer.parseInt(firstNumbers.toString()) * Integer.parseInt(secondNumbers.toString());
        System.out.printf("%s * %s = %d \n", firstNumbers,secondNumbers,result);

        return result + "";
    }

    public static Deque<Integer> createDeque(int size){
        Random random = new Random();

        Deque <Integer> deque = new ArrayDeque();
        for (int i = 0; i < size; i++) {
            deque.add(random.nextInt(1,10));
        }
        System.out.println(deque);

        return deque;
    }
}
