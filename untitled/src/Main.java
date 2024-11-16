import java.util.Scanner;
public class Main {
    public static void  calcMoy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much note : ");
        int numberNot = sc.nextInt();
        float total=0;

        int i = 1;
        while (i <= numberNot) {
            System.out.println("Enter number note : " + i);
            float note = Float.parseFloat(sc.next());
            total = total + note;
            i++;
        }
        float moy = total / numberNot;

        // switch Syntax
        // return switch (o) {
        //     case "+" -> number01 + number02;
        //     case "-" -> number01 - number02;
        //     case "*" -> number01 * number02;
        //     case "/" -> number01 / number02;
        //     default -> 0;
        // };

        System.out.println("Moy =  " + moy);
    }



    public static void main(String[] args) {
        calcMoy();
    }
}
