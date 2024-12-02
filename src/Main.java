import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // Input: sirius 2, Output: sius
        System.out.println("Enter the word and the limit separated in spaces");
        StringPattern stringPattern=new StringPattern(scanner.next(),scanner.nextInt());
        System.out.println("String Pattern: "+stringPattern.getPattern());

        //Input: 347, Output: 6
        System.out.println("Enter the number:");
        SingleDigitProduct singleDigitProduct=new SingleDigitProduct(scanner.nextInt());
        System.out.println(singleDigitProduct.getResult());

        //Input: 2520, Output: 72
        System.out.println("Enter the number : ");
        SumOfDigits sumOfDigits=new SumOfDigits(scanner.nextInt());
        System.out.println(sumOfDigits.getResult());

        //Input: a3b10c4, Output: aaabbbbbbbbbbcccc
        System.out.println("Enter the word: ");
        StringPatternGenerator stringPatternGenerator=new StringPatternGenerator(scanner.next());
        System.out.println(stringPatternGenerator.getResult());

        /*Input: 10
        Output:
        1 2 7
        2 7 1
        7 1 2*/
        System.out.println("Enter the sum:");
        MatrixPatternGenerator matrixPatternGenerator=new MatrixPatternGenerator(scanner.nextInt());
        matrixPatternGenerator.getPatternMatrix();
    }
}

//https://onlinegdb.com/NXcT44Shs
//https://www.onlinegdb.com/gzwg9eVzw
//https://onlinegdb.com/GD36LT_vI
//https://onlinegdb.com/FQt3vtN-M
//https://onlinegdb.com/kBr-xkmxw