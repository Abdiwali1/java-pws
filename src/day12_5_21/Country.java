package day12_5_21;

public class Country {
    private String name;
    private String mainLanguage;
    private int population; // unit is millions
    private double latitude;
    private double longitude;

    public Country(String name, String mainLanguage, int population, double latitude, double longitude) {
        this.name = name;
        this.mainLanguage = mainLanguage;
        this.population = population;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", mainLanguage='" + mainLanguage + '\'' +
                ", population=" + population +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
