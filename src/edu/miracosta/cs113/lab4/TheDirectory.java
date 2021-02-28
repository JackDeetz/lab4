package edu.miracosta.cs113.lab4;

import java.util.ArrayList;
import java.util.Objects;

public class TheDirectory
{
    private ArrayList<DirectoryEntry> theDirectory ;

    public TheDirectory()
    {
        theDirectory = new ArrayList<DirectoryEntry>() ;
    }


    public String addOrChangeEntry(String aName, String newNumber)  //search for the newNumber(directoryEntry.mNumber), if found,update, otherwise, add to the arrayList
    {
        for (int i = 0 ; i < theDirectory.size() ; i++)
        {
            if (theDirectory.get(i).getNumber().equals(newNumber))      //test is each number is the same as the 'new' entry
            {
                String output = theDirectory.get(i).getname() ;         //save old name to be replaced in a temperary variable, to return later
                theDirectory.get(i).setname(aName);                     //update the Entry with the new Name
                return output ;                                 //return replaced name

            }
        }
        theDirectory.add(new DirectoryEntry(aName, newNumber)) ;    //add to arrayList if theres no entry to update
        return null ;
    }

    public DirectoryEntry removeEntry(String aName)                 //if parameter matches any entry, remove and return the delete entry
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
        return null ;                                                   //otherwise, return null
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

    /*
        public TheDirectory(TheDirectory other) throws CloneNotSupportedException {
            theDirectory = new ArrayList<>() ;
            Iterator<DirectoryEntry> theDirectoryIterator = other.theDirectory.iterator() ;
            {
                while (theDirectoryIterator.hasNext())
                {
                    theDirectory.add(theDirectoryIterator.next().clone()) ;

                }

            }
        }

     */
    public void addEntry(DirectoryEntry entry)
    {
        theDirectory.add(entry) ;
    }

}
