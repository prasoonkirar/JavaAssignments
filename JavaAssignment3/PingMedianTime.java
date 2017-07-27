package JavaAssignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * A class for an program will ping any host which given as input and
 * computes the median of the time taken to ping specific number of pings.
 * Created by Prasoon on 25/7/17.
 */
public class PingMedianTime {

    /**
     *A method to make a command for the process builder takin ping count
     * and the ping address from user and adding all to make a sensible address
     * to be read in terminal
     * @return list of string containing the command for ping
     */
    public List<String> makeCommand() {
        int flag=0;
        List<String> command = new ArrayList<>();
        while (flag == 0) {
            try {
                System.out.println("Enter number of Ping counts ");
                command.add("ping");
                command.add("-c");
                Scanner sc = new Scanner(System.in);
                int pingCount = sc.nextInt();
                String pingCount1=Integer.toString(pingCount);
                command.add(pingCount1);
                System.out.println("\nEnter ping address or IP");
                String pingAddress = sc.next();
                System.out.println("\n");
                command.add(pingAddress);
                flag=1;
                return command;
            } catch (Exception m) {
                System.out.println("Error!!! Invalid input...!");
                System.out.println("Please again give the input\n");
            }
        }
        return command;
    }

    /**
     *A method to ping the given address and take out the reaction time substring
     * and put that time in a array so that it can be further sent for median calculation.
     * @param command ping command generated and returned from makeCommand method.
     * @return a list of double values that is the array list of time take to ping.
     */
    public List<Double> commandOutputRead(List<String> command){

        int flag=0;
        List<Double> array=new ArrayList<>();
        try {
            ProcessBuilder process= new ProcessBuilder(command);
            Process process1 = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    process1.getInputStream()));
            String readline;
            String time,time1;
            int index=0;
            double p1;
            while ((readline = reader.readLine()) != null) {
                index = readline.indexOf("time=");
                if (index > 0) {
                    flag=1;
                    System.out.print("Reaction ");
                    time=readline.substring(index);
                    System.out.println(time);
                    time1=time.substring(time.indexOf("=")+1,time.indexOf(" "));
                    p1=Double.parseDouble(time1);
                    array.add(p1);
                }
            }
            if (flag==0){
                throw new CustomException1("Invalid input or Network is not connected");
            }
            System.out.println("\n");
        }catch (Exception m){
            System.out.println("Error found");
            System.out.println(m);
        }
        return array;
    }

    /**
     *A method to sort the array list and then calculate the median and print it.
     * @param array the arraylist containing ping reaction time of the given ping counts
     */
    public double printMedian(List<Double> array){
        double median=0;
        if (array.size()!=0){
            Collections.sort(array);

            int middle = array.size()/2;
            if (array.size()%2 == 1) {
                median=array.get(middle);
            } else {
                median=((array.get(middle-1)) + (array.get(middle))) / 2.0;
            }
        }
        return median;
    }

}


