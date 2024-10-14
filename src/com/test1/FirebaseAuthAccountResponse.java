package com.test1;

public class FirebaseAuthAccountResponse {
	private Integer firebaseId;
	private String appHosting;
	private boolean activeAccount;
	private String serviceAccountId;
	private String activeAccountId;
	private String allowedUsersList;
	private String singInMethods;
	private String templates;
	private String authCountry;
	private Integer authRegionCode;
	private String exceptions;
	private String status;
	private String remarks;

	public FirebaseAuthAccountResponse() {

	}

	public FirebaseAuthAccountResponse(Integer firebaseId, String appHosting, boolean activeAccount,
			String serviceAccountId, String activeAccountId, String allowedUsersList, String singInMethods,
			String templates, String authCountry, Integer authRegionCode, String exceptions, String status,
			String remarks) {
		super();
		this.firebaseId = firebaseId;
		this.appHosting = appHosting;
		this.activeAccount = activeAccount;
		this.serviceAccountId = serviceAccountId;
		this.activeAccountId = activeAccountId;
		this.allowedUsersList = allowedUsersList;
		this.singInMethods = singInMethods;
		this.templates = templates;
		this.authCountry = authCountry;
		this.authRegionCode = authRegionCode;
		this.exceptions = exceptions;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getFirebaseId() {
		return firebaseId;
	}

	public void setFirebaseId(Integer firebaseId) {
		this.firebaseId = firebaseId;
	}

	public String getAppHosting() {
		return appHosting;
	}

	public void setAppHosting(String appHosting) {
		this.appHosting = appHosting;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public String getServiceAccountId() {
		return serviceAccountId;
	}

	public void setServiceAccountId(String serviceAccountId) {
		this.serviceAccountId = serviceAccountId;
	}

	public String getActiveAccountId() {
		return activeAccountId;
	}

	public void setActiveAccountId(String activeAccountId) {
		this.activeAccountId = activeAccountId;
	}

	public String getAllowedUsersList() {
		return allowedUsersList;
	}

	public void setAllowedUsersList(String allowedUsersList) {
		this.allowedUsersList = allowedUsersList;
	}

	public String getSingInMethods() {
		return singInMethods;
	}

	public void setSingInMethods(String singInMethods) {
		this.singInMethods = singInMethods;
	}

	public String getTemplates() {
		return templates;
	}

	public void setTemplates(String templates) {
		this.templates = templates;
	}

	public String getAuthCountry() {
		return authCountry;
	}

	public void setAuthCountry(String authCountry) {
		this.authCountry = authCountry;
	}

	public Integer getAuthRegionCode() {
		return authRegionCode;
	}

	public void setAuthRegionCode(Integer authRegionCode) {
		this.authRegionCode = authRegionCode;
	}

	public String getExceptions() {
		return exceptions;
	}

	public void setExceptions(String exceptions) {
		this.exceptions = exceptions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
