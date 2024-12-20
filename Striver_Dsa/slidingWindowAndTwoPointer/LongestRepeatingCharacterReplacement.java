public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s,1));
    }

    public static int characterReplacement(String s, int k) {
        int start=0,maxlength=0,maxfreq=0;
        int [] characterFreq=new int[26];

        for(int end=0; end <s.length();end++){
            characterFreq[s.charAt(end)-'A']++;
            maxfreq=Math.max(maxfreq, characterFreq[s.charAt(end)-'A']);

            if ((end-start+1)-maxfreq>k) {
                characterFreq[s.charAt(start)-'A']--;

                start++;
                
            }
            maxlength=Math.max(maxlength, end-start+1);

            
        }
        return maxlength;
        
    }
    
}
