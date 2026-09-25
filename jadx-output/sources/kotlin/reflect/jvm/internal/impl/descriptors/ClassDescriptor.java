package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters {
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo1261getCompanionObjectDescriptor();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration();

    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultType();

    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution);

    kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getOriginal();

    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getSealedSubclasses();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope();

    kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getThisAsReceiverParameter();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedInnerClassesScope();

    kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope();

    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo1262getUnsubstitutedPrimaryConstructor();

    kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility();

    boolean isCompanionObject();

    boolean isData();

    boolean isInline();
}
