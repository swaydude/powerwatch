package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class BuiltInConverters extends retrofit2.Converter.Factory {
    private boolean checkForKotlinUnit = true;

    BuiltInConverters() {
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, retrofit2.Retrofit retrofit) {
        if (type == okhttp3.ResponseBody.class) {
            if (retrofit2.Utils.isAnnotationPresent(annotationArr, retrofit2.http.Streaming.class)) {
                return retrofit2.BuiltInConverters.StreamingResponseBodyConverter.INSTANCE;
            }
            return retrofit2.BuiltInConverters.BufferingResponseBodyConverter.INSTANCE;
        }
        if (type == java.lang.Void.class) {
            return retrofit2.BuiltInConverters.VoidResponseBodyConverter.INSTANCE;
        }
        if (!this.checkForKotlinUnit || type != kotlin.Unit.class) {
            return null;
        }
        try {
            return retrofit2.BuiltInConverters.UnitResponseBodyConverter.INSTANCE;
        } catch (java.lang.NoClassDefFoundError unused) {
            this.checkForKotlinUnit = false;
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, retrofit2.Retrofit retrofit) {
        if (okhttp3.RequestBody.class.isAssignableFrom(retrofit2.Utils.getRawType(type))) {
            return retrofit2.BuiltInConverters.RequestBodyConverter.INSTANCE;
        }
        return null;
    }

    static final class VoidResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Void> {
        static final retrofit2.BuiltInConverters.VoidResponseBodyConverter INSTANCE = new retrofit2.BuiltInConverters.VoidResponseBodyConverter();

        VoidResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.Void convert(okhttp3.ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    static final class UnitResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, kotlin.Unit> {
        static final retrofit2.BuiltInConverters.UnitResponseBodyConverter INSTANCE = new retrofit2.BuiltInConverters.UnitResponseBodyConverter();

        UnitResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public kotlin.Unit convert(okhttp3.ResponseBody responseBody) {
            responseBody.close();
            return kotlin.Unit.INSTANCE;
        }
    }

    static final class RequestBodyConverter implements retrofit2.Converter<okhttp3.RequestBody, okhttp3.RequestBody> {
        static final retrofit2.BuiltInConverters.RequestBodyConverter INSTANCE = new retrofit2.BuiltInConverters.RequestBodyConverter();

        @Override // retrofit2.Converter
        public okhttp3.RequestBody convert(okhttp3.RequestBody requestBody) {
            return requestBody;
        }

        RequestBodyConverter() {
        }
    }

    static final class StreamingResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, okhttp3.ResponseBody> {
        static final retrofit2.BuiltInConverters.StreamingResponseBodyConverter INSTANCE = new retrofit2.BuiltInConverters.StreamingResponseBodyConverter();

        @Override // retrofit2.Converter
        public okhttp3.ResponseBody convert(okhttp3.ResponseBody responseBody) {
            return responseBody;
        }

        StreamingResponseBodyConverter() {
        }
    }

    static final class BufferingResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, okhttp3.ResponseBody> {
        static final retrofit2.BuiltInConverters.BufferingResponseBodyConverter INSTANCE = new retrofit2.BuiltInConverters.BufferingResponseBodyConverter();

        BufferingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public okhttp3.ResponseBody convert(okhttp3.ResponseBody responseBody) throws java.io.IOException {
            try {
                return retrofit2.Utils.buffer(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    static final class ToStringConverter implements retrofit2.Converter<java.lang.Object, java.lang.String> {
        static final retrofit2.BuiltInConverters.ToStringConverter INSTANCE = new retrofit2.BuiltInConverters.ToStringConverter();

        ToStringConverter() {
        }

        @Override // retrofit2.Converter
        public java.lang.String convert(java.lang.Object obj) {
            return obj.toString();
        }
    }
}
