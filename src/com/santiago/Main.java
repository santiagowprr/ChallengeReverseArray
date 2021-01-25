package com.santiago;

public class Main {

    public void reverse(int[] array){
        int[] tempArr = new int[array.length];
        for (int i=0; i<array.length; i++){
            tempArr[i] = array[array.length-1-i];
        }
        return tempArr;
    }
}
