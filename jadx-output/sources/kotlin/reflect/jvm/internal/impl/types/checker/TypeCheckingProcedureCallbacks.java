package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeCheckingProcedureCallbacks {
    boolean assertEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2);

    boolean assertEqualTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure typeCheckingProcedure);

    boolean assertSubtype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure typeCheckingProcedure);

    boolean capture(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection);

    boolean noCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2);
}
