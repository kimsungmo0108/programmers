class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail"; // 로그인 실패를 기본으로 설정
        
        int rowCount = db.length;
        
        for (int i = 0; i < rowCount; i++) {
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                answer = "login";
                break;
            }else if (id_pw[0].equals(db[i][0]) && !(id_pw[1].equals(db[i][1]))) {
                answer = "wrong pw";
            }
        }
        
        return answer;
    }
}
