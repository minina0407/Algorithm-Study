class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //일부 플롯에는 꽃이 심어져 있고 일부는 심어져 있지 않은 긴 화단이 있습니다. 그러나 인접한 플롯에는 꽃을 심을 수 없습니다.

//0과 1이 포함된 정수 배열 화단(0은 비어 있고 1은 비어 있지 않음을 의미)과 정수 n이 주어졌을 때,
        //인접 꽃 금지 규칙을 위반하지 않고 화단에 n개의 새로운 꽃을 심을 수 있으면 참을 반환하고, 그렇지 않으면 거짓을 반환합니다.
        
        // 1 0 0 0 1 -> 1 0 1 0 1 : 1 가능. 2불가능
        // 인접이 핵심 -> 만약 첫 시작이 0 이면 -> 0 | 1 : 다음이 1일경우 심기 불가 , 
        // 0 | 0 | 1 -> 첫번쨰 0에는 가능
            // 그리디 알고리즘으로 접근
       // 0 요소 바로 다음이 1이 아니여야함 -> 이걸 만족하는 요소가 n개 일경우 true 반환, 아닐 경우 false 반환
         int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                // 현재 위치, 이전 위치가 0인 경우를 고려하여 꽃을 심을 수 있는지 확인
                boolean canPlace = (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (canPlace) {
                    flowerbed[i] = 1; // 비어있는 곳에 꽃심기
                    count++; // 꽃을 심었으므로 개수를 증
                }
            }
        }
        
        return count >= n; // 심은 꽃의 개수가 n 이상이면 true를 반환
    }
}