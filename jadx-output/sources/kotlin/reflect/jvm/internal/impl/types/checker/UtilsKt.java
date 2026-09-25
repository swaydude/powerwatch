package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType subtype, kotlin.reflect.jvm.internal.impl.types.KotlinType supertype, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subtype, "subtype");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertype, "supertype");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.add(new kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode(subtype, null));
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = supertype.getConstructor();
        while (!arrayDeque.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode subtypePathNode = (kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode) arrayDeque.poll();
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = subtypePathNode.getType();
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor2 = type.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = type.isMarkedNullable();
                for (kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode previous = subtypePathNode.getPrevious(); previous != null; previous = previous.getPrevious()) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = previous.getType();
                    java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = type2.getArguments();
                    if (!(arguments instanceof java.util.Collection) || !arguments.isEmpty()) {
                        java.util.Iterator<T> it = arguments.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            if (((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    if (z) {
                        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeSafeSubstitute = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(type2), false, 1, null).buildSubstitutor().safeSubstitute(type, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeSafeSubstitute, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        type = approximate(kotlinTypeSafeSubstitute);
                    } else {
                        type = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(type2).buildSubstitutor().safeSubstitute(type, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                    }
                    zIsMarkedNullable = zIsMarkedNullable || type2.isMarkedNullable();
                }
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor3 = type.getConstructor();
                if (!typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    throw new java.lang.AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + debugInfo(constructor3) + ", \n\nsupertype: " + debugInfo(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
                }
                return kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified(type, zIsMarkedNullable);
            }
            for (kotlin.reflect.jvm.internal.impl.types.KotlinType immediateSupertype : constructor2.mo1269getSupertypes()) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode(immediateSupertype, subtypePathNode));
            }
        }
        return null;
    }

    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType approximate(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final java.lang.String debugInfo(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.jvm.functions.Function1<java.lang.String, java.lang.StringBuilder> function1 = new kotlin.jvm.functions.Function1<java.lang.String, java.lang.StringBuilder>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.UtilsKt$debugInfo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.StringBuilder invoke(java.lang.String unaryPlus) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(unaryPlus, "$this$unaryPlus");
                java.lang.StringBuilder sb2 = sb;
                sb2.append(unaryPlus);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(sb2, "append(value)");
                return kotlin.text.StringsKt.appendln(sb2);
            }
        };
        function1.invoke("type: " + typeConstructor);
        function1.invoke("hashCode: " + typeConstructor.hashCode());
        function1.invoke("javaClass: " + typeConstructor.getClass().getCanonicalName());
        for (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = typeConstructor.mo1268getDeclarationDescriptor(); classifierDescriptorMo1268getDeclarationDescriptor != null; classifierDescriptorMo1268getDeclarationDescriptor = classifierDescriptorMo1268getDeclarationDescriptor.getContainingDeclaration()) {
            function1.invoke("fqName: " + kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.FQ_NAMES_IN_TYPES.render(classifierDescriptorMo1268getDeclarationDescriptor));
            function1.invoke("javaClass: " + classifierDescriptorMo1268getDeclarationDescriptor.getClass().getCanonicalName());
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
