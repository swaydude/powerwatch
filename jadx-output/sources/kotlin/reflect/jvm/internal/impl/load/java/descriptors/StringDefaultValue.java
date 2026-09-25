package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StringDefaultValue extends kotlin.reflect.jvm.internal.impl.load.java.descriptors.AnnotationDefaultValue {
    private final java.lang.String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringDefaultValue(java.lang.String value) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(value, "value");
        this.value = value;
    }

    public final java.lang.String getValue() {
        return this.value;
    }
}
