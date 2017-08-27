public class pmath
{
    public static void main(String[] args) {

        System.out.println(factorial2(-2));
        symbolCase('a');
        symbolCase('b');
        symbolCase('z');
    }

    public static int factorial(int number){
        if (number<=0) {
            System.out.println("Error");
            return -1;
        }
        int tempResult=1;
        for (int i = number; i >1 ; i--) {
            tempResult=tempResult*i;
        }
        return tempResult;
    }

    public static int factorial2(int number){
        if(number==1) {
            return 1;
        }
        if (number<=0) {
            System.out.println("Error");
            return -1;}

        return number*factorial2(number-1);
    }

    public static void symbolCase (char symbol) {
        switch(symbol) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            default:
                System.out.println("--");
                break;
        }
    }


}

