package org.example;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void setName() {
        String expected = "John";
        Person person = new Person();
        person.setName(expected);
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    void setAge() {
        int expected = 21;
        Person person = new Person();
        person.setAge(expected);
        int actual = person.getAge();
        assertEquals(expected,actual);
    }

    @Test
    void getName() {
        String expected = "John";
        Person person = new Person(expected);
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getAge() {
        int expected = 21;
        Person person = new Person(expected);
        int actual = person.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void addName() {
        String expected = "Mary";
        Person person = new Person("John");
        person.addName(expected);
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("John");
        expectedList.add("Mary");
        assertTrue(expectedList.equals(person.getList()));

        //This code doesn't consider duplicates
        //assertTrue(person.getList().contains(expected));


    }

    @Test
    void removeName() {
        String expected = "Mary";
        Person person = new Person("John");
        person.addName(expected);
        person.removeName(expected);
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("John");
        assertEquals(expectedList,person.getList());

        //This code doesn't consider duplicates
        //assertFalse(person.getList().contains(expected));

    }

    @Test
    void getSizeOfList() {
        String name1 = "Mary";
        String name2 = "Larry";
        Person person = new Person("John");
        person.addName(name1);
        person.addName(name2);
        int expected = 3;
        int actual = person.getSizeOfList();
        assertEquals(expected,actual);
    }

    @Test
    void getList() {
        String name1 = "Mary";
        String name2 = "John";
        List<String> expectedNames = new ArrayList<>();
        expectedNames.add(name1);
        expectedNames.add(name2);
        Person person = new Person();
        person.addName(name1);
        person.addName(name2);
        List<String> actualNames = person.getList();
        assertEquals(expectedNames,actualNames);
    }
}