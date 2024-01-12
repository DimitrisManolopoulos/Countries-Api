package com.example;
import java.util.Map;

public class CountryName {
	    String common;
	    String official;
	    Map<String, CodeName> nativeName;

	    public String getCommon() {
	        return common;
	    }

	    public void setCommon(String common) {
	        this.common = common;
	    }

	    public String getOfficial() {
	        return official;
	    }

	    public void setOfficial(String official) {
	        this.official = official;
	    }

	    public Map<String, CodeName> getNativeName() {
	        return nativeName;
	    }

	    public void setNativeName(Map<String, CodeName> nativeName) {
	        this.nativeName = nativeName;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(common);
	        sb.append(" και το επίσημο όνομα είναι: ").append(official);
	        return sb.toString();
	    }
}
