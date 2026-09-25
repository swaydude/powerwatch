package retrofit2.converter.gson;

/* JADX INFO: loaded from: classes3.dex */
final class GsonRequestBodyConverter<T> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    private static final okhttp3.MediaType MEDIA_TYPE = okhttp3.MediaType.get("application/json; charset=UTF-8");
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private final com.google.gson.TypeAdapter<T> adapter;
    private final com.google.gson.Gson gson;

    GsonRequestBodyConverter(com.google.gson.Gson gson, com.google.gson.TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public okhttp3.RequestBody convert(T t) throws java.io.IOException {
        okio.Buffer buffer = new okio.Buffer();
        com.google.gson.stream.JsonWriter jsonWriterNewJsonWriter = this.gson.newJsonWriter(new java.io.OutputStreamWriter(buffer.outputStream(), UTF_8));
        this.adapter.write(jsonWriterNewJsonWriter, t);
        jsonWriterNewJsonWriter.close();
        return okhttp3.RequestBody.create(MEDIA_TYPE, buffer.readByteString());
    }
}
