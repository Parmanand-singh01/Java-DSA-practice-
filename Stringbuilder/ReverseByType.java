class Solution {
    public String reverseByType(String s) {
        String f = s;
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        String p = "";
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(s.charAt(i))) {
                p += s.charAt(i);
            }
        }

        p = new StringBuilder(p).reverse().toString();
        int k = 0;
        s = s.replaceAll("[a-z]", "0");
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                sb.setCharAt(i, p.charAt(k++));
            }
        }
        p = "";
        s = f;
        for (int i = 0; i < n; i++) {
            if (!Character.isLetter(s.charAt(i))) {
                p += s.charAt(i);
            }
        }

        p = new StringBuilder(p).reverse().toString();

        s = s.replaceAll("[^a-zA-Z]", "1");
        k = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                sb.setCharAt(i, p.charAt(k++));
            }
        }
        return sb.toString();
    }
}
