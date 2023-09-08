import java.util.Scanner;

public class Booking{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int cusID=0;
        int option = get.nextInt();
        System.out.println("\n1.booking\n2.display");
        switch(option){
            case 1 :
                int customerNo = cusID++;
                String pickupPoint = get.nextLine();
                String dropPoint = get.nextLine();
                int pickupTime = get.nextInt();
                // Taxi tx = new Taxi();
                
                break;
        }
    }    
}
