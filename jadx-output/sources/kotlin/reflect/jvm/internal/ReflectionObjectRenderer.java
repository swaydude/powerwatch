package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "renderTypeParameter", "typeParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class ReflectionObjectRenderer {
    public static final kotlin.reflect.jvm.internal.ReflectionObjectRenderer INSTANCE = new kotlin.reflect.jvm.internal.ReflectionObjectRenderer();
    private static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer renderer = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.FQ_NAMES_IN_TYPES;

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.reflect.KParameter.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[kotlin.reflect.KParameter.Kind.INSTANCE.ordinal()] = 2;
            iArr[kotlin.reflect.KParameter.Kind.VALUE.ordinal()] = 3;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            iArr2[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    private ReflectionObjectRenderer() {
    }

    private final void appendReceiverType(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor) {
        if (receiverParameterDescriptor != null) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = receiverParameterDescriptor.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "receiver.type");
            sb.append(renderType(type));
            sb.append(".");
        }
    }

    private final void appendReceivers(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor instanceReceiverParameter = kotlin.reflect.jvm.internal.UtilKt.getInstanceReceiverParameter(callableDescriptor);
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        appendReceiverType(sb, instanceReceiverParameter);
        boolean z = (instanceReceiverParameter == null || extensionReceiverParameter == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        appendReceiverType(sb, extensionReceiverParameter);
        if (z) {
            sb.append(")");
        }
    }

    private final java.lang.String renderCallable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor descriptor) {
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
            return renderProperty((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) descriptor);
        }
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) {
            return renderFunction((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) descriptor);
        }
        throw new java.lang.IllegalStateException(("Illegal callable: " + descriptor).toString());
    }

    public final java.lang.String renderProperty(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(descriptor.isVar() ? "var " : "val ");
        kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer = renderer;
        kotlin.reflect.jvm.internal.impl.name.Name name = descriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.name");
        sb.append(descriptorRenderer.renderName(name, true));
        sb.append(": ");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = descriptor.getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "descriptor.type");
        sb.append(reflectionObjectRenderer.renderType(type));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final java.lang.String renderFunction(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("fun ");
        kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb, descriptor);
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer = renderer;
        kotlin.reflect.jvm.internal.impl.name.Name name = descriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.name");
        sb.append(descriptorRenderer.renderName(name, true));
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "descriptor.valueParameters");
        kotlin.collections.CollectionsKt.joinTo(valueParameters, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) != 0 ? "" : ")", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderFunction$1$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it) {
                kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer2 = kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = it.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
                return reflectionObjectRenderer2.renderType(type);
            }
        });
        sb.append(": ");
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = descriptor.getReturnType();
        if (returnType == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "descriptor.returnType!!");
        sb.append(reflectionObjectRenderer.renderType(returnType));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final java.lang.String renderLambda(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor invoke) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(invoke, "invoke");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        reflectionObjectRenderer.appendReceivers(sb, invoke);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = invoke.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "invoke.valueParameters");
        kotlin.collections.CollectionsKt.joinTo(valueParameters, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) != 0 ? "" : ")", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderLambda$1$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it) {
                kotlin.reflect.jvm.internal.ReflectionObjectRenderer reflectionObjectRenderer2 = kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = it.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
                return reflectionObjectRenderer2.renderType(type);
            }
        });
        sb.append(" -> ");
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = invoke.getReturnType();
        if (returnType == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "invoke.returnType!!");
        sb.append(reflectionObjectRenderer.renderType(returnType));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final java.lang.String renderParameter(kotlin.reflect.jvm.internal.KParameterImpl parameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameter, "parameter");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = kotlin.reflect.jvm.internal.ReflectionObjectRenderer.WhenMappings.$EnumSwitchMapping$0[parameter.getKind().ordinal()];
        if (i == 1) {
            sb.append("extension receiver");
        } else if (i == 2) {
            sb.append("instance");
        } else if (i == 3) {
            sb.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb.append(" of ");
        sb.append(INSTANCE.renderCallable(parameter.getCallable().getDescriptor()));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final java.lang.String renderTypeParameter(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameter, "typeParameter");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = kotlin.reflect.jvm.internal.ReflectionObjectRenderer.WhenMappings.$EnumSwitchMapping$1[typeParameter.getVariance().ordinal()];
        if (i == 2) {
            sb.append("in ");
        } else if (i == 3) {
            sb.append("out ");
        }
        sb.append(typeParameter.getName());
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final java.lang.String renderType(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return renderer.renderType(type);
    }
}
