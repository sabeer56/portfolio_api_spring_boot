package MailSender.com.PortFolioMailSenderDto;


public class MailStructure {
    private String subject;
    private String message;
    private String emailId;
    private String mobileNumber;
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubject() {
		return subject;
	}
	public String getMessage() {
		
		return message;
	}
}
