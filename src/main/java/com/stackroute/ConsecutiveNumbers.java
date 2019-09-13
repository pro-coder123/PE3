package com.stackroute;

import java.util.Arrays;

public class ConsecutiveNumbers {

    public boolean checkconsecutive(int[] a)
    {
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
            if(a[i+1]!=a[i]+1)
                return false;
        return true;
    }


}
