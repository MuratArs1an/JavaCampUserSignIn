package eTrade.core;

import eTrade.googleUser.GoogleUserManager;

public class GoogleUserManagerAdapter implements GoogleUserService {

	@Override
	public void logIn(String user) {
		GoogleUserManager googleUserManager=new GoogleUserManager();
		googleUserManager.logIn(user);
		
	}

}
