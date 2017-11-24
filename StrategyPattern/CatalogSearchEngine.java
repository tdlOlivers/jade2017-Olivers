package StrategyPattern;

import java.util.ArrayList;
public class CatalogSearchEngine {

    private SortAlgorithm sorter;

    public CatalogSearchEngine(SortAlgorithm ss) {
        sorter = ss;
    }
    public ArrayList search() {
        ArrayList list = null;
        sorter.sort(list);
        return list;
    }
}