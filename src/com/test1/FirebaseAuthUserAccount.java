package com.test1;

public class FirebaseAuthUserAccount {
	private Integer firebaseId;
	private String userAccountFeatures;
	private String functionTrigger;
	private String onAuth;
	private String onCreate;
	private Integer locale;
	private String sendWelcomeEmail;
	private String isPrivileged;
	private String lastLogin;
	private Integer contactId;
	private String addressId;
	private String uniqueUserId;
	private String requestType;

	public FirebaseAuthUserAccount() {

	}

	public FirebaseAuthUserAccount(Integer firebaseId, String userAccountFeatures, String functionTrigger,
			String onAuth, String onCreate, Integer locale, String sendWelcomeEmail, String isPrivileged,
			String lastLogin, Integer contactId, String addressId, String uniqueUserId, String requestType) {
		super();
		this.firebaseId = firebaseId;
		this.userAccountFeatures = userAccountFeatures;
		this.functionTrigger = functionTrigger;
		this.onAuth = onAuth;
		this.onCreate = onCreate;
		this.locale = locale;
		this.sendWelcomeEmail = sendWelcomeEmail;
		this.isPrivileged = isPrivileged;
		this.lastLogin = lastLogin;
		this.contactId = contactId;
		this.addressId = addressId;
		this.uniqueUserId = uniqueUserId;
		this.requestType = requestType;
	}

	public Integer getFirebaseId() {
		return firebaseId;
	}

	public void setFirebaseId(Integer firebaseId) {
		this.firebaseId = firebaseId;
	}

	public String getUserAccountFeatures() {
		return userAccountFeatures;
	}

	public void setUserAccountFeatures(String userAccountFeatures) {
		this.userAccountFeatures = userAccountFeatures;
	}

	public String getFunctionTrigger() {
		return functionTrigger;
	}

	public void setFunctionTrigger(String functionTrigger) {
		this.functionTrigger = functionTrigger;
	}

	public String getOnAuth() {
		return onAuth;
	}

	public void setOnAuth(String onAuth) {
		this.onAuth = onAuth;
	}

	public String getOnCreate() {
		return onCreate;
	}

	public void setOnCreate(String onCreate) {
		this.onCreate = onCreate;
	}

	public Integer getLocale() {
		return locale;
	}

	public void setLocale(Integer locale) {
		this.locale = locale;
	}

	public String getSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	public void setSendWelcomeEmail(String sendWelcomeEmail) {
		this.sendWelcomeEmail = sendWelcomeEmail;
	}

	public String getIsPrivileged() {
		return isPrivileged;
	}

	public void setIsPrivileged(String isPrivileged) {
		this.isPrivileged = isPrivileged;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getUniqueUserId() {
		return uniqueUserId;
	}

	public void setUniqueUserId(String uniqueUserId) {
		this.uniqueUserId = uniqueUserId;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

}
