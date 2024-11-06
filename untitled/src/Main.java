import java.util.Scanner;
public class Main {
//    public static long toMilesPerHour(double kilometersPerHour) {
//        if (kilometersPerHour < 0) {
//            return -1;
//        }
//        return Math.round(kilometersPerHour / 1.609);
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//        long milesPerHour = toMilesPerHour(kilometersPerHour);
//        if (milesPerHour == -1) {
//            System.out.println("Invalid Value");
//        } else {
//            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
//        }
//    }
//    public static int calc() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Entre first number : ");
//        int number01 = sc.nextInt();
//
//        System.out.println("Entre second number : ");
//        int number02 = sc.nextInt();
//
//        System.out.println("Chase type pf operator : ");
//        String operator = sc.next();
//
//        return switch (operator) {
//            case "+" -> number01 + number02;
//            case "-" -> number01 - number02;
//            case "*" -> number01 * number02;
//            case "/" -> number01 / number02;
//            default -> 0;
//        };
//    }

    public static void  calcMoy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much note that u want to calc : ");
        int numberNot = sc.nextInt();
        float total=0;

        int i = 1;
        while (i <= numberNot) {
            System.out.println("Enter note number : " + i);
            float note = Float.parseFloat(sc.next());
            total = total + note;
            i++;
        }
        float moy = total / numberNot;
        System.out.println("Moy =  " + moy);
    }



    public static void main(String[] args) {
        calcMoy();
    }
}
