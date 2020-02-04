package lfu;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LFU {
    private static final int CAPACITY = 10;
    private static final int MIN_FREQUENCY = 1;
    private static Map<Integer, LFUCache> cache = new LinkedHashMap<>();

    public void addEntry(int key, String data) {
        if (!isFull()) {
            LFUCache temp = new LFUCache();
            temp.setData(data);
            temp.setFrequency(0);
            cache.put(key, temp);
        } else {
            int removableKey = getLFUKey();
            cache.remove(removableKey);
            LFUCache temp = new LFUCache();
            temp.setData(data);
            temp.setFrequency(0);
            cache.put(key, temp);
        }
    }

    private int getLFUKey() {
        int key = 0;
        int minFreq = 1;
        for (Map.Entry<Integer, LFUCache> entry : cache.entrySet()) {
            if (minFreq > entry.getValue().getFrequency()) {
                key = entry.getKey();
                minFreq = entry.getValue().getFrequency();
            }
        }
        return key;
    }

    public void getEntry(int key) {
        if (cache.containsKey(key)) {
            LFUCache temp = cache.get(key);
            temp.incrementFrequency();
            cache.put(key, temp);
        }
    }

    private boolean isFull() {
        return cache.size() == CAPACITY;
    }

    public void printMostRequested() {
        List<String> mostRequested = cache.values().stream()
                .filter(lfuCache -> lfuCache.getFrequency() > MIN_FREQUENCY)
                .map(LFUCache::getData)
                .collect(Collectors.toList());
        System.out.println(mostRequested);
    }
}