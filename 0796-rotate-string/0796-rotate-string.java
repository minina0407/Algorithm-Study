class Solution {
    public boolean rotateString(String s, String goal) {
/*
두 개의 문자열과 목표가 주어지면 s가 몇 번 이동한 후 목표가 될 수 있는 경우에만 true를 반환합니다.

s의 이동은 s의 가장 왼쪽 문자를 가장 오른쪽 위치로 이동하는 것으로 구성됩니다.

예를 들어, s = "abcde"이면 한 번의 이동 후 "bcdea"가 됩니다.
*/
    if (s.length() != goal.length()) {
        return false;
    }

    String double_s = s + s;

    return double_s.contains(goal);
}

}