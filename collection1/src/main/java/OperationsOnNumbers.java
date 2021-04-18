import java.util.*;
import java.lang.*;
public class OperationsOnNumbers{

    ArrayList<Integer> numbers = new ArrayList<>();

    //  OperationsOnNumbers() { //constructor that always exists by default bc of the name of class }

    public void printNumbers(){
        System.out.println(numbers);
    }



    public double sumNumbers(){
        double sum = 0;
        for (int n : numbers) { // n is every single number from array :)
            sum = sum + n;
        }
        return sum;
    }


    public double countAverage(){
        int countElement = numbers.size(); // size = count how many elements stays in the array
        return sumNumbers()/countElement; // better looking n faster version of : double average = sumNumbers()/countElement; return average;
    }

    public int countNumberOfPositive(){
        int positiveNumbers = 0;
        for (int n2 : numbers) {
            if ( n2 >= 1){
                positiveNumbers = positiveNumbers + 1;
            }

        }
        return positiveNumbers;

    }

    public int[] findMinElement(){
        int minNumber = Integer.MAX_VALUE;
        for(int m : numbers) {
            if (m<minNumber){
                minNumber = m;
            }
        }
        int index = numbers.indexOf(minNumber);

        return new int[]{minNumber, index};
    }




}
