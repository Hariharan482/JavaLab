public class SumOfDigits {
    private final int result;
    public SumOfDigits(int number){
        this.result=sumOfDigits(number);
    }

    public int getResult() {
        return result;
    }

    private int sumOfDigits(int number){
        String digit= String.valueOf(number);
        int sum=0;
        int digitLength=digit.length();
        for (int i = 0; i < digitLength / 2; i++) {
            sum+= (digit.charAt(i) - '0')*10+ digit.charAt(digitLength - i - 1) - '0';
        }

        if (digitLength % 2 != 0) {
            int pivotDigit = digit.charAt(digitLength / 2) - '0';
            sum += pivotDigit;
        }
        return sum;
    }
}
