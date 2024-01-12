package com.example;

public class CodeName {

    String official;
    String common;

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("το επίσημο όνομα : ").append(official);
        sb.append("και το σύνηθες : ").append(common);
        return sb.toString();
    }
}
