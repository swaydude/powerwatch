package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRegistryLite {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite EMPTY = new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite(true);
    private static volatile boolean eagerlyParseMessageSets = false;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    public static kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite newInstance() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite();
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getEmptyRegistry() {
        return EMPTY;
    }

    public <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair(containingtype, i));
    }

    public final void add(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair(generatedExtension.getContainingTypeDefaultInstance(), generatedExtension.getNumber()), generatedExtension);
    }

    ExtensionRegistryLite() {
        this.extensionsByNumber = new java.util.HashMap();
    }

    private ExtensionRegistryLite(boolean z) {
        this.extensionsByNumber = java.util.Collections.emptyMap();
    }

    private static final class ObjectIntPair {
        private final int number;
        private final java.lang.Object object;

        ObjectIntPair(java.lang.Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public int hashCode() {
            return (java.lang.System.identityHashCode(this.object) * androidx.core.internal.view.SupportMenu.USER_MASK) + this.number;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair objectIntPair = (kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.ObjectIntPair) obj;
            return this.object == objectIntPair.object && this.number == objectIntPair.number;
        }
    }
}
