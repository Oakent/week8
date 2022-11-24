import java.util.Scanner;;
public class tempconvert {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double f;
        System.out.print("enter temp in f: ");
        f = scan.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("== "+c+"C");
        scan.close();
    }
}
