package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury",88, PlanetTypes.ROCKY),
    VENUS("Venus",225, PlanetTypes.ROCKY),
    EARTH("Earth",365, PlanetTypes.ROCKY),
    MARS("Mars",687, PlanetTypes.ROCKY),
    JUPITER("Jupiter",4333, PlanetTypes.GASSY),
    SATURN("Saturn",10759, PlanetTypes.GASSY),
    URANUS("Uranus",30687, PlanetTypes.ICY),
    NEPTUNE("Neptune",60200, PlanetTypes.ICY);

    private final String name;
    private final int yearLength;
    private final PlanetTypes type;

    Planets(String name, int yearLength, PlanetTypes type ) {
        this.name = name;
        this.yearLength = yearLength;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() { return yearLength; }

    public PlanetTypes getType() { return type; }
}
