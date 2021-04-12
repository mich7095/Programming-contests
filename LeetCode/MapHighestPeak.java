import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode 1765. Given a 2D array where True represents water and False
 * represents land generate a map with highest possible peak. Rules are: the
 * height of any water height is 0, the height of any land cell cannot differ
 * for more than one from any of the neighbouring(sharing one edge) cells.
 * Input: [0,1][0,0] Output: [1,0][2,1]
 */
class Solution {
    int m = isWater.length;
    int n = isWater[0].length;

    int[][] height = new int[m][n];
    Queue<int[]> q = new LinkedList<>();

    for(
    int i = 0;i<m;i++)
    {
        for (int j = 0; j < n; j++) {
            if (isWater[i][j] == 1) {
                height[i][j] = 0;
                q.offer(new int[] { i, j });
            } else
                height[i][j] = -1;
        }
    }while(!q.isEmpty())
    {
        int[] cell = q.poll();
        int row = cell[0], col = cell[1];
        for (int k = 0; k < 4; k++) {
            int x = row + d[k], y = col + d[k + 1];
            if (x >= 0 && x < m && y >= 0 && y < n && height[x][y] < 0) {
                height[x][y] = height[row][col] + 1;
                q.offer(new int[] { x, y });
            }
        }
    }return height;

}}