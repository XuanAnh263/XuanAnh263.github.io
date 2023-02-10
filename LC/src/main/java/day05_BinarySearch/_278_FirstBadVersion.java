package day05_BinarySearch;

public class _278_FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {//hàm isBadVersion(mid) kiểm tra giá trị tại mid
                right = mid; //nếu giá trị tại mid là bad thì trả về true--> right = mid
            } else {
                //ngụược lại nếu false thì mid là good
                left = mid + 1;
            }
        }
        // vòng lặp sẽ tieesp tục chạy cho đến khi left >= right thì sẽ dừng lại

        return left;
    }

    private static boolean isBadVersion(int version) {
        //theo đề bài:
        //API isBadVersion được định nghĩa trong lớp mẹ VersionControl.
        //      boolean isBadVersion(int version)
        int bad = 4; // lấy bad ở Exam: 1
        return version >= bad;
    }
}
