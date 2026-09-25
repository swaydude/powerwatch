package retrofit2.converter.scalars;

/* JADX INFO: loaded from: classes3.dex */
final class ScalarRequestBodyConverter<T> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    static final retrofit2.converter.scalars.ScalarRequestBodyConverter<java.lang.Object> INSTANCE = new retrofit2.converter.scalars.ScalarRequestBodyConverter<>();
    private static final okhttp3.MediaType MEDIA_TYPE = okhttp3.MediaType.get("text/plain; charset=UTF-8");

    private ScalarRequestBodyConverter() {
    }

    @Override // retrofit2.Converter
    public okhttp3.RequestBody convert(T t) throws java.io.IOException {
        return okhttp3.RequestBody.create(MEDIA_TYPE, java.lang.String.valueOf(t));
    }
}
