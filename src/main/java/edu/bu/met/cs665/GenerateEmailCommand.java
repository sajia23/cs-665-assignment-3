package edu.bu.met.cs665;

public class GenerateEmailCommand implements Command {
    EmailTemplate emailTemplate;
    Request request;

    public GenerateEmailCommand() {

    }

    @Override
    public Email execute() {
        Email email = new Email();
        email.setFrom("cs665emailservice@bu.edu");
        email.setTo(request.getCustomerEmail());
        email.setSubjectLine(emailTemplate.getSubjectLine());
        email.setSalutation(emailTemplate.getSalutation(request.getCustomerName()));
        email.setBody(emailTemplate.getBody());
        email.setClosing(emailTemplate.getClosing());
        email.setSignature(emailTemplate.getSignature());
        return email;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public EmailTemplate getEmailTemplate() {
        return emailTemplate;
    }

    public void setEmailTemplate(EmailTemplate emailTemplate) {
        this.emailTemplate = emailTemplate;
    }
}
