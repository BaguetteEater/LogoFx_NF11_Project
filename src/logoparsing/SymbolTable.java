package logoparsing;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private Map<String, Double> table = new HashMap<>();

    public void addEntry(String symbol, Double value) {
        this.table.put(symbol, value);
    }

    public Double getEntry(String symbol) {
        return this.table.get(symbol);
    }
}
