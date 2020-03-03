package data01;

/**
 * 算法中的有穷性
 */

import java.util.ArrayList;

public class Finiteness {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(59);
        fin(list);
        System.out.println(list);
        System.out.println(list.size());
    }

    private static void fin(ArrayList<Integer> list) {
        int n = list.get(list.size() - 1);
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                list.add(n);
            } else if (n % 2 != 0) {
                n = n * 3 + 1;
                list.add(n);
            }
        }

    }
}