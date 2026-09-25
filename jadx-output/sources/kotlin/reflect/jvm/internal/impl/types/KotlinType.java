package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinType implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker {
    public abstract java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments();

    public abstract kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor();

    public abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope();

    public abstract boolean isMarkedNullable();

    public abstract kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap();

    private KotlinType() {
    }

    public /* synthetic */ KotlinType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int hashCode() {
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(this)) {
            return super.hashCode();
        }
        return (((getConstructor().hashCode() * 31) + getArguments().hashCode()) * 31) + (isMarkedNullable() ? 1 : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj;
        return isMarkedNullable() == kotlinType.isMarkedNullable() && kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrap(), kotlinType.unwrap());
    }
}
