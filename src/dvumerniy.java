public class dvumerniy {
    public static void main(String[] args) {

        int arNumOfElements = 7;
        int calcnum = 0;
        int[] calcArray = new int[arNumOfElements];

        for (int i = 0; i < arNumOfElements; i++) {
            calcArray[i] = (int) (Math.random() * 10);
        }
        int[][] dwumCalcArray = new int[arNumOfElements][arNumOfElements];
        for (int i = 0; i < arNumOfElements; i++) {
            for (int j = 0; j < arNumOfElements; j++) {
                calcnum = i + j;
                if ((i + j) > arNumOfElements-1) {
                    calcnum = calcnum - arNumOfElements;
                }
                dwumCalcArray[i][j] = calcArray[calcnum];
            }
        }
        for (int i = 0; i < arNumOfElements; i++) {
            for (int j = 0; j < arNumOfElements; j++) {
                System.out.print(dwumCalcArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
