package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonTreeReader extends com.google.gson.stream.JsonReader {
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    private java.lang.Object[] stack;
    private int stackSize;
    private static final java.io.Reader UNREADABLE_READER = new java.io.Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws java.io.IOException {
            throw new java.lang.AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            throw new java.lang.AssertionError();
        }
    };
    private static final java.lang.Object SENTINEL_CLOSED = new java.lang.Object();

    public JsonTreeReader(com.google.gson.JsonElement jsonElement) {
        super(UNREADABLE_READER);
        this.stack = new java.lang.Object[32];
        this.stackSize = 0;
        this.pathNames = new java.lang.String[32];
        this.pathIndices = new int[32];
        push(jsonElement);
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.BEGIN_ARRAY);
        push(((com.google.gson.JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.BEGIN_OBJECT);
        push(((com.google.gson.JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.END_OBJECT);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws java.io.IOException {
        com.google.gson.stream.JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == com.google.gson.stream.JsonToken.END_OBJECT || jsonTokenPeek == com.google.gson.stream.JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public com.google.gson.stream.JsonToken peek() throws java.io.IOException {
        if (this.stackSize == 0) {
            return com.google.gson.stream.JsonToken.END_DOCUMENT;
        }
        java.lang.Object objPeekStack = peekStack();
        if (objPeekStack instanceof java.util.Iterator) {
            boolean z = this.stack[this.stackSize - 2] instanceof com.google.gson.JsonObject;
            java.util.Iterator it = (java.util.Iterator) objPeekStack;
            if (!it.hasNext()) {
                return z ? com.google.gson.stream.JsonToken.END_OBJECT : com.google.gson.stream.JsonToken.END_ARRAY;
            }
            if (z) {
                return com.google.gson.stream.JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (objPeekStack instanceof com.google.gson.JsonObject) {
            return com.google.gson.stream.JsonToken.BEGIN_OBJECT;
        }
        if (objPeekStack instanceof com.google.gson.JsonArray) {
            return com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        }
        if (objPeekStack instanceof com.google.gson.JsonPrimitive) {
            com.google.gson.JsonPrimitive jsonPrimitive = (com.google.gson.JsonPrimitive) objPeekStack;
            if (jsonPrimitive.isString()) {
                return com.google.gson.stream.JsonToken.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return com.google.gson.stream.JsonToken.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return com.google.gson.stream.JsonToken.NUMBER;
            }
            throw new java.lang.AssertionError();
        }
        if (objPeekStack instanceof com.google.gson.JsonNull) {
            return com.google.gson.stream.JsonToken.NULL;
        }
        if (objPeekStack == SENTINEL_CLOSED) {
            throw new java.lang.IllegalStateException("JsonReader is closed");
        }
        throw new java.lang.AssertionError();
    }

    private java.lang.Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private java.lang.Object popStack() {
        java.lang.Object[] objArr = this.stack;
        int i = this.stackSize - 1;
        this.stackSize = i;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void expect(com.google.gson.stream.JsonToken jsonToken) throws java.io.IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new java.lang.IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String nextName() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) peekStack()).next();
        java.lang.String str = (java.lang.String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String nextString() throws java.io.IOException {
        com.google.gson.stream.JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != com.google.gson.stream.JsonToken.STRING && jsonTokenPeek != com.google.gson.stream.JsonToken.NUMBER) {
            throw new java.lang.IllegalStateException("Expected " + com.google.gson.stream.JsonToken.STRING + " but was " + jsonTokenPeek + locationString());
        }
        java.lang.String asString = ((com.google.gson.JsonPrimitive) popStack()).getAsString();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.BOOLEAN);
        boolean asBoolean = ((com.google.gson.JsonPrimitive) popStack()).getAsBoolean();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.NULL);
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws java.io.IOException {
        com.google.gson.stream.JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != com.google.gson.stream.JsonToken.NUMBER && jsonTokenPeek != com.google.gson.stream.JsonToken.STRING) {
            throw new java.lang.IllegalStateException("Expected " + com.google.gson.stream.JsonToken.NUMBER + " but was " + jsonTokenPeek + locationString());
        }
        double asDouble = ((com.google.gson.JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (java.lang.Double.isNaN(asDouble) || java.lang.Double.isInfinite(asDouble))) {
            throw new java.lang.NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws java.io.IOException {
        com.google.gson.stream.JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != com.google.gson.stream.JsonToken.NUMBER && jsonTokenPeek != com.google.gson.stream.JsonToken.STRING) {
            throw new java.lang.IllegalStateException("Expected " + com.google.gson.stream.JsonToken.NUMBER + " but was " + jsonTokenPeek + locationString());
        }
        long asLong = ((com.google.gson.JsonPrimitive) peekStack()).getAsLong();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws java.io.IOException {
        com.google.gson.stream.JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != com.google.gson.stream.JsonToken.NUMBER && jsonTokenPeek != com.google.gson.stream.JsonToken.STRING) {
            throw new java.lang.IllegalStateException("Expected " + com.google.gson.stream.JsonToken.NUMBER + " but was " + jsonTokenPeek + locationString());
        }
        int asInt = ((com.google.gson.JsonPrimitive) peekStack()).getAsInt();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.stack = new java.lang.Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws java.io.IOException {
        if (peek() == com.google.gson.stream.JsonToken.NAME) {
            nextName();
            this.pathNames[this.stackSize - 2] = "null";
        } else {
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                this.pathNames[i - 1] = "null";
            }
        }
        int i2 = this.stackSize;
        if (i2 > 0) {
            int[] iArr = this.pathIndices;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String toString() {
        return getClass().getSimpleName();
    }

    public void promoteNameToValue() throws java.io.IOException {
        expect(com.google.gson.stream.JsonToken.NAME);
        java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.Iterator) peekStack()).next();
        push(entry.getValue());
        push(new com.google.gson.JsonPrimitive((java.lang.String) entry.getKey()));
    }

    private void push(java.lang.Object obj) {
        int i = this.stackSize;
        java.lang.Object[] objArr = this.stack;
        if (i == objArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[i * 2];
            int[] iArr = new int[i * 2];
            java.lang.String[] strArr = new java.lang.String[i * 2];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.pathIndices, 0, iArr, 0, this.stackSize);
            java.lang.System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = objArr2;
            this.pathIndices = iArr;
            this.pathNames = strArr;
        }
        java.lang.Object[] objArr3 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        objArr3[i2] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String getPath() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.text.Typography.dollar);
        int i = 0;
        while (i < this.stackSize) {
            java.lang.Object[] objArr = this.stack;
            if (objArr[i] instanceof com.google.gson.JsonArray) {
                i++;
                if (objArr[i] instanceof java.util.Iterator) {
                    sb.append('[');
                    sb.append(this.pathIndices[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof com.google.gson.JsonObject) {
                i++;
                if (objArr[i] instanceof java.util.Iterator) {
                    sb.append('.');
                    java.lang.String[] strArr = this.pathNames;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private java.lang.String locationString() {
        return " at path " + getPath();
    }
}
