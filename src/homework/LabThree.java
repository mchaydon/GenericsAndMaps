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
public class LabThree {
    /*Store the same four Movie objects in a TreeMap. Demonstrate that sorting
    works, but only the keys are sorted. How can you sort the values? Retrieve a
    Collection of the values using the values() method of your map. Now use the
    Collections.sort() method to sort those values by the default sort order*/
    
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
        Collections.sort(sortedList);
        
        for(Object val : sortedList) {
            System.out.println((Movie)val);
        }
        
        

    }
}
