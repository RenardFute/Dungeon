package fr.renardfute.dungeon.Utils;

import java.lang.reflect.Array;

public class ArrayUtils<A> {

    Class<A> aClass;

    public ArrayUtils(Class<A> aClass){
        this.aClass = aClass;
    }

    public A[] append(A[] first, A item){
        @SuppressWarnings("unchecked")
        A[] newArray = (A[]) Array.newInstance(aClass, first.length + 1);
        for(int i = 0; i <= first.length; i++){
            if(i == newArray.length - 1){
                newArray[i] = item;
            }
            else {
                newArray[i] = first[i];
            }
        }

        return newArray;
    }

}
