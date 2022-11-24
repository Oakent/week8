import java.util.ArrayList;
import java.util.Scanner;;
public class doublearr {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> temps = new ArrayList<>();
        int i=0;
        System.out.println("Eneter the first number: ");
        double first = scan.nextDouble();
        temps.add(first);
        while(temps.get(i)!= -99){
            System.out.println("Enter another number: ");
            double num = scan.nextDouble();
            temps.add(num);
            i++;
        }
        double sum =0;
        for(int j=0;j<temps.size()-1; j++){
            sum+=temps.get(j);
        }
        double avg = sum/(temps.size()-1);
        System.out.println("average of inputs is: "+avg);
        scan.close();
    }
}
