package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program04 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment com1 = new Comment("Have a nice trip");
		Comment com2 = new Comment("Wow that's awesome!");
		Post post1 = new Post(
							"Traveling to New Zealand", 
							"I'm going to visist this wonderful country!", 
							sdf.parse("21/06/2018T13:05:44Z"), 
							12);
		post1.addComments(com1);
		post1.addComments(com2);
		
		Comment com3 = new Comment("Good night");
		Comment com4 = new Comment("May the force be with you");
		Post post2 = new Post(
							"Good night guys", 
							"See you tomorrow", 
							sdf.parse("28/07/2018T23:14:19Z"), 
							5);
		post2.addComments(com3);
		post2.addComments(com4);
		
		System.out.println();



		
		
		
		
		sc.close();

	}

}
