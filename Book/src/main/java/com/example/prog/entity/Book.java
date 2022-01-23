package com.example.prog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue
		   private Integer bookId;
		   private String bookName;
		   private Double bookPrice ;
		   private String bookAuthor;
             
		   public int bookId() {
	            return bookId;
	        }
	        public void setbookId(int bookId) {
	            this.bookId = bookId;
	        }
	        public String getbookName() {
	            return bookName;
	        }
	        public void setbookName(String bookName) {
	            this.bookName = bookName;
	        }
	        public Double getbookPrice () {
	            return bookPrice;
	        }
	        public void setbookPrice(Double bookPrice) {
	            this.bookPrice = bookPrice;
	        }
	        public String getbookAuthor() {
	            return bookAuthor;
	        }
	        public void setbookAuthor(String bookAuthor) {
	            this.bookAuthor = bookAuthor;
	        }
			
}
