package JavaAssignment3;

import java.util.List;

/**
 * Created by Prasoon on 25/7/17.
 */
public class Main {
    public static void main(String[] args) {

        PingMedianTime ping= new PingMedianTime();
        List<String> command = ping.makeCommand();
        List<Double> array= ping.commandOutputRead(command);
        double median= ping.printMedian(array);
        System.out.println("Median Reaction time = "+median);
    }
}
