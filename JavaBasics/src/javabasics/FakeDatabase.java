package javabasics;

public class FakeDatabase {
	
	public Authentication authenticate(String username,String password) {
		if (username.equals("mgmg") && password.equals("1234"))
			return new Authentication("a12345","ssa123");
		else
			return null;
	}

}
