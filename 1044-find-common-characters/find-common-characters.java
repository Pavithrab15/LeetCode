class Solution {
    public List<String> commonChars(String[] words) {
        int common[] = new int[26];
        String firstWord = words[0];

        for(char ch: firstWord.toCharArray()){
            int index = ch - 'a';
            common[index]++;
        }

        int n = words.length;
        for(int i=1; i<n; i++){
            int curr[] = new int[26];

            for(char ch: words[i].toCharArray()){
                int index = ch - 'a';
                curr[index]++;
            }

            for(int j=0; j<26; j++){
                common[j] = Math.min(common[j], curr[j]);
            }
        }

        List<String> res = new ArrayList<>();

        for(int i=0; i<26; i++){
            if(common[i] != 0){
                //char ch = (char) (i + 97);
                char a = 'a';
                a+=i;
                String ch = String.valueOf(a);
                int count = common[i];
                while(count!=0){
                    res.add("" + ch);
                    count--;
                }
            }
        }

        return res;

    }
}