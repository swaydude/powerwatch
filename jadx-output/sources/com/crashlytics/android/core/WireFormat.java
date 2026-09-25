package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
final class WireFormat {
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    public static int getTagFieldNumber(int i) {
        return i >>> 3;
    }

    static int getTagWireType(int i) {
        return i & 7;
    }

    static int makeTag(int i, int i2) {
        return (i << 3) | i2;
    }

    private WireFormat() {
    }

    enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(java.lang.Float.valueOf(0.0f)),
        DOUBLE(java.lang.Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(com.crashlytics.android.core.ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final java.lang.Object defaultDefault;

        JavaType(java.lang.Object obj) {
            this.defaultDefault = obj;
        }

        java.lang.Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STRING' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static class FieldType {
        private static final /* synthetic */ com.crashlytics.android.core.WireFormat.FieldType[] $VALUES;
        public static final com.crashlytics.android.core.WireFormat.FieldType BOOL;
        public static final com.crashlytics.android.core.WireFormat.FieldType BYTES;
        public static final com.crashlytics.android.core.WireFormat.FieldType DOUBLE;
        public static final com.crashlytics.android.core.WireFormat.FieldType ENUM;
        public static final com.crashlytics.android.core.WireFormat.FieldType FIXED32;
        public static final com.crashlytics.android.core.WireFormat.FieldType FIXED64;
        public static final com.crashlytics.android.core.WireFormat.FieldType FLOAT;
        public static final com.crashlytics.android.core.WireFormat.FieldType GROUP;
        public static final com.crashlytics.android.core.WireFormat.FieldType INT32;
        public static final com.crashlytics.android.core.WireFormat.FieldType INT64;
        public static final com.crashlytics.android.core.WireFormat.FieldType MESSAGE;
        public static final com.crashlytics.android.core.WireFormat.FieldType SFIXED32;
        public static final com.crashlytics.android.core.WireFormat.FieldType SFIXED64;
        public static final com.crashlytics.android.core.WireFormat.FieldType SINT32;
        public static final com.crashlytics.android.core.WireFormat.FieldType SINT64;
        public static final com.crashlytics.android.core.WireFormat.FieldType STRING;
        public static final com.crashlytics.android.core.WireFormat.FieldType UINT32;
        public static final com.crashlytics.android.core.WireFormat.FieldType UINT64;
        private final com.crashlytics.android.core.WireFormat.JavaType javaType;
        private final int wireType;

        public boolean isPackable() {
            return true;
        }

        public static com.crashlytics.android.core.WireFormat.FieldType valueOf(java.lang.String str) {
            return (com.crashlytics.android.core.WireFormat.FieldType) java.lang.Enum.valueOf(com.crashlytics.android.core.WireFormat.FieldType.class, str);
        }

        public static com.crashlytics.android.core.WireFormat.FieldType[] values() {
            return (com.crashlytics.android.core.WireFormat.FieldType[]) $VALUES.clone();
        }

        static {
            com.crashlytics.android.core.WireFormat.FieldType fieldType = new com.crashlytics.android.core.WireFormat.FieldType("DOUBLE", 0, com.crashlytics.android.core.WireFormat.JavaType.DOUBLE, 1);
            DOUBLE = fieldType;
            com.crashlytics.android.core.WireFormat.FieldType fieldType2 = new com.crashlytics.android.core.WireFormat.FieldType("FLOAT", 1, com.crashlytics.android.core.WireFormat.JavaType.FLOAT, 5);
            FLOAT = fieldType2;
            int i = 2;
            com.crashlytics.android.core.WireFormat.FieldType fieldType3 = new com.crashlytics.android.core.WireFormat.FieldType("INT64", 2, com.crashlytics.android.core.WireFormat.JavaType.LONG, 0);
            INT64 = fieldType3;
            com.crashlytics.android.core.WireFormat.FieldType fieldType4 = new com.crashlytics.android.core.WireFormat.FieldType("UINT64", 3, com.crashlytics.android.core.WireFormat.JavaType.LONG, 0);
            UINT64 = fieldType4;
            com.crashlytics.android.core.WireFormat.FieldType fieldType5 = new com.crashlytics.android.core.WireFormat.FieldType("INT32", 4, com.crashlytics.android.core.WireFormat.JavaType.INT, 0);
            INT32 = fieldType5;
            com.crashlytics.android.core.WireFormat.FieldType fieldType6 = new com.crashlytics.android.core.WireFormat.FieldType("FIXED64", 5, com.crashlytics.android.core.WireFormat.JavaType.LONG, 1);
            FIXED64 = fieldType6;
            com.crashlytics.android.core.WireFormat.FieldType fieldType7 = new com.crashlytics.android.core.WireFormat.FieldType("FIXED32", 6, com.crashlytics.android.core.WireFormat.JavaType.INT, 5);
            FIXED32 = fieldType7;
            com.crashlytics.android.core.WireFormat.FieldType fieldType8 = new com.crashlytics.android.core.WireFormat.FieldType("BOOL", 7, com.crashlytics.android.core.WireFormat.JavaType.BOOLEAN, 0);
            BOOL = fieldType8;
            com.crashlytics.android.core.WireFormat.FieldType fieldType9 = new com.crashlytics.android.core.WireFormat.FieldType("STRING", 8, com.crashlytics.android.core.WireFormat.JavaType.STRING, i) { // from class: com.crashlytics.android.core.WireFormat.FieldType.1
                @Override // com.crashlytics.android.core.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            STRING = fieldType9;
            com.crashlytics.android.core.WireFormat.FieldType fieldType10 = new com.crashlytics.android.core.WireFormat.FieldType("GROUP", 9, com.crashlytics.android.core.WireFormat.JavaType.MESSAGE, 3) { // from class: com.crashlytics.android.core.WireFormat.FieldType.2
                @Override // com.crashlytics.android.core.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            GROUP = fieldType10;
            com.crashlytics.android.core.WireFormat.FieldType fieldType11 = new com.crashlytics.android.core.WireFormat.FieldType("MESSAGE", 10, com.crashlytics.android.core.WireFormat.JavaType.MESSAGE, i) { // from class: com.crashlytics.android.core.WireFormat.FieldType.3
                @Override // com.crashlytics.android.core.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            MESSAGE = fieldType11;
            com.crashlytics.android.core.WireFormat.FieldType fieldType12 = new com.crashlytics.android.core.WireFormat.FieldType("BYTES", 11, com.crashlytics.android.core.WireFormat.JavaType.BYTE_STRING, i) { // from class: com.crashlytics.android.core.WireFormat.FieldType.4
                @Override // com.crashlytics.android.core.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            BYTES = fieldType12;
            com.crashlytics.android.core.WireFormat.FieldType fieldType13 = new com.crashlytics.android.core.WireFormat.FieldType("UINT32", 12, com.crashlytics.android.core.WireFormat.JavaType.INT, 0);
            UINT32 = fieldType13;
            com.crashlytics.android.core.WireFormat.FieldType fieldType14 = new com.crashlytics.android.core.WireFormat.FieldType("ENUM", 13, com.crashlytics.android.core.WireFormat.JavaType.ENUM, 0);
            ENUM = fieldType14;
            com.crashlytics.android.core.WireFormat.FieldType fieldType15 = new com.crashlytics.android.core.WireFormat.FieldType("SFIXED32", 14, com.crashlytics.android.core.WireFormat.JavaType.INT, 5);
            SFIXED32 = fieldType15;
            com.crashlytics.android.core.WireFormat.FieldType fieldType16 = new com.crashlytics.android.core.WireFormat.FieldType("SFIXED64", 15, com.crashlytics.android.core.WireFormat.JavaType.LONG, 1);
            SFIXED64 = fieldType16;
            com.crashlytics.android.core.WireFormat.FieldType fieldType17 = new com.crashlytics.android.core.WireFormat.FieldType("SINT32", 16, com.crashlytics.android.core.WireFormat.JavaType.INT, 0);
            SINT32 = fieldType17;
            com.crashlytics.android.core.WireFormat.FieldType fieldType18 = new com.crashlytics.android.core.WireFormat.FieldType("SINT64", 17, com.crashlytics.android.core.WireFormat.JavaType.LONG, 0);
            SINT64 = fieldType18;
            $VALUES = new com.crashlytics.android.core.WireFormat.FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        private FieldType(java.lang.String str, int i, com.crashlytics.android.core.WireFormat.JavaType javaType, int i2) {
            super(str, i);
            this.javaType = javaType;
            this.wireType = i2;
        }

        public com.crashlytics.android.core.WireFormat.JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }
}
