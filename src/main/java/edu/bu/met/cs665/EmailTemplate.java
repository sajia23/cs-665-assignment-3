/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: EmailTemplate.java
 * Description: This class defines common parts of email for all customer.
 */
package edu.bu.met.cs665;

public abstract class EmailTemplate {
    public String getSignature() {
        return "Sincerely, Shaohua Yue CS665 EmailService";
    }

    /**
     * Generate a salutation according to customer's name.
     * @param name
     * @return
     */
    public String getSalutation(String name) {
        return "Hello, " + name;
    }

    /**
     * Generate a specific email body for customer.
     * @return
     */
    public String getBody() {
        return null;
    }

    /**
     * Generate a specific email subjectline for customer.
     * @return
     */
    public String getSubjectLine() {
        return null;
    }

    /**
     * Generate a specific email closing for customer.
     * @return
     */
    public String getClosing() {
        return "Please let me know if you're interested in this project and we can set up some time to discuss the details further. I look forward to hearing from you.";
    }
}
