import java.util.HashMap;
import java.util.List;
import java.util.Queue;

class Solution{
    public boolean canFinish(int numCourses, int[][] prerequisities){
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        int[] inDegrees = new int[numCourses];

        for(int[] courses : prerequisities){
            if(!adjList.containsKey(courses[1])){
                adjList.put(courses[1], new ArrayList<>());
            }

            adjList.get(courses[1]).add(courses[0]);
            inDegrees[courses[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(inDegrees[i] == 0){
                q.add(i);
            }
        }

        int enrolledCourses = 0;
        while(!q.isEmpty()){
            int currNode = q.poll();
            enrolledCourses++;
            if(adjList.containsKey(currNode)){
                for(int neighbor : adjList.get(currNode)){
                    inDegrees[neighbor]--;
                    if(inDegrees[neighbor] == 0){
                        q.add(neighbor);
                    }
                } 
            }
        }

        return enrolledCourses == numCourses;
    }
}