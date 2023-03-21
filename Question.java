import java.util.Scanner;

class Question {

    public String question;
    public String answer;
    public String[] options;
    public String currentAnswer;
    
    public Question(String question, String answer, String... options) {

        this.question = question;
        this.answer = answer;
        this.options = options;
       
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String[] getOptions() {
        return this.options;
    }

    public void setQuestion(String question) {
     this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setOption(String option, int index) {
        if (index > this.options.length - 1) return;

        this.options[index] = option;
    }
    
    public boolean isAnswerCorrect(String answer) {
        this.currentAnswer = answer;
        return this.answer.equals(this.currentAnswer);
    }

    public boolean isCorrect() {
        return this.isAnswerCorrect(this.currentAnswer);
    }
    
    public void print() {

        System.out.printf("%s\n", question);
        
        for (int x = 0; x < options.length; x++) {

            System.out.printf("%c. %s\n", (char) (97 + x), options[x]);
            
        }
        
    }

    public void validate() {
 
        Scanner sc = new Scanner(System.in);

        this.print();

        System.out.print("Your answer: ");
        String response = sc.nextLine();

        if (this.isAnswerCorrect(response)) {

            System.out.println("Correct!");
            
        } else {

            System.out.println("Wrong!");
            
        }
    
    }
    
}