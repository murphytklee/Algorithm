class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW=0;
        int maxH=0;
           for(int i=0;i<sizes.length;i++){
               // 두 원소중 긴 길이를 w로 설정
               int w = Math.max(sizes[i][0],sizes[i][1]); 
               // 두 원소중 짧은 길이를 h로 설정
               int h = Math.min(sizes[i][0],sizes[i][1]);
               maxW = Math.max(maxW,w); //계속 비교하며 최댓값 중 최댓값 갱신
               maxH = Math.max(maxH,h); //계속 비교하며 최솟값 중 최댓값 갱신
        }
        return answer=maxW*maxH;
    }
}