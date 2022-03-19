package main;

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo(Sorter.create(Sorter.SorterType.BUBBLE));
        Demo d2 = new Demo(Sorter.create(Sorter.SorterType.INTER));
    }
}
