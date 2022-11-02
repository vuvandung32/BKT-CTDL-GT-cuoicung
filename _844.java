public class _844 {
    public static boolean backspaceCompare(String s, String t) {
        return cleanString(s).equals(cleanString(t));
    }

    public static String cleanString(String s) {
        StringBuilder cleanS = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (cleanS.length() == 0)
                    continue;
                cleanS.deleteCharAt(cleanS.length()-1);
            }
            else
                cleanS.append(c);
        }

        return cleanS.toString();
    }

    public static void main(String[] args) {
        String  s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));

    }
}
