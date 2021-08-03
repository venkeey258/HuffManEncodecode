package com.learn.compress;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Map;

public class Helper {
    
    public static boolean isLeaf(Tree root) {
	// TODO Auto-generated method stub
	return (root.left==null && root.right==null);
    }
    
    public static String getEncodedString(Map<Character,String> huffManCodes) {
	StringBuilder sb = new StringBuilder();
	for(Map.Entry<Character, String> entry:huffManCodes.entrySet()) {
	    sb.append(entry.getValue());
	}
	
	return sb.toString();
    }

    public static String ConvertBinarytoASCII(String str) {
	// TODO Auto-generated method stub
	String base64encodedString = null;
	try {
	   base64encodedString = Base64.getUrlEncoder().encodeToString(str.getBytes("utf-8"));
	} catch (UnsupportedEncodingException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return base64encodedString;
    }

}
