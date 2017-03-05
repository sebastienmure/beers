package com.example.model;

/**
 * Created by sebas on 17/02/2017.
 */
public enum Strenght {

    AVERAGE("Average", "Moyenne"),
    LIGHT("Light", "Legère"),
    STRONG("Strong", "Forte");

    Strenght(String nameEnglish, String nameFrench) {
        this.nameEnglish = nameEnglish;
        this.nameFrench = nameFrench;
    }

    private String nameEnglish;

    private String nameFrench;

    public String getNameEnglish() {
        return nameEnglish;
    }

    public String getNameFrench() {
        return nameFrench;
    }

    public static Strenght getEnumByNameFrench(String strenghtFrench) {
        for (Strenght strenght : values()) {
            if (strenght.getNameFrench().equals(strenghtFrench)) {
                return strenght;
            }
        }
        return null;
    }
}
