package badcode;

import java.util.Arrays;
import java.util.List;

public class Speaker {
    private String firstName;
    private String lastName;
    private String email;
    private int exp;
    private int registrationFee;
    private boolean hasBlog;
    private String blogUrl;
    private List<String> certifications;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(int registrationFee) {
        this.registrationFee = registrationFee;
    }

    public boolean isHasBlog() {
        return hasBlog;
    }

    public void setHasBlog(boolean hasBlog) {
        this.hasBlog = hasBlog;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public void validate() {
        if (isNullOrEmpty(getFirstName())) {
            throw new ArgumentNullException("First name is required.");
        }
        if (isNullOrEmpty(getLastName())) {
            throw new ArgumentNullException("Last name is required.");
        }
        if (isNullOrEmpty(getEmail())) {
            throw new ArgumentNullException("Email is required.");
        }
        String[] domains = {"gmail.com", "live.com"};
        String emailDomain = getEmailDomain(getEmail()); // Avoid ArrayIndexOutOfBound
        if (Arrays.stream(domains).filter(it -> it.equals(emailDomain)).count() != 1) {
            throw new SpeakerDoesntMeetRequirementsException("Speaker doesn't meet our standard rules.");
        }
    }

    public String getEmailDomain(String email) {
        String[] inputs = email.trim().split("@");
        if (inputs.length == 2) {
            return inputs[1];
        }
        throw new DomainEmailInvalidException("Email domain invalid.");
    }

    private boolean isNullOrEmpty(String input) {
        return input == null || input.trim().equals("");
    }
}
