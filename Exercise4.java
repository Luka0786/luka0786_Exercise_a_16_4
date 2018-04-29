package Kap16Exercise4;

import Kap16Exercise2.LinkedIntList;

public class Exercise4
{
    /*
    Write a method called lastIndexOf that accepts an integer value
    as a parameter and that returns the index in the list of the last
    occurrence of that value, or 1 if the value is not found in the list.
    For example, if a variable list stores the values
    [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return 6.
    If the call had instead been list.lastIndexOf(3), the method would return –1.
    */

    //indexOf i bogen

    public static void main(String[] args)
    {
        LinkedIntListExercise4 list = new LinkedIntListExercise4();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);

        System.out.println(list.lastIndexOf(18));
        System.out.println(list.lastIndexOf(3));
    }
}
