package com.learn.compress;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Map<Character,String> huffManCodes = new HashMap<Character,String>();
	
	String mainurl = "https://www.amazon.in/b?node=2563504031&pf_rd_r=9R15V8AMX19Q0KVXH0SM&pf_rd_p=4555d78a-1ebd-4d7d-9e34-da45377f8be0&pd_rd_r=b99a0cbb-e61a-4005-82fa-b5274e8386a6&pd_rd_w=uHtEg&pd_rd_wg=V10Qf&ref_=pd_gw_unk";
	URL url = null;
	try {
	    url = new URL(mainurl);
	} catch (MalformedURLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	
	Tree huffManTree = new BuildHuffManTree().buildHuffManTree(url);
	huffManCodes = new Encode().encode(huffManTree,huffManCodes,""); 
	String str = Helper.getEncodedString(huffManCodes);
	System.out.println("In Runner"+ str);
	//String strAscii = Helper.ConvertBinarytoASCII(str);
	new Decode().decode(str,huffManCodes,huffManTree);

    }

}
