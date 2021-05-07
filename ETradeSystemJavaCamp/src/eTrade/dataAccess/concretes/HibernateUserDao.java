package eTrade.dataAccess.concretes;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi: " +user.getName()+" "+user.getSurName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile guncellendi");
		
	}

	@Override
	public void remove(User user) {
		System.out.println("Hibernate ile silindi");
		
	}

}
