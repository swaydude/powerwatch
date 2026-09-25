package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: compiled from: DescriptorRendererImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorRendererImpl extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer implements kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.class), "functionTypeAnnotationsRenderer", "getFunctionTypeAnnotationsRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRendererImpl;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.class), "functionTypeParameterTypesRenderer", "getFunctionTypeParameterTypesRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer;"))};
    private final kotlin.Lazy functionTypeAnnotationsRenderer$delegate;
    private final kotlin.Lazy functionTypeParameterTypesRenderer$delegate;
    private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl options;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN.ordinal()] = 1;
            iArr3[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr4 = new int[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN.ordinal()] = 1;
            iArr4[kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML.ordinal()] = 2;
            int[] iArr5 = new int[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.values().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            iArr5[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr5[kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
        }
    }

    private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl getFunctionTypeAnnotationsRenderer() {
        kotlin.Lazy lazy = this.functionTypeAnnotationsRenderer$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) lazy.getValue();
    }

    private final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer getFunctionTypeParameterTypesRenderer() {
        kotlin.Lazy lazy = this.functionTypeParameterTypesRenderer$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[1];
        return (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer) lazy.getValue();
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, java.lang.Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    public kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    public kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationArgumentsRenderingPolicy, "<set-?>");
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classifierNamePolicy, "<set-?>");
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.options.setDebugMode(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(set, "<set-?>");
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> set) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(set, "<set-?>");
        this.options.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameterNameRenderingPolicy, "<set-?>");
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.options.setReceiverAfterName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.options.setRenderCompanionObjectName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.options.setStartFromName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat renderingFormat) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(renderingFormat, "<set-?>");
        this.options.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.options.setVerbose(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.options.setWithDefinedIn(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.options.setWithoutSuperTypes(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.options.setWithoutTypeParameters(z);
    }

    public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    public DescriptorRendererImpl(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl options) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(options, "options");
        this.options = options;
        options.isLocked();
        this.functionTypeAnnotationsRenderer$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl invoke() {
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRendererWithOptions = this.this$0.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                        invoke2(descriptorRendererOptions);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                        receiver.setExcludedTypeAnnotationClasses(kotlin.collections.SetsKt.plus((java.util.Set) receiver.getExcludedTypeAnnotationClasses(), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.extensionFunctionType)));
                        receiver.setAnnotationArgumentsRenderingPolicy(kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy.ALWAYS_PARENTHESIZED);
                    }
                });
                if (descriptorRendererWithOptions != null) {
                    return (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) descriptorRendererWithOptions;
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            }
        });
        this.functionTypeParameterTypesRenderer$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeParameterTypesRenderer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer invoke() {
                return this.this$0.withOptions(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeParameterTypesRenderer$2.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
                        invoke2(descriptorRendererOptions);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions receiver) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                        receiver.setExcludedTypeAnnotationClasses(kotlin.collections.SetsKt.plus((java.util.Set) receiver.getExcludedTypeAnnotationClasses(), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.parameterName)));
                    }
                });
            }
        });
    }

    private final java.lang.String renderKeyword(java.lang.String str) {
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (getBoldOnlyForNamesInHtml()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final java.lang.String renderError(java.lang.String str) {
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$1[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final java.lang.String escape(java.lang.String str) {
        return getTextFormat().escape(str);
    }

    private final java.lang.String lt() {
        return escape("<");
    }

    private final java.lang.String gt() {
        return escape(">");
    }

    private final java.lang.String arrow() {
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$2[getTextFormat().ordinal()];
        if (i == 1) {
            return escape("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public java.lang.String renderMessage(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$3[getTextFormat().ordinal()];
        if (i == 1) {
            return message;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public java.lang.String renderName(kotlin.reflect.jvm.internal.impl.name.Name name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.lang.String strEscape = escape(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render(name));
        if (!getBoldOnlyForNamesInHtml() || getTextFormat() != kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML || !z) {
            return strEscape;
        }
        return "<b>" + strEscape + "</b>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderName(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.lang.StringBuilder sb, boolean z) {
        kotlin.reflect.jvm.internal.impl.name.Name name = declarationDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.name");
        sb.append(renderName(name, z));
    }

    private final void renderCompanionObjectName(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, java.lang.StringBuilder sb) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb.append("companion object");
            }
            renderSpaceIfNeeded(sb);
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb.append("of ");
                kotlin.reflect.jvm.internal.impl.name.Name name = containingDeclaration.getName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "containingDeclaration.name");
                sb.append(renderName(name, false));
            }
        }
        if (getVerbose() || (!kotlin.jvm.internal.Intrinsics.areEqual(declarationDescriptor.getName(), kotlin.reflect.jvm.internal.impl.name.SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT))) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            kotlin.reflect.jvm.internal.impl.name.Name name2 = declarationDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name2, "descriptor.name");
            sb.append(renderName(name2, true));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public java.lang.String renderFqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> listPathSegments = fqName.pathSegments();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(listPathSegments, "fqName.pathSegments()");
        return renderFqName(listPathSegments);
    }

    private final java.lang.String renderFqName(java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list) {
        return escape(kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.renderFqName(list));
    }

    public java.lang.String renderClassifierName(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor klass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
        if (kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(klass)) {
            return klass.getTypeConstructor().toString();
        }
        return getClassifierNamePolicy().renderClassifier(klass, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public java.lang.String renderType(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        renderNormalizedType(sb, getTypeNormalizer().invoke(type));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void renderNormalizedType(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (!(unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.AbbreviatedType)) {
            unwrappedTypeUnwrap = null;
        }
        kotlin.reflect.jvm.internal.impl.types.AbbreviatedType abbreviatedType = (kotlin.reflect.jvm.internal.impl.types.AbbreviatedType) unwrappedTypeUnwrap;
        if (abbreviatedType != null) {
            if (getRenderTypeExpansions()) {
                renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
                return;
            }
            renderNormalizedTypeAsIs(sb, abbreviatedType.getAbbreviation());
            if (getRenderUnabbreviatedType()) {
                renderAbbreviatedTypeExpansion(sb, abbreviatedType);
                return;
            }
            return;
        }
        renderNormalizedTypeAsIs(sb, kotlinType);
    }

    private final void renderAbbreviatedTypeExpansion(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.AbbreviatedType abbreviatedType) {
        if (getTextFormat() == kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
        sb.append(" */");
        if (getTextFormat() == kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML) {
            sb.append("</i></font>");
        }
    }

    private final void renderNormalizedTypeAsIs(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if ((kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.WrappedType) && getDebugMode() && !((kotlin.reflect.jvm.internal.impl.types.WrappedType) kotlinType).isComputed()) {
            sb.append("<Not computed yet>");
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            sb.append(((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap).render(this, this));
        } else if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            renderSimpleType(sb, (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap);
        }
    }

    private final void renderSimpleType(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(simpleType, kotlin.reflect.jvm.internal.impl.types.TypeUtils.CANT_INFER_FUNCTION_PARAM_TYPE)) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = simpleType;
            if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.isDontCarePlaceholder(simpleType2)) {
                if (kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isUninferredParameter(simpleType2)) {
                    if (getUninferredTypeParameterAsName()) {
                        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = simpleType.getConstructor();
                        if (constructor == null) {
                            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = ((kotlin.reflect.jvm.internal.impl.types.ErrorUtils.UninferredParameterTypeConstructor) constructor).getTypeParameterDescriptor();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterDescriptor, "(type.constructor as Uni…).typeParameterDescriptor");
                        java.lang.String string = typeParameterDescriptor.getName().toString();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "(type.constructor as Uni…escriptor.name.toString()");
                        sb.append(renderError(string));
                        return;
                    }
                    sb.append("???");
                    return;
                }
                if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType2)) {
                    renderDefaultType(sb, simpleType2);
                    return;
                } else if (shouldRenderAsPrettyFunctionType(simpleType2)) {
                    renderFunctionType(sb, simpleType2);
                    return;
                } else {
                    renderDefaultType(sb, simpleType2);
                    return;
                }
            }
        }
        sb.append("???");
    }

    private final boolean shouldRenderAsPrettyFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        boolean z;
        if (!kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = kotlinType.getArguments();
        if ((arguments instanceof java.util.Collection) && arguments.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                if (((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).isStarProjection()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public java.lang.String renderFlexibleType(java.lang.String lowerRendered, java.lang.String upperRendered, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperRendered, "upperRendered");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "builtIns");
        if (differsOnlyInNullability(lowerRendered, upperRendered)) {
            if (kotlin.text.StringsKt.startsWith$default(upperRendered, "(", false, 2, (java.lang.Object) null)) {
                return '(' + lowerRendered + ")!";
            }
            return lowerRendered + "!";
        }
        kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor collection = builtIns.getCollection();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collection, "builtIns.collection");
        kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl = this;
        java.lang.String strSubstringBefore$default = kotlin.text.StringsKt.substringBefore$default(classifierNamePolicy.renderClassifier(collection, descriptorRendererImpl), "Collection", (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.String strReplacePrefixes = replacePrefixes(lowerRendered, strSubstringBefore$default + "Mutable", upperRendered, strSubstringBefore$default, strSubstringBefore$default + "(Mutable)");
        if (strReplacePrefixes != null) {
            return strReplacePrefixes;
        }
        java.lang.String strReplacePrefixes2 = replacePrefixes(lowerRendered, strSubstringBefore$default + "MutableMap.MutableEntry", upperRendered, strSubstringBefore$default + "Map.Entry", strSubstringBefore$default + "(Mutable)Map.(Mutable)Entry");
        if (strReplacePrefixes2 != null) {
            return strReplacePrefixes2;
        }
        kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor array = builtIns.getArray();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(array, "builtIns.array");
        java.lang.String strSubstringBefore$default2 = kotlin.text.StringsKt.substringBefore$default(classifierNamePolicy2.renderClassifier(array, descriptorRendererImpl), "Array", (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.String strReplacePrefixes3 = replacePrefixes(lowerRendered, strSubstringBefore$default2 + escape("Array<"), upperRendered, strSubstringBefore$default2 + escape("Array<out "), strSubstringBefore$default2 + escape("Array<(out) "));
        if (strReplacePrefixes3 != null) {
            return strReplacePrefixes3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public java.lang.String renderTypeArguments(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> typeArguments) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(lt());
        appendTypeProjections(sb, typeArguments);
        sb.append(gt());
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void renderDefaultType(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        renderAnnotations$default(this, sb, kotlinType, null, 2, null);
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType)) {
            if ((kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.UnresolvedType) && getPresentableUnresolvedTypes()) {
                sb.append(((kotlin.reflect.jvm.internal.impl.types.UnresolvedType) kotlinType).getPresentableName());
            } else {
                sb.append(kotlinType.getConstructor().toString());
            }
            sb.append(renderTypeArguments(kotlinType.getArguments()));
        } else {
            renderTypeConstructorAndArguments$default(this, sb, kotlinType, null, 2, null);
        }
        if (kotlinType.isMarkedNullable()) {
            sb.append("?");
        }
        if (kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb.append("!!");
        }
    }

    static /* synthetic */ void renderTypeConstructorAndArguments$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.renderTypeConstructorAndArguments(sb, kotlinType, typeConstructor);
    }

    private final void renderTypeConstructorAndArguments(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (possiblyInnerTypeBuildPossiblyInnerType == null) {
            sb.append(renderTypeConstructor(typeConstructor));
            sb.append(renderTypeArguments(kotlinType.getArguments()));
        } else {
            renderPossiblyInnerType(sb, possiblyInnerTypeBuildPossiblyInnerType);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    private final void renderPossiblyInnerType(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType possiblyInnerType) {
        kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            renderPossiblyInnerType(sb, outerType);
            sb.append('.');
            kotlin.reflect.jvm.internal.impl.name.Name name = possiblyInnerType.getClassifierDescriptor().getName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(renderName(name, false));
            if (sb == null) {
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "possiblyInnerType.classi…escriptor.typeConstructor");
                sb.append(renderTypeConstructor(typeConstructor));
            }
        } else {
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor2, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(renderTypeConstructor(typeConstructor2));
        }
        sb.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    public java.lang.String renderTypeConstructor(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "typeConstructor");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = typeConstructor.mo1268getDeclarationDescriptor();
        if ((classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) || (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) || (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor)) {
            return renderClassifierName(classifierDescriptorMo1268getDeclarationDescriptor);
        }
        if (classifierDescriptorMo1268getDeclarationDescriptor == null) {
            return typeConstructor.toString();
        }
        throw new java.lang.IllegalStateException(("Unexpected classifier: " + classifierDescriptorMo1268getDeclarationDescriptor.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public java.lang.String renderTypeProjection(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeProjection, "typeProjection");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendTypeProjections(sb, kotlin.collections.CollectionsKt.listOf(typeProjection));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final void appendTypeProjections(java.lang.StringBuilder sb, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.collections.CollectionsKt.joinTo(list, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) != 0 ? "" : null, (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.TypeProjection, java.lang.CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.appendTypeProjections.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.CharSequence invoke(kotlin.reflect.jvm.internal.impl.types.TypeProjection it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                if (it.isStarProjection()) {
                    return "*";
                }
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this;
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = it.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
                java.lang.String strRenderType = descriptorRendererImpl.renderType(type);
                if (it.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                    strRenderType = it.getProjectionKind() + ' ' + strRenderType;
                }
                return strRenderType;
            }
        });
    }

    private final void renderFunctionType(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.name.Name nameExtractParameterNameFromFunctionTypeArgument;
        int length = sb.length();
        renderAnnotations$default(getFunctionTypeAnnotationsRenderer(), sb, kotlinType, null, 2, null);
        boolean z = true;
        boolean z2 = sb.length() != length;
        boolean zIsSuspendFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean zIsMarkedNullable = kotlinType.isMarkedNullable();
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverTypeFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        boolean z3 = zIsMarkedNullable || (z2 && receiverTypeFromFunctionType != null);
        if (z3) {
            if (zIsSuspendFunctionType) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    java.lang.StringBuilder sb2 = sb;
                    kotlin.text.StringsKt.last(sb2);
                    if (sb.charAt(kotlin.text.StringsKt.getLastIndex(sb2) - 1) != ')') {
                        sb.insert(kotlin.text.StringsKt.getLastIndex(sb2), "()");
                    }
                }
                sb.append("(");
            }
        }
        renderModifier(sb, zIsSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            if ((!shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) || receiverTypeFromFunctionType.isMarkedNullable()) && !hasModifiersOrAnnotations(receiverTypeFromFunctionType)) {
                z = false;
            }
            if (z) {
                sb.append("(");
            }
            renderNormalizedType(sb, receiverTypeFromFunctionType);
            if (z) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        int i = 0;
        for (kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection : kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
            if (i > 0) {
                sb.append(", ");
            }
            if (getParameterNamesInFunctionalTypes()) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "typeProjection.type");
                nameExtractParameterNameFromFunctionTypeArgument = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
            } else {
                nameExtractParameterNameFromFunctionTypeArgument = null;
            }
            if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                sb.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                sb.append(": ");
            }
            sb.append(getFunctionTypeParameterTypesRenderer().renderTypeProjection(typeProjection));
            i++;
        }
        sb.append(") ");
        sb.append(arrow());
        sb.append(" ");
        renderNormalizedType(sb, kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z3) {
            sb.append(")");
        }
        if (zIsMarkedNullable) {
            sb.append("?");
        }
    }

    private final boolean hasModifiersOrAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    private final void appendDefinedIn(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) || (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor)) {
            return;
        }
        if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) {
            sb.append(" is a module");
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        if (containingDeclaration == null || (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor)) {
            return;
        }
        sb.append(" ");
        sb.append(renderMessage("defined in"));
        sb.append(" ");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(containingDeclaration);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "DescriptorUtils.getFqName(containingDeclaration)");
        sb.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
        if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource)) {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = ((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource) declarationDescriptor).getSource();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(source, "descriptor.source");
            kotlin.reflect.jvm.internal.impl.descriptors.SourceFile containingFile = source.getContainingFile();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingFile, "descriptor.source.containingFile");
            java.lang.String name = containingFile.getName();
            if (name != null) {
                sb.append(" ");
                sb.append(renderMessage("in file"));
                sb.append(" ");
                sb.append(name);
            }
        }
    }

    static /* synthetic */ void renderAnnotations$default(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl, java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget) null;
        }
        descriptorRendererImpl.renderAnnotations(sb, annotated, annotationUseSiteTarget);
    }

    private final void renderAnnotations(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS)) {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> excludedTypeAnnotationClasses = annotated instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, java.lang.Boolean> annotationFilter = getAnnotationFilter();
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!kotlin.collections.CollectionsKt.contains(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                    sb.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        kotlin.text.StringsKt.appendln(sb);
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public java.lang.String renderAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotation, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget annotationUseSiteTarget) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotation, "annotation");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ":");
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = annotation.getType();
        sb.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            java.util.List<java.lang.String> listRenderAndSortAnnotationArguments = renderAndSortAnnotationArguments(annotation);
            if (getIncludeEmptyAnnotationArguments() || (!listRenderAndSortAnnotationArguments.isEmpty())) {
                kotlin.collections.CollectionsKt.joinTo(listRenderAndSortAnnotationArguments, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) != 0 ? "" : ")", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : null);
            }
        }
        if (getVerbose() && (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(type) || (type.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final java.util.List<java.lang.String> renderAndSortAnnotationArguments(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters;
        java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        java.util.ArrayList arrayListEmptyList = null;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
        if (annotationClass != null && (classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor = annotationClass.mo1262getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : valueParameters) {
                if (((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj).declaresDefaultValue()) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it : arrayList2) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                arrayList3.add(it.getName());
            }
            arrayListEmptyList = arrayList3;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayListEmptyList) {
            if (!allValueArguments.containsKey((kotlin.reflect.jvm.internal.impl.name.Name) obj2)) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((kotlin.reflect.jvm.internal.impl.name.Name) it2.next()).asString() + " = ...");
        }
        java.util.ArrayList arrayList7 = arrayList6;
        java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        java.util.Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
            kotlin.reflect.jvm.internal.impl.name.Name name = (kotlin.reflect.jvm.internal.impl.name.Name) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) entry.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(name.asString());
            sb.append(" = ");
            sb.append(!arrayListEmptyList.contains(name) ? renderConstant(constantValue) : "...");
            arrayList8.add(sb.toString());
        }
        return kotlin.collections.CollectionsKt.sorted(kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList7, (java.lang.Iterable) arrayList8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String renderConstant(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue) {
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) {
            return kotlin.collections.CollectionsKt.joinToString$default(((kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) constantValue).getValue(), ", ", "{", "}", 0, null, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderConstant.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderConstant(it);
                }
            }, 24, null);
        }
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) {
            return kotlin.text.StringsKt.removePrefix(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.renderAnnotation$default(this, ((kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) constantValue).getValue(), null, 2, null), (java.lang.CharSequence) "@");
        }
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value value = ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) constantValue).getValue();
            if (value instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) {
                return ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) value).getType() + "::class";
            }
            if (!(value instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass normalClass = (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) value;
            java.lang.String strAsString = normalClass.getClassId().asSingleFqName().asString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "classValue.classId.asSingleFqName().asString()");
            int arrayDimensions = normalClass.getArrayDimensions();
            for (int i = 0; i < arrayDimensions; i++) {
                strAsString = "kotlin.Array<" + strAsString + kotlin.text.Typography.greater;
            }
            return strAsString + "::class";
        }
        return constantValue.toString();
    }

    private final boolean renderVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility, java.lang.StringBuilder sb) {
        if (!getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            visibility = visibility.normalize();
        }
        if (!getRenderDefaultVisibility() && kotlin.jvm.internal.Intrinsics.areEqual(visibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb.append(renderKeyword(visibility.getDisplayName()));
        sb.append(" ");
        return true;
    }

    private final void renderModality(kotlin.reflect.jvm.internal.impl.descriptors.Modality modality, java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2) {
        if (getRenderDefaultModality() || modality != modality2) {
            boolean zContains = getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MODALITY);
            java.lang.String strName = modality.name();
            if (strName == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String lowerCase = strName.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            renderModifier(sb, zContains, lowerCase);
        }
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality implicitModalityWithoutExtensions(kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) memberDescriptor).getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE ? kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT : kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            containingDeclaration = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        if (classDescriptor == null) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }
        if (!(memberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor)) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) memberDescriptor;
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "this.overriddenDescriptors");
        if ((!overriddenDescriptors.isEmpty()) && classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
        }
        if (classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE && (!kotlin.jvm.internal.Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE))) {
            return callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT ? kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT : kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    private final void renderModalityForCallable(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN && overridesSomething(callableMemberDescriptor)) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = callableMemberDescriptor.getModality();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(modality, "callable.modality");
        renderModality(modality, sb, implicitModalityWithoutExtensions(callableMemberDescriptor));
    }

    private final void renderOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.OVERRIDE) && overridesSomething(callableMemberDescriptor) && getOverrideRenderingPolicy() != kotlin.reflect.jvm.internal.impl.renderer.OverrideRenderingPolicy.RENDER_OPEN) {
            renderModifier(sb, true, "override");
            if (getVerbose()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb.append("*/ ");
            }
        }
    }

    private final void renderMemberKind(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.lang.StringBuilder sb) {
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            java.lang.String strName = callableMemberDescriptor.getKind().name();
            if (strName == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String lowerCase = strName.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            sb.append("*/ ");
        }
    }

    private final void renderModifier(java.lang.StringBuilder sb, boolean z, java.lang.String str) {
        if (z) {
            sb.append(renderKeyword(str));
            sb.append(" ");
        }
    }

    private final void renderMemberModifiers(kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor, java.lang.StringBuilder sb) {
        renderModifier(sb, memberDescriptor.isExternal(), "external");
        renderModifier(sb, getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        renderModifier(sb, getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual(), "actual");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    private final void renderAdditionalModifiers(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.StringBuilder sb) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (functionDescriptor.isOperator()) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors, "functionDescriptor.overriddenDescriptors");
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection = overriddenDescriptors;
            if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
                java.util.Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = true;
                        break;
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor it2 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it.next();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                    if (it2.isOperator()) {
                        z3 = false;
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
            if (z3 || getAlwaysRenderModifiers()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (functionDescriptor.isInfix()) {
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overriddenDescriptors2, "functionDescriptor.overriddenDescriptors");
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> collection2 = overriddenDescriptors2;
            if (!(collection2 instanceof java.util.Collection) || !collection2.isEmpty()) {
                java.util.Iterator<T> it3 = collection2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = true;
                        break;
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor it4 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) it3.next();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it4, "it");
                    if (it4.isInfix()) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                z2 = true;
                break;
            }
            if (z2 || getAlwaysRenderModifiers()) {
                z4 = true;
            }
        }
        renderModifier(sb, functionDescriptor.isTailrec(), "tailrec");
        renderSuspendModifier(functionDescriptor, sb);
        renderModifier(sb, functionDescriptor.isInline(), "inline");
        renderModifier(sb, z4, "infix");
        renderModifier(sb, z, "operator");
    }

    private final void renderSuspendModifier(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.StringBuilder sb) {
        renderModifier(sb, functionDescriptor.isSuspend(), "suspend");
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public java.lang.String render(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(declarationDescriptor, "declarationDescriptor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        declarationDescriptor.accept(new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor(), sb);
        if (getWithDefinedIn()) {
            appendDefinedIn(sb, declarationDescriptor);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeParameter(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, java.lang.StringBuilder sb, boolean z) {
        if (z) {
            sb.append(lt());
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        renderModifier(sb, typeParameterDescriptor.isReified(), "reified");
        java.lang.String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z2 = true;
        renderModifier(sb, label.length() > 0, label);
        renderAnnotations$default(this, sb, typeParameterDescriptor, null, 2, null);
        renderName(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType upperBound = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDefaultBound(upperBound)) {
                sb.append(" : ");
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBound, "upperBound");
                sb.append(renderType(upperBound));
            }
        } else if (z) {
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType upperBound2 : typeParameterDescriptor.getUpperBounds()) {
                if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDefaultBound(upperBound2)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBound2, "upperBound");
                    sb.append(renderType(upperBound2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(gt());
        }
    }

    private final void renderTypeParameters(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.lang.StringBuilder sb, boolean z) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb.append(lt());
        renderTypeParameterList(sb, list);
        sb.append(gt());
        if (z) {
            sb.append(" ");
        }
    }

    private final void renderTypeParameterList(java.lang.StringBuilder sb, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFunction(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.StringBuilder sb) {
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderAnnotations$default(this, sb, functionDescriptor, null, 2, null);
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = functionDescriptor.getVisibility();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "function.visibility");
                renderVisibility(visibility, sb);
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor2 = functionDescriptor;
                renderModalityForCallable(functionDescriptor2, sb);
                if (getIncludeAdditionalModifiers()) {
                    renderMemberModifiers(functionDescriptor, sb);
                }
                renderOverride(functionDescriptor2, sb);
                if (getIncludeAdditionalModifiers()) {
                    renderAdditionalModifiers(functionDescriptor, sb);
                } else {
                    renderSuspendModifier(functionDescriptor, sb);
                }
                renderMemberKind(functionDescriptor2, sb);
                if (getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(renderKeyword("fun"));
            sb.append(" ");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = functionDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "function.typeParameters");
            renderTypeParameters(typeParameters, sb, true);
            renderReceiver(functionDescriptor, sb);
        }
        renderName(functionDescriptor, sb, true);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "function.valueParameters");
        renderValueParameters(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb);
        renderReceiverAfterName(functionDescriptor, sb);
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = functionDescriptor.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(returnType))) {
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : renderType(returnType));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = functionDescriptor.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters2, "function.typeParameters");
        renderWhereSuffix(typeParameters2, sb);
    }

    private final void renderReceiverAfterName(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb.append(" on ");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "receiver.type");
            sb.append(renderType(type));
        }
    }

    private final void renderReceiver(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb, extensionReceiverParameter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.RECEIVER);
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = extensionReceiverParameter.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "receiver.type");
            java.lang.String strRenderType = renderType(type);
            if (shouldRenderAsPrettyFunctionType(type) && !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(type)) {
                strRenderType = '(' + strRenderType + ')';
            }
            sb.append(strRenderType);
            sb.append(".");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderConstructor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor;
        renderAnnotations$default(this, sb, constructorDescriptor, null, 2, null);
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = constructorDescriptor.getVisibility();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "constructor.visibility");
        boolean zRenderVisibility = renderVisibility(visibility, sb);
        renderMemberKind(constructorDescriptor, sb);
        boolean z = getRenderConstructorKeyword() || !constructorDescriptor.isPrimary() || zRenderVisibility;
        if (z) {
            sb.append(renderKeyword("constructor"));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "constructor.containingDeclaration");
        if (getSecondaryConstructorsAsPrimary()) {
            if (z) {
                sb.append(" ");
            }
            renderName(containingDeclaration, sb, true);
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "constructor.typeParameters");
            renderTypeParameters(typeParameters, sb, false);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "constructor.valueParameters");
        renderValueParameters(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb);
        if (getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && (classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).mo1262getUnsubstitutedPrimaryConstructor()) != null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "primaryConstructor.valueParameters");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : valueParameters2) {
                kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                sb.append(" : ");
                sb.append(renderKeyword("this"));
                sb.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList2, ", ", "(", ")", 0, null, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderConstructor.1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor2) {
                        return "";
                    }
                }, 24, null));
            }
        }
        if (getSecondaryConstructorsAsPrimary()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters2, "constructor.typeParameters");
            renderWhereSuffix(typeParameters2, sb);
        }
    }

    private final void renderWhereSuffix(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.lang.StringBuilder sb) {
        if (getWithoutTypeParameters()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "typeParameter.upperBounds");
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType it : kotlin.collections.CollectionsKt.drop(upperBounds, 1)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                kotlin.reflect.jvm.internal.impl.name.Name name = typeParameterDescriptor.getName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "typeParameter.name");
                sb2.append(renderName(name, false));
                sb2.append(" : ");
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                sb2.append(renderType(it));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(renderKeyword("where"));
        sb.append(" ");
        kotlin.collections.CollectionsKt.joinTo(arrayList, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) != 0 ? "" : null, (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : null);
    }

    private final void renderValueParameters(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> collection, boolean z, java.lang.StringBuilder sb) {
        boolean zShouldRenderParameterNames = shouldRenderParameterNames(z);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb);
        int i = 0;
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i, size, sb);
            renderValueParameter(valueParameterDescriptor, zShouldRenderParameterNames, sb, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i, size, sb);
            i++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb);
    }

    private final boolean shouldRenderParameterNames(boolean z) {
        int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.WhenMappings.$EnumSwitchMapping$4[getParameterNameRenderingPolicy().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    public final void renderValueParameter(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, boolean z, java.lang.StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(renderKeyword("value-parameter"));
            sb.append(" ");
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        renderAnnotations$default(this, sb, valueParameterDescriptor, null, 2, null);
        renderModifier(sb, valueParameterDescriptor.isCrossinline(), "crossinline");
        renderModifier(sb, valueParameterDescriptor.isNoinline(), "noinline");
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor)) {
                containingDeclaration = null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) containingDeclaration;
            if (classConstructorDescriptor != null && classConstructorDescriptor.isPrimary()) {
                renderModifier(sb, getActualPropertiesInPrimaryConstructor(), "actual");
                renderModifier(sb, true, "val");
            }
        }
        renderVariable(valueParameterDescriptor, z, sb, z2);
        if (getDefaultParameterValueRenderer() != null) {
            z3 = getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        if (z3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(" = ");
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, java.lang.String> defaultParameterValueRenderer = getDefaultParameterValueRenderer();
            if (defaultParameterValueRenderer == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            sb2.append(defaultParameterValueRenderer.invoke(valueParameterDescriptor));
            sb.append(sb2.toString());
        }
    }

    private final void renderValVarPrefix(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, java.lang.StringBuilder sb) {
        if (variableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) {
            return;
        }
        sb.append(renderKeyword(variableDescriptor.isVar() ? "var" : "val"));
        sb.append(" ");
    }

    private final void renderVariable(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, boolean z, java.lang.StringBuilder sb, boolean z2) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = variableDescriptor.getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "variable.type");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) (!(variableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) ? null : variableDescriptor);
        kotlin.reflect.jvm.internal.impl.types.KotlinType varargElementType = valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = varargElementType != null ? varargElementType : type;
        renderModifier(sb, varargElementType != null, "vararg");
        if (z2 && !getStartFromName()) {
            renderValVarPrefix(variableDescriptor, sb);
        }
        if (z) {
            renderName(variableDescriptor, sb, z2);
            sb.append(": ");
        }
        sb.append(renderType(kotlinType));
        renderInitializer(variableDescriptor, sb);
        if (!getVerbose() || varargElementType == null) {
            return;
        }
        sb.append(" /*");
        sb.append(renderType(type));
        sb.append("*/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderProperty(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.StringBuilder sb) {
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderPropertyAnnotations(propertyDescriptor, sb);
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = propertyDescriptor.getVisibility();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "property.visibility");
                renderVisibility(visibility, sb);
                boolean z = false;
                renderModifier(sb, getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                renderMemberModifiers(propertyDescriptor, sb);
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor2 = propertyDescriptor;
                renderModalityForCallable(propertyDescriptor2, sb);
                renderOverride(propertyDescriptor2, sb);
                if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z = true;
                }
                renderModifier(sb, z, "lateinit");
                renderMemberKind(propertyDescriptor2, sb);
            }
            renderValVarPrefix(propertyDescriptor, sb);
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "property.typeParameters");
            renderTypeParameters(typeParameters, sb, true);
            renderReceiver(propertyDescriptor, sb);
        }
        renderName(propertyDescriptor, sb, true);
        sb.append(": ");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = propertyDescriptor.getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "property.type");
        sb.append(renderType(type));
        renderReceiverAfterName(propertyDescriptor, sb);
        renderInitializer(propertyDescriptor, sb);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters2, "property.typeParameters");
        renderWhereSuffix(typeParameters2, sb);
    }

    private final void renderPropertyAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.StringBuilder sb) {
        if (getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS)) {
            renderAnnotations$default(this, sb, propertyDescriptor, null, 2, null);
            kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor it = propertyDescriptor.getBackingField();
            if (it != null) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                renderAnnotations(sb, it, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.FIELD);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor it2 = propertyDescriptor.getDelegateField();
            if (it2 != null) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                renderAnnotations(sb, it2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE) {
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor it3 = propertyDescriptor.getGetter();
                if (it3 != null) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it3, "it");
                    renderAnnotations(sb, it3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(setter, "it");
                    renderAnnotations(sb, setter, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.PROPERTY_SETTER);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(setter, "setter");
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "setter.valueParameters");
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it4 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) valueParameters);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it4, "it");
                    renderAnnotations(sb, it4, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void renderInitializer(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor variableDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constant;
        if (!getIncludePropertyConstant() || (constant = variableDescriptor.mo1264getCompileTimeInitializer()) == null) {
            return;
        }
        sb.append(" = ");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constant, "constant");
        sb.append(escape(renderConstant(constant)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderTypeAlias(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.lang.StringBuilder sb) {
        renderAnnotations$default(this, sb, typeAliasDescriptor, null, 2, null);
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = typeAliasDescriptor.getVisibility();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "typeAlias.visibility");
        renderVisibility(visibility, sb);
        renderMemberModifiers(typeAliasDescriptor, sb);
        sb.append(renderKeyword("typealias"));
        sb.append(" ");
        renderName(typeAliasDescriptor, sb, true);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "typeAlias.declaredTypeParameters");
        renderTypeParameters(declaredTypeParameters, sb, false);
        renderCapturedTypeParametersIfRequired(typeAliasDescriptor, sb);
        sb.append(" = ");
        sb.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final void renderCapturedTypeParametersIfRequired(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, java.lang.StringBuilder sb) {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "classifier.declaredTypeParameters");
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classifierDescriptorWithTypeParameters.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "classifier.typeConstructor");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "classifier.typeConstructor.parameters");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb.append(" /*captured type parameters: ");
            renderTypeParameterList(sb, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.StringBuilder sb) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor;
        boolean z = classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY;
        if (!getStartFromName()) {
            renderAnnotations$default(this, sb, classDescriptor, null, 2, null);
            if (!z) {
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = classDescriptor.getVisibility();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "klass.visibility");
                renderVisibility(visibility, sb);
            }
            if (classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind = classDescriptor.getKind();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind, "klass.kind");
                if (!kind.isSingleton() || classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL) {
                    kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = classDescriptor.getModality();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(modality, "klass.modality");
                    renderModality(modality, sb, implicitModalityWithoutExtensions(classDescriptor));
                }
            }
            renderMemberModifiers(classDescriptor, sb);
            renderModifier(sb, getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INNER) && classDescriptor.isInner(), "inner");
            renderModifier(sb, getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.DATA) && classDescriptor.isData(), "data");
            renderModifier(sb, getModifiers().contains(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            renderClassKindPrefix(classDescriptor, sb);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(classDescriptor2)) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            renderName(classDescriptor2, sb, true);
        } else {
            renderCompanionObjectName(classDescriptor2, sb);
        }
        if (z) {
            return;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredTypeParameters, "klass.declaredTypeParameters");
        renderTypeParameters(declaredTypeParameters, sb, false);
        renderCapturedTypeParametersIfRequired(classDescriptor, sb);
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind2 = classDescriptor.getKind();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind2, "klass.kind");
        if (!kind2.isSingleton() && getClassWithPrimaryConstructor() && (classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor = classDescriptor.mo1262getUnsubstitutedPrimaryConstructor()) != null) {
            sb.append(" ");
            renderAnnotations$default(this, sb, classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor, null, 2, null);
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2 = classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor.getVisibility();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility2, "primaryConstructor.visibility");
            renderVisibility(visibility2, sb);
            sb.append(renderKeyword("constructor"));
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "primaryConstructor.valueParameters");
            renderValueParameters(valueParameters, classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb);
        }
        renderSuperTypes(classDescriptor, sb);
        renderWhereSuffix(declaredTypeParameters, sb);
    }

    private final void renderSuperTypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.StringBuilder sb) {
        if (getWithoutSuperTypes() || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "klass.typeConstructor");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "klass.typeConstructor.supertypes");
        if (collectionMo1269getSupertypes.isEmpty()) {
            return;
        }
        if (collectionMo1269getSupertypes.size() == 1 && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAnyOrNullableAny(collectionMo1269getSupertypes.iterator().next())) {
            return;
        }
        renderSpaceIfNeeded(sb);
        sb.append(": ");
        kotlin.collections.CollectionsKt.joinTo(collectionMo1269getSupertypes, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) != 0 ? "" : null, (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.renderSuperTypes.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType it) {
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                return descriptorRendererImpl.renderType(it);
            }
        });
    }

    private final void renderClassKindPrefix(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.StringBuilder sb) {
        sb.append(renderKeyword(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageView(kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor, java.lang.StringBuilder sb) {
        renderPackageHeader(packageViewDescriptor.getFqName(), "package", sb);
        if (getDebugMode()) {
            sb.append(" in context of ");
            renderName(packageViewDescriptor.getModule(), sb, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderPackageFragment(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, java.lang.StringBuilder sb) {
        renderPackageHeader(packageFragmentDescriptor.getFqName(), "package-fragment", sb);
        if (getDebugMode()) {
            sb.append(" in ");
            renderName(packageFragmentDescriptor.getContainingDeclaration(), sb, false);
        }
    }

    private final void renderPackageHeader(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str, java.lang.StringBuilder sb) {
        sb.append(renderKeyword(str));
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = fqName.toUnsafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe, "fqName.toUnsafe()");
        java.lang.String strRenderFqName = renderFqName(unsafe);
        if (strRenderFqName.length() > 0) {
            sb.append(" ");
            sb.append(strRenderFqName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderAccessorModifiers(kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor, java.lang.StringBuilder sb) {
        renderMemberModifiers(propertyAccessorDescriptor, sb);
    }

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    private final class RenderDeclarationDescriptorVisitor implements kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<kotlin.Unit, java.lang.StringBuilder> {

        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                iArr[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                iArr[kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitClassDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.lang.StringBuilder sb) {
            visitClassDescriptor2(classDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, java.lang.StringBuilder sb) {
            visitConstructorDescriptor2(constructorDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.StringBuilder sb) {
            visitFunctionDescriptor2(functionDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitModuleDeclaration(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, java.lang.StringBuilder sb) {
            visitModuleDeclaration2(moduleDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitPackageFragmentDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor, java.lang.StringBuilder sb) {
            visitPackageFragmentDescriptor2(packageFragmentDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitPackageViewDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor, java.lang.StringBuilder sb) {
            visitPackageViewDescriptor2(packageViewDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitPropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.StringBuilder sb) {
            visitPropertyDescriptor2(propertyDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitPropertyGetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor propertyGetterDescriptor, java.lang.StringBuilder sb) {
            visitPropertyGetterDescriptor2(propertyGetterDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitPropertySetterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor propertySetterDescriptor, java.lang.StringBuilder sb) {
            visitPropertySetterDescriptor2(propertySetterDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitReceiverParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor, java.lang.StringBuilder sb) {
            visitReceiverParameterDescriptor2(receiverParameterDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitTypeAliasDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.lang.StringBuilder sb) {
            visitTypeAliasDescriptor2(typeAliasDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, java.lang.StringBuilder sb) {
            visitTypeParameterDescriptor2(typeParameterDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ kotlin.Unit visitValueParameterDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor, java.lang.StringBuilder sb) {
            visitValueParameterDescriptor2(valueParameterDescriptor, sb);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: visitValueParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitValueParameterDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderValueParameter(descriptor, true, builder, true);
        }

        /* JADX INFO: renamed from: visitPropertyDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderProperty(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPropertyGetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertyGetterDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            visitPropertyAccessorDescriptor(descriptor, builder, "getter");
        }

        /* JADX INFO: renamed from: visitPropertySetterDescriptor, reason: avoid collision after fix types in other method */
        public void visitPropertySetterDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            visitPropertyAccessorDescriptor(descriptor, builder, "setter");
        }

        private final void visitPropertyAccessorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor propertyAccessorDescriptor, java.lang.StringBuilder sb, java.lang.String str) {
            int i = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.RenderDeclarationDescriptorVisitor.WhenMappings.$EnumSwitchMapping$0[kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                visitFunctionDescriptor2((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) propertyAccessorDescriptor, sb);
                return;
            }
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderAccessorModifiers(propertyAccessorDescriptor, sb);
            sb.append(str + " for ");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl descriptorRendererImpl = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this;
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(correspondingProperty, "descriptor.correspondingProperty");
            descriptorRendererImpl.renderProperty(correspondingProperty, sb);
        }

        /* JADX INFO: renamed from: visitFunctionDescriptor, reason: avoid collision after fix types in other method */
        public void visitFunctionDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderFunction(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitReceiverParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitReceiverParameterDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            builder.append(descriptor.getName());
        }

        /* JADX INFO: renamed from: visitConstructorDescriptor, reason: avoid collision after fix types in other method */
        public void visitConstructorDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructorDescriptor, "constructorDescriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderConstructor(constructorDescriptor, builder);
        }

        /* JADX INFO: renamed from: visitTypeParameterDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeParameterDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderTypeParameter(descriptor, builder, true);
        }

        /* JADX INFO: renamed from: visitPackageFragmentDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageFragmentDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderPackageFragment(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitPackageViewDescriptor, reason: avoid collision after fix types in other method */
        public void visitPackageViewDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderPackageView(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitModuleDeclaration, reason: avoid collision after fix types in other method */
        public void visitModuleDeclaration2(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderName(descriptor, builder, true);
        }

        /* JADX INFO: renamed from: visitClassDescriptor, reason: avoid collision after fix types in other method */
        public void visitClassDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderClass(descriptor, builder);
        }

        /* JADX INFO: renamed from: visitTypeAliasDescriptor, reason: avoid collision after fix types in other method */
        public void visitTypeAliasDescriptor2(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor descriptor, java.lang.StringBuilder builder) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builder, "builder");
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.this.renderTypeAlias(descriptor, builder);
        }
    }

    private final void renderSpaceIfNeeded(java.lang.StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final java.lang.String replacePrefixes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (kotlin.text.StringsKt.startsWith$default(str, str2, false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.startsWith$default(str3, str4, false, 2, (java.lang.Object) null)) {
            int length = str2.length();
            if (str == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String strSubstring = str.substring(length);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
            int length2 = str4.length();
            if (str3 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String strSubstring2 = str3.substring(length2);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            java.lang.String str6 = str5 + strSubstring;
            if (kotlin.jvm.internal.Intrinsics.areEqual(strSubstring, strSubstring2)) {
                return str6;
            }
            if (differsOnlyInNullability(strSubstring, strSubstring2)) {
                return str6 + "!";
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x0034, please report this as an issue */
    private final boolean differsOnlyInNullability(java.lang.String str, java.lang.String str2) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, kotlin.text.StringsKt.replace$default(str2, "?", "", false, 4, (java.lang.Object) null))) {
            if (kotlin.text.StringsKt.endsWith$default(str2, "?", false, 2, (java.lang.Object) null)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(str + '?', str2)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual('(' + str + ")?", str2)) {
                        return false;
                    }
                }
            } else {
                if (kotlin.jvm.internal.Intrinsics.areEqual('(' + str + ")?", str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean overridesSomething(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }
}
