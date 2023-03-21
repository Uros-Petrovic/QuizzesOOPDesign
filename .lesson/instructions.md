# Instructions  
Write a class that represents a short answer (multiple choice) quiz results. (It doesn’t matter the TYPE of the quiz, just that each question on this quiz would be worth only one mark!) This is a little different from the exercise on the previous assignment, as it is more geared towards SCORING a quiz not necessarily creating it. It would have attributes for the total marks, the actual score a student might receive as well as an array to keep track of whether or not a question is correct. 

There would be a default constructor to set the score to 0, the total to 10 and the array to a length of 10, but also another constructor that would take a different length of the quiz as the total, and use that to instantiate the array of results. Three methods would be:

- To enter whether or not each question was correct or not
- To check the results and update the score (based on the contents of the array)
- To display the final results of the quiz including the score, the total as well as calculate and show the percent earned

The main method in the Main class would be the driver code to instantiate a quiz object, then use each of these methods. Create driver code that uses the default quiz constructor (of length 10), **and** a second object that is a different length of quiz (uses the other constructor).

BONUS (level 4): If you can connect this assignment with your previous assignment to create the quiz and THEN mark it!
  