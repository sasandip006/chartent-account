package com.san.springboot;

import java.io.ByteArrayOutputStream;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HexEncryption {


static String decrypt="665F708A99A61828CDBCBD8A9C7C2373BEC4A8F32B21B9B14988EF8725308B3A2EACED579212933CC73873378620E094";
static String secret="746869734973415365637265744B6579746869734973415365637265744B6579";

public static void main1(String[] args) throws Exception {
		
		System.out.println("JAVA DECRYPT::"+decryptionFromHex(decrypt,secret ));
		System.out.println("JAVA Encrypt::"+encryptBy64(decryptionFromHex(decrypt,secret),secret));
	}




 private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
	 private static String encryptBy64( String str, String secret) throws Exception
	  { 
		 ByteArrayOutputStream baos = new ByteArrayOutputStream(secret.length() / 2);

	        for (int i = 0; i < secret.length(); i += 2) {
	            String output = secret.substring(i, i + 2);
	            int decimal = Integer.parseInt(output, 16);
	            baos.write(decimal);
	        }
	        byte[] encoded = baos.toByteArray();
	      SecretKey myKeySpec = new SecretKeySpec(encoded, "AES");
	      Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
	      cipher.init(Cipher.ENCRYPT_MODE, myKeySpec);
	      byte[] encrypted  = cipher.doFinal(str.getBytes());
//	      System.out.println("CHAR:"+StringToHex.stringToHex(new String(encrypted)).toLowerCase().trim());
	      

	        char[] chars = new char[2 * encrypted.length];
	        for (int i = 0; i < encrypted.length; ++i)
	        {
	            chars[2 * i] = HEX_CHARS[(encrypted[i] & 0xF0) >>> 4];
	            chars[2 * i + 1] = HEX_CHARS[encrypted[i] & 0x0F];
	        }
	        return new String(chars).toUpperCase().trim();
	  }
	



public static String decryptionFromHex(String data,String secret) 
	    {       
	        try {
	        	ByteArrayOutputStream baos1 = new ByteArrayOutputStream(secret.length() / 2);

		        for (int i = 0; i < secret.length(); i += 2) {
		            String output = secret.substring(i, i + 2);
		            int decimal = Integer.parseInt(output, 16);
		            baos1.write(decimal);
		        }
		        byte[] encoded = baos1.toByteArray();

	            SecretKey secretKey = new   SecretKeySpec(encoded,  "AES");

	            
	            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");

	            
	            cipher.init(Cipher.DECRYPT_MODE, secretKey);

	            ByteArrayOutputStream baos = new ByteArrayOutputStream(data.length() / 2);

		        for (int i = 0; i < data.length(); i += 2) {
		            String output = data.substring(i, i + 2);
		            int decimal = Integer.parseInt(output, 16);
		            baos.write(decimal);
		        }
		        byte[] decryptedByte = cipher.doFinal(baos.toByteArray());
	            


	            
	            return (new String(decryptedByte));
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 

	         
	        return "";
	    }

}
