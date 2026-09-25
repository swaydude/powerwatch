package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KPackageImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "proto", "invoke"}, k = 3, mv = {1, 1, 15})
final /* synthetic */ class KPackageImpl$getLocalProperty$1$1$1 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> {
    public static final kotlin.reflect.jvm.internal.KPackageImpl$getLocalProperty$1$1$1 INSTANCE = new kotlin.reflect.jvm.internal.KPackageImpl$getLocalProperty$1$1$1();

    KPackageImpl$getLocalProperty$1$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final java.lang.String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KDeclarationContainer getOwner() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final java.lang.String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor invoke(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer p1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property p2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p2, "p2");
        return p1.loadProperty(p2);
    }
}
