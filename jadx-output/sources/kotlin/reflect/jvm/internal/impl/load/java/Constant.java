package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Constant extends kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue {
    private final java.lang.Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Constant(java.lang.Object value) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        this.value = value;
    }
}
