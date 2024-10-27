/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: ReceiveBox.java
 * Description: This class defines a receive box for emails.
 */
package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class ReceiveBox implements SubscriberBase{
    Map<String, Email> emailBox;

    private static volatile ReceiveBox receiveBox;

    /**
     * Get a singleton instance.
     */
    public static ReceiveBox getInstance() {
        if(receiveBox == null) {
            synchronized (ReceiveBox.class) {
                if(receiveBox == null) {
                    receiveBox = new ReceiveBox();
                }
            }
        }
        return receiveBox;
    }

    /**
     * Construction method
     */
    private ReceiveBox() {
        this.emailBox = new HashMap<>();
    }

    /**
     * accept message from publisher
     * @param email
     */
    @Override
    public void updateSelf(Email email) {
        emailBox.put(email.getTo(), email);
    }
}
