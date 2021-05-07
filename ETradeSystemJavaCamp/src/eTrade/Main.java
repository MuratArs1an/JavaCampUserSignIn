package eTrade;

import eTrade.business.abstracts.UserService;
import eTrade.business.concretes.UserManager;
import eTrade.core.GoogleUserManagerAdapter;
import eTrade.dataAccess.concretes.HibernateUserDao;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService= new UserManager(new HibernateUserDao(),new GoogleUserManagerAdapter());
		User user=new User(1, "Murat","Arslan", "murat@gmail.com", "123456");
		User user2=new User(2, "m", "as", "1234534", "234355");
		
		userService.add(user);
		userService.add(user2);
		
		userService.logIn(user);
		userService.logInWithGoogle(user);
		
		

	}

}
