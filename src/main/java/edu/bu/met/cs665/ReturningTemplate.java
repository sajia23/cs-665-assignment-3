package edu.bu.met.cs665;

public class ReturningTemplate extends EmailTemplate{
    private static volatile ReturningTemplate ReturningTemplate;



    private ReturningTemplate() {

    }

    public static ReturningTemplate getInstance() {
        if(ReturningTemplate == null) {
            synchronized (ReturningTemplate.class) {
                if(ReturningTemplate == null) {
                    ReturningTemplate = new ReturningTemplate();
                }
            }
        }
        return ReturningTemplate;
    }

    public String getSalutation(String name) {
        return "Hello, " + name;
    }

    public String getBody() {
        return "We’re delighted to have you back with us! Your return means a lot, and we're excited to continue this journey together. Explore new updates, special offers, and exciting features waiting for you.";
    }

    public String getSubjectLine() {
        return "Welcome Back!";
    }
}
