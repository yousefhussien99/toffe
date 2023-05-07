package Tofee;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *  @author: Youssef Hussein
 *     @version: 1.0
 *     @deprecated this class is used store items in cart
 */
public class CartItem extends Item {
    //attributes
     Item item [] = new Item[100];
    Item cart [] = new Item[100];
    private int Quantity;
    private int count = 0;
    private double totalPrice=0.0;
    /**
     * this method is used to add item to cart
     * @param ID
     * @param quantity
     */
    public void addToCart(int ID, int quantity) {
        File file = new File("C:\\Users\\dell\\IdeaProjects\\untitled\\src\\Tofee\\items");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                item[count] = new Item();
               item[count].ID = scanner.nextInt();
                item[count].name = scanner.next();
                item[count].price = scanner.nextDouble();
                item[count].quantity = scanner.nextInt();
                if (item[count].ID == ID) {
                    if (item[count].quantity < quantity) {
                        System.out.println("Not enough quantity");
                        return;
                    }
                    item[count].quantity -= quantity;
                    System.out.println("Added to cart");
                    cart[count] = new Item();
                    cart[count].ID = item[count].ID;
                    cart[count].name = item[count].name;
                    cart[count].price = item[count].price;
                    cart[count].quantity = quantity;
                    count++;
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    /**
     * this method is used to show items in cart
     */
     public void showCartitem() {
         for (int i = 0; i < count; i++) {
             System.out.println(cart[i].ID + " " + cart[i].name + " " + cart[i].price + " " + cart[i].quantity);
         }
     }

    /**
     * this method is used to remove item from cart
     * @param ID
     */
     public void removeItem(int ID) {
            for (int i = 0; i < count; i++) {
                if (cart[i].ID == ID) {
                    for (int j=0 ; j<100 ; j++){
                        if (item[j].ID == ID){
                            item[j].quantity += cart[i].quantity;
                            cart[i].quantity = 0;
                            System.out.println("Item removed");
                            return;
                        }
                    }
                }
            }
    }

    /**
     * this method is used to update item in cart
     * @param ID
     * @param quantity
     */
    public void  updateItem(int ID, int quantity) {
        for (int i = 0; i < count; i++) {
            if (cart[i].ID == ID) {
               for (int j=0 ; j<100 ; j++){
                   if (item[j].ID == ID){
                       item[j].quantity += cart[i].quantity;
                          if (item[j].quantity < quantity) {
                            System.out.println("Not enough quantity");
                            return;
                          }
                       item[j].quantity -= quantity;
                       cart[i].quantity = quantity;
                       System.out.println("Item updated");
                       return;
                   }
               }
            }
        }
    }

    /**
     * this method is used to get total price of items in cart
     *
     * @return totalPrice
     */
    public double getTotalPrice() {
        for (int i = 0; i < count; i++) {
            totalPrice += cart[i].price * cart[i].quantity;
        }
        return totalPrice;
    }
}