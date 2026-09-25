package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
abstract class ServiceMethod<T> {
    abstract T invoke(java.lang.Object[] objArr);

    ServiceMethod() {
    }

    static <T> retrofit2.ServiceMethod<T> parseAnnotations(retrofit2.Retrofit retrofit, java.lang.reflect.Method method) {
        retrofit2.RequestFactory annotations = retrofit2.RequestFactory.parseAnnotations(retrofit, method);
        java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
        if (retrofit2.Utils.hasUnresolvableType(genericReturnType)) {
            throw retrofit2.Utils.methodError(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType == java.lang.Void.TYPE) {
            throw retrofit2.Utils.methodError(method, "Service methods cannot return void.", new java.lang.Object[0]);
        }
        return retrofit2.HttpServiceMethod.parseAnnotations(retrofit, method, annotations);
    }
}
