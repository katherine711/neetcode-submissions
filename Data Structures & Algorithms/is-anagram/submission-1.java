class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();

        if(n1!=n2){
            return false;
        }

        HashMap<Character, Integer> map1=new HashMap<>();
        HashMap<Character, Integer> map2=new HashMap<>();

        for(int i=0; i<n1; i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            map1.put(ch1, map1.getOrDefault(ch1, 0)+1);
            map2.put(ch2, map2.getOrDefault(ch2, 0)+1);
        }

        return map1.equals(map2);
    }
}
