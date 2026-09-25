package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX INFO: compiled from: RawType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RawTypeImpl extends kotlin.reflect.jvm.internal.impl.types.FlexibleType implements kotlin.reflect.jvm.internal.impl.types.RawType {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$1, reason: invalid class name */
    /* JADX INFO: compiled from: RawType.kt */
    static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.Boolean> {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass1 INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.String str, java.lang.String str2) {
            return java.lang.Boolean.valueOf(invoke2(str, str2));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2(java.lang.String first, java.lang.String second) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(first, "first");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(second, "second");
            return kotlin.jvm.internal.Intrinsics.areEqual(first, kotlin.text.StringsKt.removePrefix(second, (java.lang.CharSequence) "out ")) || kotlin.jvm.internal.Intrinsics.areEqual(second, "*");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound, kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "lowerBound");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "upperBound");
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(lowerBound, upperBound);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return getLowerBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = getConstructor().mo1268getDeclarationDescriptor();
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            classifierDescriptorMo1268getDeclarationDescriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
        if (classDescriptor == null) {
            throw new java.lang.IllegalStateException(("Incorrect classifier: " + getConstructor().mo1268getDeclarationDescriptor()).toString());
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = classDescriptor.getMemberScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScope, "classDescriptor.getMemberScope(RawSubstitution)");
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(getLowerBound().replaceAnnotations(newAnnotations), getUpperBound().replaceAnnotations(newAnnotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl makeNullableAsSpecified(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public java.lang.String render(final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer renderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions options) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(renderer, "renderer");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(options, "options");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass1 anonymousClass1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass1.INSTANCE;
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.List<? extends java.lang.String>> function1 = new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.List<? extends java.lang.String>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.render.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.List<java.lang.String> invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = type.getArguments();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
                java.util.Iterator<T> it = arguments.iterator();
                while (it.hasNext()) {
                    arrayList.add(renderer.renderTypeProjection((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()));
                }
                return arrayList;
            }
        };
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass3 anonymousClass3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass3.INSTANCE;
        java.lang.String strRenderType = renderer.renderType(getLowerBound());
        java.lang.String strRenderType2 = renderer.renderType(getUpperBound());
        if (options.getDebugMode()) {
            return "raw (" + strRenderType + ".." + strRenderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return renderer.renderFlexibleType(strRenderType, strRenderType2, kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this));
        }
        java.util.List<java.lang.String> listInvoke = function1.invoke((kotlin.reflect.jvm.internal.impl.types.KotlinType) getLowerBound());
        java.util.List<java.lang.String> listInvoke2 = function1.invoke((kotlin.reflect.jvm.internal.impl.types.KotlinType) getUpperBound());
        java.util.List<java.lang.String> list = listInvoke;
        java.lang.String strJoinToString$default = kotlin.collections.CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(java.lang.String it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return "(raw) " + it;
            }
        }, 30, null);
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(list, listInvoke2);
        boolean z = true;
        if (!(listZip instanceof java.util.Collection) || !listZip.isEmpty()) {
            for (kotlin.Pair pair : listZip) {
                if (!kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass1.INSTANCE.invoke2((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            strRenderType2 = anonymousClass3.invoke(strRenderType2, strJoinToString$default);
        }
        java.lang.String strInvoke = anonymousClass3.invoke(strRenderType, strJoinToString$default);
        return kotlin.jvm.internal.Intrinsics.areEqual(strInvoke, strRenderType2) ? strInvoke : renderer.renderFlexibleType(strInvoke, strRenderType2, kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this));
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$3, reason: invalid class name */
    /* JADX INFO: compiled from: RawType.kt */
    static final class AnonymousClass3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.String> {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass3 INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.AnonymousClass3();

        AnonymousClass3() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.String invoke(java.lang.String replaceArgs, java.lang.String newArgs) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replaceArgs, "$this$replaceArgs");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newArgs, "newArgs");
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) replaceArgs, kotlin.text.Typography.less, false, 2, (java.lang.Object) null)) {
                return replaceArgs;
            }
            return kotlin.text.StringsKt.substringBefore$default(replaceArgs, kotlin.text.Typography.less, (java.lang.String) null, 2, (java.lang.Object) null) + kotlin.text.Typography.less + newArgs + kotlin.text.Typography.greater + kotlin.text.StringsKt.substringAfterLast$default(replaceArgs, kotlin.text.Typography.greater, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }
}
