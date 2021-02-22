package lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheDirectoryTest
{
    private static final TheDirectory TEST_DIRECTORY_ONE = new TheDirectory() ;
    {
        {
            TEST_DIRECTORY_ONE.addEntry( new DirectoryEntry("Adam", "760-754-3456"));
            TEST_DIRECTORY_ONE.addEntry( new DirectoryEntry("Anders", "750-345-3654")) ;
            TEST_DIRECTORY_ONE.addEntry( new DirectoryEntry("Blake", "740-321-1234")) ;
        }
    } ;
    private static final TheDirectory TEST_DIRECTORY_TWO = new TheDirectory() ;
    {
        {
            TEST_DIRECTORY_TWO.addEntry( new DirectoryEntry("Adam", "760-754-3456"));
            TEST_DIRECTORY_TWO.addEntry( new DirectoryEntry("Anders", "750-345-3654")) ;
            TEST_DIRECTORY_TWO.addEntry( new DirectoryEntry("Kyle", "740-321-1234")) ;
        }
    } ;

    @Test
    void addOrChangeEntry()
    {
        TheDirectory testDirectory = new TheDirectory(TEST_DIRECTORY_ONE);
        testDirectory.addOrChangeEntry("Kyle", "740-321-1234") ;
        assertEquals(TEST_DIRECTORY_TWO, testDirectory);



    }

    @Test
    void removeEntry() {
    }
}