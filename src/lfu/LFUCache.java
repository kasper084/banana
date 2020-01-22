package lfu;

public class LFUCache {
    private String data;
    private int frequency;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void incrementFrequency() {
        frequency++;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "LFUCache{" +
                "data='" + data + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}