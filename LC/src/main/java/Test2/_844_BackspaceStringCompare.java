package Test2;

public class _844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        String processedS = processString(s);
        String processedT = processString(t);

        //so sánh 2 chuỗi và trả về kq ss
        return processedS.equals(processedT);
    }

    //method để loại bỏ những ký tự bị xóa khỏi chuỗi
    private String processString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {//duyệt qua từng ký tự trong chuỗi
            if (c == '#') {
                if (sb.length() > 0 ) { //kiểm tra xem sb đã có ký tự nào chưa bằng
                    sb.deleteCharAt(sb.length() - 1); //nếu đã có, xóa ký tự cuối cùng trong chuỗi sb
                }
            } else { //nếu ko phải ký tự '#', thì thêm ký tự đó vào cuối chuỗi
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //độ phức tạp của thuật toán O(n),  n là tổng độ dài của 2 chuỗi đầu vào s, t
}
