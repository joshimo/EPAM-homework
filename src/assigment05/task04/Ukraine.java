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
        ukraine.setCapital("Kyiv");
        ukraine.setContinentName("Europe");
        addRegion(new Region(1).setRegionName("Kyivska region").setRegionCapital("Kyiv").setRegionSpace(1.0).setRegionPopulation(4000000));
        addRegion(new Region(2).setRegionName("Zhytomyrska region").setRegionCapital("Zhytomyr").setRegionSpace(2.0).setRegionPopulation(400000));
        addRegion(new Region(3).setRegionName("Cherkasska region").setRegionCapital("Cherkassy").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(4).setRegionName("Poltavska region").setRegionCapital("Poltava").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(5).setRegionName("Chernihivska region").setRegionCapital("Chernihiv").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(6).setRegionName("Vinnyntska region").setRegionCapital("Vinnytsya").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(7).setRegionName("Odesska region").setRegionCapital("Odessa").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(8).setRegionName("Vinnyntska region").setRegionCapital("Vinnytsya").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(9).setRegionName("Kirovohradska region").setRegionCapital("Kropyvnytskyi").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(10).setRegionName("Mykolaivska region").setRegionCapital("Mykolaiv").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(11).setRegionName("Khersonska region").setRegionCapital("Kherson").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(12).setRegionName("Sumska region").setRegionCapital("Sumy").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(13).setRegionName("Donetska region").setRegionCapital("Mariupil").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(14).setRegionName("Luhanska region").setRegionCapital("Severodonetsk").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(15).setRegionName("Dnipropetrovska region").setRegionCapital("Dnipro").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(16).setRegionName("Zaporizhska region").setRegionCapital("Zaporizhzhya").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(17).setRegionName("Kharkivska region").setRegionCapital("Kharkiv").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(18).setRegionName("Rivnenska region").setRegionCapital("Rivne").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(19).setRegionName("Khmelnytska region").setRegionCapital("Khmelnytskyi").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(20).setRegionName("Ternopilska region").setRegionCapital("Ternopil").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(21).setRegionName("Chernivetska region").setRegionCapital("Chernivtsi").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(22).setRegionName("Ivano-Frankivska region").setRegionCapital("Ivano-Frankivsk").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(23).setRegionName("Lvivska region").setRegionCapital("Lviv").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(24).setRegionName("Volynska region").setRegionCapital("Lutsk").setRegionSpace(3.0).setRegionPopulation(400000));
        addRegion(new Region(25).setRegionName("Zakarpatska region").setRegionCapital("Uzhhorod").setRegionSpace(3.0).setRegionPopulation(400000));
        return ukraine;
    }

    private Ukraine(String countryName) {
        super(countryName);
        regions = new ArrayList<>();
    }

    private static void addRegion(Region region) {
        regions.add(region);
    }

    @Override
    public String toString() {
        return "Ukraine{" +
                "countryName='" + countryName + '\'' +
                ", continentName='" + continentName + '\'' +
                ", capital='" + capital + '\'' +
                ", regions" + regions.toString() +
                '}';
    }
}
