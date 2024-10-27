package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class EmailService implements PublisherBase{
    List<Email> readyList;
    HandleProxy handleProxy;
    static GenerateEmailCommand generateEmailCommand;

    ReceiveBox receiveBox;
    private static volatile EmailService es;

    private EmailService() {
        handleProxy = HandleProxy.getInstance();
        readyList = new ArrayList<>();
        generateEmailCommand = new GenerateEmailCommand();
        receiveBox = ReceiveBox.getInstance();
    }

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

    public void SendEmails(List<Request> requestList) {
        for(Request request : requestList) {
            handleRequests(request);
        }
    }

    public void handleRequests(Request request) {
        generateEmailCommand.setEmailTemplate(TemplateFactory.produceTemplate(request.getCustomerSegment()));
        generateEmailCommand.setRequest(request);
        notifySubscribers(generateEmailCommand.execute());
    }

    @Override
    public void subscribe(SubscriberBase o) {
        receiveBox = (ReceiveBox) o;
    }

    @Override
    public void unsubscribeAll() {
        receiveBox = null;
    }

    @Override
    public void notifySubscribers(Email email) {
        receiveBox.updateSelf(email);
    }
}
