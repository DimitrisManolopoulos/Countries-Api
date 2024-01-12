package com.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CountryApiClient {
    private static final String API_BASE_URL = "https://restcountries.com/v3.1/";

    public String getAllCountries() throws Exception {
        return fetchData("all");
    }

    public String getCountryByName(String name) throws Exception {
        return fetchData("name/" + name);
    }

    public String getCountryByFullName(String name) throws Exception {
        return fetchData("name/" + name + "?fullText=true");
    }

    public String getCountryByCode(String code) throws Exception {
        return fetchData("alpha/" + code);
    }

    public String getCountriesByLanguage(String language) throws Exception {
        return fetchData("lang/" + language);
    }

    public String getCountriesByCurrency(String currency) throws Exception {
        return fetchData("currency/" + currency);
    }
    
    private String fetchData(String endpoint) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_BASE_URL + endpoint)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
