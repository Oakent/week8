import java.util.Scanner;
public class Averages {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount of numbers to calculate average: ");
        int n = scan.nextInt();
        int total = 0;
        for(int i=0; i<n; i++){
            System.out.println("Enter number "+n+": ");
            int input  = scan.nextInt();
            total = total +input;
        }
        double average = total/n;
        System.out.println("the average of your inputs is: "+average);
        scan.close();
    }
}