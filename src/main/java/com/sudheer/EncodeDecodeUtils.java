package com.sudheer;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeUtils {
	
	
	private String encode(String text)
	{
		Encoder encoder = Base64.getEncoder();
		String enocdestring = encoder.encodeToString(text.getBytes());
		return enocdestring;
	}
	
	public String decode(String encodeText)
	{
		Decoder decoder = Base64.getDecoder();
		byte[] decodetext = decoder.decode(encodeText);
		
		return new String(decodetext);
		
	}

}
