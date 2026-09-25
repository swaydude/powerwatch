package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: ContractDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ContractDeserializer {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion Companion = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion.$$INSTANCE;

    kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, java.lang.Object> deserializeContractFromFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer);

    /* JADX INFO: compiled from: ContractDeserializer.kt */
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion $$INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer.Companion();
        private static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer DEFAULT = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            public kotlin.Pair deserializeContractFromFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function proto, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor ownerFunction, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ownerFunction, "ownerFunction");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeDeserializer, "typeDeserializer");
                return null;
            }
        };

        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer getDEFAULT() {
            return DEFAULT;
        }
    }
}
