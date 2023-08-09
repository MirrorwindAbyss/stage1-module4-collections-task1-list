package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(Integer element : sourceList){
            if(element%2==1){
                linkedList.addFirst(element);
            } else{
                linkedList.addLast(element);
            }
        }
        return linkedList;
    }
}
