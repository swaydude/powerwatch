package kotlin.reflect.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectProperties {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static abstract class Val<T> {
        private static final java.lang.Object NULL_VALUE = new java.lang.Object() { // from class: kotlin.reflect.jvm.internal.ReflectProperties.Val.1
        };

        public abstract T invoke();

        public final T getValue(java.lang.Object obj, java.lang.Object obj2) {
            return invoke();
        }

        protected java.lang.Object escape(T t) {
            return t == null ? NULL_VALUE : t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T unescape(java.lang.Object obj) {
            if (obj == NULL_VALUE) {
                return null;
            }
            return obj;
        }
    }

    public static class LazyVal<T> extends kotlin.reflect.jvm.internal.ReflectProperties.Val<T> {
        private final kotlin.jvm.functions.Function0<T> initializer;
        private java.lang.Object value;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        public LazyVal(kotlin.jvm.functions.Function0<T> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(0);
            }
            this.value = null;
            this.initializer = function0;
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val
        public T invoke() {
            java.lang.Object obj = this.value;
            if (obj != null) {
                return unescape(obj);
            }
            T tInvoke = this.initializer.invoke();
            this.value = escape(tInvoke);
            return tInvoke;
        }
    }

    public static class LazySoftVal<T> extends kotlin.reflect.jvm.internal.ReflectProperties.Val<T> {
        private final kotlin.jvm.functions.Function0<T> initializer;
        private java.lang.ref.SoftReference<java.lang.Object> value;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        public LazySoftVal(T t, kotlin.jvm.functions.Function0<T> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(0);
            }
            this.value = null;
            this.initializer = function0;
            if (t != null) {
                this.value = new java.lang.ref.SoftReference<>(escape(t));
            }
        }

        @Override // kotlin.reflect.jvm.internal.ReflectProperties.Val
        public T invoke() {
            java.lang.Object obj;
            java.lang.ref.SoftReference<java.lang.Object> softReference = this.value;
            if (softReference != null && (obj = softReference.get()) != null) {
                return unescape(obj);
            }
            T tInvoke = this.initializer.invoke();
            this.value = new java.lang.ref.SoftReference<>(escape(tInvoke));
            return tInvoke;
        }
    }

    public static <T> kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<T> lazy(kotlin.jvm.functions.Function0<T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(0);
        }
        return new kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<>(function0);
    }

    public static <T> kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<T> lazySoft(T t, kotlin.jvm.functions.Function0<T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(1);
        }
        return new kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<>(t, function0);
    }

    public static <T> kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<T> lazySoft(kotlin.jvm.functions.Function0<T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(2);
        }
        return lazySoft(null, function0);
    }
}
