package Tofee;

/**
 *  @ author: Youssef Hussein
 *     @version: 1.0
 *     @deprecated this class is used to make order
 */
class Order {
    //attributes
    private double totalPrice;
    private String status;
    private String shippingAddress;
    private int customerid;
    /**
     * this method is used to make order
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * this method is used to get total price
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * this method is used to set status
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * this method is used to get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * this method is used to set shipping address
     * @param shippingAddress
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    /**
     * this method is used to get shipping address
     * @return shippingAddress
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * this method is used to set customer id
     * @param customerid
     */
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    /**
     * this method is used to get customer id
     * @return customerid
     */
    public int getCustomerid() {
        return customerid;
    }
}