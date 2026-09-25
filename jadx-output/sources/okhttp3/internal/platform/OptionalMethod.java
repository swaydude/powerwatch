package okhttp3.internal.platform;

/* JADX INFO: loaded from: classes2.dex */
class OptionalMethod<T> {
    private final java.lang.String methodName;
    private final java.lang.Class[] methodParams;
    private final java.lang.Class<?> returnType;

    OptionalMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class... clsArr) {
        this.returnType = cls;
        this.methodName = str;
        this.methodParams = clsArr;
    }

    public boolean isSupported(T t) {
        return getMethod(t.getClass()) != null;
    }

    public java.lang.Object invokeOptional(T t, java.lang.Object... objArr) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method method = getMethod(t.getClass());
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(t, objArr);
        } catch (java.lang.IllegalAccessException unused) {
            return null;
        }
    }

    public java.lang.Object invokeOptionalWithoutCheckedException(T t, java.lang.Object... objArr) {
        try {
            return invokeOptional(t, objArr);
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public java.lang.Object invoke(T t, java.lang.Object... objArr) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method method = getMethod(t.getClass());
        if (method == null) {
            throw new java.lang.AssertionError("Method " + this.methodName + " not supported for object " + t);
        }
        try {
            return method.invoke(t, objArr);
        } catch (java.lang.IllegalAccessException e) {
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpectedly could not call: " + method);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public java.lang.Object invokeWithoutCheckedException(T t, java.lang.Object... objArr) {
        try {
            return invoke(t, objArr);
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private java.lang.reflect.Method getMethod(java.lang.Class<?> cls) {
        java.lang.Class<?> cls2;
        java.lang.String str = this.methodName;
        if (str == null) {
            return null;
        }
        java.lang.reflect.Method publicMethod = getPublicMethod(cls, str, this.methodParams);
        if (publicMethod == null || (cls2 = this.returnType) == null || cls2.isAssignableFrom(publicMethod.getReturnType())) {
            return publicMethod;
        }
        return null;
    }

    private static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> cls, java.lang.String str, java.lang.Class[] clsArr) {
        try {
            java.lang.reflect.Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (java.lang.NoSuchMethodException unused) {
            }
            return method;
        } catch (java.lang.NoSuchMethodException unused2) {
            return null;
        }
    }
}
