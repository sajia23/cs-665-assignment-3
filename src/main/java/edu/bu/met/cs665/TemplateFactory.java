/**
 * Name: Shaohua Yue
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: TemplateFactory.java
 * Description: This class produces all kinds of template.
 */
package edu.bu.met.cs665;

public class TemplateFactory {
    /**
     * Produce a desired email template by input parameter
     */
    public static EmailTemplate produceTemplate(CustomerSegment customerSegment) {
        switch(customerSegment) {
            case Business:
                return BussinessTemplate.getInstance();
            case Returning:
                return ReturningTemplate.getInstance();
            case Frequent:
                return FrequentTemplate.getInstance();
            case New:
                return NewTemplate.getInstance();
            case VIP:
                return VIPTemplate.getInstance();
            default:
                break;
        }
        return null;
    }

}
