package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=0; i<sourceList.size(); i++){
            if(i%3==2){
                arrayList.add(sourceList.get(i));
                arrayList.add(sourceList.get(i));
            }
        }
        return arrayList;
    }


    public static void main(String[] args) {
        ArrayListCreator a = new ArrayListCreator();

        List<String> list = Arrays.asList("One","Two","Three", "Four");
        ArrayList<String> result = a.createArrayList(list);
        for(String element:result){
            System.out.println(element);
        }
    }
}
