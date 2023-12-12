import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> database = new HashMap<>();
        
        for (int i = 0; i < db.length; i++) {
            database.put(db[i][0], db[i][1]);
        }
        
        if (database.containsKey(id_pw[0])){
            if (id_pw[1].equals(database.get(id_pw[0]))){
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }
}