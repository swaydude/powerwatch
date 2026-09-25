package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeProjection extends kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker {
    kotlin.reflect.jvm.internal.impl.types.Variance getProjectionKind();

    kotlin.reflect.jvm.internal.impl.types.KotlinType getType();

    boolean isStarProjection();
}
