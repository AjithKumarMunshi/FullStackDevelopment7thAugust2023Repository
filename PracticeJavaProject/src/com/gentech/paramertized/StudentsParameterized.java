package com.gentech.paramertized;

class Students {
    String FirstName;
    int age;
    String course;
    int id;

    Students(String name, int age, String course, int id) {
        
        System.out.println("FirstName:" + name);
        System.out.println("Age:" + age);
        System.out.println("course:" + course);
        System.out.println("id:" + id);
        System.out.println("----------------------");
    }
}

class Library {
    String FirstName;
    int id;
    String BookName;
    String Address;

    Library(String name, int id, String bookName, String address) {
        

        System.out.println("FirstName:" + name);
        System.out.println("id:" + id);
        System.out.println("BookName:" + bookName);
        System.out.println("Address:" + address);
        System.out.println("-----------------------");
    }
}

class Sports {
    String SportsName;
    String Coach;
    int NoofPLAYERS;
    int id;

    Sports(String sportsName, String coach, int players, int id) {
        

        System.out.println("SportsName:" + sportsName);
        System.out.println("Coach:" + coach);
        System.out.println("NoofPLAYERS:" + players);
        System.out.println("id:" + id);
    }
}
public class StudentsParameterized {

    public static void main(String[] args) {
        Students details = new Students("Rajkumar", 21, "BSC", 13);
        Library information = new Library("Surya", 1123, "Wings of Fire", "Raichur");
        Sports fitness = new Sports("Cricket", "Rahul", 11, 8988);
    }
}
















