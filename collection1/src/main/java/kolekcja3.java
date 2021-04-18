import java.util.*;

public class kolekcja3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); // passing a variable

        OperationsOnNumbers op = new OperationsOnNumbers(); // creating new object called op, with a data type 'OperationsOnNumbers'
        int UserInputNumber;
        String UserInputMessage;

        System.out.println("Enter some numbers to be able to perform operations on numbers. After entering number 0, you won't be allowed to enter more numbers.\n");


        do {
            System.out.print("Enter a number: ");
            UserInputNumber = scanner.nextInt();

            if(UserInputNumber != 0) {
                op.numbers.add(UserInputNumber);

            }



        }
        while (UserInputNumber != 0);

        System.out.println("Choose a method within available methods by inputting the name of it:\nprintNumbers\nsumNumbers\naverageNumber\nnumberOfPositiveElements\nsmallestNumberAndIndex\n ");


        UserInputMessage = scanner.next();
        switch (UserInputMessage) { // instead of writing thousands of else if ; default is equal to 'else'
            case "printNumbers" -> op.printNumbers();
            case "sumNumbers" -> System.out.println(op.sumNumbers());
            case "averageNumber" -> System.out.println(op.countAverage());
            case "numberOfPositiveElements" -> System.out.println(op.countNumberOfPositive());
            case "smallestNumberAndIndex" -> System.out.println(Arrays.toString(op.findMinElement()));
            default -> System.out.println("Incorrect method!");
        }






    }


}
