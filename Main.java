class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

        Quiz q = new Quiz();

        String chooseDefaultQuiz = InputHelper.getString("Use Default Quiz('y' / 'n'): ");
      
        if (chooseDefaultQuiz.equals("y")) {
            q = Quiz.DEFAULT_QUIZ;
        } else {

            int questionCount = InputHelper.getInt("Amount of questions for custom quiz: ", 0, Integer.MAX_VALUE);
            q.getQuestionsFromUser(questionCount);
            
        }

        //q.print();
        q.playQuiz();
        System.out.printf("Quiz Mark: %.2f%%", q.getMark());
  }
}