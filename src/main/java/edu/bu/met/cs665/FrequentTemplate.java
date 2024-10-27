package edu.bu.met.cs665;

public class FrequentTemplate extends EmailTemplate{
    private static volatile FrequentTemplate frequentTemplate;



    private FrequentTemplate() {

    }

    public static FrequentTemplate getInstance() {
        if(frequentTemplate == null) {
            synchronized (FrequentTemplate.class) {
                if(frequentTemplate == null) {
                    frequentTemplate = new FrequentTemplate();
                }
            }
        }
        return frequentTemplate;
    }

    public String getSalutation(String name) {
        return "Hello, " + name;
    }

    public String getBody() {
        return "We truly appreciate your frequent support and loyalty to [Organization's Name]. Your ongoing trust means the world to us! As a token of gratitude, enjoy exclusive perks and personalized offers designed just for you.";
    }

    public String getSubjectLine() {
        return "Thank You for Your Continued Loyalty!";
    }
}
