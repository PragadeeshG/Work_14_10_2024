package com.test1;

public class FirebaseAppCheck {
	private Integer firebaseId;
	private String deviceCheck;
	private String appAttest;
	private String playIntegrity;
	private Integer reCaptchaEnterprise;
	private Integer defaultProviders;
	private Integer userId;
	private String customProviders;
	private String platformAttest;
	private String testProviders;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FirebaseAppCheck() {

	}

	public FirebaseAppCheck(Integer firebaseId, String deviceCheck, String appAttest, String playIntegrity,
			Integer reCaptchaEnterprise, Integer defaultProviders, Integer userId, String customProviders,
			String platformAttest, String testProviders, String creationDate, String modifiedDate, String entityState) {
		super();
		this.firebaseId = firebaseId;
		this.deviceCheck = deviceCheck;
		this.appAttest = appAttest;
		this.playIntegrity = playIntegrity;
		this.reCaptchaEnterprise = reCaptchaEnterprise;
		this.defaultProviders = defaultProviders;
		this.userId = userId;
		this.customProviders = customProviders;
		this.platformAttest = platformAttest;
		this.testProviders = testProviders;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getFirebaseId() {
		return firebaseId;
	}

	public void setFirebaseId(Integer firebaseId) {
		this.firebaseId = firebaseId;
	}

	public String getDeviceCheck() {
		return deviceCheck;
	}

	public void setDeviceCheck(String deviceCheck) {
		this.deviceCheck = deviceCheck;
	}

	public String getAppAttest() {
		return appAttest;
	}

	public void setAppAttest(String appAttest) {
		this.appAttest = appAttest;
	}

	public String getPlayIntegrity() {
		return playIntegrity;
	}

	public void setPlayIntegrity(String playIntegrity) {
		this.playIntegrity = playIntegrity;
	}

	public Integer getReCaptchaEnterprise() {
		return reCaptchaEnterprise;
	}

	public void setReCaptchaEnterprise(Integer reCaptchaEnterprise) {
		this.reCaptchaEnterprise = reCaptchaEnterprise;
	}

	public Integer getDefaultProviders() {
		return defaultProviders;
	}

	public void setDefaultProviders(Integer defaultProviders) {
		this.defaultProviders = defaultProviders;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCustomProviders() {
		return customProviders;
	}

	public void setCustomProviders(String customProviders) {
		this.customProviders = customProviders;
	}

	public String getPlatformAttest() {
		return platformAttest;
	}

	public void setPlatformAttest(String platformAttest) {
		this.platformAttest = platformAttest;
	}

	public String getTestProviders() {
		return testProviders;
	}

	public void setTestProviders(String testProviders) {
		this.testProviders = testProviders;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
