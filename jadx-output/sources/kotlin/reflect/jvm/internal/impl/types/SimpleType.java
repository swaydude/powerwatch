package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleType extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType implements kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker {
    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public abstract kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations);

    public SimpleType() {
        super(null);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            kotlin.text.StringsKt.append(sb, "[", kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.renderAnnotation$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT, it.next(), null, 2, null), "] ");
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            kotlin.collections.CollectionsKt.joinTo(getArguments(), sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "<", (112 & 8) != 0 ? "" : ">", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : null);
        }
        if (isMarkedNullable()) {
            sb.append("?");
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
