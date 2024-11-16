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

        System.out.println("Moy =  " + moy);
    }



    public static void main(String[] args) {
        calcMoy();
    }
}
