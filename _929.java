import java.util.HashSet;
import java.util.Set;

public class _929 {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int output = numUniqueEmails(emails);
        System.out.println(output);
    }

    public static int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) {
            return 0;
        }
        Set<String> mails = new HashSet<>();
        for (String email : emails) {
            String[] splits = email.split("@");
            StringBuilder sb = new StringBuilder();
            for (char c : splits[0].toCharArray()) {
                if (c == '+') {
                    break;
                }
                if (c == '.') {
                    continue;
                }
                sb.append(c);
            }
            sb.append("@").append(splits[1]);
            mails.add(sb.toString());
        }
        return mails.size();
    }
}
