package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAdapters {
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> ATOMIC_BOOLEAN;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> ATOMIC_INTEGER;
    public static final com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> ATOMIC_INTEGER_ARRAY;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final com.google.gson.TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final com.google.gson.TypeAdapter<java.math.BigDecimal> BIG_DECIMAL;
    public static final com.google.gson.TypeAdapter<java.math.BigInteger> BIG_INTEGER;
    public static final com.google.gson.TypeAdapter<java.util.BitSet> BIT_SET;
    public static final com.google.gson.TypeAdapterFactory BIT_SET_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN;
    public static final com.google.gson.TypeAdapter<java.lang.Boolean> BOOLEAN_AS_STRING;
    public static final com.google.gson.TypeAdapterFactory BOOLEAN_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> BYTE;
    public static final com.google.gson.TypeAdapterFactory BYTE_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.Calendar> CALENDAR;
    public static final com.google.gson.TypeAdapterFactory CALENDAR_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Character> CHARACTER;
    public static final com.google.gson.TypeAdapterFactory CHARACTER_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Class> CLASS;
    public static final com.google.gson.TypeAdapterFactory CLASS_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.Currency> CURRENCY;
    public static final com.google.gson.TypeAdapterFactory CURRENCY_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> DOUBLE;
    public static final com.google.gson.TypeAdapterFactory ENUM_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> FLOAT;
    public static final com.google.gson.TypeAdapter<java.net.InetAddress> INET_ADDRESS;
    public static final com.google.gson.TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> INTEGER;
    public static final com.google.gson.TypeAdapterFactory INTEGER_FACTORY;
    public static final com.google.gson.TypeAdapter<com.google.gson.JsonElement> JSON_ELEMENT;
    public static final com.google.gson.TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.Locale> LOCALE;
    public static final com.google.gson.TypeAdapterFactory LOCALE_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> LONG;
    public static final com.google.gson.TypeAdapter<java.lang.Number> NUMBER;
    public static final com.google.gson.TypeAdapterFactory NUMBER_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.Number> SHORT;
    public static final com.google.gson.TypeAdapterFactory SHORT_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.String> STRING;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuffer> STRING_BUFFER;
    public static final com.google.gson.TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final com.google.gson.TypeAdapter<java.lang.StringBuilder> STRING_BUILDER;
    public static final com.google.gson.TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final com.google.gson.TypeAdapterFactory STRING_FACTORY;
    public static final com.google.gson.TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final com.google.gson.TypeAdapter<java.net.URI> URI;
    public static final com.google.gson.TypeAdapterFactory URI_FACTORY;
    public static final com.google.gson.TypeAdapter<java.net.URL> URL;
    public static final com.google.gson.TypeAdapterFactory URL_FACTORY;
    public static final com.google.gson.TypeAdapter<java.util.UUID> UUID;
    public static final com.google.gson.TypeAdapterFactory UUID_FACTORY;

    private TypeAdapters() {
        throw new java.lang.UnsupportedOperationException();
    }

    static {
        com.google.gson.TypeAdapter<java.lang.Class> typeAdapterNullSafe = new com.google.gson.TypeAdapter<java.lang.Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Class cls) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Class read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                throw new java.lang.UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = typeAdapterNullSafe;
        CLASS_FACTORY = newFactory(java.lang.Class.class, typeAdapterNullSafe);
        com.google.gson.TypeAdapter<java.util.BitSet> typeAdapterNullSafe2 = new com.google.gson.TypeAdapter<java.util.BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            /* JADX WARN: Code duplicated, block: B:15:0x002e  */
            @Override // com.google.gson.TypeAdapter
            public java.util.BitSet read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.BitSet bitSet = new java.util.BitSet();
                jsonReader.beginArray();
                com.google.gson.stream.JsonToken jsonTokenPeek = jsonReader.peek();
                int i = 0;
                while (jsonTokenPeek != com.google.gson.stream.JsonToken.END_ARRAY) {
                    int i2 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
                    boolean zNextBoolean = true;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            zNextBoolean = jsonReader.nextBoolean();
                        } else if (i2 == 3) {
                            java.lang.String strNextString = jsonReader.nextString();
                            try {
                                if (java.lang.Integer.parseInt(strNextString) == 0) {
                                    zNextBoolean = false;
                                }
                            } catch (java.lang.NumberFormatException unused) {
                                throw new com.google.gson.JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + strNextString);
                            }
                        } else {
                            throw new com.google.gson.JsonSyntaxException("Invalid bitset value type: " + jsonTokenPeek);
                        }
                    } else if (jsonReader.nextInt() == 0) {
                        zNextBoolean = false;
                    }
                    if (zNextBoolean) {
                        bitSet.set(i);
                    }
                    i++;
                    jsonTokenPeek = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.BitSet bitSet) throws java.io.IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = typeAdapterNullSafe2;
        BIT_SET_FACTORY = newFactory(java.util.BitSet.class, typeAdapterNullSafe2);
        com.google.gson.TypeAdapter<java.lang.Boolean> typeAdapter = new com.google.gson.TypeAdapter<java.lang.Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Boolean read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.STRING) {
                    return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(jsonReader.nextString()));
                }
                return java.lang.Boolean.valueOf(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Boolean bool) throws java.io.IOException {
                jsonWriter.value(bool);
            }
        };
        BOOLEAN = typeAdapter;
        BOOLEAN_AS_STRING = new com.google.gson.TypeAdapter<java.lang.Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Boolean read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Boolean.valueOf(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Boolean bool) throws java.io.IOException {
                jsonWriter.value(bool == null ? "null" : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(java.lang.Boolean.TYPE, java.lang.Boolean.class, typeAdapter);
        com.google.gson.TypeAdapter<java.lang.Number> typeAdapter2 = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Byte.valueOf((byte) jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                jsonWriter.value(number);
            }
        };
        BYTE = typeAdapter2;
        BYTE_FACTORY = newFactory(java.lang.Byte.TYPE, java.lang.Byte.class, typeAdapter2);
        com.google.gson.TypeAdapter<java.lang.Number> typeAdapter3 = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Short.valueOf((short) jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                jsonWriter.value(number);
            }
        };
        SHORT = typeAdapter3;
        SHORT_FACTORY = newFactory(java.lang.Short.TYPE, java.lang.Short.class, typeAdapter3);
        com.google.gson.TypeAdapter<java.lang.Number> typeAdapter4 = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Integer.valueOf(jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                jsonWriter.value(number);
            }
        };
        INTEGER = typeAdapter4;
        INTEGER_FACTORY = newFactory(java.lang.Integer.TYPE, java.lang.Integer.class, typeAdapter4);
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> typeAdapterNullSafe3 = new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public java.util.concurrent.atomic.AtomicInteger read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                try {
                    return new java.util.concurrent.atomic.AtomicInteger(jsonReader.nextInt());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicInteger atomicInteger) throws java.io.IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = typeAdapterNullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(java.util.concurrent.atomic.AtomicInteger.class, typeAdapterNullSafe3);
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> typeAdapterNullSafe4 = new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public java.util.concurrent.atomic.AtomicBoolean read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                return new java.util.concurrent.atomic.AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) throws java.io.IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = typeAdapterNullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(java.util.concurrent.atomic.AtomicBoolean.class, typeAdapterNullSafe4);
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> typeAdapterNullSafe5 = new com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public java.util.concurrent.atomic.AtomicIntegerArray read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(jsonReader.nextInt()));
                    } catch (java.lang.NumberFormatException e) {
                        throw new com.google.gson.JsonSyntaxException(e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray = new java.util.concurrent.atomic.AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((java.lang.Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray) throws java.io.IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(atomicIntegerArray.get(i));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = typeAdapterNullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(java.util.concurrent.atomic.AtomicIntegerArray.class, typeAdapterNullSafe5);
        LONG = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return java.lang.Long.valueOf(jsonReader.nextLong());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                jsonWriter.value(number);
            }
        };
        FLOAT = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                jsonWriter.value(number);
            }
        };
        DOUBLE = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.lang.Double.valueOf(jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                jsonWriter.value(number);
            }
        };
        com.google.gson.TypeAdapter<java.lang.Number> typeAdapter5 = new com.google.gson.TypeAdapter<java.lang.Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Number read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                com.google.gson.stream.JsonToken jsonTokenPeek = jsonReader.peek();
                int i = com.google.gson.internal.bind.TypeAdapters.AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()];
                if (i == 1 || i == 3) {
                    return new com.google.gson.internal.LazilyParsedNumber(jsonReader.nextString());
                }
                if (i == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new com.google.gson.JsonSyntaxException("Expecting number, got: " + jsonTokenPeek);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Number number) throws java.io.IOException {
                jsonWriter.value(number);
            }
        };
        NUMBER = typeAdapter5;
        NUMBER_FACTORY = newFactory(java.lang.Number.class, typeAdapter5);
        com.google.gson.TypeAdapter<java.lang.Character> typeAdapter6 = new com.google.gson.TypeAdapter<java.lang.Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public java.lang.Character read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String strNextString = jsonReader.nextString();
                if (strNextString.length() != 1) {
                    throw new com.google.gson.JsonSyntaxException("Expecting character, got: " + strNextString);
                }
                return java.lang.Character.valueOf(strNextString.charAt(0));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.Character ch) throws java.io.IOException {
                jsonWriter.value(ch == null ? null : java.lang.String.valueOf(ch));
            }
        };
        CHARACTER = typeAdapter6;
        CHARACTER_FACTORY = newFactory(java.lang.Character.TYPE, java.lang.Character.class, typeAdapter6);
        com.google.gson.TypeAdapter<java.lang.String> typeAdapter7 = new com.google.gson.TypeAdapter<java.lang.String>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public java.lang.String read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                com.google.gson.stream.JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonTokenPeek == com.google.gson.stream.JsonToken.BOOLEAN) {
                    return java.lang.Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.String str) throws java.io.IOException {
                jsonWriter.value(str);
            }
        };
        STRING = typeAdapter7;
        BIG_DECIMAL = new com.google.gson.TypeAdapter<java.math.BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public java.math.BigDecimal read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new java.math.BigDecimal(jsonReader.nextString());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.math.BigDecimal bigDecimal) throws java.io.IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new com.google.gson.TypeAdapter<java.math.BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public java.math.BigInteger read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new java.math.BigInteger(jsonReader.nextString());
                } catch (java.lang.NumberFormatException e) {
                    throw new com.google.gson.JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.math.BigInteger bigInteger) throws java.io.IOException {
                jsonWriter.value(bigInteger);
            }
        };
        STRING_FACTORY = newFactory(java.lang.String.class, typeAdapter7);
        com.google.gson.TypeAdapter<java.lang.StringBuilder> typeAdapter8 = new com.google.gson.TypeAdapter<java.lang.StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public java.lang.StringBuilder read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new java.lang.StringBuilder(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.StringBuilder sb) throws java.io.IOException {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = typeAdapter8;
        STRING_BUILDER_FACTORY = newFactory(java.lang.StringBuilder.class, typeAdapter8);
        com.google.gson.TypeAdapter<java.lang.StringBuffer> typeAdapter9 = new com.google.gson.TypeAdapter<java.lang.StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public java.lang.StringBuffer read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new java.lang.StringBuffer(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.lang.StringBuffer stringBuffer) throws java.io.IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = typeAdapter9;
        STRING_BUFFER_FACTORY = newFactory(java.lang.StringBuffer.class, typeAdapter9);
        com.google.gson.TypeAdapter<java.net.URL> typeAdapter10 = new com.google.gson.TypeAdapter<java.net.URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public java.net.URL read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.lang.String strNextString = jsonReader.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new java.net.URL(strNextString);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.net.URL url) throws java.io.IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = typeAdapter10;
        URL_FACTORY = newFactory(java.net.URL.class, typeAdapter10);
        com.google.gson.TypeAdapter<java.net.URI> typeAdapter11 = new com.google.gson.TypeAdapter<java.net.URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public java.net.URI read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    java.lang.String strNextString = jsonReader.nextString();
                    if ("null".equals(strNextString)) {
                        return null;
                    }
                    return new java.net.URI(strNextString);
                } catch (java.net.URISyntaxException e) {
                    throw new com.google.gson.JsonIOException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.net.URI uri) throws java.io.IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = typeAdapter11;
        URI_FACTORY = newFactory(java.net.URI.class, typeAdapter11);
        com.google.gson.TypeAdapter<java.net.InetAddress> typeAdapter12 = new com.google.gson.TypeAdapter<java.net.InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public java.net.InetAddress read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.net.InetAddress.getByName(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.net.InetAddress inetAddress) throws java.io.IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = typeAdapter12;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java.net.InetAddress.class, typeAdapter12);
        com.google.gson.TypeAdapter<java.util.UUID> typeAdapter13 = new com.google.gson.TypeAdapter<java.util.UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public java.util.UUID read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return java.util.UUID.fromString(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.UUID uuid) throws java.io.IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = typeAdapter13;
        UUID_FACTORY = newFactory(java.util.UUID.class, typeAdapter13);
        com.google.gson.TypeAdapter<java.util.Currency> typeAdapterNullSafe6 = new com.google.gson.TypeAdapter<java.util.Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public java.util.Currency read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                return java.util.Currency.getInstance(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Currency currency) throws java.io.IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = typeAdapterNullSafe6;
        CURRENCY_FACTORY = newFactory(java.util.Currency.class, typeAdapterNullSafe6);
        TIMESTAMP_FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                if (typeToken.getRawType() != java.sql.Timestamp.class) {
                    return null;
                }
                final com.google.gson.TypeAdapter<T> adapter = gson.getAdapter(java.util.Date.class);
                return (com.google.gson.TypeAdapter<T>) new com.google.gson.TypeAdapter<java.sql.Timestamp>() { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // com.google.gson.TypeAdapter
                    public java.sql.Timestamp read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                        java.util.Date date = (java.util.Date) adapter.read(jsonReader);
                        if (date != null) {
                            return new java.sql.Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(com.google.gson.stream.JsonWriter jsonWriter, java.sql.Timestamp timestamp) throws java.io.IOException {
                        adapter.write(jsonWriter, timestamp);
                    }
                };
            }
        };
        com.google.gson.TypeAdapter<java.util.Calendar> typeAdapter14 = new com.google.gson.TypeAdapter<java.util.Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            private static final java.lang.String DAY_OF_MONTH = "dayOfMonth";
            private static final java.lang.String HOUR_OF_DAY = "hourOfDay";
            private static final java.lang.String MINUTE = "minute";
            private static final java.lang.String MONTH = "month";
            private static final java.lang.String SECOND = "second";
            private static final java.lang.String YEAR = "year";

            @Override // com.google.gson.TypeAdapter
            public java.util.Calendar read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (jsonReader.peek() != com.google.gson.stream.JsonToken.END_OBJECT) {
                    java.lang.String strNextName = jsonReader.nextName();
                    int iNextInt = jsonReader.nextInt();
                    if (YEAR.equals(strNextName)) {
                        i = iNextInt;
                    } else if (MONTH.equals(strNextName)) {
                        i2 = iNextInt;
                    } else if (DAY_OF_MONTH.equals(strNextName)) {
                        i3 = iNextInt;
                    } else if (HOUR_OF_DAY.equals(strNextName)) {
                        i4 = iNextInt;
                    } else if (MINUTE.equals(strNextName)) {
                        i5 = iNextInt;
                    } else if (SECOND.equals(strNextName)) {
                        i6 = iNextInt;
                    }
                }
                jsonReader.endObject();
                return new java.util.GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Calendar calendar) throws java.io.IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name(YEAR);
                jsonWriter.value(calendar.get(1));
                jsonWriter.name(MONTH);
                jsonWriter.value(calendar.get(2));
                jsonWriter.name(DAY_OF_MONTH);
                jsonWriter.value(calendar.get(5));
                jsonWriter.name(HOUR_OF_DAY);
                jsonWriter.value(calendar.get(11));
                jsonWriter.name(MINUTE);
                jsonWriter.value(calendar.get(12));
                jsonWriter.name(SECOND);
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = typeAdapter14;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(java.util.Calendar.class, java.util.GregorianCalendar.class, typeAdapter14);
        com.google.gson.TypeAdapter<java.util.Locale> typeAdapter15 = new com.google.gson.TypeAdapter<java.util.Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapter
            public java.util.Locale read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(jsonReader.nextString(), io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR);
                java.lang.String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new java.util.Locale(strNextToken);
                }
                if (strNextToken3 == null) {
                    return new java.util.Locale(strNextToken, strNextToken2);
                }
                return new java.util.Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, java.util.Locale locale) throws java.io.IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = typeAdapter15;
        LOCALE_FACTORY = newFactory(java.util.Locale.class, typeAdapter15);
        com.google.gson.TypeAdapter<com.google.gson.JsonElement> typeAdapter16 = new com.google.gson.TypeAdapter<com.google.gson.JsonElement>() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.TypeAdapter
            public com.google.gson.JsonElement read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                switch (com.google.gson.internal.bind.TypeAdapters.AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new com.google.gson.JsonPrimitive((java.lang.Number) new com.google.gson.internal.LazilyParsedNumber(jsonReader.nextString()));
                    case 2:
                        return new com.google.gson.JsonPrimitive(java.lang.Boolean.valueOf(jsonReader.nextBoolean()));
                    case 3:
                        return new com.google.gson.JsonPrimitive(jsonReader.nextString());
                    case 4:
                        jsonReader.nextNull();
                        return com.google.gson.JsonNull.INSTANCE;
                    case 5:
                        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonArray.add(read(jsonReader));
                        }
                        jsonReader.endArray();
                        return jsonArray;
                    case 6:
                        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            jsonObject.add(jsonReader.nextName(), read(jsonReader));
                        }
                        jsonReader.endObject();
                        return jsonObject;
                    default:
                        throw new java.lang.IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(com.google.gson.stream.JsonWriter jsonWriter, com.google.gson.JsonElement jsonElement) throws java.io.IOException {
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    jsonWriter.nullValue();
                    return;
                }
                if (jsonElement.isJsonPrimitive()) {
                    com.google.gson.JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive.isNumber()) {
                        jsonWriter.value(asJsonPrimitive.getAsNumber());
                        return;
                    } else if (asJsonPrimitive.isBoolean()) {
                        jsonWriter.value(asJsonPrimitive.getAsBoolean());
                        return;
                    } else {
                        jsonWriter.value(asJsonPrimitive.getAsString());
                        return;
                    }
                }
                if (jsonElement.isJsonArray()) {
                    jsonWriter.beginArray();
                    java.util.Iterator<com.google.gson.JsonElement> it = jsonElement.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (jsonElement.isJsonObject()) {
                    jsonWriter.beginObject();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                        jsonWriter.name(entry.getKey());
                        write(jsonWriter, entry.getValue());
                    }
                    jsonWriter.endObject();
                    return;
                }
                throw new java.lang.IllegalArgumentException("Couldn't write " + jsonElement.getClass());
            }
        };
        JSON_ELEMENT = typeAdapter16;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com.google.gson.JsonElement.class, typeAdapter16);
        ENUM_FACTORY = new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                java.lang.Class<? super T> rawType = typeToken.getRawType();
                if (!java.lang.Enum.class.isAssignableFrom(rawType) || rawType == java.lang.Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter(rawType);
            }
        };
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$36, reason: invalid class name */
    static /* synthetic */ class AnonymousClass36 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[com.google.gson.stream.JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[com.google.gson.stream.JsonToken.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.STRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NULL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.NAME.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[com.google.gson.stream.JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    private static final class EnumTypeAdapter<T extends java.lang.Enum<T>> extends com.google.gson.TypeAdapter<T> {
        private final java.util.Map<java.lang.String, T> nameToConstant = new java.util.HashMap();
        private final java.util.Map<T, java.lang.String> constantToName = new java.util.HashMap();

        public EnumTypeAdapter(java.lang.Class<T> cls) {
            try {
                for (T t : cls.getEnumConstants()) {
                    java.lang.String strName = t.name();
                    com.google.gson.annotations.SerializedName serializedName = (com.google.gson.annotations.SerializedName) cls.getField(strName).getAnnotation(com.google.gson.annotations.SerializedName.class);
                    if (serializedName != null) {
                        strName = serializedName.value();
                        for (java.lang.String str : serializedName.alternate()) {
                            this.nameToConstant.put(str, t);
                        }
                    }
                    this.nameToConstant.put(strName, t);
                    this.constantToName.put(t, strName);
                }
            } catch (java.lang.NoSuchFieldException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
            if (jsonReader.peek() == com.google.gson.stream.JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.nameToConstant.get(jsonReader.nextString());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter jsonWriter, T t) throws java.io.IOException {
            jsonWriter.value(t == null ? null : this.constantToName.get(t));
        }
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(final com.google.gson.reflect.TypeToken<TT> typeToken, final com.google.gson.TypeAdapter<TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(final java.lang.Class<TT> cls, final com.google.gson.TypeAdapter<TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public java.lang.String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactory(final java.lang.Class<TT> cls, final java.lang.Class<TT> cls2, final com.google.gson.TypeAdapter<? super TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                java.lang.Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public java.lang.String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> com.google.gson.TypeAdapterFactory newFactoryForMultipleTypes(final java.lang.Class<TT> cls, final java.lang.Class<? extends TT> cls2, final com.google.gson.TypeAdapter<? super TT> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.TypeAdapterFactory
            public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T> typeToken) {
                java.lang.Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public java.lang.String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> com.google.gson.TypeAdapterFactory newTypeHierarchyFactory(final java.lang.Class<T1> cls, final com.google.gson.TypeAdapter<T1> typeAdapter) {
        return new com.google.gson.TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // com.google.gson.TypeAdapterFactory
            public <T2> com.google.gson.TypeAdapter<T2> create(com.google.gson.Gson gson, com.google.gson.reflect.TypeToken<T2> typeToken) {
                final java.lang.Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (com.google.gson.TypeAdapter<T2>) new com.google.gson.TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // com.google.gson.TypeAdapter
                        public void write(com.google.gson.stream.JsonWriter jsonWriter, T1 t1) throws java.io.IOException {
                            typeAdapter.write(jsonWriter, t1);
                        }

                        @Override // com.google.gson.TypeAdapter
                        public T1 read(com.google.gson.stream.JsonReader jsonReader) throws java.io.IOException {
                            T1 t1 = (T1) typeAdapter.read(jsonReader);
                            if (t1 == null || rawType.isInstance(t1)) {
                                return t1;
                            }
                            throw new com.google.gson.JsonSyntaxException("Expected a " + rawType.getName() + " but was " + t1.getClass().getName());
                        }
                    };
                }
                return null;
            }

            public java.lang.String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
