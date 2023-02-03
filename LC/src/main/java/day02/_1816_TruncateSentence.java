package day02;

public class _1816_TruncateSentence {
    public String truncateSentence(String s, int k) {
        int i=0;
        int spaceCount=0;

        while(i<s.length() && spaceCount<k){
            if(s.charAt(i)==' ') spaceCount++;
            i++;
        }
        // nếu spaceCount < k : phải bao gồm toàn bộ chuối
        return spaceCount==k ? s.substring(0, i - 1) : s;
    }
}
