package com.koyi;

import java.util.LinkedList;

public class HashTable {

    private int n = 1000;
    private LinkedList<Student>[] slots = new LinkedList[n];

    public HashTable() {
        for (int i = 0; i < n; i++) {
            slots[i] = new LinkedList<>();
        }
    }

    public void put(String id, Student student) {
        int hashValue = hashFuction(id);
        LinkedList<Student> linkedList = slots[hashValue];
        linkedList.addFirst(student);
    }

    public Student get(String id) {
        int hashValue = hashFuction(id);
        LinkedList<Student> linkedList = slots[hashValue];
        for (Student student : linkedList){
            if (student.id.equals(id)) return student;
        }
        return null;
    }


    private int hashFuction(String id) {
        int idNum = Integer.parseInt(id);
        int hashValue = idNum % n;
        return hashValue;
    }
}


class Student {
    public String id;
    public String name;
}