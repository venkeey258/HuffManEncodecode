package com.learn.compress;

import java.net.URL;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class BuildHuffManTree {
    
    /** This will build a HuffManTree with URL as the input */
    public Tree buildHuffManTree(URL url) {
	
	char[] charArray = url.getQuery().toCharArray();
	Map<Character,Integer> charFrequency = new HashMap<Character,Integer>();
	
	for(char c: charArray) {
	    charFrequency.put(c, charFrequency.getOrDefault(c, 0)+1);
	}
	
	Queue<Tree> pqueue = new PriorityQueue<Tree>(Comparator.comparingInt(l -> l.frequency));
	
	for(Map.Entry<Character, Integer> entry: charFrequency.entrySet()) {
	    pqueue.add(new Tree(entry.getKey(),entry.getValue()));
	}
	
	while(pqueue.size() != 1) {
	    Tree left = pqueue.poll();
	    Tree right = pqueue.poll();
	    int sum = left.frequency+right.frequency;
	    pqueue.add(new Tree(null,sum,left,right));

	}
	
	return pqueue.peek();
	
    }

}
