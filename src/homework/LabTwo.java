package homework;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

/**
 *
 * @author Mike
 */
public class LabTwo {
    public static void main(String[] args) {
        Movie m1 = new Movie("Adventuring", "John Smith");
        Movie m2 = new Movie("Speeder", "Sarah Adams");
        Movie m3 = new Movie("Adventuring", "John Smith");
        Movie m4 = new Movie("Absolute Winners", "Robert Jones");
        
        Map map = new HashMap();
        map.put("Adventuring, Smith", m1);
        map.put("Speeder, Adams", m2);
        //If the duplicate is given the same key as the first, the duplicate
        //will overwrite the value.
        map.put("Adventuring, Smith", m3);
        map.put("Absolute, Robert", m4);
        
        Movie movie = (Movie)map.get("Adventuring, Smith");
        System.out.println(movie + "\n");
        
        Set keys = map.keySet();
        for(Object key : keys) {
            movie = (Movie)map.get(key);
            System.out.println(movie);
        }
    }
}
