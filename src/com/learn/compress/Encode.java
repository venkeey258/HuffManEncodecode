package com.learn.compress;

import java.util.Map;

public class Encode {
    
    public Map<Character,String> encode(Tree root,Map<Character,String> huffManCodes,String str) {
	
	
	if(root == null) return huffManCodes;
	if(Helper.isLeaf(root)) {
	    huffManCodes.put(root.ch, str.length() > 0 ? str : "1");
	}
	encode(root.left,huffManCodes,str+'0');
	encode(root.right,huffManCodes,str+'1');
	
	return huffManCodes;
    }

    

}
