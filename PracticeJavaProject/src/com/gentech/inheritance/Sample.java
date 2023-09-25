package com.gentech.inheritance;
class library {
    String name;
    int id;

    public library(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}

class book extends library {
    String bookname;
    String location;

    public book(String name, int id, String bookname, String location)
    {
        super(name, id);
        this.bookname = bookname;
        this.location = location;
    }
}

class employee extends book {
    public employee(String name, int id, String bookname, String location) {
        super(name, id, bookname, location);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Book name: " + bookname);
        System.out.println("Location: " + location);
    }
}

public class Sample {

    public static void main(String[] args) {
        
    	employee obj = new employee("state library", 30, "java", "sindhanur ");
        obj.displayInfo();
    }
}


