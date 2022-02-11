package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private String title;
	private String content;
	private Integer likes;
	private Date moment;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(String title, String content, Integer likes, Date moment) {
		this.title = title;
		this.content = content;
		this.moment = moment;
		this.likes = likes;
	}
	
	public List<Comment> getComments(){
		return comments;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComments(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComments(Comment comment) {
		comments.remove(comment);
	}
	public String toString(){
		
		return 	title +
				"%n" +
				likes +
				" Likes - "+
				moment +
				"%n"+
				content +
				"%n" +
				"Comments: "+
				String.format(comments.forEach(comment->System.out.println(comment)));
	}

}
