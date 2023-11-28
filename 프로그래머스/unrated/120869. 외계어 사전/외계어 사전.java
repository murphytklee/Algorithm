public class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            int count = spell.length;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])){
                    count--;
                }
            }
            if (count == 0){
                return 1;
            }
        }
        return 2;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        int answer = sol.solution(spell, dic);
        System.out.println("answer = " + answer);
    }
}