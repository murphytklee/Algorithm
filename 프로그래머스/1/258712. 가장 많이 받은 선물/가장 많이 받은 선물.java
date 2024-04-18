import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        int friendsLength = friends.length;
        int[] giftPoint = new int[friendsLength];
        int[][] exchangeGiftChart = new int[friendsLength][friendsLength];

        for (int i = 0; i < friendsLength; i++) {
            map.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] giveAndTake = gift.split(" ");
            String giver = giveAndTake[0];
            String receiver = giveAndTake[1];

            giftPoint[map.get(giver)]++;
            giftPoint[map.get(receiver)]--;
            exchangeGiftChart[map.get(giver)][map.get(receiver)]++;

        }
        for (int i = 0; i < friendsLength; i++) {
            int num = 0;
            for (int j = 0; j < friendsLength; j++) {
                if ( i == j) {
                    continue;
                }
                if (exchangeGiftChart[i][j] > exchangeGiftChart[j][i] || exchangeGiftChart[i][j] == exchangeGiftChart[j][i] && giftPoint[i] > giftPoint[j]){
                    num++;
                }
            }
            if (num > answer){
                answer = num;
            }
        }

        return answer;
    }
}