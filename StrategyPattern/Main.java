package StrategyPattern;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        SortAlgorithm sorter = new QuickSort();
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        sorter.sort(obj);
	}
}
