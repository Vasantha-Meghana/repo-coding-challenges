//Unique Morse Code Words
class Solution
{
    public int uniqueMorseRepresentations(String[] words) 
    {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<String>();
        HashMap<Character, String> map = new HashMap<Character, String>();
        int i = 0;
        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            map.put(ch, code[i]);
            i++;
        }
        for(String str : words)
        {
            StringBuilder sbd = new StringBuilder();
            for(char ch : str.toCharArray())
                sbd.append(map.get(ch));
            set.add(sbd.toString());
        }
        return set.size();
    }    
}
