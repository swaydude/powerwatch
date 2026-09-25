package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorRenderer {
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT_WITHOUT_SUPERTYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT_WITH_MODIFIERS;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer COMPACT_WITH_SHORT_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer DEBUG_TEXT;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer FQ_NAMES_IN_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer HTML;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer ONLY_NAMES_WITH_SHORT_TYPES;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer SHORT_NAMES_IN_TYPES;

    public abstract java.lang.String render(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor);

    public abstract java.lang.String renderAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract java.lang.String renderFlexibleType(java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns);

    public abstract java.lang.String renderFqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe);

    public abstract java.lang.String renderName(kotlin.reflect.jvm.internal.impl.name.Name name, boolean z);

    public abstract java.lang.String renderType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType);

    public abstract java.lang.String renderTypeProjection(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection);

    public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer withOptions(kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit> changeOptions) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(changeOptions, "changeOptions");
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl descriptorRendererOptionsImplCopy = ((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) this).getOptions().copy();
        changeOptions.invoke(descriptorRendererOptionsImplCopy);
        descriptorRendererOptionsImplCopy.lock();
        return new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl(descriptorRendererOptionsImplCopy);
    }

    public static /* synthetic */ java.lang.String renderAnnotation$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i & 2) != 0) {
            annotationUseSiteTarget = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null;
        }
        return descriptorRenderer.renderAnnotation(annotationDescriptor, annotationUseSiteTarget);
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public interface ValueParametersHandler {
        void appendAfterValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, int i2, java.lang.StringBuilder sb);

        void appendAfterValueParameters(int i, java.lang.StringBuilder sb);

        void appendBeforeValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, int i, int i2, java.lang.StringBuilder sb);

        void appendBeforeValueParameters(int i, java.lang.StringBuilder sb);

        /* JADX INFO: compiled from: DescriptorRenderer.kt */
        public static final class DEFAULT implements kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler {
            public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor parameter, int i, int i2, java.lang.StringBuilder builder) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameter, "parameter");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            }

            private DEFAULT() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendBeforeValueParameters(int i, java.lang.StringBuilder builder) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameters(int i, java.lang.StringBuilder builder) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
                builder.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void appendAfterValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor parameter, int i, int i2, java.lang.StringBuilder builder) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameter, "parameter");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
                if (i != i2 - 1) {
                    builder.append(", ");
                }
            }
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class Companion {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS.ordinal()] = 1;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE.ordinal()] = 2;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS.ordinal()] = 3;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT.ordinal()] = 4;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY.ordinal()] = 6;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer withOptions(kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit> changeOptions) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(changeOptions, "changeOptions");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.lock();
            return new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }

        public final java.lang.String getClassifierKindPrefix(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifier) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classifier, "classifier");
            if (classifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
                return "typealias";
            }
            if (classifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifier;
                if (classDescriptor.isCompanionObject()) {
                    return "companion object";
                }
                switch (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion.WhenMappings.$EnumSwitchMapping$0[classDescriptor.getKind().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            throw new java.lang.AssertionError("Unexpected classifier: " + classifier);
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion companion = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion(null);
        Companion = companion;
        COMPACT_WITH_MODIFIERS = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setWithDefinedIn(false);
            }
        });
        COMPACT = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setWithDefinedIn(false);
                receiver.setModifiers(kotlin.collections.SetsKt.emptySet());
            }
        });
        COMPACT_WITHOUT_SUPERTYPES = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setWithDefinedIn(false);
                receiver.setModifiers(kotlin.collections.SetsKt.emptySet());
                receiver.setWithoutSuperTypes(true);
            }
        });
        COMPACT_WITH_SHORT_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setModifiers(kotlin.collections.SetsKt.emptySet());
                receiver.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT.INSTANCE);
                receiver.setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }
        });
        ONLY_NAMES_WITH_SHORT_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setWithDefinedIn(false);
                receiver.setModifiers(kotlin.collections.SetsKt.emptySet());
                receiver.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT.INSTANCE);
                receiver.setWithoutTypeParameters(true);
                receiver.setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE);
                receiver.setReceiverAfterName(true);
                receiver.setRenderCompanionObjectName(true);
                receiver.setWithoutSuperTypes(true);
                receiver.setStartFromName(true);
            }
        });
        FQ_NAMES_IN_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL);
            }
        });
        SHORT_NAMES_IN_TYPES = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT.INSTANCE);
                receiver.setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
            }
        });
        DEBUG_TEXT = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$DEBUG_TEXT$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setDebugMode(true);
                receiver.setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
                receiver.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL);
            }
        });
        HTML = companion.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$HTML$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                invoke2(descriptorRendererOptions);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                receiver.setTextFormat(kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML);
                receiver.setModifiers(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL);
            }
        });
    }
}
