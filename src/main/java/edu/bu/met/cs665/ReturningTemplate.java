/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: ReturningTemplate.java
 * Description: This class defines related parts of email for returning customer.
 */
package edu.bu.met.cs665;

public class ReturningTemplate extends EmailTemplate{
    private static volatile ReturningTemplate ReturningTemplate;

    /**
     * Construction method
     */
    private ReturningTemplate() {

    }

    /**
     * Get a singleton instance.
     */
    public static ReturningTemplate getInstance() {
        if(ReturningTemplate == null) {
            synchronized (ReturningTemplate.class) {
                if(ReturningTemplate == null) {
                    ReturningTemplate = new ReturningTemplate();
                }
            }
        }
        return ReturningTemplate;
    }

    /**
     * Generate a specific email body for returning customer.
     * @return
     */
    public String getBody() {
        return "We’re delighted to have you back with us! Your return means a lot, and we're excited to continue this journey together. Explore new updates, special offers, and exciting features waiting for you.";
    }

    /**
     * Generate a specific email subjectline for returning customer.
     * @return
     */
    public String getSubjectLine() {
        return "Welcome Back!";
    }
}
