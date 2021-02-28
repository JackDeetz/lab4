package edu.miracosta.cs113.lab4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheDirectoryTest
{
    private static final ArrayList<DirectoryEntry> TEST_DIRECTORY_ONE = new ArrayList<DirectoryEntry>(

            List.of( new DirectoryEntry("Adam", "760-754-3456"),
            new DirectoryEntry("Anders", "750-345-3654"),
            new DirectoryEntry("Blake", "740-321-1234"))) ;


    private static final ArrayList<DirectoryEntry> TEST_DIRECTORY_TWO = new ArrayList<DirectoryEntry>(

            List.of( new DirectoryEntry("Adam", "760-754-3456"),
                    new DirectoryEntry("Anders", "750-345-3654"),
                    new DirectoryEntry("Kyle", "740-321-1234"))) ;


    private static final ArrayList<DirectoryEntry> TEST_DIRECTORY_THREE = new ArrayList<DirectoryEntry>(

            List.of( new DirectoryEntry("Adam", "760-754-3456"),
                    new DirectoryEntry("Anders", "750-345-3654"))) ;


    @Test
    void addOrChangeEntry() throws CloneNotSupportedException {
        TheDirectory testDirectory = new TheDirectory() ;
        testDirectory.addEntry(TEST_DIRECTORY_ONE.get(0));
        testDirectory.addEntry(TEST_DIRECTORY_ONE.get(1));
        testDirectory.addEntry(TEST_DIRECTORY_ONE.get(2));

        testDirectory.addOrChangeEntry("Kyle", "740-321-1234") ;
        assertEquals(TEST_DIRECTORY_TWO.toString(), testDirectory.toString());
        System.out.println("addOrChangeEntry() test directectory \n" + testDirectory);
        System.out.println("addOrChangeEntry() test directectory one \n" + TEST_DIRECTORY_ONE);



    }

    @Test
    void removeEntry() throws CloneNotSupportedException {
        System.out.println("removeEntry() test directectory one initially \n" + TEST_DIRECTORY_ONE);
        TheDirectory testDirectory2 = new TheDirectory() ;
        testDirectory2.addEntry(TEST_DIRECTORY_ONE.get(0));
        testDirectory2.addEntry(TEST_DIRECTORY_ONE.get(1));
        testDirectory2.addEntry(TEST_DIRECTORY_ONE.get(2));
        testDirectory2.removeEntry("Kyle") ;
        assertEquals(TEST_DIRECTORY_THREE.toString(), testDirectory2.toString());
        System.out.println("removeEntry() test directectory2 \n" + testDirectory2);

    }
}