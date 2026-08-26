
class Solution {

    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        String answer = "";
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '1') {
                count++;
            }
            while (count == k) {
                int len = j - i + 1;
                String current = s.substring(i, j + 1);
                if (len < min || (len == min && current.compareTo(answer) < 0)) {
                    min = len;
                    answer = current;
                }
                if (s.charAt(i) == '1') {
                    count--;
                }
                i++;
            }
        }
        return answer;
    }
}
