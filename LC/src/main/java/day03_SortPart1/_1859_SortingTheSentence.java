package day03_SortPart1;

public class _1859_SortingTheSentence {
    public String sortSentence(String s) {
        String[] ans = new String[s.split(" ").length];
        for(String st: s.split(" "))
        {
            ans[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
        }
        return String.join(" ",ans);
    }
}
