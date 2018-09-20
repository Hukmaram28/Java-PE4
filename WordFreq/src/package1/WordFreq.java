package package1;

public class WordFreq {

    public int freq(String str){
        int charcount = str.length() - str.replaceAll("a", "").length();
        return charcount;
    }
    public static void main(String[] args) {
        String str = "Java is java again java";
        int charcount = str.length() - str.replaceAll("a", "").length();
        System.out.println("Frequency Of a in Sentence: " + charcount);
    }
}
