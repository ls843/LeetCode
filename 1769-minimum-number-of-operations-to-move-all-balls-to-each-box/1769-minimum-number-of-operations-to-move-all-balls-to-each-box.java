class Solution {
    public int[] minOperations(String boxes) {
        int answer[] = new int[boxes.length()];
        int minOps = 0;

        for(int i = 0; i < boxes.length(); i++) {
            for(int j = 0; j < boxes.length(); j++) {
                if(i == j) continue;
                if(boxes.charAt(j) == '1') {
                    minOps += Math.abs(j - i);
                }
            }

            answer[i] = minOps;
            minOps = 0;
        }

        return answer;
    }
}