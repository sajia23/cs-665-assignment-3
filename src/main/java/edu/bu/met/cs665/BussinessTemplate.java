package edu.bu.met.cs665;

public class BussinessTemplate extends EmailTemplate{
    private static volatile BussinessTemplate bussinessTemplate;

    private BussinessTemplate() {

    }

    public static BussinessTemplate getInstance() {
        if(bussinessTemplate == null) {
            synchronized (BussinessTemplate.class) {
                if(bussinessTemplate == null) {
                    bussinessTemplate = new BussinessTemplate();
                }
            }
        }
        return bussinessTemplate;
    }

    public String getSalutation(String name) {
        return "Hello, " + name;
    }

    public String getBody() {
        return "We are excited to welcome you to our Business Membership program! As a valued business partner, you'll gain access to tailored solutions, exclusive offers, and dedicated support to help your business thrive.";
    }

    public String getSubjectLine() {
        return "Welcome to Business Membership!";
    }
}
