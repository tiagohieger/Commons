package br.com.makesystem.commons.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static String toMD5(final String data) {
		
		try {
			
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.reset();
			m.update(data.getBytes());
			BigInteger bigInt = new BigInteger(1, m.digest());
			String hashtext = bigInt.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
			
		} catch (NoSuchAlgorithmException e) {
			return "";
		}
	}

}
