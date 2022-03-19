package main;

public class BubbleSorter implements Sorter {
    @Override
    public int[] sort(int[] list) {
        int a;
        boolean sorted = true;

        do {
            sorted = true;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    a = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = a;
                    sorted = false;
                }
            }
        } while (!sorted);

        return list;
    }
}
