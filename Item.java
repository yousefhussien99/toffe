package Tofee;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author: Youssef Hussein
 *       @version: 1.0
 *       @deprecated this class is used show items
 */
public class Item {
    //attributes
    public String name;
    public int ID;
    public double price;
    public int quantity;

    /**
     * this method is used to show items
     */
    public void ShowItem(){
        File file = new File("C:\\Users\\dell\\IdeaProjects\\untitled\\src\\Tofee\\items");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.ID = scanner.nextInt();
                this.name = scanner.next();
                this.price = scanner.nextDouble();
                this.quantity = scanner.nextInt();
                System.out.println(this.ID + " " + this.name + " " + this.price + " " + this.quantity);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
