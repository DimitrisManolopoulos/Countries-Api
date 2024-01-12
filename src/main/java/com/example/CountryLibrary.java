package com.example;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class CountryLibrary {
    private CountryApiClient apiClient;
    
    public CountryLibrary() {
        this.apiClient = new CountryApiClient();
    }

    public List<Country> getAllCountries() throws Exception {
        String countriesJson = apiClient.getAllCountries();
        return parseCountryList(countriesJson);
    }

    public Country getCountryByName(String name) throws Exception {
        String countryJson = apiClient.getCountryByName(name);
        return parseCountry(countryJson);
    }

    public Country getCountryByFullName(String name) throws Exception {
        String countryJson = apiClient.getCountryByFullName(name);
        return parseCountry(countryJson);
    }

    public Country getCountryByCode(String code) throws Exception {
        String countryJson = apiClient.getCountryByCode(code);
        return parseCountry(countryJson);
    }

    public ArrayList<Country> getCountriesByLanguage(String language) throws Exception {
        String countriesJson = apiClient.getCountriesByLanguage(language);
        return parseCountryList(countriesJson);
    }

    public ArrayList<Country> getCountriesByCurrency(String currency) throws Exception {
        String countriesJson = apiClient.getCountriesByCurrency(currency);
        return parseCountryList(countriesJson);
    }

    private ArrayList<Country> parseCountryList(String countriesJson) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(countriesJson, new TypeReference<ArrayList<Country>>() {});
    }

    private Country parseCountry(String countryJson) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Country[] countries = objectMapper.readValue(countryJson, Country[].class);
        if (countries != null && countries.length > 0) {
            return countries[0];
        } else {
            throw new Exception("No country data found in the response.");
        }
    }


}

