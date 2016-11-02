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
        Movie m1 = new Movie("Adventuring", "John Smith", 100);
        Movie m2 = new Movie("Speeder", "Sarah Adams", 101);
        Movie m3 = new Movie("Lost", "James Jobs", 100);
        Movie m4 = new Movie("Absolute Winners", "Robert Jones", 102);
        
        Map map = new HashMap();
        map.put(102, m4);
        map.put(101, m2);
        //If the duplicate is given the same key as the first, the duplicate
        //will overwrite the value.
        map.put(100, m3);
        map.put(100, m1);
        
        
        Movie movie = (Movie)map.get("Adventuring, Smith");
        System.out.println(movie + "\n");
        
        Set keys = map.keySet();
        for(Object key : keys) {
            movie = (Movie)map.get(key);
            System.out.println(movie);
        }
    }
}
