package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: Visibility.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility {
    private final boolean isPublicAPI;
    private final java.lang.String name;

    public abstract boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor);

    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
        return this;
    }

    protected Visibility(java.lang.String name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        this.name = name;
        this.isPublicAPI = z;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    protected java.lang.Integer compareTo(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visibility, "visibility");
        return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.compareLocal(this, visibility);
    }

    public java.lang.String getDisplayName() {
        return this.name;
    }

    public final java.lang.String toString() {
        return getDisplayName();
    }
}
