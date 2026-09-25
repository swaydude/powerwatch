package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class UnwrappedType extends kotlin.reflect.jvm.internal.impl.types.KotlinType {
    public abstract kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z);

    public abstract kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap() {
        return this;
    }

    private UnwrappedType() {
        super(null);
    }

    public /* synthetic */ UnwrappedType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
