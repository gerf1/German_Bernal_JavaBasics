import java.util.Arrays;

public class BasicsTesting {
    public static void main(String[] args){
        Basics basics = new Basics();

        basics.print_1_to_255();   //Print 1-255

        basics.oddNumbers_1_to_255(); //Print odd numbers between 1-255

        basics.Sum_1_to_255(); //Print Sum


        int[] array = {4, 7, 8, -1, -4, 6}; //Array

        basics.interateArray(array); //Iterating through an array
        basics.findMax(array); //Find Max

        basics.getAverage(array); //Get Average

        System.out.println(basics.arrayOddNumbers());  //Array with Odd Numbers

        System.out.println(basics.greaterThanY(array,4)); //Greater Than Y
        
        System.out.println(Arrays.toString(basics.squareValues(array))); //Square the values
        int[] arr = {4, 7, 8, -1, -4, 6}; //Array
        System.out.println(Arrays.toString(basics.eliminateNegatives(arr)));//Eliminate Negative Numbers
        int[] arrMaxMin = {1, 5, 10, -2}; //Array
        System.out.println(Arrays.toString(basics.maxMinAvg(arrMaxMin))); //Max, Min, and Average
        int[] arrShift = {1, 5, 10, 7, -2};
        System.out.println(Arrays.toString(basics.shiftArray(arrShift))); //Shifting the Values in the Array




    }
}