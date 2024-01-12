package com.example;

public class Currency {
    String currencyCode;
    String name;
    String symbol;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public String toString() {
        StringBuilder currency = new StringBuilder();
        currency.append(" ").append(name);
        currency.append(" και το σύμβολο είναι: ").append(symbol);
        return currency.toString();
    }
}
