class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> map=new HashSet<>();
        map.add('a');
        map.add('e');
        map.add('i');
        map.add('o');
        map.add('u');

        int window_vowel=0;
        int max_vowel=0;

        for(int i=0;i<k;i++){
            if(map.contains(s.charAt(i))) window_vowel++;
        }
        max_vowel=window_vowel;
        int start=0;
        int end=k;
        while(end<s.length()){
            if(map.contains(s.charAt(start))){
                window_vowel--;
            }
            start++;

            if(map.contains(s.charAt(end))){
                window_vowel++;
            }
            end++;

            max_vowel=Math.max(max_vowel,window_vowel);
        }
        return max_vowel;
    }
}