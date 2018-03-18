package assigment06.task01;

import java.util.ArrayList;
import java.util.List;

/** 1. Можно ли реализовать класс AirplaneEngine (двигатель) как
 * внутренний класс для класса Airplane (самолет)? В каком случае
 * внутренний класс имеет смысл объявлять открытым/защищенным?
 * Определите сласс Engine внутри класса AirplaneEngine. Вынесите в
 * отдельный интерфейс IEngine методы класса AirplaneEngine и
 * реализуйте их в классе AirplaneEngine. Определите класс Airplane,
 * имеющий несколько двигателей. */

public class Airplane {

    class AirplaneEngine implements IEngine {

        private int num;

        AirplaneEngine(int num) {
            this.num = num;
        }

        @Override
        public boolean start() {
            System.out.println("Aircraft " + modelName  + " Bort number " + bortNumber + " Engine #" + num + " is Warming up...");
            return true;
        }

        @Override
        public boolean work() {
            System.out.println("Aircraft " + modelName  + " Bort number " + bortNumber + " Engine #" + num + " is ready");
            return true;
        }

        @Override
        public boolean stop() {
            System.out.println("Aircraft " + modelName  + " Bort number " + bortNumber + " Engine #" + num + " is cooling down...");
            return true;
        }

        class Engine {

        }
    }

    private int engineNum;
    private List<IEngine> engines;
    private String modelName = "Noname";
    private String bortNumber = "Nonumber";

    public Airplane() {
        engineNum = 1;
        engines = new ArrayList<>();
        engines.add(new AirplaneEngine(1));
    }

    public Airplane(int engineNum) {
        this.engineNum = engineNum;
        engines = new ArrayList<>();
        for (int counter = 0; counter < engineNum; counter ++)
            engines.add(new AirplaneEngine(counter + 1));
    }

    public int getEngineNum() {
        return engineNum;
    }

    public List<IEngine> getEngines() {
        return engines;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBortNumber() {
        return bortNumber;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setBortNumber(String bortNumber) {
        this.bortNumber = bortNumber;
    }
}
