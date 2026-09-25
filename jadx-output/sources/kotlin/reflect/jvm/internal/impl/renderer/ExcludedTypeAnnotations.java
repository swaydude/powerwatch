package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExcludedTypeAnnotations {
    public static final kotlin.reflect.jvm.internal.impl.renderer.ExcludedTypeAnnotations INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.ExcludedTypeAnnotations();
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> internalAnnotationsForResolve = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.internal.NoInfer"), new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.internal.Exact")});

    private ExcludedTypeAnnotations() {
    }

    public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getInternalAnnotationsForResolve() {
        return internalAnnotationsForResolve;
    }
}
