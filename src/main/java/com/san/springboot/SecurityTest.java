package com.san.springboot;

import java.io.ByteArrayOutputStream;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
//import javax.xml.bind.DatatypeConverter;

public class SecurityTest {

//public class Test {
	static String valEnc = "665F708A99A61828CDBCBD8A9C7C2373BEC4A8F32B21B9B14988EF8725308B3A2EACED579212933CC73873378620E094";

//static String
	public static void main1(String[] args) throws Exception {

		System.out.println("Encryption Started");
		
		System.out.println(encryptBy64("Hello Sandeep Sir", secretKey));
// decryption();
		System.out.println("Java Decrypt:" + DecryptionFromBytes(hexStrToByteArray(valEnc1)));
		System.out.println("JAVA CODE::" + decrypt(valEnc, secretKey));
		System.out.println("JAVA CODE::" + Decrypt(valEnc, secretKey));

	}

	private static String secretKey = "746869734973415365637265744B6579746869734973415365637265744B6579";
	private static String salt = "";

	public static String decryptingO() {
// org.owasp.esapi.codecs.Base64 base=new org.owasp.esapi.codecs.Base64();
// Cipher ciper =new CipherSpec();

		return "";
	}

	public static String decryptO(String strToDecrypt, String secret) throws Exception {
		/*
		 * try {
		 */
		byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		IvParameterSpec ivspec = new IvParameterSpec(iv);

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec spec = new PBEKeySpec(secretKey.toCharArray());// , salt.getBytes(), 65536, 256);
		SecretKey tmp = factory.generateSecret(spec);
		SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");

		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, secretKey, ivspec);
		return null;// new
					// String(cipher.doFinal(Base64.decode(strToDecrypt)));//getDecoder().decode(strToDecrypt)));
		/*
		 * } catch (Exception e) { System.out.println("Error while decrypting: " +
		 * e.toString()); } return null;
		 */
	}

	public static byte[] hexStrToByteArray(String hex) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(hex.length() / 2);

		for (int i = 0; i < hex.length(); i += 2) {
			String output = hex.substring(i, i + 2);
			int decimal = Integer.parseInt(output, 16);
			baos.write(decimal);
		}
		return baos.toByteArray();
	}

	static String Decrypt(String text, String key) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		byte[] keyBytes = new byte[16];
		byte[] b = key.getBytes("UTF-8");
		int len = b.length;
		if (len > keyBytes.length)
			len = keyBytes.length;
		System.arraycopy(b, 0, keyBytes, 0, len);
		SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
		IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
		cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
//BASE64Decoder decoder = new BASE64Decoder();
		byte[] results = null;//cipher.doFinal(DatatypeConverter.parseBase64Binary(text));
		return new String(results, "UTF-8");
	}

	static void decryptionO() throws Exception {
		/*
		 * KeySpec ks = new DESKeySpec(secretKey.getBytes("UTF-8")); SecretKey key =
		 * SecretKeyFactory.getInstance("AES").generateSecret(ks);
		 * 
		 * IvParameterSpec iv = new IvParameterSpec(
		 * Hex.decodeHex(valEnc.toCharArray()));
		 * 
		 * Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		 * cipher.init(Cipher.DECRYPT_MODE, key, iv);
		 * 
		 * byte[] decoded = cipher.doFinal(Base64.decodeBase64("B3xogi/Qfsc="));
		 * 
		 * System.out.println("Decoded: " + new String(decoded, "UTF-8"));
		 * 
		 */}

//sandeep
	public static String DecryptionFromBytes(byte[] base64Data) {
		try {
//Create SecretKey object from common secret key string mentioned in constants class
			byte[] encoded = hexStrToByteArray(secretKey);// new
															// BigInteger("746869734973415365637265744B6579746869734973415365637265744B6579",
		System.out.println("Secret Key"+secretKey);							// 16).toByteArray();
			SecretKey secretKey = new SecretKeySpec(encoded, "AES");// SecretKeySpec(encoded, "AES");

//Cipher class object using AES as transformation
			Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");

//Initialize cipher in decrypt mode along with secret key object created above.
			cipher.init(Cipher.DECRYPT_MODE, secretKey);

//Decrypt input byte array
			byte[] decryptedByte = cipher.doFinal(base64Data);

//return decrypted input bytes as string
			return (new String(decryptedByte));
		} catch (Exception e) {
			e.printStackTrace();
		}

//return empty string if any error
		return "";
	}

	private static byte[] hexStringToByteO(String hexString) {
		try {
			int bytesCount = (hexString.length()) / 2;
			byte[] bytes = new byte[bytesCount];
			for (int x = 0; x < bytesCount; ++x) {
				System.out.println("Value HEX:" + x);
				bytes[x] = Byte.parseByte(hexString.substring(x * 2, 2), 16);
			} 
			return bytes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
//	}

//	}

//	---------------------------

	/*
	 * https://docs.spring.io/spring-cloud-dataflow/docs/current/reference/
	 * htmlsingle/
	 * 
	 * package com.vTransact.upi.common.test;
	 * 
	 * import java.io.ByteArrayOutputStream; import java.math.BigInteger; import
	 * java.security.NoSuchAlgorithmException; import
	 * java.security.spec.InvalidKeySpecException; import
	 * java.security.spec.KeySpec;
	 * 
	 * import javax.crypto.Cipher; import javax.crypto.SecretKey; import
	 * javax.crypto.SecretKeyFactory; import javax.crypto.spec.DESKeySpec; import
	 * javax.crypto.spec.IvParameterSpec; import javax.crypto.spec.PBEKeySpec;
	 * import javax.crypto.spec.SecretKeySpec; import
	 * javax.xml.bind.DatatypeConverter;
	 * 
	 * import org.apache.commons.codec.binary.Base64; import
	 * org.apache.commons.codec.binary.Hex; //import org.owasp.esapi.codecs.Base64;
	 * import org.owasp.esapi.crypto.CipherSpec;
	 * 
	 * import com.vTransact.upi.security.UPISecurity;
	 * 
	 * public class Test {
	 */
//	static String valEnc = "665F708A99A61828CDBCBD8A9C7C2373BEC4A8F32B21B9B14988EF8725308B3A2EACED579212933CC73873378620E094";
	static String valEnc1 = "AFAFBD800AC75C382E6432BC1CF44688FF9E2710CD3342EF396B8738E6836A9C9B7B9D3F88EAE1E5C44E99AD0C2646A2A20020E0D7511047F08ECE1FDF521ED3D2A797ACF28AE2A965022C90D6144990616FC9D42370A950E24FDD2F25B5C1CDB6DDF6EDBA66FA612099B2BAAEA9EE0A53B8EDF81D185550A3D74C407D6D63FC2A2B61DF5F4485656669D2BE73FB3A500F8191988A58A086AAE5BE8386A5E93113FE117D717C7579A494195058F792F9D52821734CB1A271AF04E77FC12D819E9B3C795E3FD1CDD7D061A92E987262F0A42CBE50D00D05BDB5B5B5B5AC4F0A8AF3CF06E37900642F256CE6541303CD64";

	public static void mainO(String[] args) throws Exception {
// UPISecurity security=new UPISecurity();
// decryption();
		System.out.println("Java Decrypt:" + DecryptionFromBytes(hexStrToByteArray(valEnc1)));
		System.out.println("JAVA CODE::" + decrypt(valEnc, secretKey));
		System.out.println("JAVA CODE::" + Decrypt(valEnc, secretKey));

	}

//	private static String secretKey = "746869734973415365637265744B6579746869734973415365637265744B6579";
//	private static String salt = "";

	public static String decrypting() {
// org.owasp.esapi.codecs.Base64 base=new org.owasp.esapi.codecs.Base64();
// Cipher ciper =new CipherSpec();

		return "";
	}

	public static String decrypt(String strToDecrypt, String secret) throws Exception {
		/*
		 * try {
		 */
		byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		IvParameterSpec ivspec = new IvParameterSpec(iv);

		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		KeySpec spec = new PBEKeySpec(secretKey.toCharArray());// , salt.getBytes(), 65536, 256);
		SecretKey tmp = factory.generateSecret(spec);
		SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");

		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, secretKey, ivspec);
		return null;// new
					// String(cipher.doFinal(Base64.decode(strToDecrypt)));//getDecoder().decode(strToDecrypt)));
		/*
		 * } catch (Exception e) { System.out.println("Error while decrypting: " +
		 * e.toString()); } return null;
		 */
	}

	public static byte[] hexStrToByteArrayO(String hex) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(hex.length() / 2);

		for (int i = 0; i < hex.length(); i += 2) {
			String output = hex.substring(i, i + 2);
			int decimal = Integer.parseInt(output, 16);
			baos.write(decimal);
		}
		return baos.toByteArray();
	}

	static String DecryptO(String text, String key) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		byte[] keyBytes = new byte[16];
		byte[] b = key.getBytes("UTF-8");
		int len = b.length;
		if (len > keyBytes.length)
			len = keyBytes.length;
		System.arraycopy(b, 0, keyBytes, 0, len);
		SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
		IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
		cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
//BASE64Decoder decoder = new BASE64Decoder();
		byte[] results = null;//cipher.doFinal(DatatypeConverter.parseBase64Binary(text));
		return new String(results, "UTF-8");
	}

	static void decryption() throws Exception {
		/*
		 * KeySpec ks = new DESKeySpec(secretKey.getBytes("UTF-8")); SecretKey key =
		 * SecretKeyFactory.getInstance("AES").generateSecret(ks);
		 * 
		 * IvParameterSpec iv = new
		 * IvParameterSpec(Hex.decodeHex(valEnc.toCharArray()));
		 * 
		 * Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		 * cipher.init(Cipher.DECRYPT_MODE, key, iv);
		 * 
		 * byte[] decoded = cipher.doFinal(Base64.decodeBase64("B3xogi/Qfsc="));
		 * 
		 * System.out.println("Decoded: " + new String(decoded, "UTF-8"));
		 * 
		 */}

//sandeep
	public static String DecryptionFromBytesO(byte[] base64Data) {
		try {
//Create SecretKey object from common secret key string mentioned in constants class
			byte[] encoded = hexStrToByteArray(secretKey);// new
															// BigInteger("746869734973415365637265744B6579746869734973415365637265744B6579",
															// 16).toByteArray();
			SecretKey secretKey = new SecretKeySpec(encoded, "AES");// SecretKeySpec(encoded, "AES");

//Cipher class object using AES as transformation
			Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");

//Initialize cipher in decrypt mode along with secret key object created above.
			cipher.init(Cipher.DECRYPT_MODE, secretKey);

//Decrypt input byte array
			byte[] decryptedByte = cipher.doFinal(base64Data);

//return decrypted input bytes as string
			return (new String(decryptedByte));
		} catch (Exception e) {
			e.printStackTrace();
		}

//return empty string if any error
		return "";
	}

 byte[] hexStringToByte(String hexString)
    {
      try
    {
			int bytesCount = (hexString.length()) / 2;
			byte[] bytes = new byte[bytesCount];
			for (int x = 0; x < bytesCount; ++x)
					{
					System.out.println("Value HEX:"+x);
					bytes[x] = Byte.parseByte(hexString.substring(x * 2, 2), 16);
					}
			return bytes;
			}
			catch(Exception e)
				{
					e.printStackTrace();
					}
				return null;
				}
//      }

//-----------------------------------------------

//	https:// stackoverflow.com/questions/27454025/unable-to-obtain-localdatetime-from-temporalaccessor-when-parsing-localdatetime

//	https:// javarevisited.blogspot.com/2015/03/20-examples-of-date-and-time-api-from-Java8.html

	private static String encryptBy64(String str, String theKey) throws Exception {

		byte[] encoded = hexStringToByteArray(secretKey);
		SecretKey myKeySpec = new SecretKeySpec(encoded, "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		cipher.init(Cipher.ENCRYPT_MODE, myKeySpec);
		byte[] encrypted = cipher.doFinal(str.getBytes());
		System.out.println(new String(encrypted) + ":::");
//		return StringToHex.asHex(encrypted).toUpperCase().trim();
		return null;
	}

	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
		}
		return data;
	}

	private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

	public static String asHex(byte[] buf) {
		char[] chars = new char[2 * buf.length];
		for (int i = 0; i < buf.length; ++i) {
			chars[2 * i] = HEX_CHARS[(buf[i] & 0xF0) >>> 4];
			chars[2 * i + 1] = HEX_CHARS[buf[i] & 0x0F];
		}
		return new String(chars);
	}

}
