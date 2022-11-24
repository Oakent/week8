import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;
import java.lang.*;
public class bankteller {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount to hand out: ");
        int sterling = scan.nextInt();
        System.out.print("You will be given: ");
        int fifty=0; 
        if(sterling>50){
            fifty = sterling/50;
            sterling = sterling%50;
        }
        int twenty=0;
        if(sterling>20){
            twenty = sterling/20;
            sterling = sterling%20;
        }
        int ten=0;
        if(sterling>10){
            ten = sterling/10;
            sterling = sterling%10;
        }
        int five=0;
        if(sterling>5){
            five = sterling/10;
            sterling = sterling%10;
        }
        int two=0;
        if(sterling>2){
            two = sterling/2;
            sterling = sterling%2;
        }
        System.out.println("You will be given "+fifty+" x £50, "+twenty+" x £20, "+ten+" x £10, "+five+" x £5, "+two+" x £2, "+sterling+" x £1");
        scan.close();
    }
}
