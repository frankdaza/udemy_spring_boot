package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyAppConfig {
	
	private String appName;
	private String appDescription;
	private String adminFirstName;
	private String adminLastName;
	private String adminEmail;
	
	
	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}
	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}
	/**
	 * @return the appDescription
	 */
	public String getAppDescription() {
		return appDescription;
	}
	/**
	 * @param appDescription the appDescription to set
	 */
	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}
	/**
	 * @return the adminFirstName
	 */
	public String getAdminFirstName() {
		return adminFirstName;
	}
	/**
	 * @param adminFirstName the adminFirstName to set
	 */
	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}
	/**
	 * @return the adminLastName
	 */
	public String getAdminLastName() {
		return adminLastName;
	}
	/**
	 * @param adminLastName the adminLastName to set
	 */
	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}
	/**
	 * @return the adminEmail
	 */
	public String getAdminEmail() {
		return adminEmail;
	}
	/**
	 * @param adminEmail the adminEmail to set
	 */
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyAppConfig [appName=" + appName + ", appDescription=" + appDescription + ", adminFirstName="
				+ adminFirstName + ", adminLastName=" + adminLastName + ", adminEmail=" + adminEmail + "]";
	}
	
}
