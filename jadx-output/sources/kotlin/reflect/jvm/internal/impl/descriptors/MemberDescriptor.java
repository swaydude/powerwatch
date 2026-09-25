package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public interface MemberDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility {
    kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality();

    kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility();

    boolean isActual();

    boolean isExpect();

    boolean isExternal();
}
