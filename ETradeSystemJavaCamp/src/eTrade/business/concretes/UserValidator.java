package eTrade.business.concretes;

import java.util.regex.Pattern;

public class UserValidator {

	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isPasswordValid(String password) {
		if(password.length()>=6) {
			return true;
		}else {
		return false;}
	}
	
	public static boolean isNameAndSurnameValid(String name, String surName) {
		if(name.length()>=2 && surName.length()>=2) {
			return true;
		}else {
		return false;}
	}
	
	
}
