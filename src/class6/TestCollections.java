/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author shahzad
 */
public class TestCollections {
    
    public static void main(String[] args) {
        //      Sorting     Ordering    Duplicate
        // Set  No          No          Yes
        // List No/Yes      Yes         Yes/No
        // Map  Yes         Yes         No (key, value)
        
        // Set - HashSet, LinkedHashSet, TreeSet, EnumSet
        // List - Vector, ArrayList, Stack, LinkedList, Queue
        // Map - Hashtable, HashMap, WeakHashMap, LinkedHashMap
        
        Set<String> set = new HashSet<>() ; 
        List<String> list = new ArrayList<>() ; 
        HashMap<String, Integer> map = new HashMap<>() ;
    }
    
}
