package assigment05.task04;

public abstract class Country {
    String countryName;
    String continentName;
    String capital;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    //abstract <T extends Country> T create();

    public Country setContinentName(String continentName) {
        this.continentName = continentName;
        return this;
    }

    public Country setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public String getCapital() {
        return capital;
    }
}
