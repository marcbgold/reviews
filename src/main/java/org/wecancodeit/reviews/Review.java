package org.wecancodeit.reviews;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collection;

public class Review {

	private long id;
	private String title;
	private int yearPublished;
	private String category;
	private String description;
	private String imageUrl;
	private Collection<String> content;
	private ArrayList<String> tags;

	// TODO add tags implementation

	public Review(long id, String title, int yearPublished, String category, String description, String imageUrl, String haikuFirstLine, String haikuSecondLine,
			String haikuThirdLine) {
		this.id = id;
		this.title = title;
		this.yearPublished = yearPublished;
		this.category = category;
		this.description = description;
		this.imageUrl = imageUrl;
		this.content = new ArrayList<String>(asList(haikuFirstLine, haikuSecondLine, haikuThirdLine));
	}

	public long getId() {
		return id;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public Collection<String> getContent() {
		return content;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

}
