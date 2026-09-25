package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface FlexibleTypeDeserializer {
    kotlin.reflect.jvm.internal.impl.types.KotlinType create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, java.lang.String str, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2);

    /* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
    public static final class ThrowException implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer {
        public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException();

        private ThrowException() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        public kotlin.reflect.jvm.internal.impl.types.KotlinType create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type proto, java.lang.String flexibleId, kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound, kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flexibleId, "flexibleId");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "lowerBound");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "upperBound");
            throw new java.lang.IllegalArgumentException("This method should not be used.");
        }
    }
}
