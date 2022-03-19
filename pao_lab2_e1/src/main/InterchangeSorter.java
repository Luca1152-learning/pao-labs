package main;

public class InterchangeSorter implements Sorter {
    @Override
    public int[] sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int a;
                    a = list[i];
                    list[i] = list[j];
                    list[j] = a;
                }
            }
        }
        return list;
    }
}
