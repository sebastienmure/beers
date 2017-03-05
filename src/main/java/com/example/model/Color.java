package com.example.model;

/**
 * Created by sebas on 17/02/2017.
 */
public enum Color {

    BLONDE("Blonde", "Blonde"),
    BRUNE("Brune", "Brune"),
    DARK("Dark", "Noire"),
    PALE_ALE("Pale Ale", "Ambrée"),
    WHEAT("Wheat", "Blanche");

    Color(String nameEnglish, String nameFrench) {
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

    public static Color getEnumByNameFrench(String colorFrench) {
        for (Color color : values()) {
            if (color.getNameFrench().equals(colorFrench)) {
                return color;
            }
        }
        return null;
    }
}
