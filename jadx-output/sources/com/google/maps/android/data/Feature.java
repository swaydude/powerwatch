package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public class Feature extends java.util.Observable {
    private com.google.maps.android.data.Geometry mGeometry;
    private final java.lang.String mId;
    private final java.util.Map<java.lang.String, java.lang.String> mProperties;

    public Feature(com.google.maps.android.data.Geometry geometry, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mGeometry = geometry;
        this.mId = str;
        if (map == null) {
            this.mProperties = new java.util.HashMap();
        } else {
            this.mProperties = map;
        }
    }

    public java.lang.Iterable<java.lang.String> getPropertyKeys() {
        return this.mProperties.keySet();
    }

    public java.lang.Iterable getProperties() {
        return this.mProperties.entrySet();
    }

    public java.lang.String getProperty(java.lang.String str) {
        return this.mProperties.get(str);
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public boolean hasProperty(java.lang.String str) {
        return this.mProperties.containsKey(str);
    }

    public com.google.maps.android.data.Geometry getGeometry() {
        return this.mGeometry;
    }

    public boolean hasProperties() {
        return this.mProperties.size() > 0;
    }

    public boolean hasGeometry() {
        return this.mGeometry != null;
    }

    protected java.lang.String setProperty(java.lang.String str, java.lang.String str2) {
        return this.mProperties.put(str, str2);
    }

    protected java.lang.String removeProperty(java.lang.String str) {
        return this.mProperties.remove(str);
    }

    protected void setGeometry(com.google.maps.android.data.Geometry geometry) {
        this.mGeometry = geometry;
    }
}
