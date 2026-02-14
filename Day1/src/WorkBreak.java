//Notes
/*
We use
Boolean[] vs boolean[]: We use the wrapper class Boolean so the array defaults to null.
if we use primitive default value will be false.
 */
class WordBreak {
    public Boolean[] isValidWordBreak;
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        int l=s.length();
        isValidWordBreak = new Boolean[l];
        return isWordBreak(s,0,words,l,isValidWordBreak);


    }

    public boolean isWordBreak(String s, int start, Set<String> words, int l,Boolean [] isValidWordBreak){
        if(start==l)
            return true;

        if(isValidWordBreak[start]!=null)
            return isValidWordBreak[start];

        for(int end =start+1;end<=l;end++){
            String sub = s.substring(start,end);
            if(words.contains(sub) && isWordBreak(s,end,words,l,isValidWordBreak)){
                return isValidWordBreak[start] = true;
            }
        }
        return isValidWordBreak[start]=false;



    }
}
