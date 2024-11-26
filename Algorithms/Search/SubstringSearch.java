public class SubstringSearch {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "abaaba";
        substringString(s1,s2);
    }
    //naive search
    public static void substringString(String pat,String string){
        int p = pat.length();
        int s = string.length();

        for (int i = 0; i <= s - p; i++) {
            int j;
            for (j = 0; j < p; j++) {
                if (string.charAt(i+j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j==p){
                System.out.println("pattern found! " + "index: " + i);
            }
        }
    }
}
