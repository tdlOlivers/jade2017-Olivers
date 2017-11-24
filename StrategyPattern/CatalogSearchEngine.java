package StrategyPattern;

import java.util.ArrayList;
public class CatalogSearchEngine {

    private SortStrategy sorter;

    public CatalogSearchEngine(SortStrategy ss) {
        sorter = ss;
    }
    public ArrayList search() {
        ArrayList list = a;
        sorter.sort(list);
        return list;
    }
}