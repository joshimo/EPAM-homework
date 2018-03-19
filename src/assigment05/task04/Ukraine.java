package assigment05.task04;

import java.util.ArrayList;
import java.util.List;

/** 4. Создать объект класса Украина, используя класс Область.
 * Методы: вывести на консоль столицу,
 * количество областей, площадь, областные центры.*/

public class Ukraine extends Country {

    private static Ukraine ukraine;
    private static List<Region> regions;

    public static Ukraine create() {
        ukraine = new Ukraine("Ukraine");
        ukraine.addPopulation(42248598).addCapital("Kyiv").addContinentName("Europe").addSquare(603.050);
        addRegion(new Region(1).addRegionName("Kyivska region").addRegionCapital("Kyiv")
                .addRegionSpace(28.121).addRegionPopulation(1732200));
        addRegion(new Region(2).addRegionName("Zhytomyrska region").addRegionCapital("Zhytomyr")
                .addRegionSpace(29.827).addRegionPopulation(1233202));
        addRegion(new Region(3).addRegionName("Cherkasska region").addRegionCapital("Cherkassy")
                .addRegionSpace(20.916).addRegionPopulation(1250925));
        addRegion(new Region(4).addRegionName("Poltavska region").addRegionCapital("Poltava")
                .addRegionSpace(28.750).addRegionPopulation(1462412));
        addRegion(new Region(5).addRegionName("Chernihivska region").addRegionCapital("Chernihiv")
                .addRegionSpace(31.903).addRegionPopulation(1054626));
        addRegion(new Region(6).addRegionName("Vinnyntska region").addRegionCapital("Vinnytsya")
                .addRegionSpace(26.492).addRegionPopulation(1616511));
        addRegion(new Region(7).addRegionName("Odesska region").addRegionCapital("Odessa")
                .addRegionSpace(33.314).addRegionPopulation(2395358));
        addRegion(new Region(8).addRegionName("Kirovohradska region").addRegionCapital("Kropyvnytskyi")
                .addRegionSpace(24.588).addRegionPopulation(999600));
        addRegion(new Region(9).addRegionName("Mykolaivska region").addRegionCapital("Mykolaiv")
                .addRegionSpace(24.585).addRegionPopulation(1164878));
        addRegion(new Region(10).addRegionName("Khersonska region").addRegionCapital("Kherson")
                .addRegionSpace(28.461).addRegionPopulation(1055649));
        addRegion(new Region(11).addRegionName("Sumska region").addRegionCapital("Sumy")
                .addRegionSpace(23.832).addRegionPopulation(1113200));
        addRegion(new Region(12).addRegionName("Donetska region").addRegionCapital("Kramatorsk")
                .addRegionSpace(26.517).addRegionPopulation(4320821));
        addRegion(new Region(13).addRegionName("Luhanska region").addRegionCapital("Severodonetsk")
                .addRegionSpace(26.683).addRegionPopulation(2167802));
        addRegion(new Region(14).addRegionName("Dnipropetrovska region").addRegionCapital("Dnipro")
                .addRegionSpace(31.923).addRegionPopulation(3285626));
        addRegion(new Region(15).addRegionName("Zaporizhska region").addRegionCapital("Zaporizhzhya")
                .addRegionSpace(27.183).addRegionPopulation(1765926));
        addRegion(new Region(16).addRegionName("Kharkivska region").addRegionCapital("Kharkiv")
                .addRegionSpace(31.418).addRegionPopulation(2696427));
        addRegion(new Region(17).addRegionName("Rivnenska region").addRegionCapital("Rivne")
                .addRegionSpace(20.051).addRegionPopulation(1159259));
        addRegion(new Region(18).addRegionName("Khmelnytska region").addRegionCapital("Khmelnytskyi")
                .addRegionSpace(20.629).addRegionPopulation(1309687));
        addRegion(new Region(19).addRegionName("Ternopilska region").addRegionCapital("Ternopil")
                .addRegionSpace(13.824).addRegionPopulation(1074923));
        addRegion(new Region(20).addRegionName("Chernivetska region").addRegionCapital("Chernivtsi")
                .addRegionSpace(8.096).addRegionPopulation(906600));
        addRegion(new Region(21).addRegionName("Ivano-Frankivska region").addRegionCapital("Ivano-Frankivsk")
                .addRegionSpace(13.927).addRegionPopulation(1381798));
        addRegion(new Region(22).addRegionName("Lvivska region").addRegionCapital("Lviv")
                .addRegionSpace(21.831).addRegionPopulation(2530326));
        addRegion(new Region(23).addRegionName("Volynska region").addRegionCapital("Lutsk")
                .addRegionSpace(20.144).addRegionPopulation(1043215));
        addRegion(new Region(24).addRegionName("Zakarpatska region").addRegionCapital("Uzhhorod")
                .addRegionSpace(12.753).addRegionPopulation(1259068));
        addRegion(new Region(25).addRegionName("Republic of Crimea").addRegionCapital("Simferopil")
                .addRegionSpace(0.0).addRegionPopulation(0));
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
