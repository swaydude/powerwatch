package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: SystemProps.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a,\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0000\u001a,\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"AVAILABLE_PROCESSORS", "", "getAVAILABLE_PROCESSORS", "()I", "systemProp", "", "propertyName", "", "defaultValue", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class SystemPropsKt {
    private static final int AVAILABLE_PROCESSORS = java.lang.Runtime.getRuntime().availableProcessors();

    public static final int getAVAILABLE_PROCESSORS() {
        return AVAILABLE_PROCESSORS;
    }

    public static final java.lang.String systemProp(java.lang.String propertyName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(propertyName, "propertyName");
        try {
            return java.lang.System.getProperty(propertyName);
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static final boolean systemProp(java.lang.String propertyName, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(propertyName, "propertyName");
        try {
            java.lang.String property = java.lang.System.getProperty(propertyName);
            return property != null ? java.lang.Boolean.parseBoolean(property) : z;
        } catch (java.lang.SecurityException unused) {
            return z;
        }
    }

    public static /* synthetic */ int systemProp$default(java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return systemProp(str, i, i2, i3);
    }

    public static final int systemProp(java.lang.String propertyName, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(propertyName, "propertyName");
        return (int) systemProp(propertyName, i, i2, i3);
    }

    public static /* synthetic */ long systemProp$default(java.lang.String str, long j, long j2, long j3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        }
        return systemProp(str, j, j4, j3);
    }

    public static final long systemProp(java.lang.String propertyName, long j, long j2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(propertyName, "propertyName");
        java.lang.String strSystemProp = systemProp(propertyName);
        if (strSystemProp == null) {
            return j;
        }
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(strSystemProp);
        if (longOrNull == null) {
            throw new java.lang.IllegalStateException(("System property '" + propertyName + "' has unrecognized value '" + strSystemProp + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j2 <= jLongValue && j3 >= jLongValue) {
            return jLongValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + propertyName + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }
}
