import java.util.Arrays;

public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] location = new int[2];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S'){
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            char direction = routes[i].charAt(0);
            int distance = Character.getNumericValue(routes[i].charAt(2));

            int newRow = location[0];
            int newCol = location[1];

            boolean validMove = true;

            for (int j = 0; j < distance; j++) {
                if (direction == 'N'){
                    newRow--;
                }
                if (direction == 'S'){
                    newRow++;
                }
                if (direction == 'W'){
                    newCol--;
                }
                if (direction == 'E'){
                    newCol++;
                }

                if (!isValidPosition(park, newRow, newCol) || park[newRow].charAt(newCol) == 'X') {
                    validMove = false;
                    break;
                }
            }

            if (validMove) {
                location[0] = newRow;
                location[1] = newCol;
            }
        }
        
        return location;
    }

    private boolean isValidPosition(String[] park, int row, int col) {
        return row >= 0 && row < park.length && col >= 0 && col < park[row].length();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        int[] answer = sol.solution(park, routes);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
