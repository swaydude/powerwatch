package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KClassImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "T", "", "invoke"}, k = 3, mv = {1, 1, 15})
final class KClassImpl$Data$supertypes$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.KTypeImpl>> {
    final /* synthetic */ kotlin.reflect.jvm.internal.KClassImpl.Data this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KClassImpl$Data$supertypes$2(kotlin.reflect.jvm.internal.KClassImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.List<? extends kotlin.reflect.jvm.internal.KTypeImpl> invoke() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.this$0.getDescriptor().getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "descriptor.typeConstructor");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = typeConstructor.mo1269getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "descriptor.typeConstructor.supertypes");
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionMo1269getSupertypes.size());
        for (final kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : collectionMo1269getSupertypes) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinType, "kotlinType");
            arrayList.add(new kotlin.reflect.jvm.internal.KTypeImpl(kotlinType, new kotlin.jvm.functions.Function0<java.lang.reflect.Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.reflect.Type invoke() {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
                    if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptorMo1268getDeclarationDescriptor);
                    }
                    java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor);
                    if (javaClass == null) {
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Unsupported superclass of " + this.this$0 + ": " + classifierDescriptorMo1268getDeclarationDescriptor);
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().getSuperclass(), javaClass)) {
                        java.lang.reflect.Type genericSuperclass = kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().getGenericSuperclass();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericSuperclass, "jClass.genericSuperclass");
                        return genericSuperclass;
                    }
                    java.lang.Class<?>[] interfaces = kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().getInterfaces();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(interfaces, "jClass.interfaces");
                    int iIndexOf = kotlin.collections.ArraysKt.indexOf(interfaces, javaClass);
                    if (iIndexOf < 0) {
                        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("No superclass of " + this.this$0 + " in Java reflection for " + classifierDescriptorMo1268getDeclarationDescriptor);
                    }
                    java.lang.reflect.Type type = kotlin.reflect.jvm.internal.KClassImpl.this.getJClass().getGenericInterfaces()[iIndexOf];
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "jClass.genericInterfaces[index]");
                    return type;
                }
            }));
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isSpecialClassWithNoSupertypes(this.this$0.getDescriptor())) {
            java.util.ArrayList arrayList3 = arrayList;
            boolean z = false;
            if ((arrayList3 instanceof java.util.Collection) && arrayList3.isEmpty()) {
                z = true;
                break;
            }
            java.util.Iterator it = arrayList3.iterator();
            do {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorForType = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getClassDescriptorForType(((kotlin.reflect.jvm.internal.KTypeImpl) it.next()).getType());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classDescriptorForType, "DescriptorUtils.getClassDescriptorForType(it.type)");
                kind = classDescriptorForType.getKind();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kind, "DescriptorUtils.getClass…ptorForType(it.type).kind");
            } while (kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS);
            if (z) {
                kotlin.reflect.jvm.internal.impl.types.SimpleType anyType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(this.this$0.getDescriptor()).getAnyType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(anyType, "descriptor.builtIns.anyType");
                arrayList2.add(new kotlin.reflect.jvm.internal.KTypeImpl(anyType, new kotlin.jvm.functions.Function0<java.lang.Class<java.lang.Object>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Class<java.lang.Object> invoke() {
                        return java.lang.Object.class;
                    }
                }));
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(arrayList);
    }
}
