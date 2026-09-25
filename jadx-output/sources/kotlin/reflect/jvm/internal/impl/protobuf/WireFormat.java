package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class WireFormat {
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

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(java.lang.Float.valueOf(0.0f)),
        DOUBLE(java.lang.Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(""),
        BYTE_STRING(kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final java.lang.Object defaultDefault;

        JavaType(java.lang.Object obj) {
            this.defaultDefault = obj;
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
    public static class FieldType {
        private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[] $VALUES;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType BOOL;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType BYTES;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType DOUBLE;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType ENUM;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType FIXED32;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType FIXED64;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType FLOAT;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType GROUP;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType INT32;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType INT64;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType MESSAGE;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SFIXED32;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SFIXED64;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SINT32;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType SINT64;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType STRING;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType UINT32;
        public static final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType UINT64;
        private final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType javaType;
        private final int wireType;

        public boolean isPackable() {
            return true;
        }

        public static kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType valueOf(java.lang.String str) {
            return (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.class, str);
        }

        public static kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[] values() {
            return (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[]) $VALUES.clone();
        }

        static {
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("DOUBLE", 0, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE, 1);
            DOUBLE = fieldType;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType2 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("FLOAT", 1, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT, 5);
            FLOAT = fieldType2;
            int i = 2;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType3 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("INT64", 2, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 0);
            INT64 = fieldType3;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType4 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("UINT64", 3, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 0);
            UINT64 = fieldType4;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType5 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("INT32", 4, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 0);
            INT32 = fieldType5;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType6 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("FIXED64", 5, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 1);
            FIXED64 = fieldType6;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType7 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("FIXED32", 6, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 5);
            FIXED32 = fieldType7;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType8 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("BOOL", 7, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN, 0);
            BOOL = fieldType8;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType9 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("STRING", 8, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING, i) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.1
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            STRING = fieldType9;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType10 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("GROUP", 9, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE, 3) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.2
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            GROUP = fieldType10;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType11 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("MESSAGE", 10, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE, i) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.3
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            MESSAGE = fieldType11;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType12 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("BYTES", 11, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING, i) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.4
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
                public boolean isPackable() {
                    return false;
                }
            };
            BYTES = fieldType12;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType13 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("UINT32", 12, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 0);
            UINT32 = fieldType13;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType14 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("ENUM", 13, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM, 0);
            ENUM = fieldType14;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType15 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("SFIXED32", 14, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 5);
            SFIXED32 = fieldType15;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType16 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("SFIXED64", 15, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 1);
            SFIXED64 = fieldType16;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType17 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("SINT32", 16, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT, 0);
            SINT32 = fieldType17;
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType18 = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType("SINT64", 17, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG, 0);
            SINT64 = fieldType18;
            $VALUES = new kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18};
        }

        private FieldType(java.lang.String str, int i, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType javaType, int i2) {
            super(str, i);
            this.javaType = javaType;
            this.wireType = i2;
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }
    }
}
