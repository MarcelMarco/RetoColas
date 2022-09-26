public class QueueImpl<T> implements Queue<T> {
    private int size = 0;
    T[] v;

    public QueueImpl(int len) {
        v= (T[]) new Object[len];
    }

    @Override
    public void push(T t) throws FullQueueException {
        v[size++] = t;
        //size++;
    }

    @Override
    public T pop() throws EmptyQueueException {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
