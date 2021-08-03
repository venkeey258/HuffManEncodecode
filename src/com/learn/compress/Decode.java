package com.learn.compress;

import java.util.Map;

public class Decode {
    
    public void decode(String url, Map<Character, String> huffManCodes, Tree tree) {
	StringBuilder sb = new StringBuilder();
	System.out.println("In decode"+sb.toString());
        for (char c: url.toCharArray()) {
            sb.append(huffManCodes.get(c));
        }
        if (Helper.isLeaf(tree))
        {
            // Special case: For input like a, aa, aaa, etc.
            while (tree.frequency-- > 0) {
                System.out.print(tree.ch);
            }
        }
        else {
            // Traverse the Huffman Tree again and this time,
            // decode the encoded string
            int index = -1;
            while (index < sb.length() - 1) {
                index = decodeTree(tree, index, sb);
            }
        }
    }



    private int decodeTree(Tree root, int index, StringBuilder sb) {
	// TODO Auto-generated method stub
	 if (root == null) {
	            return index;
	        }
	 
	        // Found a leaf node
	        if (Helper.isLeaf(root))
	        {
	            System.out.print(root.ch);
	            return index;
	        }
	 
	        index++;
	 
	        root = (sb.charAt(index) == '0') ? root.left : root.right;
	        index = decodeTree(root, index, sb);
	        return index;
    }
}