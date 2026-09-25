package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class BiMultiMap<K> extends java.util.HashMap<K, java.lang.Object> {
    private final java.util.Map<java.lang.Object, K> mValuesToKeys = new java.util.HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ?> map) {
        for (java.util.Map.Entry<? extends K, ?> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(K k, java.lang.Object obj) {
        this.mValuesToKeys.put(obj, k);
        return super.put(k, obj);
    }

    public java.lang.Object put(K k, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.mValuesToKeys.put(it.next(), k);
        }
        return super.put((java.lang.Object) k, collection);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        java.lang.Object objRemove = super.remove(obj);
        if (objRemove instanceof java.util.Collection) {
            java.util.Iterator it = ((java.util.Collection) objRemove).iterator();
            while (it.hasNext()) {
                this.mValuesToKeys.remove(it.next());
            }
        } else {
            this.mValuesToKeys.remove(objRemove);
        }
        return objRemove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.mValuesToKeys.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public com.google.maps.android.data.geojson.BiMultiMap<K> clone() {
        com.google.maps.android.data.geojson.BiMultiMap<K> biMultiMap = new com.google.maps.android.data.geojson.BiMultiMap<>();
        biMultiMap.putAll((java.util.Map) super.clone());
        return biMultiMap;
    }

    public K getKey(java.lang.Object obj) {
        return this.mValuesToKeys.get(obj);
    }
}
