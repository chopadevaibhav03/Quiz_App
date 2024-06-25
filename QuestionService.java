import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"size of int ","1","2","3","4","4");
        questions[1] = new Question(2,"size of float ","1","2","3","4","4");
        questions[2] = new Question(3,"size of lonmg ","1","2","6","4","4");
        questions[3] = new Question(4,"size of Double ","1","2","8","4","8");
        questions[4] = new Question(5,"size of boolean ","1","2","3","4","1");

    }

    public void playQuiz(){

        int i=0;
        for(Question q : questions){
            System.out.println("Question no. :"+ q.getId());
            System.out.println(q.getQuestions());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for(String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        
        int score = 0;
        for(int i=0;i<questions.length;i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("your score is: "+ score);
    }

}
