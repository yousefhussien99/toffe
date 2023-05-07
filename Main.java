package Tofee;

public class Main {
    /**
     * This is the main method which makes use of login, register, showItem, addToCart, showCartItem, removeItem, updateItem, setTotalPrice, setShippingAddress, setStatus, setCustomerid, makePayment, showPayment methods.
     * @param args
     */
    public static void main(String[] args) {
        User user = new User();
        //user.login(20210467, "565656");
        user.register("Zainab", "565656", "zainab@gmail.com", "01113005613", "Haram_giza", 20210154);
        if (user.login(20210154, "565656")) {
            Item item = new Item();
            item.ShowItem();
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.addToCart(1, 5);
            shoppingCart.addToCart(2, 3);
            shoppingCart.showCartitem();
            shoppingCart.removeItem(1);
            shoppingCart.showCartitem();
            shoppingCart.updateItem(2, 5);
            shoppingCart.addToCart(3, 5);
            shoppingCart.showCartitem();
            Order order = new Order();
            order.setTotalPrice(shoppingCart.getTotalPrice());
            order.setShippingAddress(user.getAddress());
            order.setStatus("Pending");
            order.setCustomerid(user.getID());
            Payment payment = new Payment();
            payment.makePayment("Cash", shoppingCart.getTotalPrice(), user.getID());
            payment.showPayment();
        }
        else {
            System.out.println("Invalid username or password");
        }
    }
}
