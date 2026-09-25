package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultDateTypeAdapter extends com.google.gson.TypeAdapter<java.util.Date> {
    private static final java.lang.String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final java.lang.Class<? extends java.util.Date> dateType;
    private final java.text.DateFormat enUsFormat;
    private final java.text.DateFormat localFormat;

    DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> cls) {
        this(cls, java.text.DateFormat.getDateTimeInstance(2, 2, java.util.Locale.US), java.text.DateFormat.getDateTimeInstance(2, 2));
    }

    DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> cls, java.lang.String str) {
        this(cls, new java.text.SimpleDateFormat(str, java.util.Locale.US), new java.text.SimpleDateFormat(str));
    }

    DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> cls, int i) {
        this(cls, java.text.DateFormat.getDateInstance(i, java.util.Locale.US), java.text.DateFormat.getDateInstance(i));
    }

    public DefaultDateTypeAdapter(int i, int i2) {
        this((java.lang.Class<? extends java.util.Date>) java.util.Date.class, java.text.DateFormat.getDateTimeInstance(i, i2, java.util.Locale.US), java.text.DateFormat.getDateTimeInstance(i, i2));
    }

    public DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> cls, int i, int i2) {
        this(cls, java.text.DateFormat.getDateTimeInstance(i, i2, java.util.Locale.US), java.text.DateFormat.getDateTimeInstance(i, i2));
    }

    DefaultDateTypeAdapter(java.lang.Class<? extends java.util.Date> cls, java.text.DateFormat dateFormat, java.text.DateFormat dateFormat2) {
        if (cls != java.util.Date.class && cls != java.sql.Date.class && cls != java.sql.Timestamp.class) {
            throw new java.lang.IllegalArgumentException("Date type must be one of " + java.util.Date.class + ", " + java.sql.Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
        }
        this.dateType = cls;
        this.enUsFormat = dateFormat;
        this.localFormat = dateFormat2;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Date date) throws java.io.IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.localFormat) {
            jsonWriter.value(this.enUsFormat.format(date));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public java.util.Date read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
        if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        java.util.Date dateDeserializeToDate = deserializeToDate(jsonReader.nextString());
        java.lang.Class<? extends java.util.Date> cls = this.dateType;
        if (cls == java.util.Date.class) {
            return dateDeserializeToDate;
        }
        if (cls == java.sql.Timestamp.class) {
            return new java.sql.Timestamp(dateDeserializeToDate.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateDeserializeToDate.getTime());
        }
        throw new java.lang.AssertionError();
    }

    private java.util.Date deserializeToDate(java.lang.String str) {
        java.util.Date date;
        synchronized (this.localFormat) {
            try {
                try {
                    try {
                        date = this.localFormat.parse(str);
                    } catch (java.text.ParseException e) {
                        throw new com.google.gson.JsonSyntaxException(str, e);
                    }
                } catch (java.text.ParseException unused) {
                    return com.google.gson.internal.bind.util.ISO8601Utils.parse(str, new java.text.ParsePosition(0));
                }
            } catch (java.text.ParseException unused2) {
                return this.enUsFormat.parse(str);
            }
        }
        return date;
    }

    public java.lang.String toString() {
        return SIMPLE_NAME + '(' + this.localFormat.getClass().getSimpleName() + ')';
    }
}
