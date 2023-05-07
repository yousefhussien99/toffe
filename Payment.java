package Tofee;

import java.util.Date;

/**
  @author: Youssef Hussein
    @version: 1.0
    @deprecated this class is used to make payment
 */
public class Payment {
    //attributes
    private String paymentMethod;
    private double amount;
    private String status;
    private Date date;
    private int customerID;

    /**
     *  this method is used to make payment
     * @param paymentMethod
     * @param amount
     * @param customerID

     */
    public void makePayment(String paymentMethod, double amount, int customerID){
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = "Paid";
        this.date = new Date();
        this.customerID = customerID;
    }

    /**
     * this method is used to show payment
     *
     */
    void showPayment(){
        System.out.println("Payment Method: " + this.paymentMethod);
        System.out.println("Amount: " + this.amount);
        System.out.println("Status: " + this.status);
        System.out.println("Date: " + this.date);
        System.out.println("Customer ID: " + this.customerID);
    }
    /**
     * this method is used to show payment
     *
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


}
