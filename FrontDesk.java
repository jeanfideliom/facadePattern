public class FrontDesk {
   public void useService(HotelService service){
      System.out.println("Using service...");
      service.doService();
      System.out.println("Service completed.");
   }

}
