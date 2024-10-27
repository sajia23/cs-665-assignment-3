/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: EmailService.java
 * Description: This class defines email service.
 */
package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class EmailService implements PublisherBase{
    List<Email> readyList;
    static GenerateEmailCommand generateEmailCommand;

    ReceiveBox receiveBox;
    private static volatile EmailService es;

    /**
     * Construction method
     */
    private EmailService() {
        readyList = new ArrayList<>();
        generateEmailCommand = new GenerateEmailCommand();
        receiveBox = ReceiveBox.getInstance();
    }

    /**
     * Get a singleton instance.
     */
    public static EmailService getInstance() {
        if(es == null) {
            synchronized (EmailService.class) {
                if(es == null) {
                    es = new EmailService();
                }
            }
        }
        return es;
    }

    /**
     * Handle request
     * @param request
     */
    public void handleRequests(Request request) {
        generateEmailCommand.setEmailTemplate(TemplateFactory.produceTemplate(request.getCustomerSegment()));
        generateEmailCommand.setRequest(request);
        notifySubscribers(generateEmailCommand.execute());
    }

    /**
     * subscriber subscribe itself into publisher
     * @param o
     */
    @Override
    public void subscribe(SubscriberBase o) {
        receiveBox = (ReceiveBox) o;
    }

    /**
     * release all subscriber
     */
    @Override
    public void unsubscribeAll() {
        receiveBox = null;
    }

    /**
     * Publisher send the email to subscriber.
     * @param email
     */
    @Override
    public void notifySubscribers(Email email) {
        receiveBox.updateSelf(email);
    }
}
