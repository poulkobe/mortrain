public class Zadanie2508 {
    public static void main(String[] args) {
        int arNumOfElements = 100;
        int regularSumm = 0;
        int recursSumm = 0;
        int[] calcArray = new int[arNumOfElements];

        for (int i = 0; i < arNumOfElements; i++) {
            calcArray[i] = (int) (Math.random() * 1000);
            regularSumm = regularSumm + calcArray[i];

        }
        System.out.println("Regular - " + regularSumm);

        if (regularSumm == getRecursSumm(calcArray, calcArray.length - 1 )) {
            System.out.println("Sovpalo");
            System.out.println(regularSumm + "===" + getRecursSumm(calcArray, calcArray.length - 1 ));
        } else {
            System.out.println("ne sovpalo");
            System.out.println(regularSumm + "===" + getRecursSumm(calcArray, calcArray.length - 1 ));
        }
    }


    public static int getRecursSumm(int[] arToCalc, int position) {
        if (position == 0) {
            return arToCalc[position];
        }

        return  arToCalc[position] + getRecursSumm(arToCalc, position-1 );


    }


}
