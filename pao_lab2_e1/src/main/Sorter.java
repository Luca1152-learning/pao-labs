package main;

public interface Sorter {
    int[] sort(int[] list);

    static Sorter create(SorterType type) {
        switch (type) {
            case BUBBLE:
                return new BubbleSorter();
            case INTER:
                return new InterchangeSorter();
            default:
                return null;
        }
    }

    enum SorterType {
        BUBBLE,
        INTER
    }
}
