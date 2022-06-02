package com.ironhack.lab_1;

public class Main {
    public static void main(String[] args) {
        // exercise 1
        int [] values = {1,-16,4,27,-5};
        int result = difference(values);
        System.out.println(result);

        // exercise 2
        smallestAndSecondSmallest(values);

        // exercise 3
        int number1 = 1;
        int number2 = 5;
        double result2 = result(number1,number2);
        System.out.println(result2);
    }
    public static int difference(int[] intArray){
        int biggest = 0;
        int smallest = 0;
        for(int i=0;i< intArray.length;i++){
            if(intArray[i] < smallest){
                smallest = intArray[i];
            } else if (intArray[i] > biggest) {
                biggest = intArray[i];
            }
        }
        return biggest-smallest;
    }

    public static void smallestAndSecondSmallest(int[] intArray){
        int smallest = intArray[0];
        int secondSmallest = intArray[0];

        for(int i=0;i< intArray.length;i++){
            if(intArray[i] < smallest){
                secondSmallest = smallest;
                smallest = intArray[i];
            } else if (intArray[i] > smallest && intArray[i] < secondSmallest) {
                secondSmallest = intArray[i];
            }
        }
        System.out.println(smallest + " " + secondSmallest);
    }

    public static double result(int x,int y){
        return ((Math.pow(x,2))+(Math.pow((((4*y)/5)-x),2)));
    }
}
