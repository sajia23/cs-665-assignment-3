package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestEmailService {
    @Before
    public void registerReceiveBox() {
        EmailService.getInstance().subscribe(ReceiveBox.getInstance());
    }

    public Request generateRequest(CustomerSegment customerSegment) {
        String name = RandomStringUtils.random(5, true, false);
        String emailAddress = name+"@bu.edu";
        Request request = new Request(name, emailAddress, customerSegment);
        return request;
    }

    @Test
    public void sendEmailToNewCustomer() {
        Request request = generateRequest(CustomerSegment.New);
        EmailService.getInstance().handleRequests(request);
        assertEquals(request.getCustomerEmail(), ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getTo());
        assertEquals("cs665emailservice@bu.edu", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getFrom());
        assertEquals("We're thrilled to have you with us. As part of our community, you'll enjoy exclusive benefits, exciting events, and valuable resources.", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getBody());

    }

    @Test
    public void sendEmailToVIPCustomer() {
        Request request = generateRequest(CustomerSegment.VIP);
        EmailService.getInstance().handleRequests(request);
        assertEquals(request.getCustomerEmail(), ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getTo());
        assertEquals("cs665emailservice@bu.edu", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getFrom());
        assertEquals("A warm welcome to our VIP community! We're honored to have you as a valued member. Enjoy premium benefits, priority support, and exclusive offers tailored just for you.", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getBody());
    }

    @Test
    public void sendEmailToBusinessCustomer() {
        Request request = generateRequest(CustomerSegment.Business);
        EmailService.getInstance().handleRequests(request);
        assertEquals(request.getCustomerEmail(), ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getTo());
        assertEquals("cs665emailservice@bu.edu", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getFrom());
        assertEquals("We are excited to welcome you to our Business Membership program! As a valued business partner, you'll gain access to tailored solutions, exclusive offers, and dedicated support to help your business thrive.", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getBody());
    }

    @Test
    public void sendEmailToFrequentCustomer() {
        Request request = generateRequest(CustomerSegment.Frequent);
        EmailService.getInstance().handleRequests(request);
        assertEquals(request.getCustomerEmail(), ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getTo());
        assertEquals("cs665emailservice@bu.edu", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getFrom());
        assertEquals("We truly appreciate your frequent support and loyalty to [Organization's Name]. Your ongoing trust means the world to us! As a token of gratitude, enjoy exclusive perks and personalized offers designed just for you.", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getBody());
    }

    @Test
    public void sendEmailToReturningCustomer() {
        Request request = generateRequest(CustomerSegment.Returning);
        EmailService.getInstance().handleRequests(request);
        assertEquals(request.getCustomerEmail(), ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getTo());
        assertEquals("cs665emailservice@bu.edu", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getFrom());
        assertEquals("We’re delighted to have you back with us! Your return means a lot, and we're excited to continue this journey together. Explore new updates, special offers, and exciting features waiting for you.", ReceiveBox.getInstance().emailBox.get(request.getCustomerEmail()).getBody());
    }


}
