import java.util.*;

class Solution{
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> answer = new ArrayList<>();
        Set<String> foodList = new HashSet<>();
        Set<String> tableList = new HashSet<>();
        Map<String, Map<String, Integer>> tableOrders = new HashMap<>();

        // 주문 목록에서 테이블 번호와 음식을 가져와서 foodList와 tableList에 추가
        for(List<String> order : orders){
            String tableNum = order.get(1);
            String food = order.get(2);

            foodList.add(food);
            tableList.add(tableNum);
            // 테이블 번호별로 음식을 저장할 Map을 만들고, 없으면 만들어서 추가
            tableOrders.putIfAbsent(tableNum, new HashMap<>());
            //테이블 번호별로, 주문 받은 음식별로 갯수 추가
            tableOrders.get(tableNum).put(food, tableOrders.get(tableNum).getOrDefault(food, 0) + 1);
        }

        // foodList와 tableList를 정렬
        List<String> orderFoodList = new ArrayList<>(foodList);
        Collections.sort(orderFoodList);
        // Table 요소 추가
        orderFoodList.add(0, "Table");
        answer.add(orderFoodList);

        List<String> tableNumList = new ArrayList<>(tableList);
        // table 번호 정렬( 오름차순 )
        tableNumList.sort(Comparator.comparingInt(Integer::parseInt));

        // 테이블 번호별로 주문한 음식갯수 추가
        for(String tableName : tableNumList){
            List<String> orderFoodCountList = new ArrayList<>();
            orderFoodCountList.add(tableName);
            // 첫번째 요소인 "Table"을 제외한 요소들에 대해 테이블 번호 별로, 주문한 food 갯수 추가
            for(String food : orderFoodList.subList(1, orderFoodList.size())){
                orderFoodCountList.add(Integer.toString(tableOrders.get(tableName).getOrDefault(food, 0)));
            }
            answer.add(orderFoodCountList);
        }
        return answer;
    }
}
