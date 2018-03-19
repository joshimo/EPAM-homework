package assigment05.task04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** 4. Создать объект класса Украина, используя класс Область.
 * Методы: вывести на консоль столицу,
 * количество областей, площадь, областные центры.*/

public class Ukraine extends Country {

    private static Ukraine ukraine;
    private static List<Region> regions;

    public static Ukraine create() {
        ukraine = new Ukraine("Ukraine");
        ukraine.setPopulation(42248598).setCapital("Kyiv").setContinentName("Europe").setSquare(603.050);
        addRegion(new Region(1).setRegionName("Kyivska region").setRegionCapital("Kyiv").setRegionSpace(28.121).setRegionPopulation(1732200));
        addRegion(new Region(2).setRegionName("Zhytomyrska region").setRegionCapital("Zhytomyr").setRegionSpace(29.827).setRegionPopulation(1233202));
        addRegion(new Region(3).setRegionName("Cherkasska region").setRegionCapital("Cherkassy").setRegionSpace(20.916).setRegionPopulation(1250925));
        addRegion(new Region(4).setRegionName("Poltavska region").setRegionCapital("Poltava").setRegionSpace(28.750).setRegionPopulation(1462412));
        addRegion(new Region(5).setRegionName("Chernihivska region").setRegionCapital("Chernihiv").setRegionSpace(31.903).setRegionPopulation(1054626));
        addRegion(new Region(6).setRegionName("Vinnyntska region").setRegionCapital("Vinnytsya").setRegionSpace(26.492).setRegionPopulation(1616511));
        addRegion(new Region(7).setRegionName("Odesska region").setRegionCapital("Odessa").setRegionSpace(33.314).setRegionPopulation(2395358));
        addRegion(new Region(8).setRegionName("Kirovohradska region").setRegionCapital("Kropyvnytskyi").setRegionSpace(24.588).setRegionPopulation(999600));
        addRegion(new Region(9).setRegionName("Mykolaivska region").setRegionCapital("Mykolaiv").setRegionSpace(24.585).setRegionPopulation(1164878));
        addRegion(new Region(10).setRegionName("Khersonska region").setRegionCapital("Kherson").setRegionSpace(28.461).setRegionPopulation(1055649));
        addRegion(new Region(11).setRegionName("Sumska region").setRegionCapital("Sumy").setRegionSpace(23.832).setRegionPopulation(1113200));
        addRegion(new Region(12).setRegionName("Donetska region").setRegionCapital("Kramatorsk").setRegionSpace(26.517).setRegionPopulation(4320821));
        addRegion(new Region(13).setRegionName("Luhanska region").setRegionCapital("Severodonetsk").setRegionSpace(26.683).setRegionPopulation(2167802));
        addRegion(new Region(14).setRegionName("Dnipropetrovska region").setRegionCapital("Dnipro").setRegionSpace(31.923).setRegionPopulation(3285626));
        addRegion(new Region(15).setRegionName("Zaporizhska region").setRegionCapital("Zaporizhzhya").setRegionSpace(27.183).setRegionPopulation(1765926));
        addRegion(new Region(16).setRegionName("Kharkivska region").setRegionCapital("Kharkiv").setRegionSpace(31.418).setRegionPopulation(2696427));
        addRegion(new Region(17).setRegionName("Rivnenska region").setRegionCapital("Rivne").setRegionSpace(20.051).setRegionPopulation(1159259));
        addRegion(new Region(18).setRegionName("Khmelnytska region").setRegionCapital("Khmelnytskyi").setRegionSpace(20.629).setRegionPopulation(1309687));
        addRegion(new Region(19).setRegionName("Ternopilska region").setRegionCapital("Ternopil").setRegionSpace(13.824).setRegionPopulation(1074923));
        addRegion(new Region(20).setRegionName("Chernivetska region").setRegionCapital("Chernivtsi").setRegionSpace(8.096).setRegionPopulation(906600));
        addRegion(new Region(21).setRegionName("Ivano-Frankivska region").setRegionCapital("Ivano-Frankivsk").setRegionSpace(13.927).setRegionPopulation(1381798));
        addRegion(new Region(22).setRegionName("Lvivska region").setRegionCapital("Lviv").setRegionSpace(21.831).setRegionPopulation(2530326));
        addRegion(new Region(23).setRegionName("Volynska region").setRegionCapital("Lutsk").setRegionSpace(20.144).setRegionPopulation(1043215));
        addRegion(new Region(24).setRegionName("Zakarpatska region").setRegionCapital("Uzhhorod").setRegionSpace(12.753).setRegionPopulation(1259068));
        addRegion(new Region(25).setRegionName("Republic of Crimea").setRegionCapital("Simferopil").setRegionSpace(0.0).setRegionPopulation(0));
        return ukraine;
    }

    private Ukraine(String countryName) {
        super(countryName);
        regions = new ArrayList<>();
    }

    private static void addRegion(Region region) {
        regions.add(region);
    }

    public Integer getRegionsNumber() {
        return regions.size();
    }

    public Region getRegionById(Integer id) {
        return regions.get(id - 1);
    }

    public String getAllRegionsCapitals() {
        StringBuilder sb = new StringBuilder();
        for (Region region : regions)
            sb.append(region.getRegionName() + ": " + region.getRegionCapital() + "\n");
        return sb.toString();
    }

    public String getAllRegionsSquares() {
        StringBuilder sb = new StringBuilder();
        for (Region region : regions)
            sb.append(region.getRegionName() + ": " + region.getRegionSpace() + " mln.sq.m.\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nRegions:\n");
        for (Region region : regions)
            sb.append(region.toString());
        return sb.toString();
    }

}
