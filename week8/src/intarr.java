import java.util.Scanner;
public class intarr {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers for array: ");
        int arrlen = scan.nextInt();
        int array[] =  new int[arrlen];
        for(int i=0; i<arrlen; i++){
            System.out.println("Enter number: ");
            int next = scan.nextInt();
            array[i] = next;
        }
        System.out.println("Even numbers: ");
        for (int i : array) {
            if(i % 2==0){
                System.out.println(i);
            }
        }
        scan.close();
    }
}
