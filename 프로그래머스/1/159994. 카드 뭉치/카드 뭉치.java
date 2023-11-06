public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Index = 0;
        int card2Index = 0;
        for (int i = 0; i < goal.length; i++) {
            if (card1Index < cards1.length && goal[i].equals(cards1[card1Index])){
                card1Index++;
            } else if (card2Index < cards2.length && goal[i].equals(cards2[card2Index])){
                card2Index++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String answer = sol.solution(cards1, cards2, goal);
        System.out.println("answer = " + answer);
    }
}
