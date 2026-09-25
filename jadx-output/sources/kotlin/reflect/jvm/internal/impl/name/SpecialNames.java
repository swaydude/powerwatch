package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: loaded from: classes2.dex */
public class SpecialNames {
    public static final kotlin.reflect.jvm.internal.impl.name.Name NO_NAME_PROVIDED = kotlin.reflect.jvm.internal.impl.name.Name.special("<no name provided>");
    public static final kotlin.reflect.jvm.internal.impl.name.Name ROOT_PACKAGE = kotlin.reflect.jvm.internal.impl.name.Name.special("<root package>");
    public static final kotlin.reflect.jvm.internal.impl.name.Name DEFAULT_NAME_FOR_COMPANION_OBJECT = kotlin.reflect.jvm.internal.impl.name.Name.identifier("Companion");
    public static final kotlin.reflect.jvm.internal.impl.name.Name SAFE_IDENTIFIER_FOR_NO_NAME = kotlin.reflect.jvm.internal.impl.name.Name.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
    public static final kotlin.reflect.jvm.internal.impl.name.Name ANONYMOUS_FUNCTION = kotlin.reflect.jvm.internal.impl.name.Name.special("<anonymous>");

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 2 : 3];
        if (i != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
        }
        if (i != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 1) {
            throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.name.Name safeIdentifier(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null || name.isSpecial()) {
            name = SAFE_IDENTIFIER_FOR_NO_NAME;
        }
        if (name == null) {
            $$$reportNull$$$0(0);
        }
        return name;
    }

    public static boolean isSafeIdentifier(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null) {
            $$$reportNull$$$0(1);
        }
        return (name.asString().isEmpty() || name.isSpecial()) ? false : true;
    }
}
