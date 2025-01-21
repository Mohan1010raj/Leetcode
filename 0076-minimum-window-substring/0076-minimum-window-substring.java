class Solution {
    // static boolean contains(String curr,String t){
    //     Map<Character,Integer> m1=new HashMap<>();
    //     Map<Character,Integer> m2=new HashMap<>();
    //     for(char c:curr.toCharArray()){
    //         m1.put(c,m1.getOrDefault(c,0)+1);
    //     }

    //     for(char c:t.toCharArray()){
    //         m2.put(c,m2.getOrDefault(c,0)+1);
    //     }

    //     for(Map.Entry<Character,Integer> entry:m2.entrySet()){
    //         char key=entry.getKey();
    //         int value=entry.getValue();
    //         if(!m1.containsKey(key) || m1.get(key)<value){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public String minWindow(String s, String t) {
    //     int l=0;
    //     int r=l+t.length();
    //     int size=s.length()-t.length();
    //     String str="";
    //     int len=Integer.MAX_VALUE;
    //     while(l<=size){
    //         String curr=s.substring(l,Math.min(r,s.length()));
    //         System.out.println(curr+" "+t);
    //         if(contains(curr,t)){
    //             if(curr.length()<len){
    //                 len=curr.length();
    //                 str=curr;
                    
    //             }
    //             l++;
    //             r=l+t.length();
    //         }
    //         else{
    //             r++;
    //         }
    //         if(r>s.length()){
    //             l++;
    //             r=l+t.length();
    //         }
    //     }
    //     return str;
    // }


    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency map for characters in `t`
        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        // Sliding window variables
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Frequency map for the current window
        Map<Character, Integer> windowFreq = new HashMap<>();
        int required = tFreq.size();
        int formed = 0;

        while (r < s.length()) {
            // Expand the window by including the character at `r`
            char c = s.charAt(r);
            windowFreq.put(c, windowFreq.getOrDefault(c, 0) + 1);

            // Check if the current window contains all characters of `t`
            if (windowFreq.getOrDefault(c, 0).equals(tFreq.getOrDefault(c, 0))) {
                formed++;
            }

            // If the window is valid, try to shrink it
            while (l <= r && formed == required) {
                String curr = s.substring(l, r + 1);
                if (curr.length() < minLen) {
                    minLen = curr.length();
                    start = l;
                }

                // Remove the leftmost character from the window
                char leftChar = s.charAt(l);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                if (windowFreq.get(leftChar) < tFreq.getOrDefault(leftChar, 0)) {
                    formed--;
                }
                l++;
            }
            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}