public class StringTrim {

    private String sentence;
    public StringTrim(){
        sentence ="      I am a CSE student.";
    }

    public StringTrim(String sentence){
        this.sentence=sentence;
    }
    public String trim(){

        sentence=sentence.trim();
        return sentence;
    }

}
