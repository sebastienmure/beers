package com.example.model;

/**
 * Created by sebas on 16/02/2017.
 */
public enum Country {

    AUSTRIA("Austria", "Autriche"),
    BELGIUM("Belgium", "Belgique"),
    DEUTSCHLAND("Deutschland", "Allemagne"),
    FRANCE("France", "France");

    Country(String nameEnglish, String nameFrench) {
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

    public static Country getEnumByNameFrench(String countryFrench) {
        for (Country country : values()) {
            if (country.getNameFrench().equals(countryFrench)) {
                return country;
            }
        }
        return null;
    }
}
