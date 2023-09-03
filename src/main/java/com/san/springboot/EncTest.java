package com.san.springboot;

import java.io.ByteArrayOutputStream;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class EncTest {


static String decrypt="665F708A99A61828CDBCBD8A9C7C2373BEC4A8F32B21B9B14988EF8725308B3A2EACED579212933CC73873378620E094";
static String secret="746869734973415365637265744B6579746869734973415365637265744B6579";

public static void main1(String[] args) throws Exception {
		
		System.out.println("JAVA DECRYPT::"+decryptionFromHex(decrypt,secret ));
		String inputData ="{\"StatusCode\":0,\"ResponseContent\":{\"Token\":\"OWNtVmRIVXcxa2k4cjdHV3ZjdGtTb0ZkQWpHT20wN3Y1\",\"TokenSecret\":\"V1dGWmVWSjNiek5PWmtoaFUyaE9lbTEwTVRkTWQwZGxUalpSTVZORE5EZHZWMmxTVUU1aVUwMVJXRzVLUlU4d1QyVlBSSGQ2YzFobWJHdFBkbkV4Tncy0\"}}";
		String secretKey = "746869734973415365637265744B6579746869734973415365637265744B6579";
		
		System.out.println("Encrypted Data ===>"+encryptBy64(inputData,secretKey));
		 
	}


	

	public static String getEncryptValue(String instr,String enc_key) throws Exception
		{
			if(!(instr ==null || instr.equals(""))){

				
				initEncrypt(enc_key);
				return encryptMEMessage(instr);

			}else{
				return"";
			}
		}

	public static String encryptMEMessage(String reqMsg) throws Exception {
			try {
				byte encstr[] = cipher.doFinal(reqMsg.getBytes());
				return HexUtil.HextoString(encstr);
			} catch (BadPaddingException nse) {
				throw new Exception("Invalid input String");
			}
		}

	public static void initEncrypt(String key) throws Exception {
		try {
			skeySpec = new SecretKeySpec(HexUtil.HexfromString(key), "AES");
			cipher = Cipher.getInstance("AES");
			cipher.init(1, skeySpec);
		} catch (NoSuchAlgorithmException nsae) {
			throw new Exception("Invalid Java Version");
		} catch (NoSuchPaddingException nse) {
			throw new Exception("Invalid Key");
		}
	}
	
	public static byte[] HexfromString(String s) {
		int i = s.length();
		byte abyte0[] = new byte[(i + 1) / 2];
		int j = 0;
		int k = 0;
		if (i % 2 == 1)
			abyte0[k++] = (byte) HexfromDigit(s.charAt(j++));
		while (j < i)
			abyte0[k++] = (byte) (HexfromDigit(s.charAt(j++)) << 4 | HexfromDigit(s.charAt(j++)));
		return abyte0;
	}
	
	public static int HexfromDigit(char c) {
		if (c >= '0' && c <= '9')
			return c - 48;
		if (c >= 'A' && c <= 'F')
			return (c - 65) + 10;
		if (c >= 'a' && c <= 'f')
			return (c - 97) + 10;
		else
			throw new IllegalArgumentException("invalid hex digit: " + c);
	}







        private static Cipher cipher;
	private static SecretKeySpec skeySpec;
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
	      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
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
