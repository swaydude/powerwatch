package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    static final retrofit2.CallAdapter.Factory INSTANCE = new retrofit2.DefaultCallAdapterFactory();

    DefaultCallAdapterFactory() {
    }

    @Override // retrofit2.CallAdapter.Factory
    @javax.annotation.Nullable
    public retrofit2.CallAdapter<?, ?> get(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (getRawType(type) != retrofit2.Call.class) {
            return null;
        }
        final java.lang.reflect.Type callResponseType = retrofit2.Utils.getCallResponseType(type);
        return new retrofit2.CallAdapter<java.lang.Object, retrofit2.Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            public retrofit2.Call<?> adapt(retrofit2.Call<java.lang.Object> call) {
                return call;
            }

            @Override // retrofit2.CallAdapter
            public java.lang.reflect.Type responseType() {
                return callResponseType;
            }
        };
    }
}
