
public class StringReplace {

    private String stateName;

    public StringReplace(){
        stateName ="Mississippi";
    }
    public StringReplace(String stateName){
        this.stateName=stateName;

    }
    public int replaceI(){
        stateName=stateName.replace("i","ii");
        return stateName.length();
    }
    public int replaceS(){
        stateName=stateName.replace("ss","s");
        return stateName.length();
    }
}
