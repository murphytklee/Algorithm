class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] keypad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 0, 11}
        };

        int leftHand = 10;  // '*'의 위치
        int rightHand = 11; // '#'의 위치

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (currentNumber == 1 || currentNumber == 4 || currentNumber == 7) {
                answer.append("L");
                leftHand = currentNumber;
            } else if (currentNumber == 3 || currentNumber == 6 || currentNumber == 9) {
                answer.append("R");
                rightHand = currentNumber;
            } else {
                int[] leftPos = findPosition(keypad, leftHand);
                int[] rightPos = findPosition(keypad, rightHand);
                int[] targetPos = findPosition(keypad, currentNumber);

                int leftDistance = calculateDistance(leftPos, targetPos);
                int rightDistance = calculateDistance(rightPos, targetPos);

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    answer.append("L");
                    leftHand = currentNumber;
                } else {
                    answer.append("R");
                    rightHand = currentNumber;
                }
            }
        }

        return answer.toString();
    }

    private int[] findPosition(int[][] keypad, int hand) throws IllegalArgumentException {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (keypad[i][j] == hand) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("위치를 찾을 수 없습니다." + hand);
    }

    private int calculateDistance(int[] from, int[] to) {
        // 가로 Distance + 세로 Distance 절대값 계산
        return Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String answer = sol.solution(numbers, hand);
        System.out.println("answer = " + answer);
    }
}
