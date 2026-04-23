class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowels = "AEIOUaeiou";

        int left = 0, right = s.length() - 1;

        while(left < right) {
            while(left < right && vowels.indexOf(sb.charAt(left)) == -1) left++;
            while(left < right && vowels.indexOf(sb.charAt(right)) == -1) right--;

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }

        return sb.toString();
    }
}