package javabasics;

public class Authentication {
	
	private String token;
	private String securityKey;
	public Authentication(String token, String securityKey) {
		super();
		this.token = token;
		this.securityKey = securityKey;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getSecurityKey() {
		return securityKey;
	}
	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;

	}
}
