public class Riddle {
    private String question;
    private String answer;

    public Riddle(String q, String a){
        question = q;
        answer = a;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }
}
