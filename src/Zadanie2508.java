public class Zadanie2508 {
    public static void main(String[] args) {
        int arNumOfElements = 100;
        int regularSumm = 0;
        int recursSumm = 0;
        int[] calcArray = new int[arNumOfElements];

        for (int i = 0; i < arNumOfElements; i++) {
            calcArray[i] = (int) (Math.random() * 1000);
            regularSumm = regularSumm + calcArray[i];
            System.out.println(regularSumm + "===" + calcArray[i]);
        }

        if (regularSumm == getRecursSumm(calcArray, calcArray.length - 1, recursSumm)) {
            System.out.println("sovpalo");
            System.out.println(regularSumm + "===" + getRecursSumm(calcArray, calcArray.length - 1, recursSumm));
        } else {
            System.out.println("ne sovpalo");
            System.out.println(regularSumm + "===" + getRecursSumm(calcArray, calcArray.length - 1, recursSumm));
        }
    }


    public static int getRecursSumm(int[] arToCalc, int position, int recursSumm) {
        if (position > 0)
        {
            recursSumm = arToCalc[position] + getRecursSumm(arToCalc, --position, recursSumm);
            //System.out.println("recusrs -- " + recursSumm);
            return recursSumm;
        }
        if (position == 0)
        {
            recursSumm = recursSumm + arToCalc[position];
            System.out.println("recusrs  final-- " + recursSumm);
            return recursSumm;
        }
        return recursSumm;
    }


}
