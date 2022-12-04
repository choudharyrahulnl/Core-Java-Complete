package com.java.core.collections.Map;

/**
 * An object that maps keys to values
 * A map cannot contain duplicate keys; each key can map to at most one value.
 * The Map interface provides three collection views,
 * which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings
 * TreeMap class, make specific guarantees as to their order, HashMap class, do not
 */
public class MapExample {

    // clear(): Removes all of the mappings from this map

    // containsKey(Object key): Returns true if this map contains a mapping for the specified key.
    // containsValue(Object value): Returns true if this map maps one or more keys to the specified value

    // entry(K k, V v): Returns an unmodifiable Map.Entry containing the given key and value.
    // entrySet(): Returns a Set view of the mappings contained in this map.
    // keySet(): Returns a Set view of the keys contained in this map.
    // values(): Returns a Collection view of the values contained in this map.

    // get(Object key): Returns the value to which the specified key is mapped, or null if this map contains
    // no mapping for the key.
    // getOrDefault(Object key, V defaultValue): Returns the value to which the specified key is mapped,
    // or defaultValue if this map contains no mapping for the key.
    // put(K key, V value): Associates the specified value with the specified key in this map, also override value
    // putIfAbsent(K key, V value): If the specified key is not already associated with a value (or is mapped to null)
    // associates it with the given value and returns null, else returns the current value.
    // putAll(Map m): Copies all of the mappings from the specified map to this map


    // remove(Object key): Removes the mapping for a key from this map if it is present
    // remove(Object key, Object value): Removes the entry for the specified key only if it is currently mapped
    // to the specified value.

    // replace(K key, V value): Replaces the entry for the specified key only if it is currently mapped to some value.
    // replace(K key, V oldValue, V newValue): Replaces the entry for the specified key only if currently mapped to
    // the specified value.
    // replaceAll(K key, V value): Replaces each entry's value with the result of invoking the given function on that
    // entry until all entries have been processed or the function throws an exception

    // isEmpty(): Returns true if this map contains no key-value mappings.

    // merge((key,value)-> {}): If the specified key is not already associated with a value or is associated with null,
    // associates it with the given non-null value.

    // Map.of(): Returns an unmodifiable map containing zero mappings.
    // Map.of(K k1, V v1): Returns an unmodifiable map containing a single mapping.

    // size(): Returns the number of key-value mappings in this map.

    // 	forEach((key,value)-> {}): Performs the given action for each entry in this map until all entries have
    // 	been processed or the action throws an exception
}
