/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

/**
 *
 * @author shahzad
 */
public class MyLinkedList <T> {

    private ListItem start, end, current;

    public MyLinkedList() {
    }

    public MyLinkedList(T item) {
        addItem(item);
    }

    public MyLinkedList(T[] items) {
        addItems(items);
    }

    public void addItem(T item) {
        ListItem it = new ListItem(item);
        if (start == null) {
            start = end = it;
        } else {
            end.next = it;
            end = it;
        }
    }

    public void addItems(T[] items) {
        for (T item : items) {
            addItem(item);
        }
    }

    public T getFirst() {
        current = start;
        return current != null ? current.item : null;
    }

    public T getNext() {
        if (current != null) {
            current = current.next;
        }
        return current != null ? current.item : null;
    }

    @Override
    public String toString() {
        StringBuffer buf =new StringBuffer() ;
        for ( T item = getFirst(); item !=null ; 
                item = getNext() ) {
            buf.append(item);
            buf.append(",") ;
        }
        return buf.toString() ;
    }
    
    private class ListItem {

        T item;
        ListItem next;

        public ListItem(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "ListItem{" + "item=" + item + ", next=" + next + '}';
        }
    }
}
