package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: JavaFlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaFlexibleTypeDeserializer implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer INSTANCE = new kotlin.reflect.jvm.internal.impl.load.kotlin.JavaFlexibleTypeDeserializer();

    private JavaFlexibleTypeDeserializer() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    public kotlin.reflect.jvm.internal.impl.types.KotlinType create(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type proto, java.lang.String flexibleId, kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound, kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flexibleId, "flexibleId");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "lowerBound");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "upperBound");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(flexibleId, "kotlin.jvm.PlatformType")) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Error java flexible type with id: " + flexibleId + ". (" + lowerBound + ".." + upperBound + ')');
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return simpleTypeCreateErrorType;
        }
        if (proto.hasExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.isRaw)) {
            return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(lowerBound, upperBound);
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(lowerBound, upperBound);
    }
}
