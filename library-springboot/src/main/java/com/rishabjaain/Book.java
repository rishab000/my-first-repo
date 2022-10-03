package com.rishabjaain;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "book_111")
	public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		private String name;
		private String author;
		private int price;
		private String status;
		private String forDays;
		public void setStatus(String string) {
			this.status = string;
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPrice() {
			return this.price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getForDays() {
			return this.forDays;
		}
		public void setForDays(String forDays) {
			this.forDays = forDays;
		}
		public String getStatus() {
			return this.status;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", status="
					+ status + ", forDays=" + forDays + "]";
		}
		public Book(int id, String name, String author, int price, String status, String forDays) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.price = price;
			this.status = status;
			this.forDays = forDays;
		}
		public Book() {
			
		}

		//getters and setters
		//constructors
		//toString
		//hiosjd;maklsjfljzfjsklajflsdkaf[o das jf;lmkajdflknjsiodfoksadjfn;lkad jf [djfm[lkadjfn'lkjadflksdjnflk;ad nf;kljAS ;NLK;ASfn;lkasjdlk asjdokasd;lkjasdfljnsdfkl;ss
	}

