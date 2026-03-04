import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 1. 선수의 이름과 현재 등수(인덱스)를 저장할 Map 생성
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        // 2. 호명된 선수를 처리
        for (String calling : callings) {
            // 현재 불린 선수의 등수
            int currentRank = rankMap.get(calling);
            
            // 앞서가던 선수 정보
            int frontRank = currentRank - 1;
            String frontPlayer = players[frontRank];

            // 3. 배열에서 두 선수의 위치 변경 (Swap)
            players[frontRank] = calling;
            players[currentRank] = frontPlayer;

            // 4. Map에서도 변경된 등수 갱신
            rankMap.put(calling, frontRank);
            rankMap.put(frontPlayer, currentRank);
        }

        return players;
    }
}