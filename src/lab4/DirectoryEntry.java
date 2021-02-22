package lab4;

public class DirectoryEntry
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
        this.mName = mName;
    }

    public String toString()
    {
        return "(" + mName + "~~" + mNumber + ")" ;
    }
}
