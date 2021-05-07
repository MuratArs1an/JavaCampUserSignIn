package eTrade.business.abstracts;

import eTrade.entities.concretes.User;

public interface UserService {
	void add(User user);
	void logIn(User user);
	void logInWithGoogle(User user);

}
