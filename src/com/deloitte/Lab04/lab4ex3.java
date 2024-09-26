package com.deloitte.Lab04;

public class lab4ex3 {
public static void main(String[] args) {
	 Book book1 = new Book(1, "Sample Book",5, "AAA");
	 
	 JournalPaper journal1 = new JournalPaper(2, "SampleJ", 4,"BBB",2002);
	 Video video1 = new Video(3, "Sample Video", 4,120, "NAME","CCC",2002);
	 
	 CD cd1 = new CD(4, "SampleCD",10, 20, "NAME" ,"GGG");
	 
	 System.out.println("Details before operations:");
     System.out.println("Book 1: " + book1.toString());
     System.out.println("Journal 1: " + journal1.toString());
     System.out.println("Video 1: " + video1.toString());
     System.out.println("CD 1: " + cd1.toString());
     
     book1.checkOut(); 
     journal1.addItem(2);
     video1.checkIn(); 
     cd1.checkOut();
     
     System.out.println("\nDetails after operations:");
     System.out.println("Book 1: " + book1.toString());
     System.out.println("Journal 1: " + journal1.toString());
     System.out.println("Video 1: " + video1.toString());
     System.out.println("CD 1: " + cd1.toString());
	 
	 
}
}
