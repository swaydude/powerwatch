package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeSubstitutionKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType replace$default(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        return replace(kotlinType, (java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection>) list, annotations);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replace(kotlin.reflect.jvm.internal.impl.types.KotlinType replace, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replace, "$this$replace");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newArguments, "newArguments");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        if ((newArguments.isEmpty() || newArguments == replace.getArguments()) && newAnnotations == replace.getAnnotations()) {
            return replace;
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = replace.unwrap();
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap;
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), newArguments, newAnnotations), replace(flexibleType.getUpperBound(), newArguments, newAnnotations));
        }
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return replace((kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap, newArguments, newAnnotations);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType replace$default(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, java.util.List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = simpleType.getArguments();
        }
        if ((i & 2) != 0) {
            annotations = simpleType.getAnnotations();
        }
        return replace(simpleType, (java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection>) list, annotations);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType replace(kotlin.reflect.jvm.internal.impl.types.SimpleType replace, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> newArguments, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replace, "$this$replace");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newArguments, "newArguments");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        if (newArguments.isEmpty() && newAnnotations == replace.getAnnotations()) {
            return replace;
        }
        if (newArguments.isEmpty()) {
            return replace.replaceAnnotations(newAnnotations);
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(newAnnotations, replace.getConstructor(), newArguments, replace.isMarkedNullable());
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType asSimpleType(kotlin.reflect.jvm.internal.impl.types.KotlinType asSimpleType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asSimpleType, "$this$asSimpleType");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = asSimpleType.unwrap();
        if (!(unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
            unwrappedTypeUnwrap = null;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap;
        if (simpleType != null) {
            return simpleType;
        }
        throw new java.lang.IllegalStateException(("This is should be simple type: " + asSimpleType).toString());
    }
}
