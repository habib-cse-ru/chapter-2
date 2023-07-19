public class ReplaceTesterFull {
    public static void main(String[] args){

        String inputWord = "Mississippi";
        String encodedWord;
        encodedWord = inputWord.replace('i','!');
        encodedWord = inputWord.replace('s','$');
        System.out.println(inputWord);
        System.out.println(encodedWord.replace('i','!'));

    }
}
