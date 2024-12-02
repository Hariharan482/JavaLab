public class StringPatternGenerator {
    private final String result;
    public StringPatternGenerator(String word){
        this.result=generatePattern(word);
    }

    public String getResult() {
        return result;
    }

    private String generatePattern(String word){
        StringBuilder resultString=new StringBuilder();
        int i=0;
        int length=word.length();
        while (i < length) {
            char ch = word.charAt(i);
            i++;
            int count = 0;
            while (i < length && Character.isDigit(word.charAt(i))) {
                count = count * 10 + (word.charAt(i) - '0');
                i++;
            }
            for (int j = 0; j < count; j++) {
                resultString.append(ch);
            }
        }
        return resultString.toString();
    }
}
