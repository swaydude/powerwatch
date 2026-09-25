package kotlin.reflect.jvm.internal.calls;

/* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\u0010\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u0014²\u0006\u0014\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002²\u0006\u0014\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"createAnnotationInstance", "T", "", "annotationClass", "Ljava/lang/Class;", "values", "", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflection", "hashCode", "toString"}, k = 2, mv = {1, 1, 15})
public final class AnnotationConstructorCallerKt {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.class, "kotlin-reflection"), "hashCode", "<v#0>")), kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinPackage(kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.class, "kotlin-reflection"), "toString", "<v#1>"))};

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object transformKotlinToJvm(java.lang.Object obj, java.lang.Class<?> cls) {
        if (obj instanceof java.lang.Class) {
            return null;
        }
        if (obj instanceof kotlin.reflect.KClass) {
            obj = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) obj);
        } else if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr instanceof java.lang.Class[]) {
                return null;
            }
            if (!(objArr instanceof kotlin.reflect.KClass[])) {
                obj = objArr;
            } else {
                if (obj == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                }
                kotlin.reflect.KClass[] kClassArr = (kotlin.reflect.KClass[]) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kClassArr.length);
                for (kotlin.reflect.KClass kClass : kClassArr) {
                    arrayList.add(kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass));
                }
                obj = arrayList.toArray(new java.lang.Class[0]);
                if (obj == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void throwIllegalArgumentType(int i, java.lang.String str, java.lang.Class<?> cls) {
        kotlin.reflect.KClass kotlinClass;
        java.lang.String qualifiedName;
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Class.class)) {
            kotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.KClass.class);
        } else if (cls.isArray() && kotlin.jvm.internal.Intrinsics.areEqual(cls.getComponentType(), java.lang.Class.class)) {
            kotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.KClass[].class);
        } else {
            kotlinClass = kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kotlinClass.getQualifiedName(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object[].class).getQualifiedName())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlinClass.getQualifiedName());
            sb.append(kotlin.text.Typography.less);
            java.lang.Class<?> componentType = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlinClass).getComponentType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(componentType, "kotlinClass.java.componentType");
            sb.append(kotlin.jvm.JvmClassMappingKt.getKotlinClass(componentType).getQualifiedName());
            sb.append(kotlin.text.Typography.greater);
            qualifiedName = sb.toString();
        } else {
            qualifiedName = kotlinClass.getQualifiedName();
        }
        throw new java.lang.IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + qualifiedName);
    }

    public static /* synthetic */ java.lang.Object createAnnotationInstance$default(java.lang.Class cls, java.util.Map map, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            java.util.Set setKeySet = map.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            java.util.Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((java.lang.String) it.next(), new java.lang.Class[0]));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    public static final <T> T createAnnotationInstance(final java.lang.Class<T> annotationClass, final java.util.Map<java.lang.String, ? extends java.lang.Object> values, java.util.List<java.lang.reflect.Method> methods) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationClass, "annotationClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(values, "values");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(methods, "methods");
        final kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.AnonymousClass2 anonymousClass2 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.AnonymousClass2(annotationClass, methods, values);
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ java.lang.Integer invoke() {
                return java.lang.Integer.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final int invoke2() {
                int iHashCode;
                int iHashCode2 = 0;
                for (java.util.Map.Entry entry : values.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = java.util.Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = java.util.Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = java.util.Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = java.util.Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = java.util.Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = java.util.Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = java.util.Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = java.util.Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof java.lang.Object[] ? java.util.Arrays.hashCode((java.lang.Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * kotlinx.coroutines.scheduling.WorkQueueKt.MASK);
                }
                return iHashCode2;
            }
        });
        kotlin.reflect.KProperty[] kPropertyArr = $$delegatedProperties;
        final kotlin.reflect.KProperty kProperty = kPropertyArr[0];
        final kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.String invoke() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append('@');
                sb.append(annotationClass.getCanonicalName());
                kotlin.collections.CollectionsKt.joinTo(values.entrySet(), sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) != 0 ? "" : ")", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : new kotlin.jvm.functions.Function1<java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.Object>, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.String invoke(java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.Object> entry) {
                        return invoke2((java.util.Map.Entry<java.lang.String, ? extends java.lang.Object>) entry);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final java.lang.String invoke2(java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry) {
                        java.lang.String string;
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(entry, "entry");
                        java.lang.String key = entry.getKey();
                        java.lang.Object value = entry.getValue();
                        if (value instanceof boolean[]) {
                            string = java.util.Arrays.toString((boolean[]) value);
                        } else if (value instanceof char[]) {
                            string = java.util.Arrays.toString((char[]) value);
                        } else if (value instanceof byte[]) {
                            string = java.util.Arrays.toString((byte[]) value);
                        } else if (value instanceof short[]) {
                            string = java.util.Arrays.toString((short[]) value);
                        } else if (value instanceof int[]) {
                            string = java.util.Arrays.toString((int[]) value);
                        } else if (value instanceof float[]) {
                            string = java.util.Arrays.toString((float[]) value);
                        } else if (value instanceof long[]) {
                            string = java.util.Arrays.toString((long[]) value);
                        } else if (value instanceof double[]) {
                            string = java.util.Arrays.toString((double[]) value);
                        } else {
                            string = value instanceof java.lang.Object[] ? java.util.Arrays.toString((java.lang.Object[]) value) : value.toString();
                        }
                        return key + '=' + string;
                    }
                });
                java.lang.String string = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
        });
        final kotlin.reflect.KProperty kProperty2 = kPropertyArr[1];
        T t = (T) java.lang.reflect.Proxy.newProxyInstance(annotationClass.getClassLoader(), new java.lang.Class[]{annotationClass}, new java.lang.reflect.InvocationHandler() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$result$1
            @Override // java.lang.reflect.InvocationHandler
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(method, "method");
                java.lang.String name = method.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    if (iHashCode != -1776922004) {
                        if (iHashCode != 147696667) {
                            if (iHashCode == 1444986633 && name.equals("annotationType")) {
                                return annotationClass;
                            }
                        } else if (name.equals("hashCode")) {
                            return lazy.getValue();
                        }
                    } else if (name.equals("toString")) {
                        return lazy2.getValue();
                    }
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(name, "equals") && objArr != null && objArr.length == 1) {
                    return java.lang.Boolean.valueOf(anonymousClass2.invoke2(kotlin.collections.ArraysKt.single(objArr)));
                }
                if (values.containsKey(name)) {
                    return values.get(name);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Method is not supported: ");
                sb.append(method);
                sb.append(" (args: ");
                if (objArr == null) {
                    objArr = new java.lang.Object[0];
                }
                sb.append(kotlin.collections.ArraysKt.toList(objArr));
                sb.append(')');
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            }
        });
        if (t != null) {
            return t;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type T");
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"equals", "", "T", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "invoke"}, k = 3, mv = {1, 1, 15})
    static final class AnonymousClass2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> {
        final /* synthetic */ java.lang.Class $annotationClass;
        final /* synthetic */ java.util.List $methods;
        final /* synthetic */ java.util.Map $values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(java.lang.Class cls, java.util.List list, java.util.Map map) {
            super(1);
            this.$annotationClass = cls;
            this.$methods = list;
            this.$values = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(invoke2(obj));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            boolean zAreEqual;
            boolean z;
            kotlin.reflect.KClass annotationClass;
            java.lang.Class javaClass = null;
            java.lang.annotation.Annotation annotation = (java.lang.annotation.Annotation) (!(obj instanceof java.lang.annotation.Annotation) ? null : obj);
            if (annotation != null && (annotationClass = kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation)) != null) {
                javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(annotationClass);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(javaClass, this.$annotationClass)) {
                java.util.List<java.lang.reflect.Method> list = this.$methods;
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    z = true;
                } else {
                    for (java.lang.reflect.Method method : list) {
                        java.lang.Object obj2 = this.$values.get(method.getName());
                        java.lang.Object objInvoke = method.invoke(obj, new java.lang.Object[0]);
                        if (obj2 instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.BooleanArray");
                            }
                            zAreEqual = java.util.Arrays.equals(zArr, (boolean[]) objInvoke);
                        } else if (obj2 instanceof char[]) {
                            char[] cArr = (char[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.CharArray");
                            }
                            zAreEqual = java.util.Arrays.equals(cArr, (char[]) objInvoke);
                        } else if (obj2 instanceof byte[]) {
                            byte[] bArr = (byte[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                            zAreEqual = java.util.Arrays.equals(bArr, (byte[]) objInvoke);
                        } else if (obj2 instanceof short[]) {
                            short[] sArr = (short[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.ShortArray");
                            }
                            zAreEqual = java.util.Arrays.equals(sArr, (short[]) objInvoke);
                        } else if (obj2 instanceof int[]) {
                            int[] iArr = (int[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
                            }
                            zAreEqual = java.util.Arrays.equals(iArr, (int[]) objInvoke);
                        } else if (obj2 instanceof float[]) {
                            float[] fArr = (float[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.FloatArray");
                            }
                            zAreEqual = java.util.Arrays.equals(fArr, (float[]) objInvoke);
                        } else if (obj2 instanceof long[]) {
                            long[] jArr = (long[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.LongArray");
                            }
                            zAreEqual = java.util.Arrays.equals(jArr, (long[]) objInvoke);
                        } else if (obj2 instanceof double[]) {
                            double[] dArr = (double[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.DoubleArray");
                            }
                            zAreEqual = java.util.Arrays.equals(dArr, (double[]) objInvoke);
                        } else if (obj2 instanceof java.lang.Object[]) {
                            java.lang.Object[] objArr = (java.lang.Object[]) obj2;
                            if (objInvoke == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                            }
                            zAreEqual = java.util.Arrays.equals(objArr, (java.lang.Object[]) objInvoke);
                        } else {
                            zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(obj2, objInvoke);
                        }
                        if (!zAreEqual) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }
}
