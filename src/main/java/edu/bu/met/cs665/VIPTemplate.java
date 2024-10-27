/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: VIPTemplate.java
 * Description: This class defines related parts of email for vip customer.
 */
package edu.bu.met.cs665;

public class VIPTemplate extends EmailTemplate{
    private static volatile VIPTemplate vipTemplate;

    /**
     * Construction method
     */
    private VIPTemplate() {

    }

    /**
     * Get a singleton instance.
     */
    public static VIPTemplate getInstance() {
        if(vipTemplate == null) {
            synchronized (VIPTemplate.class) {
                if(vipTemplate == null) {
                    vipTemplate = new VIPTemplate();
                }
            }
        }
        return vipTemplate;
    }

    /**
     * Generate a specific email body for vip customer.
     * @return
     */
    public String getBody() {
        return "A warm welcome to our VIP community! We're honored to have you as a valued member. Enjoy premium benefits, priority support, and exclusive offers tailored just for you.";
    }

    /**
     * Generate a specific email subjectline for vip customer.
     * @return
     */
    public String getSubjectLine() {
        return "Welcome to Our VIP Membership!";
    }
}
