package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes2.dex */
public class DelegatedTypeSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution;

    public DelegatedTypeSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(substitution, "substitution");
        this.substitution = substitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection mo1273get(kotlin.reflect.jvm.internal.impl.types.KotlinType key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return this.substitution.mo1273get(key);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public kotlin.reflect.jvm.internal.impl.types.KotlinType prepareTopLevelType(kotlin.reflect.jvm.internal.impl.types.KotlinType topLevelType, kotlin.reflect.jvm.internal.impl.types.Variance position) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(topLevelType, "topLevelType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(position, "position");
        return this.substitution.prepareTopLevelType(topLevelType, position);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.substitution.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.substitution.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations filterAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        return this.substitution.filterAnnotations(annotations);
    }
}
