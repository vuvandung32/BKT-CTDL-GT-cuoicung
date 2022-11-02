import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _609 {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        List<List<String>> output = findDuplicate(paths);
        System.out.println(output.toString());
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (int n = 0; n < paths.length; n++) {
            char[] sa = paths[n].toCharArray();
            int b = 0;
            int i = 0;
            while (sa[i] != ' ') {
                i++;
            }
            String path = paths[n].substring(b, i);
            b = i + 1;
            while (i < sa.length) {
                while (sa[i] != ' ') {
                    i++;
                }
                b = i + 1;
                while (sa[i] != '(') {
                    i++;
                }
                String fileName = paths[n].substring(b, i);
                b = i + 1;
                while (sa[i] != ')') {
                    i++;
                }
                String content = paths[n].substring(b, i);
                String fullFileName = path + "/" + fileName;
                List<String> pli = map.get(content);
                if (pli == null) {
                    pli = new ArrayList<>();
                    map.put(content, pli);
                }
                pli.add(fullFileName);
                i++;
            }
        }
        for(List<String> pli : map.values()) {
            if(pli.size() > 1) {
                ans.add(pli);
            }
        }
        return ans;
    }
}
