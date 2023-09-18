import java.util.Arrays;

class Solution {
    public int[] solution(String[] wallpaper) {
        int luY = wallpaper.length;
        int luX = wallpaper[0].length();
        int rdY = 0;
        int rdX = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    luX = Math.min(luX, j);
                    luY = Math.min(luY, i);
                    rdX = Math.max(rdX, j+1);
                    rdY = Math.max(rdY, i+1);
                }
            }
        }

        int[] answer = {luY, luX, rdY, rdX};
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] wallpaper = {"..", "#."};
        int[] answer = sol.solution(wallpaper);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
