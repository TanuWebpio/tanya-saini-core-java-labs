package com.tanya.lab4.ex3;

	class Book extends WrittenItem {

	    public Book(int id, String title, int copies, String author) {
	        super(id, title, copies, author);
	    }

	    @Override
	    public void print() {
	        System.out.println("Book -> " + this.toString());
	    }
	}

