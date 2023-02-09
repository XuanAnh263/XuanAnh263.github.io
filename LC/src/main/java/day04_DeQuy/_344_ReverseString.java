package day04_DeQuy;

public class _344_ReverseString {
    public void reverseString(char[] s) {
        //Trong đó, hàm reverseString sử dụng hàm reverseStringHelper đệ quy để đảo ngược mảng ký tự.

        reverseStringHelper(s, 0, s.length - 1);
    }

    private void reverseStringHelper(char[] s, int start, int end) {
        // Hàm reverseStringHelper sẽ gọi đệ quy cho mỗi cặp ký tự từ đầu và cuối mảng,
        // đảo ngược vị trí của các ký tự này và gọi đệ quy cho một mảng con mới
        // để tiếp tục đảo ngược cho đến khi toàn bộ mảng được đảo ngược.
        if (start >= end) {
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverseStringHelper(s, start + 1, end - 1);
    }
}
