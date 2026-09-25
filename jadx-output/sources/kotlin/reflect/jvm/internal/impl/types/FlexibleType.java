package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FlexibleType extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType implements kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound;

    public abstract kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate();

    public abstract java.lang.String render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions);

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    public boolean sameTypeConstructor(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return false;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getLowerBound() {
        return this.lowerBound;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getUpperBound() {
        return this.upperBound;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound, kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "lowerBound");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "upperBound");
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getSubTypeRepresentative() {
        return this.lowerBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SubtypingRepresentatives
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getSuperTypeRepresentative() {
        return this.upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        return getDelegate().getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }
}
