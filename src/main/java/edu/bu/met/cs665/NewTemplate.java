package edu.bu.met.cs665;

public class NewTemplate extends EmailTemplate{

    private static volatile NewTemplate newTemplate;

    Email email;

    private NewTemplate() {

    }

    public static NewTemplate getInstance() {
        if(newTemplate == null) {
            synchronized (NewTemplate.class) {
                if(newTemplate == null) {
                    newTemplate = new NewTemplate();
                }
            }
        }
        return newTemplate;
    }

    public String getSalutation(String name) {
        return "Hello, " + name;
    }

    public String getBody() {
        return "We're thrilled to have you with us. As part of our community, you'll enjoy exclusive benefits, exciting events, and valuable resources.";
    }

    public String getSubjectLine() {
        return "Welcome to Our Community!";
    }
}
