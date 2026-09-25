package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AbbreviatedType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType abbreviation;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType delegate;

    public AbbreviatedType(kotlin.reflect.jvm.internal.impl.types.SimpleType delegate, kotlin.reflect.jvm.internal.impl.types.SimpleType abbreviation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(abbreviation, "abbreviation");
        this.delegate = delegate;
        this.abbreviation = abbreviation;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getAbbreviation() {
        return this.abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.delegate;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getExpandedType() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.AbbreviatedType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType(getDelegate().replaceAnnotations(newAnnotations), this.abbreviation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.AbbreviatedType makeNullableAsSpecified(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType(getDelegate().makeNullableAsSpecified(z), this.abbreviation.makeNullableAsSpecified(z));
    }
}
