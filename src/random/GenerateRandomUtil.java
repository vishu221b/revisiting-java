package random;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
//import java.lang.Math;

public class GenerateRandomUtil {
    Random rand = new Random();

    private int random1 = rand.nextInt(100); // Generation in range 0 to 99
    private int random2 = rand.nextInt(45); // Generation in range 0, 44
    private double randomDouble1 = rand.nextDouble();
    private double randomDouble2 = rand.nextDouble();

    @Override
    public String toString() {
        return "GenerateRandomUtil{ (Random Integers" +
                ": [random1=" + random1 +
                ", random2=" + random2 +
                "]), (Random Doubles: [" +
                "randomDouble1=" + randomDouble1 +
                ", randomDouble2=" + randomDouble2 +
                "]), (Math Random: ["+ Math.random() +"])" +
                "}";
    }
}
