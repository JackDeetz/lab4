package lab4;

import java.util.ArrayList;
import java.util.Objects;

public class TheDirectory
{
    private ArrayList<DirectoryEntry> theDirectory ;

    public TheDirectory()
    {
        theDirectory = new ArrayList<DirectoryEntry>() ;
    }
    public TheDirectory(TheDirectory other)
    {
        theDirectory = (ArrayList<DirectoryEntry>) other.theDirectory.clone();
    }
    public TheDirectory(ArrayList<DirectoryEntry> cloneList)
    {
        theDirectory = (ArrayList<DirectoryEntry>) cloneList.clone() ;
    }
    public void addEntry(DirectoryEntry entry)
    {
        theDirectory.add(entry) ;
    }
    public String addOrChangeEntry(String aName, String newNumber)
    {
        for (int i = 0 ; i < theDirectory.size() ; i++)
        {
            if (theDirectory.get(i).getNumber().equals(newNumber))
            {
                String output = theDirectory.get(i).getname() ;
                theDirectory.get(i).setname(aName);
                return output ;

            }
        }
        theDirectory.add(new DirectoryEntry(aName, newNumber)) ;
        return null ;
    }
    public DirectoryEntry removeEntry(String aName)
    {
        for (int i = 0 ; i < theDirectory.size() ; i++)
        {
            if (theDirectory.get(i).getname().equals(aName))
            {
                DirectoryEntry output = theDirectory.get(i) ;
                theDirectory.remove(i) ;
                return output ;
            }
        }
        return null ;
    }

    public String toString()
    {
        return theDirectory.toString() ;
/*        String output = "[" ;
        for (int i = 0 ; i < theDirectory.size() ; i++)
        {
            output = theDirectory.get(i).toString()
        }*/
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TheDirectory)) return false;
        TheDirectory that = (TheDirectory) o;
        return Objects.equals(theDirectory, that.theDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theDirectory);
    }
}
