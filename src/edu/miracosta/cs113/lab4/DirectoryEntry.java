package edu.miracosta.cs113.lab4;

public class DirectoryEntry implements Cloneable
{
    private String mName ;
    private String mNumber ;

    public DirectoryEntry(){}
    public DirectoryEntry(String name, String number)
    {
        mName = name ;
        mNumber = number ;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        this.mNumber = number;
    }

    public String getname() {
        return mName;
    }

    public void setname(String name) {
        this.mName = name;
    }

//    @Override
//    public DirectoryEntry clone() throws CloneNotSupportedException {
//        DirectoryEntry temp = (DirectoryEntry) super.clone() ;
//        return temp ;
//    }

    @Override
    public String toString()
    {
        return "(" + mName + "~~" + mNumber + ")" ;
    }
}
