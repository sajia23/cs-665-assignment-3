package edu.bu.met.cs665;

public abstract class EmailTemplate {
    public String getSignature() {
        return "Sincerely, Shaohua Yue CS665 EmailService";
    }

    public String getSalutation(String name) {
        return "Hello, " + name;
    }

    public String getBody() {
        return null;
    }

    public String getSubjectLine() {
        return null;
    }

    public String getClosing() {
        return "Please let me know if you're interested in this project and we can set up some time to discuss the details further. I look forward to hearing from you.";
    }
}
