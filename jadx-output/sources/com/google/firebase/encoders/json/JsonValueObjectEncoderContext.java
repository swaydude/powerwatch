package com.google.firebase.encoders.json;

/* JADX INFO: compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class JsonValueObjectEncoderContext implements com.google.firebase.encoders.ObjectEncoderContext, com.google.firebase.encoders.ValueEncoderContext {
    private final android.util.JsonWriter jsonWriter;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;
    private com.google.firebase.encoders.json.JsonValueObjectEncoderContext childContext = null;
    private boolean active = true;

    JsonValueObjectEncoderContext(java.io.Writer writer, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> map, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> map2) {
        this.jsonWriter = new android.util.JsonWriter(writer);
        this.objectEncoders = map;
        this.valueEncoders = map2;
    }

    private JsonValueObjectEncoderContext(com.google.firebase.encoders.json.JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
        this.jsonWriter = jsonValueObjectEncoderContext.jsonWriter;
        this.objectEncoders = jsonValueObjectEncoderContext.objectEncoders;
        this.valueEncoders = jsonValueObjectEncoderContext.valueEncoders;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, java.lang.Object obj) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        if (obj == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        return add(obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, double d) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, int i) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, long j) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str, boolean z) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.name(str);
        return add(z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext nested(java.lang.String str) throws java.io.IOException {
        maybeUnNest();
        this.childContext = new com.google.firebase.encoders.json.JsonValueObjectEncoderContext(this);
        this.jsonWriter.name(str);
        this.jsonWriter.beginObject();
        return this.childContext;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String str) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(double d) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(int i) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(long j) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(boolean z) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        this.jsonWriter.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(byte[] bArr) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        maybeUnNest();
        if (bArr == null) {
            this.jsonWriter.nullValue();
        } else {
            this.jsonWriter.value(android.util.Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.Object obj) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        if (obj == null) {
            this.jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof java.lang.Number) {
            this.jsonWriter.value((java.lang.Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.jsonWriter.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    add(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof java.lang.Number[]) {
                java.lang.Number[] numberArr = (java.lang.Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    add(numberArr[i]);
                    i++;
                }
            } else {
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    add(objArr[i]);
                    i++;
                }
            }
            this.jsonWriter.endArray();
            return this;
        }
        if (obj instanceof java.util.Collection) {
            this.jsonWriter.beginArray();
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            this.jsonWriter.endArray();
            return this;
        }
        if (obj instanceof java.util.Map) {
            this.jsonWriter.beginObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                java.lang.Object key = entry.getKey();
                try {
                    add((java.lang.String) key, entry.getValue());
                } catch (java.lang.ClassCastException e) {
                    throw new com.google.firebase.encoders.EncodingException(java.lang.String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.jsonWriter.endObject();
            return this;
        }
        com.google.firebase.encoders.ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            this.jsonWriter.beginObject();
            objectEncoder.encode(obj, this);
            this.jsonWriter.endObject();
            return this;
        }
        com.google.firebase.encoders.ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
        if (valueEncoder != null) {
            valueEncoder.encode(obj, this);
            return this;
        }
        if (obj instanceof java.lang.Enum) {
            add(((java.lang.Enum) obj).name());
            return this;
        }
        throw new com.google.firebase.encoders.EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    void close() throws java.io.IOException {
        maybeUnNest();
        this.jsonWriter.flush();
    }

    private void maybeUnNest() throws java.io.IOException {
        if (!this.active) {
            throw new java.lang.IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        com.google.firebase.encoders.json.JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.childContext;
        if (jsonValueObjectEncoderContext != null) {
            jsonValueObjectEncoderContext.maybeUnNest();
            this.childContext.active = false;
            this.childContext = null;
            this.jsonWriter.endObject();
        }
    }
}
