package com.library.model;

import com.library.enums.BookCategory;

public class EBook extends Book {
	
	private String downloadLink;
	private double fileSizeMB;
	


	public EBook(String title, String author, int id, BookCategory category, String downloadLink, double fileSizeMB) {
		super(title, author, id, category);
		this.downloadLink = downloadLink;
		this.fileSizeMB = fileSizeMB;
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getBookType() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public double getFileSizeMB() {
		return fileSizeMB;
	}

	public void setFileSizeMB(double fileSizeMB) {
		this.fileSizeMB = fileSizeMB;
	}

	

}
