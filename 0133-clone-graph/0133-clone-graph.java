/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
    
}
일단 1번 점을 복제합니다. 그럼 우리는 1번 점과 똑같은 1번 점'이라는 새로운 점을 만들었습니다.

그리고 2번 점을 복제합니다. 이제 우리는 2번 점과 똑같은 2번 점'이라는 새로운 점을 만들었습니다.

이제 1번 점'과 2번 점'을 연결해야 합니다. 왜냐하면 원래 그래프에서 1번 점과 2번 점이 연결되어 있었기 때문입니다.

이제 이렇게 복제와 연결을 반복해서 모든 그래프를 만들면 됩니다
*/
class Solution {
          HashMap<Integer, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
      
        if (node == null) return null;
        if (visited.containsKey(node.val)) return visited.get(node.val);
        
        Node copyNode = new Node();
        copyNode.val = node.val; 
        visited.put(node.val, copyNode);
        
        for (Node neighbor : node.neighbors) {
            copyNode.neighbors.add(cloneGraph(neighbor));
        }
        
        return copyNode;
    }
}
