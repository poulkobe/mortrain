public class Pclass1 {

    public static void main(String[] args) {

        //-----------------------------------------------------------------------------------------------------------------------
        int z = 100;
        int maximMass = 0;
        int[] masOrders = new int[z];
        while ( z > 0) {
            masOrders[z-1] = (int) (Math.random() * 100);
            if (masOrders[z-1] > maximMass) {
                maximMass = masOrders[z-1];
            }
            //System.out.println(maximMass);
            --z;
        }
        System.out.print("Maxim element - ");
        System.out.println(maximMass);

//-----------------------------------------------------------------------------------------------------------------------
        //simple checking
        int chisloSimple = 1;
        int adddelitel = 0;
        int numberOfSimple = 10;
        int delitel;

        while (numberOfSimple > 0) {
            adddelitel = 0;
            delitel = chisloSimple;
            while (delitel > 0) {
                if ((chisloSimple % delitel) == 0) {
                    adddelitel++;
                }
                delitel--;
            }
            if (adddelitel <= 2) {
                System.out.println(chisloSimple);
                numberOfSimple--;
            }
            chisloSimple++;
        }
*/
//-----------------------------------------------------------------------------------------------------------------------
        int arayLength = 100;
        int tempStorage;
        int[] minMaxArray = new int[arayLength];
        int minMaxArrayCounter = arayLength-1;
        int switchTemp;
        while (arayLength > 0) {
            minMaxArray[arayLength-1] = (int) (Math.random() * 100);
            System.out.print(arayLength-1);
            System.out.print("  -- ");
            System.out.println(minMaxArray[arayLength-1]);

            --arayLength;
        }


        while (minMaxArrayCounter > minMaxArray.length / 2) {
            tempStorage = minMaxArray[minMaxArrayCounter];
            minMaxArray[minMaxArrayCounter] = minMaxArray[minMaxArray.length - minMaxArrayCounter-1];
            minMaxArray[minMaxArray.length - minMaxArrayCounter-1] = tempStorage;
            minMaxArrayCounter--;

        }

        arayLength=100;
        System.out.println("------------------------------");

        while (arayLength > 0) {
            System.out.print(arayLength-1);
            System.out.print("  -- ");
            System.out.println(minMaxArray[arayLength-1]);

            --arayLength;
        }
    }

}


