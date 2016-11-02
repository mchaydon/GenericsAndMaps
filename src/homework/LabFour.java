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
        Movie m1 = new Movie("Speeder", "John Smith");
        Movie m2 = new Movie("Adventuring", "Sarah Adams");
        Movie m3 = new Movie("Speeder", "John Smith");
        Movie m4 = new Movie("Absolute Winners", "Robert Jones");
        
        Map map = new TreeMap();
        map.put("Speeder, Smith", m1);
        map.put("Adventuring, Adams", m2);
        //If the duplicate is given the same key as the first, the duplicate
        //will overwrite the value.
        map.put("Speeder, Smith", m3);
        map.put("Absolute, Jones", m4);
        
        Collection values = map.values();
        List sortedList = new ArrayList(values);
        Collections.sort(sortedList, new MovieByDirector());
        
        for(Object val : sortedList) {
            System.out.println((Movie)val);
        }
    }
}
