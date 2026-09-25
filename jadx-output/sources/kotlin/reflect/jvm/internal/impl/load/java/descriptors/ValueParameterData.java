package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ValueParameterData {
    private final boolean hasDefaultValue;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType type;

    public ValueParameterData(kotlin.reflect.jvm.internal.impl.types.KotlinType type, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        this.type = type;
        this.hasDefaultValue = z;
    }

    public final boolean getHasDefaultValue() {
        return this.hasDefaultValue;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this.type;
    }
}
