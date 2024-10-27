package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class ReceiveBox implements SubscriberBase{
    Map<String, Email> emailBox;

    private static volatile ReceiveBox receiveBox;

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
    private ReceiveBox() {
        this.emailBox = new HashMap<>();
    }

    @Override
    public void updateSelf(Email email) {
        emailBox.put(email.getTo(), email);
    }
}
