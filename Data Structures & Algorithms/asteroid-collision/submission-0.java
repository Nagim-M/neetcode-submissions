class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            if (curr > 0) stack.push(curr);
            else {
                boolean isDestroyed = false;
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int leftAsteroid = stack.peek();
                    if (Math.abs(leftAsteroid) == Math.abs(curr)) {
                        stack.pop();
                        isDestroyed = true;
                        break;
                    }
                    else if (Math.abs(leftAsteroid) < Math.abs(curr)) stack.pop();
                    else {
                        isDestroyed = true;
                        break;
                    }
                }
                if (!isDestroyed) stack.push(curr);
            }
        }

        int[] result = new int[stack.size()];
        int i = 0;

        while (!stack.isEmpty()) result[i++] = stack.pollLast();
        return result;
    }
}