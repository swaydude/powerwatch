package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeConstructor extends kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker {
    kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns();

    /* JADX INFO: renamed from: getDeclarationDescriptor */
    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1268getDeclarationDescriptor();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters();

    /* JADX INFO: renamed from: getSupertypes */
    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes();

    boolean isDenotable();
}
