package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DisjointKeysUnionTypeSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    public static final kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution first;
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution second;

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }

    /* JADX INFO: compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution first, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution second) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(first, "first");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(second, "second");
            if (first.isEmpty()) {
                return second;
            }
            return second.isEmpty() ? first : new kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution(first, second, null);
        }
    }

    private DisjointKeysUnionTypeSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2) {
        this.first = typeSubstitution;
        this.second = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public kotlin.reflect.jvm.internal.impl.types.TypeProjection mo1273get(kotlin.reflect.jvm.internal.impl.types.KotlinType key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionMo1273get = this.first.mo1273get(key);
        return typeProjectionMo1273get != null ? typeProjectionMo1273get : this.second.mo1273get(key);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public kotlin.reflect.jvm.internal.impl.types.KotlinType prepareTopLevelType(kotlin.reflect.jvm.internal.impl.types.KotlinType topLevelType, kotlin.reflect.jvm.internal.impl.types.Variance position) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(topLevelType, "topLevelType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(position, "position");
        return this.second.prepareTopLevelType(this.first.prepareTopLevelType(topLevelType, position), position);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.first.approximateCapturedTypes() || this.second.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.first.approximateContravariantCapturedTypes() || this.second.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations filterAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        return this.second.filterAnnotations(this.first.filterAnnotations(annotations));
    }
}
