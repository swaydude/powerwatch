package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: UnsignedType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedType {
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] $VALUES;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType UBYTE;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType UINT;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType ULONG;
    public static final kotlin.reflect.jvm.internal.impl.builtins.UnsignedType USHORT;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId arrayClassId;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;
    private final kotlin.reflect.jvm.internal.impl.name.Name typeName;

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedType valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.UnsignedType.class, str);
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[] values() {
        return (kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[]) $VALUES.clone();
    }

    private UnsignedType(java.lang.String str, int i, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        super(str, i);
        this.classId = classId;
        kotlin.reflect.jvm.internal.impl.name.Name shortClassName = classId.getShortClassName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(shortClassName, "classId.shortClassName");
        this.typeName = shortClassName;
        this.arrayClassId = new kotlin.reflect.jvm.internal.impl.name.ClassId(classId.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.Name.identifier(shortClassName.asString() + "Array"));
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return this.classId;
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdFromString = kotlin.reflect.jvm.internal.impl.name.ClassId.fromString("kotlin/UByte");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdFromString, "ClassId.fromString(\"kotlin/UByte\")");
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("UBYTE", 0, classIdFromString);
        UBYTE = unsignedType;
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdFromString2 = kotlin.reflect.jvm.internal.impl.name.ClassId.fromString("kotlin/UShort");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdFromString2, "ClassId.fromString(\"kotlin/UShort\")");
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType2 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("USHORT", 1, classIdFromString2);
        USHORT = unsignedType2;
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdFromString3 = kotlin.reflect.jvm.internal.impl.name.ClassId.fromString("kotlin/UInt");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdFromString3, "ClassId.fromString(\"kotlin/UInt\")");
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType3 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("UINT", 2, classIdFromString3);
        UINT = unsignedType3;
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdFromString4 = kotlin.reflect.jvm.internal.impl.name.ClassId.fromString("kotlin/ULong");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdFromString4, "ClassId.fromString(\"kotlin/ULong\")");
        kotlin.reflect.jvm.internal.impl.builtins.UnsignedType unsignedType4 = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType("ULONG", 3, classIdFromString4);
        ULONG = unsignedType4;
        $VALUES = new kotlin.reflect.jvm.internal.impl.builtins.UnsignedType[]{unsignedType, unsignedType2, unsignedType3, unsignedType4};
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name getTypeName() {
        return this.typeName;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId getArrayClassId() {
        return this.arrayClassId;
    }
}
