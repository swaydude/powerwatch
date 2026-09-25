package org.koin.core.qualifier;

/* JADX INFO: compiled from: Qualifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a\u000e\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"named", "Lorg/koin/core/qualifier/TypeQualifier;", "T", "Lorg/koin/core/qualifier/StringQualifier;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "koin-core"}, k = 2, mv = {1, 1, 15})
public final class QualifierKt {
    public static final org.koin.core.qualifier.StringQualifier named(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return new org.koin.core.qualifier.StringQualifier(name);
    }

    private static final <T> org.koin.core.qualifier.TypeQualifier named() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return new org.koin.core.qualifier.TypeQualifier(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
    }
}
