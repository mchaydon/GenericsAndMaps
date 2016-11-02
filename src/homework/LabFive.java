/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mike
 */
public class LabFive {
    /*Store the same four Movie objects in a TreeSet. Demonstrate that sorting works
    (default order) AND that duplicates are removed by looping through the set and
    outputting the toString() value to the console.*/
    
    public static void main(String[] args) {
        Movie m1 = new Movie("Adventuring", "John Smith", 100);
        Movie m2 = new Movie("Speeder", "Sarah Adams", 101);
        Movie m3 = new Movie("Lost", "James Jobs", 100);
        Movie m4 = new Movie("Absolute Winners", "Robert Jones", 102);

        Set<Movie> set = new TreeSet<Movie>();
        set.add(m4);
        set.add(m2);
        set.add(m3);
        set.add(m1);
        
        for(Movie movie : set) {
            System.out.println(movie.toString());
        }
    }
}
