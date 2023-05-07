package Tofee;

/**
 *@author: Youssef Hussein
 * @version: 1.0
 * @deprecated this class is used to make shopping cart
 */
public class ShoppingCart {
    //attributes
    private CartItem cartItem [] = new CartItem[100];
    private int count = 0;
    private double totalPrice=0.0;
    /**
     * this method is used to add to cart
     * @param ID
     * @param quantity
     */
    public void addToCart(int ID, int quantity) {
        cartItem[count] = new CartItem();
        cartItem[count].addToCart(ID, quantity);
        count++;
    }
    /**
     * this method is used to show items in cart
     */
    public void showCartitem() {
        for (int i = 0; i < count; i++) {
            cartItem[i].showCartitem();
        }
    }
    /**
     * this method is used to remove item from cart
     * @param ID
     */
    public void removeItem(int ID) {
        for (int i = 0; i < count; i++) {
            cartItem[i].removeItem(ID);
        }
    }
    /**
     * this method is used to update item in cart
     * @param ID
     * @param quantity
     */
    public void  updateItem(int ID, int quantity) {
        for (int i = 0; i < count; i++) {
            cartItem[i].updateItem(ID, quantity);
        }
    }
    /**
     * this method is used to get total price
     * @return totalPrice
     */
    public double getTotalPrice() {
        for (int i = 0; i < count; i++) {
            totalPrice += cartItem[i].getTotalPrice();
        }
        return totalPrice/count;
    }
}