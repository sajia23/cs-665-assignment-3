/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: Request.java
 * Description: This class defines request sent to email service.
 */
package edu.bu.met.cs665;

public class Request {
    String customerName;

    String customerEmail;
    CustomerSegment customerSegment;

    /**
     * Construction method
     */
    public Request(String customerName, String customerEmail, CustomerSegment customerSegment) {
        this.customerName = customerName;
        this.customerSegment = customerSegment;
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerSegment getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(CustomerSegment customerSegment) {
        this.customerSegment = customerSegment;
    }
}
