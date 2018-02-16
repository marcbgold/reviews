package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	// TODO add addReview method
	// TODO add date field

	Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		reviewList.put(00001L, new Review(00001L, "Chrono Trigger", 1995, "RPG", "Time-hopping shenanigans.", "./images/chrono-trigger.jpg", "Mute, spiky-haired kid",
				"Saves the world from space monster", "By tweaking spacetime"));
		reviewList.put(00002L, new Review(00002L, "Crash Bandicoot", 1996, "3D Platformer", "Rodent thing with pants vs. midget mad scientist.", "./images/crash-bandicoot.png",
				"Running towards the screen", "Falling into unseen holes", "The gamedevs hate you"));
		reviewList.put(00003L, new Review(00003L, "Portal 2", 2011, "Puzzle platformer", "Free cake.  So delicious and moist.", "./images/portal.jpg", "Here's the test result:",
				"\"You're a horrible person.\"", "See? That's what it says."));
		reviewList.put(00004L, new Review(00004L, "Super Mario World", 1990, "2D Platformer", "Turtle boss must die. Again.", "./images/super-mario-world.jpg", "Fat Italian guy",
				"Eats shrooms and murders turtles", "Bowser never learns"));
		reviewList.put(00005L, new Review(00005L, "Undertale", 2015, "RPG", "Kill everybody... or don't.  Up to you.", "./images/undertale.jpg", "Here, I made you this",
				"Cinnamon-butterscotch pie", "Now be good, won't you?"));
	}

	public ReviewRepository(Review... reviews) {
		for (Review current : reviews) {
			reviewList.put(current.getId(), current);
		}
	}

	public Review getReviewByID(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> getAllReviews() {
		return reviewList.values();
	}

}
