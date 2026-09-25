package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class HttpServiceMethod<ResponseT, ReturnT> extends retrofit2.ServiceMethod<ReturnT> {
    private final retrofit2.CallAdapter<ResponseT, ReturnT> callAdapter;
    private final okhttp3.Call.Factory callFactory;
    private final retrofit2.RequestFactory requestFactory;
    private final retrofit2.Converter<okhttp3.ResponseBody, ResponseT> responseConverter;

    static <ResponseT, ReturnT> retrofit2.HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(retrofit2.Retrofit retrofit, java.lang.reflect.Method method, retrofit2.RequestFactory requestFactory) {
        retrofit2.CallAdapter callAdapterCreateCallAdapter = createCallAdapter(retrofit, method);
        java.lang.reflect.Type typeResponseType = callAdapterCreateCallAdapter.responseType();
        if (typeResponseType == retrofit2.Response.class || typeResponseType == okhttp3.Response.class) {
            throw retrofit2.Utils.methodError(method, "'" + retrofit2.Utils.getRawType(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new java.lang.Object[0]);
        }
        if (requestFactory.httpMethod.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_HEAD) && !java.lang.Void.class.equals(typeResponseType)) {
            throw retrofit2.Utils.methodError(method, "HEAD method must use Void as response type.", new java.lang.Object[0]);
        }
        return new retrofit2.HttpServiceMethod<>(requestFactory, retrofit.callFactory, callAdapterCreateCallAdapter, createResponseConverter(retrofit, method, typeResponseType));
    }

    private static <ResponseT, ReturnT> retrofit2.CallAdapter<ResponseT, ReturnT> createCallAdapter(retrofit2.Retrofit retrofit, java.lang.reflect.Method method) {
        java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
        try {
            return (retrofit2.CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(genericReturnType, method.getAnnotations());
        } catch (java.lang.RuntimeException e) {
            throw retrofit2.Utils.methodError(method, e, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    private static <ResponseT> retrofit2.Converter<okhttp3.ResponseBody, ResponseT> createResponseConverter(retrofit2.Retrofit retrofit, java.lang.reflect.Method method, java.lang.reflect.Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (java.lang.RuntimeException e) {
            throw retrofit2.Utils.methodError(method, e, "Unable to create converter for %s", type);
        }
    }

    private HttpServiceMethod(retrofit2.RequestFactory requestFactory, okhttp3.Call.Factory factory, retrofit2.CallAdapter<ResponseT, ReturnT> callAdapter, retrofit2.Converter<okhttp3.ResponseBody, ResponseT> converter) {
        this.requestFactory = requestFactory;
        this.callFactory = factory;
        this.callAdapter = callAdapter;
        this.responseConverter = converter;
    }

    @Override // retrofit2.ServiceMethod
    ReturnT invoke(java.lang.Object[] objArr) {
        return this.callAdapter.adapt(new retrofit2.OkHttpCall(this.requestFactory, objArr, this.callFactory, this.responseConverter));
    }
}
