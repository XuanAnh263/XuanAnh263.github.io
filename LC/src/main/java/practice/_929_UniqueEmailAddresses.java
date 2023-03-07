package practice;

import java.util.HashSet;
import java.util.Set;

public class _929_UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String userName = parts[0].replace(".", "");
            int plusIndex = userName.indexOf("+");
            if (plusIndex != -1) {
                userName = userName.substring(0, plusIndex);
            }
            set.add(userName + "@" + parts[1]);
        }
        return set.size();
    }
}
