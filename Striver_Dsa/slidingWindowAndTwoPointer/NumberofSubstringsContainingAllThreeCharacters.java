public class NumberofSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
       System.out.println( numberOfSubstrings("abcabc"));
    }

    public static int numberOfSubstrings(String s) {
        int count = 0;
        int[] charCount = new int[3]; // For 'a', 'b', 'c'
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'a']++;

            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                count += s.length() - right;
                charCount[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
    
}
