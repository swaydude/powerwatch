package retrofit2.converter.gson;

/* JADX INFO: loaded from: classes3.dex */
public final class GsonConverterFactory extends retrofit2.Converter.Factory {
    private final com.google.gson.Gson gson;

    public static retrofit2.converter.gson.GsonConverterFactory create() {
        return create(new com.google.gson.Gson());
    }

    public static retrofit2.converter.gson.GsonConverterFactory create(com.google.gson.Gson gson) {
        java.util.Objects.requireNonNull(gson, "gson == null");
        return new retrofit2.converter.gson.GsonConverterFactory(gson);
    }

    private GsonConverterFactory(com.google.gson.Gson gson) {
        this.gson = gson;
    }

    @Override // retrofit2.Converter.Factory
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        return new retrofit2.converter.gson.GsonResponseBodyConverter(this.gson, this.gson.getAdapter(com.google.gson.reflect.TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, retrofit2.Retrofit retrofit) {
        return new retrofit2.converter.gson.GsonRequestBodyConverter(this.gson, this.gson.getAdapter(com.google.gson.reflect.TypeToken.get(type)));
    }
}
