package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true);

    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> ALL;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.Companion Companion = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.Companion(null);
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> DEFAULTS;
    private final boolean includeByDefault;

    DescriptorRendererModifier(boolean z) {
        this.includeByDefault = z;
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        DEFAULTS = kotlin.collections.CollectionsKt.toSet(arrayList);
        ALL = kotlin.collections.ArraysKt.toSet(values());
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
