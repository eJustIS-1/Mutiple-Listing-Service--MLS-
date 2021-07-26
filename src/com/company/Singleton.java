package com.company;

import java.util.*;

/**
 * Singleton object used to contain immediate cache need (JVM scope)
 * To be complete by students for caching layer
 */
public class Singleton {

    private Singleton() { }

    public final static int MAX_CACHE_SIZE = 500000;

    private static volatile Singleton instance = null;

    private static Map<UUID, MultipleListingService> map;
    private static Map<UUID, MultipleListingService> cache;


    /**
     * Get a reference to the singleton class
     * @return the Singleton that allows caching the MLS records
     */
    public static Singleton getInstance() {
        if (null == instance){
            synchronized (Singleton.class){
                if (null == instance){
                    instance = new Singleton();
                    map = new LinkedHashMap<>() {
                        @Override
                        protected boolean removeEldestEntry(final Map.Entry old) {
                            return size() > MAX_CACHE_SIZE;
                        }
                    };
                    cache = Collections.synchronizedMap(map);
                }
            }
        }
        return instance;
    }

    /**
     * Put a MLS record in the cache
     * @param id UUID of the MLS record
     * @param record the actual MLS record
     */
    public void storeCache(UUID id, MultipleListingService record){
        cache.put(id, record);
    }

    /**
     * Delete a MLS record in the cache
     * @param id UUID of the MLS record
     * @param record the actual MLS record
     */
    public void deleteCache(UUID id, MultipleListingService record){
        cache.remove(id, record);
    }

    /**
     * Clear the cache of all the MLS records
     */
    public void clearCache(){
        cache.clear();
    }

    /**
     * Cache lookup and get operation
     * @param id UUID of the record to be looked up and fetched.
     * @return the actual MLS record and null of not found in cache.
     */
    public MultipleListingService getCache(UUID id){
        MultipleListingService record = cache.getOrDefault(id, null);
        if (record != null){ System.out.println("Cache hit for " + record.getId()); }
        return record;
    }

    public void showAllCache() {
        System.out.println(cache);
    }
}
