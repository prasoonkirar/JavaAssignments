package Day8Java;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by Prasoon on 21/7/17.
 */
public class TextFileMap {
    public static void main(String args[]){
        char ch;
        Integer freq;
        Map<Character,Integer> m=new HashMap<>();
        try{
            FileReader fr=new FileReader(args[0]);
            int i;
            while((i=fr.read())!=-1){
                ch= (char)i;
                freq = m.get(ch);
                m.put(ch,(freq==null)?1:freq+1);
            }
            fr.close();

            System.out.println("Saved to output.txt in the same directory as of program ");

            FileWriter fr1=new FileWriter("output.txt");
            fr1.write(m.toString());
            fr1.close();
        }catch (Exception e){
            System.out.println("Exception found...!!!!" +e);
        }
        System.out.println(m);

    }

}
