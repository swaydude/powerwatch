package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: ErrorType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnresolvedType extends kotlin.reflect.jvm.internal.impl.types.ErrorType {
    private final java.lang.String presentableName;

    public final java.lang.String getPresentableName() {
        return this.presentableName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnresolvedType(java.lang.String presentableName, kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments, boolean z) {
        super(constructor, memberScope, arguments, z);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(presentableName, "presentableName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(memberScope, "memberScope");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        this.presentableName = presentableName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErrorType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.types.UnresolvedType(this.presentableName, getConstructor(), getMemberScope(), getArguments(), z);
    }
}
