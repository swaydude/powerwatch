package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaResolverCache {
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache EMPTY = new kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache.1
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i) {
                case 1:
                    objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD;
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassResolvedFromSource(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            if (fqName != null) {
                return null;
            }
            $$$reportNull$$$0(0);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordClass(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
            if (javaClass == null) {
                $$$reportNull$$$0(7);
            }
            if (classDescriptor == null) {
                $$$reportNull$$$0(8);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordConstructor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor) {
            if (javaElement == null) {
                $$$reportNull$$$0(3);
            }
            if (constructorDescriptor == null) {
                $$$reportNull$$$0(4);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordField(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
            if (javaField == null) {
                $$$reportNull$$$0(5);
            }
            if (propertyDescriptor == null) {
                $$$reportNull$$$0(6);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void recordMethod(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor) {
            if (javaMethod == null) {
                $$$reportNull$$$0(1);
            }
            if (simpleFunctionDescriptor == null) {
                $$$reportNull$$$0(2);
            }
        }
    };

    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassResolvedFromSource(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    void recordClass(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor);

    void recordConstructor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement javaElement, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor constructorDescriptor);

    void recordField(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField javaField, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor);

    void recordMethod(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor);
}
