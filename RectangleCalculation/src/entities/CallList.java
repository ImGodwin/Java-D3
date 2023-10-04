package entities;

public class CallList {
    public int numCalled;
    public int time;

    public CallList(int numCalled, int time)
    {
        this.numCalled = numCalled;
        this.time = time;
    }

    @Override
    public String toString() {
        return "CallList{" +
                "numCalled=" + numCalled +
                ", time=" + time +
                '}';
    }
}
