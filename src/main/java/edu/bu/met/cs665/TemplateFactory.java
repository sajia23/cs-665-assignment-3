package edu.bu.met.cs665;

public class TemplateFactory {
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
