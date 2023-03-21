import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Quiz {

    public static final Quiz DEFAULT_QUIZ = new Quiz();

    static {

        DEFAULT_QUIZ.insertQuestion(new Question("1 + 1 = ?: ", "a", new String[] {"2", "3", "1", "4"}));
        DEFAULT_QUIZ.insertQuestion(new Question("2 + 2 = ?: ", "b", new String[] {"2", "4", "5", "2"}));
        DEFAULT_QUIZ.insertQuestion(new Question("3 + 3 = ?: ", "a", new String[] {"6", "3", "1", "4"}));
        DEFAULT_QUIZ.insertQuestion(new Question("4 + 4 = ?: ", "e", new String[] {"12", "3", "11", "4", "8"}));
        DEFAULT_QUIZ.insertQuestion(new Question("5 + 5 = ?: ", "c", new String[] {"2", "13", "10", "24"}));
        
    }
    
    
    private boolean isPlayed = false;
    public int score = 0;
    public ArrayList<Question> questions;
    
    public Quiz() {
        this.questions = new ArrayList<Question>();
    }

    public void setQuestion(int index, Question q) {
        this.questions.set(index, q);
    }

    public void insertQuestion(Question q) {
        this.questions.add(q);
    }

    public void getQuestionFromUser() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Question Prompt: ");
        String prompt = sc.nextLine();

        System.out.print("Question answer (1 character): ");
        String answer = sc.nextLine();

        ArrayList<String> options = new ArrayList<String>();

        String inp;
        
        do {
            
            System.out.print("Enter an option: ");
            inp = sc.nextLine();

            if (inp != "") {
                options.add(inp);
            }
            
        } while(inp != "");
        
        this.questions.add(new Question(prompt, answer, Arrays.asList(options.toArray()).toArray(new String[options.size()])));
    }

    public void getQuestionsFromUser(int amount) {

        while(this.questions.size() < amount) {

            this.getQuestionFromUser();
            
        }
        
    }

    public void print() {
        
        for (Question q : this.questions) {

            q.print();
            
        }
    }
    
    public void playQuiz() {

        for (Question q : this.questions) {

            q.validate();
            if (q.isCorrect()) this.score++;
            
        }
        this.isPlayed = true;
    }

    public double getMark() {

        if (this.isPlayed) {

            return (double) score /  (double) this.questions.size() * 100.0d;
            
        } 
        
        return -1.0d;
    }
    
}          