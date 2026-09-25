package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:H\u0096\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020'H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000202018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\f¨\u0006B"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructors", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "getConstructors", "()Ljava/util/List;", "element", "getElement", "()Ljava/lang/Class;", "fields", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "getFields", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "innerClassNames", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getInnerClassNames", "isAnnotationType", "", "()Z", "isEnum", "isInterface", "lightClassOriginKind", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "methods", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "getMethods", "modifiers", "", "getModifiers", "()I", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "()Lorg/jetbrains/kotlin/name/Name;", "outerClass", "getOuterClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "supertypes", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "getSupertypes", "()Ljava/util/Collection;", "typeParameters", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "findInnerClass", "hashCode", "isEnumValuesOrValueOf", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaClass extends kotlin.reflect.jvm.internal.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass, kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner {
    private final java.lang.Class<?> klass;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation> getAnnotations() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.getVisibility(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.isAbstract(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.isFinal(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.isStatic(this);
    }

    public ReflectJavaClass(java.lang.Class<?> klass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
        this.klass = klass;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner
    public java.lang.Class<?> getElement() {
        return this.klass;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.klass.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getInnerClassNames() {
        java.lang.Class<?>[] declaredClasses = this.klass.getDeclaredClasses();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredClasses, "klass.declaredClasses");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.filterNot(kotlin.collections.ArraysKt.asSequence(declaredClasses), new kotlin.jvm.functions.Function1<java.lang.Class<?>, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$innerClassNames$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Class<?> cls) {
                return java.lang.Boolean.valueOf(invoke2(cls));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(java.lang.Class<?> it) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                java.lang.String simpleName = it.getSimpleName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleName, "it.simpleName");
                return simpleName.length() == 0;
            }
        }), new kotlin.jvm.functions.Function1<java.lang.Class<?>, kotlin.reflect.jvm.internal.impl.name.Name>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$innerClassNames$2
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.name.Name invoke(java.lang.Class<?> it) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                java.lang.String simpleName = it.getSimpleName();
                if (!kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return kotlin.reflect.jvm.internal.impl.name.Name.identifier(simpleName);
                }
                return null;
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(this.klass).asSingleFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "klass.classId.asSingleFqName()");
        return fqNameAsSingleFqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public kotlin.reflect.jvm.internal.structure.ReflectJavaClass getOuterClass() {
        java.lang.Class<?> declaringClass = this.klass.getDeclaringClass();
        if (declaringClass != null) {
            return new kotlin.reflect.jvm.internal.structure.ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> getSupertypes() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.klass, java.lang.Object.class)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        java.lang.Class genericSuperclass = this.klass.getGenericSuperclass();
        if (genericSuperclass == null) {
        }
        spreadBuilder.add(genericSuperclass);
        java.lang.reflect.Type[] genericInterfaces = this.klass.getGenericInterfaces();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericInterfaces, "klass.genericInterfaces");
        spreadBuilder.addSpread(genericInterfaces);
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf(spreadBuilder.toArray(new java.lang.reflect.Type[spreadBuilder.size()]));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        java.util.Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.structure.ReflectJavaClassifierType((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaMethod> getMethods() {
        java.lang.reflect.Method[] declaredMethods = this.klass.getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredMethods, "klass.declaredMethods");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filter(kotlin.collections.ArraysKt.asSequence(declaredMethods), new kotlin.jvm.functions.Function1<java.lang.reflect.Method, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$methods$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.reflect.Method method) {
                return java.lang.Boolean.valueOf(invoke2(method));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(java.lang.reflect.Method method) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(method, "method");
                return (method.isSynthetic() || (this.this$0.isEnum() && this.this$0.isEnumValuesOrValueOf(method))) ? false : true;
            }
        }), kotlin.reflect.jvm.internal.structure.ReflectJavaClass$methods$2.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEnumValuesOrValueOf(java.lang.reflect.Method method) {
        java.lang.String name = method.getName();
        if (name == null) {
            return false;
        }
        int iHashCode = name.hashCode();
        if (iHashCode != -823812830) {
            if (iHashCode == 231605032 && name.equals("valueOf")) {
                return java.util.Arrays.equals(method.getParameterTypes(), new java.lang.Class[]{java.lang.String.class});
            }
            return false;
        }
        if (!name.equals("values")) {
            return false;
        }
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterTypes, "method.parameterTypes");
        return parameterTypes.length == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaField> getFields() {
        java.lang.reflect.Field[] declaredFields = this.klass.getDeclaredFields();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredFields, "klass.declaredFields");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filterNot(kotlin.collections.ArraysKt.asSequence(declaredFields), kotlin.reflect.jvm.internal.structure.ReflectJavaClass$fields$1.INSTANCE), kotlin.reflect.jvm.internal.structure.ReflectJavaClass$fields$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor> getConstructors() {
        java.lang.reflect.Constructor<?>[] declaredConstructors = this.klass.getDeclaredConstructors();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredConstructors, "klass.declaredConstructors");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filterNot(kotlin.collections.ArraysKt.asSequence(declaredConstructors), kotlin.reflect.jvm.internal.structure.ReflectJavaClass$constructors$1.INSTANCE), kotlin.reflect.jvm.internal.structure.ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(this.klass.getSimpleName());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(klass.simpleName)");
        return nameIdentifier;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = this.klass.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "klass.typeParameters");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.Class<?>> typeVariable : typeParameters) {
            arrayList.add(new kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.klass.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isAnnotationType() {
        return this.klass.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.klass.isEnum();
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.klass, ((kotlin.reflect.jvm.internal.structure.ReflectJavaClass) other).klass);
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + this.klass;
    }
}
