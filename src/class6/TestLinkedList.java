/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

import class4.Dog;
import java.io.Serializable;

/**
 *
 * @author shahzad
 */
public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>("one");
        list.addItem("two");
        list.addItems(new String[]{"three", "four"});
        list.addItem("five");
        list.addItem("six");
        print(list);

        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.addItems(new Integer[]{3, 4, 5, 6, 7, 8, 9});
        print(intList);
        
        MyLinkedList<Dog> dogList = new MyLinkedList<Dog>() ;
        dogList.addItem(new Dog("list"));
        print(dogList);
        
        MyLinkedList<Pair<String, Integer>> pairList = 
                new MyLinkedList<>() ;
        pairList.addItem(new Pair<>("One", 1));
        print(pairList) ;
    }

    public static void print ( MyLinkedList<?> list ) {
        System.out.println(list);
    }
}
