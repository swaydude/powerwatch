package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ModuleVisibilityHelper {
    boolean isInFriendModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2);

    /* JADX INFO: compiled from: ModuleVisibilityHelper.kt */
    public static final class EMPTY implements kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper {
        public static final kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean isInFriendModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor what, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor from) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(what, "what");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(from, "from");
            return true;
        }

        private EMPTY() {
        }
    }
}
