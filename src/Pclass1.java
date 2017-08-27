 public class Pclass1 {
//
//    public static void main(String[] args) {
//
//        //-----------------------------------------------------------------------------------------------------------------------
//        tempMethod();
//
////-----------------------------------------------------------------------------------------------------------------------
//        //simple checking
//
//
////-----------------------------------------------------------------------------------------------------------------------
//        int arayLength = 99;
//        int tempStorage;
//        int[] minMaxArray = new int[arayLength];
//        int minMaxArrayCounter = arayLength - 1;
//        int switchTemp;
//
////        while (arayLength > 0) {
////            minMaxArray[arayLength - 1] = (int) (Math.random() * 100);
////            System.out.print(arayLength - 1);
////            System.out.print("  -- ");
////            System.out.println(minMaxArray[arayLength - 1]);
////
////            arayLength--;
////        }
////
////
////
////        while (minMaxArrayCounter > minMaxArray.length / 2) {
////            tempStorage = minMaxArray[minMaxArrayCounter];
////            minMaxArray[minMaxArrayCounter] = minMaxArray[minMaxArray.length - minMaxArrayCounter - 1];
////            minMaxArray[minMaxArray.length - minMaxArrayCounter - 1] = tempStorage;
////            minMaxArrayCounter--;
////
////        }
////
////        arayLength = 99;
////        System.out.println("------------------------------");
////
////        while (arayLength > 0) {
////            System.out.print(arayLength - 1);
////            System.out.print("  -- ");
////            System.out.println(minMaxArray[arayLength - 1]);
////
////            arayLength--;
////        }
//
//        for (int ii = 0; ii < arayLength; ii++) {
//            minMaxArray[ii] = (int) (Math.random() * 100);
//        }
//
//
//        kvadrat(minMaxArray);
//    }
//
//    public static void tempMethod() {
//        int countArrayMinMax = 100;
//        int maximMass = 0;
//        int[] masorders = new int[countArrayMinMax];
//        while (countArrayMinMax > 0) {
//            masorders[countArrayMinMax - 1] = (int) (Math.random() * 100);
//            if (masorders[countArrayMinMax - 1] > maximMass) {
//                maximMass = masorders[countArrayMinMax - 1];
//            }
//            //System.out.println(maximMass);
//            --countArrayMinMax;
//        }
//        System.out.print("Maxim element - ");
//        System.out.println(maximMass);
//    }
//
//
//    public static int[] kvadrat(int[] i) {
//
//        int arayLength = i.length - 1;
//        int[] newMinMax = new int[i.length];
//        for (int j = 0; j < i.length; j++) {
//            newMinMax[j] = i[j];
//
//        }
//
//        for (int ii = arayLength; ii < arayLength / 2; ii--) {
//            int tempStorage = newMinMax[ii];
//            newMinMax[ii] = newMinMax[arayLength - ii];
//            newMinMax[arayLength - ii] = tempStorage;
//        }
//        return newMinMax;
//
//    }
//
//
//    public static void printSimpleNumber(int numberCount) {
//
//        int chisloSimple = 1;
//        int adddelitel = 0;
//        int numberOfSimple = numberCount;
//        int delitel;
//
//        while (numberOfSimple>0){
//
//        }
//
//    }
//
//    public static boolean isNumberSimple(int i) {
//        int divider = 0;
//        for (int j = i; j > 0; j--) {
//            if (i % j == 0) {
//                divider++;
//            }
//                return divider <= 2;
//
//
//
//        }
//    }
//
//
//    public static int factorial(int number){
//        int tempResult=1;
//        for (int i = number; i >1 ; i--) {
//            tempResult=tempResult*i;
//        }
//        return tempResult;
//    }
//
 }

