// Given an array of integers, retrun the unique elements.System

package DataStructures.HashSet;

import java.util.HashSet;

public class Lab05_IQ {
    public static void main(String[] args) {
        int input[]={1,2,2,3,3,4};
        int[]output=new int[input.length];
        int outputIndex=0;
        HashSet uniqueSet=new HashSet();
        for(int num:input)
        {
            uniqueSet.add(num);
        }
        System.out.println(uniqueSet);
    }
}
