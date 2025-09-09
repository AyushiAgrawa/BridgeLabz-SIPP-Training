package Generics.Day2_GenericsProgrammingElements.ListInterface;

import java.util.LinkedList;

public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        int count = 0;
        int size = list.size();
        if (n > size || n <= 0) {
            return null;
        }

        T result = null;
        LinkedList<T> tempList = new LinkedList<>();
        for (T item : list) {
            tempList.add(item);
            if (tempList.size() > n) {
                tempList.removeFirst();
            }
        }
        result = tempList.getFirst();
        return result;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        String result = findNthFromEnd(list, N);
        System.out.println(result);
    }
}
