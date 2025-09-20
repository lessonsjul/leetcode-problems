import java.util.LinkedList;
import java.util.Queue;

class Solution2534 {
    private static final int ENTERING = 0;
    private static final int EXITING = 1;
    public int[] timeTaken(int[] arrival, int[] state) {
        var result = new int[arrival.length];

        Queue<Integer> entering = new LinkedList<>();
        Queue<Integer> exiting = new LinkedList<>();

        for (int person = 0; person < state.length; person++) {
            if (state[person] == ENTERING) {
                entering.add(person);
            } else {
                exiting.add(person);
            }
        }

        int timer = 0;
        int prev = EXITING;
        while (!entering.isEmpty() && !exiting.isEmpty()) {
            if (arrival[entering.peek()] <= timer && arrival[exiting.peek()] <= timer) {
                if (prev == ENTERING) {
                    result[entering.poll()] = timer;
                } else {
                    result[exiting.poll()] = timer;
                }
            } else if (arrival[entering.peek()] <= timer && arrival[exiting.peek()] > timer) {
                result[entering.poll()] = timer;
                prev = ENTERING;
            } else if (arrival[entering.peek()] > timer && arrival[exiting.peek()] <= timer) {
                result[exiting.poll()] = timer;
                prev = EXITING;
            } else {
                prev = 1;
            }

            timer++;
        }

        while (!entering.isEmpty()) {
            int person = entering.poll();
            result[person] = Math.max(arrival[person], timer);
            timer = Math.max(arrival[person], timer) + 1;
        }

        while (!exiting.isEmpty()) {
            int person = exiting.poll();
            result[person] = Math.max(arrival[person], timer);
            timer = Math.max(arrival[person], timer) + 1;
        }

        return result;
    }
}