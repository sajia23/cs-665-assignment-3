package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class Request {
    String customerName;

    String customerEmail;
    CustomerSegment customerSegment;

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
