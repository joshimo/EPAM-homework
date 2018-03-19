package assigment05.task04;

public abstract class Country {

    String countryName;
    String continentName;
    String capital;
    Integer population;
    Double square = 0.0;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country setContinentName(String continentName) {
        this.continentName = continentName;
        return this;
    }

    public Country setCapital(String capital) {
        this.capital = capital;
        return this;
    }

    public Country setPopulation(Integer population) {
        this.population = population;
        return this;
    }

    public Country setSquare(Double square) {
        this.square = square;
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

    public Integer getPopulation() {
        return population;
    }

    public Double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country name: " + countryName + "\n");
        sb.append("Continent: " + continentName + "\n");
        sb.append("Capital: " + capital + "\n");
        sb.append("Total population: " + population + " people\n");
        sb.append("Total square: " + square + " mln.sq.meters\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        if (!getCountryName().equals(country.getCountryName())) return false;
        if (!getContinentName().equals(country.getContinentName())) return false;
        if (!getCapital().equals(country.getCapital())) return false;
        return getSquare().equals(country.getSquare());
    }

    @Override
    public int hashCode() {
        int result = getCountryName().hashCode();
        result = 31 * result + getContinentName().hashCode();
        result = 31 * result + getCapital().hashCode();
        result = 31 * result + getSquare().hashCode();
        return result;
    }
}
