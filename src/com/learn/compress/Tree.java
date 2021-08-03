package com.learn.compress;

public class Tree {
    
    Character ch;
    int frequency;
    Tree left;
    Tree right;
    
    public Tree(Character ch, int frequency, Tree left, Tree right) {
	super();
	this.ch = ch;
	this.frequency = frequency;
	this.left = left;
	this.right = right;
    }

    public Tree() {
	// TODO Auto-generated constructor stub
    }

    public Tree(Character ch, Integer frequency) {
	// TODO Auto-generated constructor stub
	this.ch = ch;
	this.frequency = frequency;
    }

    @Override
    public String toString() {
	return "Tree [ch=" + ch + ", frequency=" + frequency + ", left=" + left + ", right=" + right + "]";
    }
    
    
    

}
