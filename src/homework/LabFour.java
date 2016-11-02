/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Mike
 */
public class LabFour {
    /*Now, using the same collection in #3 above, try creating and using a Comparator
    to produce an alternate sort order for the Movie objects and sort by director.*/
    
    public static void main(String[] args) {
        Movie m1 = new Movie("Adventuring", "John Smith", 100);
        Movie m2 = new Movie("Speeder", "Sarah Adams", 101);
        Movie m3 = new Movie("Lost", "James Jobs", 100);
        Movie m4 = new Movie("Absolute Winners", "Robert Jones", 102);
        
        Map map = new TreeMap();
        map.put(100, m1);
        map.put(101, m2);
        map.put(102, m4);
        //If the duplicate is given the same key as the first, the duplicate
        //will overwrite the value.
        map.put(100, m3);
        
        
        Collection values = map.values();
        List sortedList = new ArrayList(values);
        Collections.sort(sortedList, new MovieByDirector());
        
        for(Object val : sortedList) {
            System.out.println((Movie)val);
        }
    }
}
