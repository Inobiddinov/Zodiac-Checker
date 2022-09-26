import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean returncode;
        do {

            System.out.println("Please Type Your birth year: ");
            int year = scan.nextInt();


            int result = year % 12;
            String zodiac = String.valueOf(0);

            switch (result) {
                case 0:
                    zodiac = "Monkey";
                    break;
                case 1:
                    zodiac = "rooster";
                    break;
                case 2:
                    zodiac = "dog";
                    break;
                case 3:
                    zodiac = "pig";
                    break;
                case 4:
                    zodiac = "rat";
                    break;
                case 5:
                    zodiac = "ox";
                    break;
                case 6:
                    zodiac = "tiger";
                    break;
                case 7:
                    zodiac = "rabbit";
                    break;
                case 8:
                    zodiac = "dragon";
                    break;
                case 9:
                    zodiac = "snake";
                    break;
                case 10:
                    zodiac = "horse";
                    break;
                case 11:
                    zodiac = "sheep";
                    break;
                default:break;
            }
            System.out.println("Your Zodiac sign is: " + year + " " + zodiac);

            System.out.println("Do you want to enter another value?  (1-yes, 2-no)");
            int returnCode = scan.nextInt();

            if (returnCode == 2) {
                returncode = true;
                System.out.println("Thank you for using me! ");
            } else if (returnCode == 1) {
                returncode = false;
            } else {
                returncode = false;
                System.out.print(returnCode + " is invalid value. ");
            }
        } while (!(returncode));

    }


    }

