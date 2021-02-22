package lab4;

import java.util.ArrayList;

public class main
{

    public static void replace(ArrayList<String> aList, String oldItem, String newItem)
    {
        String temp = oldItem ;
        int tempNewItemIndex = aList.indexOf(newItem) ;
        aList.set(aList.indexOf(oldItem), newItem);
        aList.set(tempNewItemIndex, temp);
    }

    public static void delete(ArrayList<String> aList, String target)
    {
        aList.remove(target) ;
    }

}



/*

 */