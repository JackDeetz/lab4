package lab4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    private static final ArrayList<String> TEST_ARRAYLIST_ONE = new ArrayList<String>() {
        {
            add("Old") ;
            add("McDonald") ;
            add("Had") ;
            add("A") ;
            add("Farm");
        }
    } ;
    private static final ArrayList<String> TEST_ARRAYLIST_TWO = new ArrayList<String>() {
        {
            add("Farm");
            add("McDonald") ;
            add("Had") ;
            add("A") ;
            add("Old") ;
        }
    } ;
    private static final ArrayList<String> TEST_ARRAYLIST_THREE = new ArrayList<String>() {
        {
            add("McDonald") ;
            add("Had") ;
            add("A") ;
            add("Farm");
        }
    } ;
    private static final String[] ANSWER_TOSTRING = {  TEST_ARRAYLIST_ONE.get(0).toString(),
            TEST_ARRAYLIST_ONE.get(1).toString(),
            TEST_ARRAYLIST_ONE.get(2).toString(),
            TEST_ARRAYLIST_ONE.get(3).toString(),
            TEST_ARRAYLIST_ONE.get(4).toString()};

    @org.junit.jupiter.api.Test
    void replace()
    {
        ArrayList<String> testList = (ArrayList<String>) TEST_ARRAYLIST_ONE.clone();
        main.replace(testList, testList.get(0), testList.get(4));
        assertTrue(testList.toString().equals(TEST_ARRAYLIST_TWO.toString()));

    }

    @Test
    void delete()
    {
        ArrayList<String> testList = (ArrayList<String>) TEST_ARRAYLIST_ONE.clone();
        main.delete(testList, testList.get(0));
        assertTrue(testList.toString().equals(TEST_ARRAYLIST_THREE.toString()));
    }
}