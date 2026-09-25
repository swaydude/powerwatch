package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: loaded from: classes2.dex */
public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    private final kotlin.reflect.jvm.internal.impl.name.Name arrayTypeName;
    private final kotlin.reflect.jvm.internal.impl.name.Name typeName;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> NUMBER_TYPES = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE));
    private kotlin.reflect.jvm.internal.impl.name.FqName typeFqName = null;
    private kotlin.reflect.jvm.internal.impl.name.FqName arrayTypeFqName = null;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/PrimitiveType";
        if (i == 1 || i == 2) {
            objArr[1] = "getTypeFqName";
        } else if (i == 3) {
            objArr[1] = "getArrayTypeName";
        } else if (i == 4 || i == 5) {
            objArr[1] = "getArrayTypeFqName";
        } else {
            objArr[1] = "getTypeName";
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", objArr));
    }

    PrimitiveType(java.lang.String str) {
        this.typeName = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        this.arrayTypeName = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str + "Array");
    }

    public kotlin.reflect.jvm.internal.impl.name.Name getTypeName() {
        kotlin.reflect.jvm.internal.impl.name.Name name = this.typeName;
        if (name == null) {
            $$$reportNull$$$0(0);
        }
        return name;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getTypeFqName() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.typeFqName;
        if (fqName != null) {
            if (fqName == null) {
                $$$reportNull$$$0(1);
            }
            return fqName;
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName);
        this.typeFqName = fqNameChild;
        if (fqNameChild == null) {
            $$$reportNull$$$0(2);
        }
        return fqNameChild;
    }

    public kotlin.reflect.jvm.internal.impl.name.Name getArrayTypeName() {
        kotlin.reflect.jvm.internal.impl.name.Name name = this.arrayTypeName;
        if (name == null) {
            $$$reportNull$$$0(3);
        }
        return name;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getArrayTypeFqName() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.arrayTypeFqName;
        if (fqName != null) {
            if (fqName == null) {
                $$$reportNull$$$0(4);
            }
            return fqName;
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(this.arrayTypeName);
        this.arrayTypeFqName = fqNameChild;
        if (fqNameChild == null) {
            $$$reportNull$$$0(5);
        }
        return fqNameChild;
    }
}
