package com.example;
import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    CountryName name;
    Map<String, Currency> currencies;
    Map<String, Language> languages;
    ArrayList<String> capital;
    int population;
    ArrayList<String> continents;

    
    public CountryName getName() {
        return name;
    }

    public Map<String, Currency> getCurrencies() {
        return currencies;
    }

    public Map<String, Language> getLanguages() {
        return languages;
    }
    
    public ArrayList<String> getContinents() {
        return continents;
    }

    public ArrayList<String> getCapital() {
        return capital;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setName(CountryName name) {
        this.name = name;
    }

    public void setCurrencies(Map<String, Currency> currencies) {
        this.currencies = currencies;
    }

    public void setLanguages(Map<String, Language> languages) {
        this.languages = languages;
    }
    
    public void setContinents(ArrayList<String> continents) {
        this.continents = continents;
    }

    public void setCapital(ArrayList<String> capital) {
        this.capital = capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    
    @Override
    public String toString() {
        StringBuilder countryString = new StringBuilder();      
        countryString.append(" Το όνομα χώρας είναι: ").append(name);
        if (capital != null) countryString.append("\n Η πρωτεύουσά της είναι: ").append(capital.getFirst());
        if (currencies != null) {
            countryString.append("\n To νόμισμά της είναι: ");
            
            for (Map.Entry<String, Currency> entry : currencies.entrySet()) {
                String currencyCode = entry.getKey();
                Currency currency = entry.getValue();
                
                countryString.append(currencyCode).append(" ή αλλιώς").append(currency.toString());
            }
        }  
        if (languages != null) {
            countryString.append("\n Οι γλώσσες της είναι:");
            
            for (Map.Entry<String, Language> entry : languages.entrySet()) {
                String languageCode = entry.getKey();
                Language lang = entry.getValue();
                
                countryString.append(" ").append(languageCode).append("=").append(lang.toString());
            }
        }
        
        countryString.append("\n Ο πληθυσμός της είναι: ").append(population);
        countryString.append("\n H ήπειρός της είναι: ").append(continents.getFirst());

        return countryString.toString();
    }

}