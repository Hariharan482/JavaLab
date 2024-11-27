import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        NumberUtils numberUtils=new NumberUtils();
        System.out.println("Enter the number to be checked as an Armstrong number");
        System.out.println(numberUtils.isArmStrongNumber(sc.nextInt()));
        System.out.println("Enter the range separated by spaces");
        int startRange=sc.nextInt();
        int endRange=sc.nextInt();
        for(int i=startRange;i<=endRange;i++){
            if( numberUtils.isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println("Enter the number to find the sum of digits of a given number");
        System.out.println(numberUtils.sumOfDigits(sc.nextInt()));
        System.out.println("Enter the number of rows of Pyramid");
        numberUtils.generatePattern(sc.nextInt());
        System.out.println("Calculator");
        System.out.println("Enter operation to be done and the numbers to which opeation to be done separated by spaces");
        numberUtils.calculator(sc.next(),sc.nextInt(),sc.nextInt());
        sc.close();

    }
}

//https://onlinegdb.com/WiW7_eleD
//
//https://onlinegdb.com/kdeJLcpLo
//
//https://onlinegdb.com/6zerrdIYV
//
//https://onlinegdb.com/VzfnguHoC
//
//https://onlinegdb.com/_cIkrDzso