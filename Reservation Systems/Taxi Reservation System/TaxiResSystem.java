import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Taxi {
    static int taxiCount = 0;
    int taxiId;
    boolean booked;
    int earnings;
    char pos;
    int freeTime;
    List<String> tripDetails;

    public Taxi() {
        taxiCount += 1;
        taxiId = taxiCount;
        booked = false;
        earnings = 0;
        pos = 'A';
        freeTime = 6;
        tripDetails = new ArrayList<>();
    }

    public void setDetails(boolean b, char nextSpot, int nextFreeTime, int i, String tripDetail) {
        this.booked = b;
        this.pos = nextSpot;
        this.freeTime = nextFreeTime;
        this.earnings = i;
        this.tripDetails.add(tripDetail);
    }

    public void printDetails() {
        System.out.println("Taxi ID: " + taxiId);
        System.out.println("Position: " + pos);
        System.out.println("Earnings: " + earnings);
        System.out.println("Free Time: " + freeTime);
        System.out.println("Trip Details:");
        for (String trip : tripDetails) {
            System.out.println(trip);
        }
    }
}

class Booking {

    static List<Taxi> initializeTaxis(int n) {
        List<Taxi> taxis = new ArrayList<>();
        for (int i = 0; i < n; i++) taxis.add(new Taxi());
        return taxis;
    }

    static void bookTaxi(List<Taxi> taxis, char from, char to, int pickupTime) {

        if (from < 'A' || to > 'F' || from > 'F' || to < 'A') {
            System.out.println("Valid pickup and drop locations are A, B, C, D, E, F. Exiting");
            return;
        }

        List<Taxi> freeTaxis;

        // Find the free taxis
        freeTaxis = freeTaxis(taxis, from, pickupTime);

        // No free taxi means we cannot allot, exit!
        if (freeTaxis.isEmpty()) {
            System.out.println("No Taxi can be allotted. Exiting");
            return;
        }

        // Sort them based on earnings
        freeTaxis = sortThemBasedOnEarnings(freeTaxis);

        int min = Integer.MAX_VALUE;
        int distanceBetweenFromAndTo = 0;
        int earning = 0;
        int nextFreeTime = 0;
        char nextSpot = 'Z';
        Taxi bookedTaxi = null;
        String tripDetail = "";

        for (Taxi t : freeTaxis) {
            int distanceBetweenCustomerAndTaxi = Math.abs((t.pos - '0') - (from - '0')) * 15;
            if (distanceBetweenCustomerAndTaxi < min) {
                bookedTaxi = t;
                distanceBetweenFromAndTo = Math.abs((to - '0') - (from - '0')) * 15;
                earning = (distanceBetweenFromAndTo - 5) * 10 + 100;
                int dropTime = pickupTime + distanceBetweenFromAndTo / 15;
                nextFreeTime = dropTime;
                nextSpot = to;
                tripDetail = "From: " + from + " To: " + to + " Pickup Time: " + pickupTime + " Drop Time: " + dropTime + " Earnings: " + earning;
                min = distanceBetweenCustomerAndTaxi;
            }
        }

        bookedTaxi.setDetails(true, nextSpot, nextFreeTime, bookedTaxi.earnings + earning, tripDetail);
        System.out.println("Taxi " + bookedTaxi.taxiId + " booked");
    }

    static List<Taxi> sortThemBasedOnEarnings(List<Taxi> freeTaxis) {
        List<Taxi> sortedList = new ArrayList<>(freeTaxis);
        Collections.sort(sortedList, new Comparator<Taxi>() {
            @Override
            public int compare(Taxi taxi1, Taxi taxi2) {
                return Integer.compare(taxi1.earnings, taxi2.earnings);
            }
        });
        return sortedList;
    }

    static List<Taxi> freeTaxis(List<Taxi> taxis, char from, int pickupTime) {
        List<Taxi> freeTaxis = new ArrayList<>();
        for (Taxi t : taxis) {
            if ((t.freeTime <= pickupTime) && (Math.abs((t.pos - '0') - (from - '0')) <= pickupTime - t.freeTime)) {
                freeTaxis.add(t);
            }
        }
        return freeTaxis;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number of taxis");
        int n = get.nextInt();
        List<Taxi> taxis = initializeTaxis(n);

        while (true) {
            System.out.println("0 - Exit");
            System.out.println("1 - Book a Taxi");
            System.out.println("2 - Print Taxi Details");
            int option = get.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exiting taxi reservation system!");
                    get.close();
                    return;
                case 1:
                    System.out.println("Enter your pick-up point");
                    String input = get.next();
                    char from = input.charAt(0);
                    System.out.println("Enter your drop point");
                    input = get.next();
                    char to = input.charAt(0);
                    System.out.println("Enter your pick-up time");
                    int pickupTime = get.nextInt();
                    bookTaxi(taxis, from, to, pickupTime);
                    break;
                case 2:
                    System.out.println("Enter the taxi ID to view details");
                    int taxiId = get.nextInt();
                    for (Taxi taxi : taxis) {
                        if (taxi.taxiId == taxiId) {
                            taxi.printDetails();
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;
            }
        }
    }
}

public class TaxiResSystem{

    public static void main(String[] args) {

        List<Taxi> taxis = Booking.initializeTaxis(5);

        Booking.bookTaxi(taxis, 'A', 'B', 8);
        Booking.bookTaxi(taxis, 'C', 'E', 10);
        Booking.bookTaxi(taxis, 'D', 'F', 12);
        Booking.bookTaxi(taxis, 'B', 'C', 9);

        System.out.println("Taxi Details:");
        for (Taxi taxi : taxis) {
            taxi.printDetails();
            System.out.println("------------------------");
        }
    }
}