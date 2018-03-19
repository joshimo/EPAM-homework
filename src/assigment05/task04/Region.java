package assigment05.task04;

public class Region {

    private String regionName = "";
    private String regionCapital = "";
    private Double regionSpace = 0.0;
    private Integer regionPopulation = 0;
    private final Integer regionId;

    public Region(Integer regionId) {
        this.regionId = regionId;
    }

    public final Region addRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    public final Region addRegionCapital(String regionCapital) {
        this.regionCapital = regionCapital;
        return this;
    }

    public final Region addRegionSpace(double regionSpace) {
        this.regionSpace = regionSpace;
        return this;
    }

    public final Region addRegionPopulation(Integer regionPopulation) {
        this.regionPopulation = regionPopulation;
        return this;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getRegionCapital() {
        return regionCapital;
    }

    public double getRegionSpace() {
        return regionSpace;
    }

    public Integer getRegionPopulation() {
        return regionPopulation;
    }

    public Integer getRegionId() {
        return regionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        Region region = (Region) o;
        if (!regionName.equals(region.regionName)) return false;
        if (!regionCapital.equals(region.regionCapital)) return false;
        if (!regionSpace.equals(region.regionSpace)) return false;
        return regionId.equals(region.regionId);
    }

    @Override
    public int hashCode() {
        int result = regionName.hashCode();
        result = 31 * result + regionCapital.hashCode();
        result = 31 * result + regionSpace.hashCode();
        result = 31 * result + regionId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder regionString = new StringBuilder("Id = " + regionId + "\n");
        regionString.append("Region name: " + regionName + "\n");
        regionString.append("Capital: " + regionCapital + "\n");
        if (regionSpace > 0)
            regionString.append("Region space: " + regionSpace + "sq.m.\n");
        else
            regionString.append("Region space: not defined \n");
        if (regionPopulation > 0)
            regionString.append("Region population: " + regionPopulation + "\n");
        else
            regionString.append("Region population:  not defined \n");
        regionString.append("\n");
        return regionString.toString();
    }
}
