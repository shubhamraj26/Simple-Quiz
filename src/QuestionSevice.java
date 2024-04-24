import java.util.Scanner;

public class QuestionSevice {
    Question[] question =new Question[5];
    String[] selection=new String[5];

    public QuestionSevice() {
        question[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Rome", "Paris");
        question[1] = new Question(2, "Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Saturn", "Mars");
        question[2] = new Question(3, "Who wrote 'Romeo and Juliet'?", "William Shakespeare", "Jane Austen", "Charles Dickens", "Leo Tolstoy", "William Shakespeare");
        question[3] = new Question(4, "What is the chemical symbol for water?", "H2O", "CO2", "NaCl", "O2", "H2O");
        question[4] = new Question(5, "Which famous scientist developed the theory of relativity?", "Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking", "Albert Einstein");
    }

    public void playQuiz()
    {
        int i=0;
        for(Question item:question)
        {
            System.out.println(item.getId());
            System.out.println(item.getQuestion());
            System.out.println(item.getOpt1());
            System.out.println(item.getOpt2());
            System.out.println(item.getOpt3());
            System.out.println(item.getOpt4());
            Scanner sc=new Scanner(System.in);
            selection[i]=sc.nextLine();
            i++;
        }
        for(String s:selection)
        {
            System.out.println(s);
        }

    }
    public void calculateScore()
    {
        int score=0;
        for(int i=0;i<5;i++)
        {
            if(selection[i].equals(question[i].getAnswer())) score++;
        }
        System.out.println(score);
    }

}
