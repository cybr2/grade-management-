package com.ydoow.utilities;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class IdGenerator {
    private static final Map<Class<?>, AtomicInteger> counters = new ConcurrentHashMap<>();

    public static int nextId(Class<?> type){
        counters.putIfAbsent(type, new AtomicInteger());
        return counters.get(type).incrementAndGet();
    } 
}
