package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: IntegerValueTypeConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IntegerValueTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module;
    private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes;
    private final long value;

    public java.lang.Void getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1268getDeclarationDescriptor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) getDeclarationDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes() {
        return this.supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    public java.lang.String toString() {
        return "IntegerValueType(" + this.value + ')';
    }
}
