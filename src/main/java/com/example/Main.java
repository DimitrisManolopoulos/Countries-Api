package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CountryLibrary countryLibrary = new CountryLibrary();

            List<Country> allCountries = countryLibrary.getAllCountries();
            System.out.println("All Countries:");
            for (Country country : allCountries) {
                System.out.println(country);
            }

            String countryName = "Greece"; 
            Country specificCountry = countryLibrary.getCountryByName(countryName);
            System.out.println("Specific Country: " + specificCountry);

            String language = "spanish"; 
            List<Country> countriesByLanguage = countryLibrary.getCountriesByLanguage(language);
            System.out.println("Countries Speaking " + language + ":");
            for (Country country : countriesByLanguage) {
                System.out.println(country);
            }

            String currency = "eur"; 
            List<Country> countriesByCurrency = countryLibrary.getCountriesByCurrency(currency);
            System.out.println("Countries Using " + currency + ":");
            for (Country country : countriesByCurrency) {
                System.out.println(country);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
