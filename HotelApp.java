import java.util.Scanner;
public class HotelApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(choice!=4){
            System.out.println("Hi, I'm Jean. How can I help you?\n 1) Do you need a Valet?\n 2) Do you need a housekeeper?\n 3) Do you need carts?\n 4) Exit");
            System.out.println("Choose the service that you need: ");
            choice = scan.nextInt();

            FrontDesk frontDesk = new FrontDesk();
            switch (choice)
            {
                case 1:
                    System.out.println("What is your vehicle's plate number?");
                    String plateNo = scan.next();
                    HotelService valet = new Valet(plateNo);
                    frontDesk.useService(valet);
                    break;
                case 2:
                    System.out.println("What is your room number?");
                    int roomNo = scan.nextInt();
                    HotelService housekeeping = new HouseKeeping(roomNo);
                    frontDesk.useService(housekeeping);
                    break;
                case 3:
                    System.out.println("How many cart/s do you need?");
                    int cartsNo = scan.nextInt();
                    HotelService cart = new Cart(cartsNo);
                    frontDesk.useService(cart);
                    break;
                case 4:
                    System.out.println("Thank you for using the program!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input, please try again!");
                    break;
            }
        }






    }
}