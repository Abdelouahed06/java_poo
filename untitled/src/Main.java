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
    public static String cheknegativ(int number){
        String m = (number > 0) ? " number is positive" :"number is negative";
        return m;
    }

    public static void main(String[] args) {
        System.out.println(cheknegativ(-7));
    }
}
