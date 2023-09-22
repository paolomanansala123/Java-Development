package enumerations;

//ENUMS
//   -> A special class that contains collection of constant values.
//   -> They can represent words as 'Objects'.
//      enum AILevel {
//          EASY,
//          MEDIUM,
//          HARD;
//      }
//   -> Not necessary capslock.


public class Main {
    public static void main(String[] args) {
        //AILevel level = AILevel.EASY;

        //IF-ELSE STATEMENT
        //if (level == AILevel.EASY) System.out.println("For Babies!");
        //else if (level == AILevel.MEDIUM) System.out.println("For Kids!");
        //else if (level == AILevel.HARD) System.out.println("For Men!");

        //SWITCH STATEMENT
        /*switch (level) {
            case EASY:
                System.out.println("For Babies!");
                break;

            case MEDIUM:
                System.out.println("For Kids!");
                break;

            case HARD:
                System.out.println("For Men!");
                break;
        }*/

        PHCurrency phC = PHCurrency.PISO;
        PHCurrency phC2 = PHCurrency.THOUSANDPESO;

        System.out.println(phC.value);
        System.out.println(phC2);

        PHCurrency phCArray[] = new PHCurrency[3];
        phCArray[0] = PHCurrency.CENTS;
        phCArray[1] = PHCurrency.HUNDREDPESO;
        phCArray[2] = PHCurrency.FIFTYPESO;


    }
}
