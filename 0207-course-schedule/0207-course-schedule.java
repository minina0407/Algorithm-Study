class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 각 과목의 진입 차수를 저장할 배열입니다.
        int[] indegree = new int[numCourses];
        // 각 과목의 후행 과목들을 저장할 인접 리스트입니다.
        Map<Integer, List<Integer>> graph = new HashMap<>();
        // 위상 정렬 결과를 저장할 리스트입니다.
        List<Integer> path = new ArrayList<>();

        // 인접 리스트와 진입 차수 배열을 초기화합니다.
        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int prereqCourse = prereq[1];
            // prereqCourse에서 course로 가는 간선을 추가합니다.
            graph.computeIfAbsent(prereqCourse, k -> new ArrayList<>()).add(course);
            // course의 진입 차수를 1 증가시킵니다.
            indegree[course]++;
        }

        // 진입 차수가 0인 과목들을 큐에 추가합니다.
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        // 위상 정렬 알고리즘을 실행합니다.
        while (!queue.isEmpty()) {
            // 큐에서 과목을 하나 꺼냅니다.
            int currCourse = queue.poll();
            // 해당 과목을 위상 정렬 결과 리스트에 추가합니다.
            path.add(currCourse);
            // 해당 과목의 후행 과목들의 진입 차수를 1씩 감소시킵니다.
            if (graph.containsKey(currCourse)) {
                for (int nextCourse : graph.get(currCourse)) {
                    indegree[nextCourse]--;
                    // 진입 차수가 0이 된 과목들을 큐에 추가합니다.
                    if (indegree[nextCourse] == 0) {
                        queue.offer(nextCourse);
                    }
                }
            }
        }

        // 모든 과목이 위상 정렬 결과 리스트에 포함되었다면 true를 반환합니다.
        return path.size() == numCourses;
    }
}