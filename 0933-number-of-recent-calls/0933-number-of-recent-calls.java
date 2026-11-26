
class RecentCounter {

    Queue<Integer> q = new ArrayDeque<>();

    public RecentCounter() {

    }

    public int ping(int t) {

        q.offer(t);

        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll();
        }

        return q.size();
    }
}