package retrofit2.converter.gson;

/* JADX INFO: loaded from: classes3.dex */
final class GsonResponseBodyConverter<T> implements retrofit2.Converter<okhttp3.ResponseBody, T> {
    private final com.google.gson.TypeAdapter<T> adapter;
    private final com.google.gson.Gson gson;

    GsonResponseBodyConverter(com.google.gson.Gson gson, com.google.gson.TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
        com.google.gson.stream.JsonReader jsonReaderNewJsonReader = this.gson.newJsonReader(responseBody.charStream());
        try {
            T t = this.adapter.read(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != com.google.gson.stream.JsonToken.END_DOCUMENT) {
                throw new com.google.gson.JsonIOException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return t;
        } catch (java.lang.Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
