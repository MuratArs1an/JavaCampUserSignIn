package eTrade.business.concretes;

import eTrade.business.abstracts.UserService;
import eTrade.core.GoogleUserService;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private GoogleUserService googleUserService;

	public UserManager(UserDao userDao, GoogleUserService googleUserService) {
		super();
		this.userDao = userDao;
		this.googleUserService=googleUserService;
	}

	@Override
	public void add(User user) {
		if(UserValidator.isEmailValid(user.geteMail()) && 
				UserValidator.isNameAndSurnameValid(user.getName(),user.getSurName())
				&& UserValidator.isPasswordValid(user.getPassword())) {
			System.out.println(user.geteMail()+" adresine kullanici dogrulama maili gonderildi.");
			System.out.println(user.geteMail()+" adresiniz dogrulandi ve kullaniciniz olusturuldu");
			userDao.add(user);
		}else {
			System.out.println("Girilen Bilgileriniz Eksik veya Yanlistir");
		}
		
	}
	
	public void logIn(User user) {
		System.out.println("Email ve Parola Giriniz:");
		System.out.println(user.geteMail()+" "+user.getPassword()+" Basari ile giris yaptiniz");
	}
	
	public void logInWithGoogle(User user) {
		googleUserService.logIn(user.geteMail());
	}

}
