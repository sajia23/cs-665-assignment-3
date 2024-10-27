package edu.bu.met.cs665;

public class VIPTemplate extends EmailTemplate{
    private static volatile VIPTemplate vipTemplate;



    private VIPTemplate() {

    }

    public static VIPTemplate getInstance() {
        if(vipTemplate == null) {
            synchronized (VIPTemplate.class) {
                if(vipTemplate == null) {
                    vipTemplate = new VIPTemplate();
                }
            }
        }
        return vipTemplate;
    }

    public String getSalutation(String name) {
        return "Hello, " + name;
    }

    public String getBody() {
        return "A warm welcome to our VIP community! We're honored to have you as a valued member. Enjoy premium benefits, priority support, and exclusive offers tailored just for you.";
    }

    public String getSubjectLine() {
        return "Welcome to Our VIP Membership!";
    }
}
