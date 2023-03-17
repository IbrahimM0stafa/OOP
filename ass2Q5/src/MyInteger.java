public class MyInteger {
    private int value;
    public int getId()
    {
        return value;
    }
    public MyInteger(int valur){
        this.value=value;
    }
    public static boolean isEven(int value){
        if(value % 2==0)
            return true;
        return false;
    }
    public static boolean isOdd(int value){
        if(value % 2!=0)
            return true;
        return false;
    }
    public static boolean isPrime(int value){
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isEven(){
        if(value % 2==0)
            return true;
        return false;
    }
    public boolean isOdd(){
        if(value % 2!=0)
            return true;
        return false;
    }
    public boolean isPrime(){
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger x){
        if(x.value % 2==0)
            return true;
        return false;
    }
    public static boolean isOdd(MyInteger x){
        if(x.value % 2!=0)
            return true;
        return false;
    }
    public static boolean isPrime(MyInteger x){
        if (x.value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x.value); i++) {
            if (x.value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean equals (int x){
        if(x==value)
            return true;
        return false;
    }
    public boolean equals (MyInteger x){
        if(x.value==value)
            return true;
        return false;
    }
}
