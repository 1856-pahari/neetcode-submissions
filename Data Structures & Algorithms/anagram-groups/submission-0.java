class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs) {
            int[] freq = new int[26];
            for(char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public static boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

        //Initialize a frequency array to store character counts
        int[] freq = new int[26];

        for(int i=0; i<str1.length(); i++) {
            //increment frequency of each character in str1
            freq[str1.charAt(i) - 'A']++;
        }

        //decrement frequency of each character at str2
        for(int i=0; i<str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--;
        }

        //check frquencies of all character are zero, meaning both the strings are equal
        for(int i=0 ;i<26; i++) {
            if(freq[i] != 0) return false;
        }
        
        return true; //the strings are anagrams
    }
}
