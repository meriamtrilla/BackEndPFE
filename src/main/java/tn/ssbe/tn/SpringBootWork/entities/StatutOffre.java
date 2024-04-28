package tn.ssbe.tn.SpringBootWork.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StatutOffre {
	 OUVERTE("OUVERTE"),
	    FERMEE("FERMEE"),
	    ANNULEE("ANNULEE");
	
	private final String value;

    StatutOffre(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static StatutOffre fromValue(String value) {
        for (StatutOffre statut : StatutOffre.values()) {
            if (statut.getValue().equals(value)) {
                return statut;
            }
        }
        throw new IllegalArgumentException("Statut invalide: " + value);
    }
}
