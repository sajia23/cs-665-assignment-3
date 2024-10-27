/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: NewTemplate.java
 * Description: This class defines related parts of email for new customer.
 */
package edu.bu.met.cs665;

public class NewTemplate extends EmailTemplate{

    private static volatile NewTemplate newTemplate;

    Email email;

    /**
     * Construction method
     */
    private NewTemplate() {

    }

    /**
     * Get a singleton instance.
     */
    public static NewTemplate getInstance() {
        if(newTemplate == null) {
            synchronized (NewTemplate.class) {
                if(newTemplate == null) {
                    newTemplate = new NewTemplate();
                }
            }
        }
        return newTemplate;
    }

    /**
     * Generate a specific email body for new customer.
     * @return
     */
    public String getBody() {
        return "We're thrilled to have you with us. As part of our community, you'll enjoy exclusive benefits, exciting events, and valuable resources.";
    }

    /**
     * Generate a specific email subjectline for new customer.
     * @return
     */
    public String getSubjectLine() {
        return "Welcome to Our Community!";
    }
}
