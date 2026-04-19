class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> map = new HashMap<>();
        int minCards = Integer.MAX_VALUE;

        for(int i = 0; i < cards.length; i++) {
            if(map.containsKey(cards[i])) {
                minCards = Math.min(minCards, i - map.get(cards[i]) + 1);
            } 

            map.put(cards[i], i);
        }

        return minCards < Integer.MAX_VALUE ? minCards : -1;
    }
}