package eTrade.dataAccess.abstracts;

import eTrade.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void remove(User user);
}
