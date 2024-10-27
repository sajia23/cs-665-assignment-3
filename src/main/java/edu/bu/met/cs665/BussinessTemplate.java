/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: BussinessTemplate.java
 * Description: This class defines related parts of email for business customer.
 */
package edu.bu.met.cs665;

public class BussinessTemplate extends EmailTemplate{
    private static volatile BussinessTemplate bussinessTemplate;

    /**
     * Construction method
     */
    private BussinessTemplate() {

    }

    /**
     * Get a singleton instance.
     */
    public static BussinessTemplate getInstance() {
        if(bussinessTemplate == null) {
            synchronized (BussinessTemplate.class) {
                if(bussinessTemplate == null) {
                    bussinessTemplate = new BussinessTemplate();
                }
            }
        }
        return bussinessTemplate;
    }

    /**
     * Generate a specific email body for bussiness customer.
     * @return
     */
    public String getBody() {
        return "We are excited to welcome you to our Business Membership program! As a valued business partner, you'll gain access to tailored solutions, exclusive offers, and dedicated support to help your business thrive.";
    }

    /**
     * Generate a specific email subjectline for business customer.
     * @return
     */
    public String getSubjectLine() {
        return "Welcome to Business Membership!";
    }
}
