import jdk.jshell.Snippet;

import java.sql.Array;
import java.util.*;

public class Prac {
    public static void main(String[] args) {

        //queuePerversion();
        //System.out.println(convertIntArrayToQueue(createIntArray(10, 0,2)));

    }

    public static void strPerversion(){
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        String text;
        int check;

        while (true){
            text = scanner.nextLine();
            if (text.equals("exit")) break;
            if (text.startsWith("print~")){
                list.remove(Integer.parseInt(text.split("~")[1]));
            }else {
                list.add(text);
            }
            System.out.println(list);
            scanner.close();
        }
    }

    public static void  queuePerversion(){
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque();

        String text;
        String startPos;
        String endPos;

        while (true) {
            text = scanner.nextLine();
            if (text.equals("print")) {
                startPos = deque.removeLast() + ", ";
                endPos = deque.removeFirst();

                for (; !deque.isEmpty();) {
                    startPos += deque.remove() + ", ";
                }
                startPos += endPos;

                break;
            } else deque.add(text);

            System.out.println(deque);
        }
        System.out.println(startPos);
        scanner.close();
    }

    public static Queue<Integer> convertIntArrayToQueue(int[] array){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        return queue;
    }

    public static int[] createIntArray(int sizeArray, int originRandom, int boundRandom){
        Random random = new Random();
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(originRandom,boundRandom);
        }
        return array;
    }

}