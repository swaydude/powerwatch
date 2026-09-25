package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* JADX INFO: loaded from: classes2.dex */
public enum JvmPrimitiveType {
    BOOLEAN(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");

    private final java.lang.String desc;
    private final java.lang.String name;
    private final kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType;
    private final kotlin.reflect.jvm.internal.impl.name.FqName wrapperFqName;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> WRAPPERS_CLASS_NAMES = new java.util.HashSet();
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> TYPE_BY_NAME = new java.util.HashMap();
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> TYPE_BY_PRIMITIVE_TYPE = new java.util.EnumMap(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class);
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType> TYPE_BY_DESC = new java.util.HashMap();

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = "type";
                break;
            case 5:
            case 8:
                objArr[0] = "desc";
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 12:
                    objArr[1] = "getDesc";
                    break;
                case 13:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    static {
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType : values()) {
            WRAPPERS_CLASS_NAMES.add(jvmPrimitiveType.getWrapperFqName());
            TYPE_BY_NAME.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            TYPE_BY_PRIMITIVE_TYPE.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            TYPE_BY_DESC.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType get(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = TYPE_BY_NAME.get(str);
        if (jvmPrimitiveType != null) {
            if (jvmPrimitiveType == null) {
                $$$reportNull$$$0(2);
            }
            return jvmPrimitiveType;
        }
        throw new java.lang.AssertionError("Non-primitive type name passed: " + str);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType get(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(3);
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = TYPE_BY_PRIMITIVE_TYPE.get(primitiveType);
        if (jvmPrimitiveType == null) {
            $$$reportNull$$$0(4);
        }
        return jvmPrimitiveType;
    }

    JvmPrimitiveType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (primitiveType == null) {
            $$$reportNull$$$0(6);
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        if (str2 == null) {
            $$$reportNull$$$0(8);
        }
        if (str3 == null) {
            $$$reportNull$$$0(9);
        }
        this.primitiveType = primitiveType;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new kotlin.reflect.jvm.internal.impl.name.FqName(str3);
    }

    public kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType() {
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = this.primitiveType;
        if (primitiveType == null) {
            $$$reportNull$$$0(10);
        }
        return primitiveType;
    }

    public java.lang.String getJavaKeywordName() {
        java.lang.String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        return str;
    }

    public java.lang.String getDesc() {
        java.lang.String str = this.desc;
        if (str == null) {
            $$$reportNull$$$0(12);
        }
        return str;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getWrapperFqName() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.wrapperFqName;
        if (fqName == null) {
            $$$reportNull$$$0(13);
        }
        return fqName;
    }
}
