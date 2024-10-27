/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: FrequentTemplate.java
 * Description: This class defines related parts of email for frequent customer.
 */
package edu.bu.met.cs665;

public class FrequentTemplate extends EmailTemplate{
    private static volatile FrequentTemplate frequentTemplate;

    /**
     * Construction method
     */
    private FrequentTemplate() {

    }

    /**
     * Get a singleton instance.
     */
    public static FrequentTemplate getInstance() {
        if(frequentTemplate == null) {
            synchronized (FrequentTemplate.class) {
                if(frequentTemplate == null) {
                    frequentTemplate = new FrequentTemplate();
                }
            }
        }
        return frequentTemplate;
    }

    /**
     * Generate a specific email body for frequent customer.
     * @return
     */
    public String getBody() {
        return "We truly appreciate your frequent support and loyalty to [Organization's Name]. Your ongoing trust means the world to us! As a token of gratitude, enjoy exclusive perks and personalized offers designed just for you.";
    }

    /**
     * Generate a specific email subjectline for frequent customer.
     * @return
     */
    public String getSubjectLine() {
        return "Thank You for Your Continued Loyalty!";
    }
}
