public class HouseKeeping implements HotelService{
    private int roomNumber;
    public HouseKeeping(int roomNumber){
        this.roomNumber = roomNumber;
    }
    @Override
    public void doService() {
        cleanRoom();
    }
    private void cleanRoom(){
        System.out.println("Housekeeping is cleaning room number: "+ roomNumber);
    }
}
