package Tofee;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author: youssef hussein
 * @version: 1.0
 * @deprecated this class is used to login and register
 */
public class User {
    //attributes
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private int ID;

    /**
     *  this method is used to login
     * @param ID
     * @param password
     * @return true if the user is registered and false if not
     */
    public boolean login(int ID ,String password) {
        File file = new File("C:\\Users\\dell\\IdeaProjects\\untitled\\src\\Tofee\\users");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.ID = scanner.nextInt();
                this.password = scanner.next();
                if (this.ID == ID && this.password.equals(password)) {
                    System.out.println("Login successful");
                    return true;
                }
            }
            System.out.println("Login failed");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return false;
    }

    /**
     * this method is used to register
     * @param name
     * @param password
     * @param email
     * @param phone
     * @param address
     * @param ID
     */
    public void register(String name, String password, String email, String phone, String address, int ID) {
        File file = new File("C:\\Users\\dell\\IdeaProjects\\untitled\\src\\Tofee\\users");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.ID = scanner.nextInt();
                this.password = scanner.next();
                if (this.ID == ID) {
                    System.out.println("This ID is already registered");
                    return;
                }
            }
               System.out.println("Register successful");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        File file1 = new File("C:\\Users\\dell\\IdeaProjects\\untitled\\src\\Tofee\\users");
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter(file, true);
            fileWriter.write("\n");
            fileWriter.write(ID + " " + password  );
            fileWriter.close();
        } catch (java.io.IOException e) {
            System.out.println("Error");
        }
        File file2 = new File("C:\\Users\\dell\\IdeaProjects\\untitled\\src\\Tofee\\users_info");
        try {
            java.io.FileWriter fileWriter = new java.io.FileWriter(file2, true);
            fileWriter.write("\n");
            fileWriter.write(ID + " " + password + " " +  email+" "+ name+ " " + phone + " " + address);
            fileWriter.close();
        } catch (java.io.IOException e) {
            System.out.println("Error");
        }
    }

    /**
     *  this method is used to show the user info
     * @param ID
     *
     */
    public void showInfo(int ID) {
        File file = new File("C:\\Users\\dell\\IdeaProjects\\untitled\\src\\Tofee\\users_info");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.ID = scanner.nextInt();
                this.password = scanner.next();
                this.email = scanner.next();
                this.name = scanner.next();
                this.phone = scanner.next();
                this.address = scanner.next();
                if (this.ID == ID) {
                    System.out.println(this.ID + " " + this.password + " " + this.email + " " + this.name + " " + this.phone + " " + this.address);
                    return;
                }
            }
            System.out.println("User not found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    /**
     *  this method is used to return the current Address
     * @return address
     */
    public String getAddress (){
        return this.address;
    }

    /**
     * this method is used to return the current name
     * @return name
     */
    public String getName (){
        return this.name;
    }

    /**
     * this method is used to return the current email
     * @return email
     */
    public String getEmail (){
        return this.email;
    }

    /**
     * this method is used to return the current phone
     * @return phone
     */
    public String getPhone (){
        return this.phone;
    }

    /**
     * this method is used to return the current ID
     * @return ID
     */
    public int getID (){
        return this.ID;
    }
};
