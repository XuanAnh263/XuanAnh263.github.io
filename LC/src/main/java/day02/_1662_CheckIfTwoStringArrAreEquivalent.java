package day02;

public class _1662_CheckIfTwoStringArrAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //dùng StringBuilder
        String s = "";
        StringBuilder s1= new StringBuilder();
        for (int i = 0; i < word1.length; i++){
            s += word1[i]; //có thể thay bằng append
        }
        for (int i = 0; i < word2.length; i++){
            s1.append(word2[i]); //dùng append để nối chuỗi
        }
        if (s.length() != s1.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            //so sánh index  s và s1
            if (s.charAt(i) != s1.charAt(j)){
                return false;
            }
            if (j <s1.length()-1) {
                j++;
            }

        }
        return true;
    }
}
