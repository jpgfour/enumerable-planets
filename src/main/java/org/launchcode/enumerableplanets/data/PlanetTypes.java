package org.launchcode.enumerableplanets.data;

public enum PlanetTypes {

    ROCKY("Rocky"),
    GASSY("Gas Giants"),
    ICY("Ice Giants");

    private final String description;

    PlanetTypes(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
