public class SingleDigitProduct {
    private final int result;
    public SingleDigitProduct(int number){
        this.result=digitMultiplier(number);
    }

    public int getResult() {
        return result;
    }

    private int digitMultiplier(int number){
        if(number < 10){
            return number;
        }
        int sum=1;
        while (number!=0){
            sum*=(number%10);
            number=number/10;
        }
        return digitMultiplier(sum);
    }
}
