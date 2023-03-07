package practice;

public class _1528_ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] characters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            characters[indices[i]] = s.charAt(i);
        }
        return new String(characters);
    }
}
