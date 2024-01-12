package com.example;

public class Language {
    String language;

    
    public Language() {
    }

    public Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    @Override
    public String toString() {
        StringBuilder lan = new StringBuilder();
        lan.append(" ").append(language);
        return lan.toString();
    }
}
