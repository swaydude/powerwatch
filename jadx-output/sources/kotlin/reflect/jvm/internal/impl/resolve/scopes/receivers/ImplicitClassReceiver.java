package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

/* JADX INFO: compiled from: ImplicitClassReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ImplicitClassReceiver implements kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitReceiver, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver {
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor declarationDescriptor;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver original;

    public ImplicitClassReceiver(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver implicitClassReceiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classDescriptor, "classDescriptor");
        this.classDescriptor = classDescriptor;
        this.original = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.declarationDescriptor = classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = this.classDescriptor.getDefaultType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "classDescriptor.defaultType");
        return defaultType;
    }

    public boolean equals(java.lang.Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = this.classDescriptor;
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver)) {
            obj = null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver implicitClassReceiver = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.classDescriptor : null);
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    public java.lang.String toString() {
        return "Class{" + getType() + '}';
    }
}
