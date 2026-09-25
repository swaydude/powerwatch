package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeCapabilities.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface SubtypingRepresentatives {
    kotlin.reflect.jvm.internal.impl.types.KotlinType getSubTypeRepresentative();

    kotlin.reflect.jvm.internal.impl.types.KotlinType getSuperTypeRepresentative();

    boolean sameTypeConstructor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);
}
