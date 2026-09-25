package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: loaded from: classes2.dex */
public class WrappedValues {
    private static final java.lang.Object NULL_VALUE = new java.lang.Object() { // from class: kotlin.reflect.jvm.internal.impl.utils.WrappedValues.1
        public java.lang.String toString() {
            return "NULL_VALUE";
        }
    };
    public static volatile boolean throwWrappedProcessCanceledException = false;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private static final class ThrowableWrapper {
        private final java.lang.Throwable throwable;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i == 1) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        private ThrowableWrapper(java.lang.Throwable th) {
            if (th == null) {
                $$$reportNull$$$0(0);
            }
            this.throwable = th;
        }

        public java.lang.Throwable getThrowable() {
            java.lang.Throwable th = this.throwable;
            if (th == null) {
                $$$reportNull$$$0(1);
            }
            return th;
        }

        public java.lang.String toString() {
            return this.throwable.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeNull(java.lang.Object obj) {
        if (obj == 0) {
            $$$reportNull$$$0(0);
        }
        if (obj == NULL_VALUE) {
            return null;
        }
        return obj;
    }

    public static <V> java.lang.Object escapeNull(V v) {
        if (v != null) {
            if (v == null) {
                $$$reportNull$$$0(2);
            }
            return v;
        }
        java.lang.Object obj = NULL_VALUE;
        if (obj == null) {
            $$$reportNull$$$0(1);
        }
        return obj;
    }

    public static java.lang.Object escapeThrowable(java.lang.Throwable th) {
        if (th == null) {
            $$$reportNull$$$0(3);
        }
        return new kotlin.reflect.jvm.internal.impl.utils.WrappedValues.ThrowableWrapper(th);
    }

    public static <V> V unescapeExceptionOrNull(java.lang.Object obj) {
        if (obj == null) {
            $$$reportNull$$$0(4);
        }
        return (V) unescapeNull(unescapeThrowable(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeThrowable(java.lang.Object obj) {
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.utils.WrappedValues.ThrowableWrapper)) {
            return obj;
        }
        java.lang.Throwable throwable = ((kotlin.reflect.jvm.internal.impl.utils.WrappedValues.ThrowableWrapper) obj).getThrowable();
        if (throwWrappedProcessCanceledException && kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(throwable)) {
            throw new kotlin.reflect.jvm.internal.impl.utils.WrappedValues.WrappedProcessCanceledException(throwable);
        }
        throw kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.rethrow(throwable);
    }

    public static class WrappedProcessCanceledException extends java.lang.RuntimeException {
        public WrappedProcessCanceledException(java.lang.Throwable th) {
            super("Rethrow stored exception", th);
        }
    }
}
