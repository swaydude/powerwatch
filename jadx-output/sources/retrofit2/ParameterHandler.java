package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
abstract class ParameterHandler<T> {
    abstract void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException;

    ParameterHandler() {
    }

    final retrofit2.ParameterHandler<java.lang.Iterable<T>> iterable() {
        return new retrofit2.ParameterHandler<java.lang.Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // retrofit2.ParameterHandler
            public void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Iterable<T> iterable) throws java.io.IOException {
                if (iterable == null) {
                    return;
                }
                java.util.Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    retrofit2.ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }

    final retrofit2.ParameterHandler<java.lang.Object> array() {
        return new retrofit2.ParameterHandler<java.lang.Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) throws java.io.IOException {
                if (obj == null) {
                    return;
                }
                int length = java.lang.reflect.Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    retrofit2.ParameterHandler.this.apply(requestBuilder, java.lang.reflect.Array.get(obj, i));
                }
            }
        };
    }

    static final class RelativeUrl extends retrofit2.ParameterHandler<java.lang.Object> {
        RelativeUrl() {
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.lang.Object obj) {
            retrofit2.Utils.checkNotNull(obj, "@Url parameter is null.");
            requestBuilder.setRelativeUrl(obj);
        }
    }

    static final class Header<T> extends retrofit2.ParameterHandler<T> {
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Header(java.lang.String str, retrofit2.Converter<T, java.lang.String> converter) {
            this.name = (java.lang.String) retrofit2.Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            java.lang.String strConvert;
            if (t == null || (strConvert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, strConvert);
        }
    }

    static final class Path<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Path(java.lang.String str, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.name = (java.lang.String) retrofit2.Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            if (t == null) {
                throw new java.lang.IllegalArgumentException("Path parameter \"" + this.name + "\" value must not be null.");
            }
            requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
        }
    }

    static final class Query<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Query(java.lang.String str, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.name = (java.lang.String) retrofit2.Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            java.lang.String strConvert;
            if (t == null || (strConvert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, strConvert, this.encoded);
        }
    }

    static final class QueryName<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final retrofit2.Converter<T, java.lang.String> nameConverter;

        QueryName(retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            if (t == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t), null, this.encoded);
        }
    }

    static final class QueryMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean encoded;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        QueryMap(retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.util.Map<java.lang.String, T> map) throws java.io.IOException {
            if (map == null) {
                throw new java.lang.IllegalArgumentException("Query map was null.");
            }
            for (java.util.Map.Entry<java.lang.String, T> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    throw new java.lang.IllegalArgumentException("Query map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new java.lang.IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                }
                java.lang.String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw new java.lang.IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.");
                }
                requestBuilder.addQueryParam(key, strConvert, this.encoded);
            }
        }
    }

    static final class HeaderMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        HeaderMap(retrofit2.Converter<T, java.lang.String> converter) {
            this.valueConverter = converter;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.util.Map<java.lang.String, T> map) throws java.io.IOException {
            if (map == null) {
                throw new java.lang.IllegalArgumentException("Header map was null.");
            }
            for (java.util.Map.Entry<java.lang.String, T> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    throw new java.lang.IllegalArgumentException("Header map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new java.lang.IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                }
                requestBuilder.addHeader(key, this.valueConverter.convert(value));
            }
        }
    }

    static final class Field<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Field(java.lang.String str, retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.name = (java.lang.String) retrofit2.Utils.checkNotNull(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) throws java.io.IOException {
            java.lang.String strConvert;
            if (t == null || (strConvert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, strConvert, this.encoded);
        }
    }

    static final class FieldMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean encoded;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        FieldMap(retrofit2.Converter<T, java.lang.String> converter, boolean z) {
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.util.Map<java.lang.String, T> map) throws java.io.IOException {
            if (map == null) {
                throw new java.lang.IllegalArgumentException("Field map was null.");
            }
            for (java.util.Map.Entry<java.lang.String, T> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    throw new java.lang.IllegalArgumentException("Field map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new java.lang.IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                }
                java.lang.String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw new java.lang.IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.");
                }
                requestBuilder.addFormField(key, strConvert, this.encoded);
            }
        }
    }

    static final class Part<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, okhttp3.RequestBody> converter;
        private final okhttp3.Headers headers;

        Part(okhttp3.Headers headers, retrofit2.Converter<T, okhttp3.RequestBody> converter) {
            this.headers = headers;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t));
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    static final class RawPart extends retrofit2.ParameterHandler<okhttp3.MultipartBody.Part> {
        static final retrofit2.ParameterHandler.RawPart INSTANCE = new retrofit2.ParameterHandler.RawPart();

        private RawPart() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable okhttp3.MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.addPart(part);
            }
        }
    }

    static final class PartMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final java.lang.String transferEncoding;
        private final retrofit2.Converter<T, okhttp3.RequestBody> valueConverter;

        PartMap(retrofit2.Converter<T, okhttp3.RequestBody> converter, java.lang.String str) {
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable java.util.Map<java.lang.String, T> map) throws java.io.IOException {
            if (map == null) {
                throw new java.lang.IllegalArgumentException("Part map was null.");
            }
            for (java.util.Map.Entry<java.lang.String, T> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    throw new java.lang.IllegalArgumentException("Part map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new java.lang.IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                }
                requestBuilder.addPart(okhttp3.Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
            }
        }
    }

    static final class Body<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, okhttp3.RequestBody> converter;

        Body(retrofit2.Converter<T, okhttp3.RequestBody> converter) {
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder requestBuilder, @javax.annotation.Nullable T t) {
            if (t == null) {
                throw new java.lang.IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                requestBuilder.setBody(this.converter.convert(t));
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }
}
