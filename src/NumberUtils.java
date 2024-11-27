public class NumberUtils {
    public String isArmStrongNumber(int number){
        int sum=0;
        int length= (int) (Math.log10(number)+1);
        int temp=number;
        while(temp>0){
            sum+= (int) Math.pow(temp%10,length);
            temp /= 10;
        }
        return (sum==number)? "Armstrong":"Not an Armstrong Number";
    }

    public boolean isPrimeNumber(int x){
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfDigits(int n){
        return (1+(n-1)%9);
    }

    public void generatePattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                System.out.print(" ");
            }
            for (int j=0;j<((i*2)+1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void calculator(String operation,int a,int b){
        int result=switch (operation.toLowerCase()){
            case "add" -> a+b;
            case "subtract" -> a-b;
            case "multiply" -> a*b;
            case "divide" -> {
                if(b!=0)
                    yield a/b;
                yield 0;
            }
            default -> {
                System.out.println("Invalid operation!");
                yield 0;
            }
        };
        System.out.println(result);
    }
}
