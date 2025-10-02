class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full = numBottles;
        int empty = 0;
        int totalDrunk = 0;
        int currentExchange = numExchange;

        while (full > 0) {
            totalDrunk += full;
            empty += full;
            full = 0;

            if (empty >= currentExchange) {
                full = 1; 
                empty -= currentExchange;
                currentExchange++;
            } else {
                break;
            }
        }

        return totalDrunk;
    }
}