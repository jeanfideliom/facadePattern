public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void doService() {
        requestCart();
    }
    private void requestCart() {
        System.out.println("Requesting " + numberOfCarts + " luggage carts");
    }
}
