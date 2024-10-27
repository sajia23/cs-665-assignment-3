package edu.bu.met.cs665;

public class Email {
    String to;
    String from;
    String body;
    String signature;
    String salutation;
    String subjectLine;
    String closing;

    public Email(String to, String from, String subjectLine, String salutation, String body, String closing, String signature) {
        this.to = to;
        this.from = from;
        this.subjectLine = subjectLine;
        this.salutation = salutation;
        this.body = body;
        this.closing = closing;
        this.signature = signature;
    }

    public Email() {

    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getSubjectLine() {
        return subjectLine;
    }

    public void setSubjectLine(String subjectLine) {
        this.subjectLine = subjectLine;
    }

    public String getClosing() {
        return closing;
    }

    public void setClosing(String closing) {
        this.closing = closing;
    }
}
