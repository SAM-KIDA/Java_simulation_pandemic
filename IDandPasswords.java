package fina;

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Nahom","1234");
		logininfo.put("Admin","PASSWORD");
		logininfo.put("user","abc123");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}