public class StringPattern {
    private String patternString;
    public StringPattern(String word,int limit) {
        generatePattern(word,limit);
    }
    public String getPattern() {
        return patternString;
    }
    private void generatePattern(String word,int limit){
        StringBuffer sb=new StringBuffer();
        sb.append(word, 0, limit);
        sb.append(word.substring(word.length()-limit));
        this.patternString=sb.toString();
    }
}
