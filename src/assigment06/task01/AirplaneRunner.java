package assigment06.task01;

/**
 * Created by Ярик on 15.03.2018.
 */

public class AirplaneRunner {

    private static Airplane airplane1;
    private static Airplane airplane2;

    public static void main(String... args) {
        airplane1 = new Airplane(1);
        airplane1.setModelName("Sesna");
        airplane1.setBortNumber("000123");
        airplane2 = new Airplane(4);
        airplane2.setModelName("Boeing");
        airplane2.setBortNumber("100123");
        airplane1.getEngines().get(0).start();
        airplane1.getEngines().get(0).work();
        airplane1.getEngines().get(0).stop();
        for (IEngine engine : airplane2.getEngines())
            engine.start();
        for (IEngine engine : airplane2.getEngines())
            engine.work();
        for (IEngine engine : airplane2.getEngines())
            engine.stop();
    }

}
