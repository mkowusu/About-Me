package com.variablevisions.aboutme;

import java.util.Random;

public class AboutMe {
		// Member variables (properties about the object)
		public String[] mAbout = {
				"I was born on February 3rd, 1995.",
				"I am a computer science major at Grinnell College.",
				"I am super-smart!",
				"My favorite book is Harry Potter.",
				"I love listening to music.",
				"I can play several different instruments.",
				"I competed at the varsity level in football and wrestling.",
				"Naruto is my favorite anime and manga.",
				"My family came to the states from Ghana.",
				"I work at Hickory Park while I stay in Ames."};
		
		// Methods (abilities: things the object can do)
		public String getADescription() {
			
			String description;

			Random randomGenerator = new Random();  //Construct a new random number generator
			int randomNumber = randomGenerator.nextInt(mAbout.length);
			
			description = mAbout[randomNumber];
			
			return description;
		}

	}
