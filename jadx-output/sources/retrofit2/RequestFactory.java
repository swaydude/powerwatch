package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class RequestFactory {
    private final okhttp3.HttpUrl baseUrl;

    @javax.annotation.Nullable
    private final okhttp3.MediaType contentType;
    private final boolean hasBody;

    @javax.annotation.Nullable
    private final okhttp3.Headers headers;
    final java.lang.String httpMethod;
    private final boolean isFormEncoded;
    private final boolean isMultipart;
    private final java.lang.reflect.Method method;
    private final retrofit2.ParameterHandler<?>[] parameterHandlers;

    @javax.annotation.Nullable
    private final java.lang.String relativeUrl;

    static retrofit2.RequestFactory parseAnnotations(retrofit2.Retrofit retrofit, java.lang.reflect.Method method) {
        return new retrofit2.RequestFactory.Builder(retrofit, method).build();
    }

    RequestFactory(retrofit2.RequestFactory.Builder builder) {
        this.method = builder.method;
        this.baseUrl = builder.retrofit.baseUrl;
        this.httpMethod = builder.httpMethod;
        this.relativeUrl = builder.relativeUrl;
        this.headers = builder.headers;
        this.contentType = builder.contentType;
        this.hasBody = builder.hasBody;
        this.isFormEncoded = builder.isFormEncoded;
        this.isMultipart = builder.isMultipart;
        this.parameterHandlers = builder.parameterHandlers;
    }

    okhttp3.Request create(java.lang.Object[] objArr) throws java.io.IOException {
        retrofit2.ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            throw new java.lang.IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + parameterHandlerArr.length + ")");
        }
        retrofit2.RequestBuilder requestBuilder = new retrofit2.RequestBuilder(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            parameterHandlerArr[i].apply(requestBuilder, objArr[i]);
        }
        return requestBuilder.get().tag(retrofit2.Invocation.class, new retrofit2.Invocation(this.method, arrayList)).build();
    }

    static final class Builder {

        @javax.annotation.Nullable
        okhttp3.MediaType contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;

        @javax.annotation.Nullable
        okhttp3.Headers headers;

        @javax.annotation.Nullable
        java.lang.String httpMethod;
        boolean isFormEncoded;
        boolean isMultipart;
        final java.lang.reflect.Method method;
        final java.lang.annotation.Annotation[] methodAnnotations;
        final java.lang.annotation.Annotation[][] parameterAnnotationsArray;

        @javax.annotation.Nullable
        retrofit2.ParameterHandler<?>[] parameterHandlers;
        final java.lang.reflect.Type[] parameterTypes;

        @javax.annotation.Nullable
        java.lang.String relativeUrl;

        @javax.annotation.Nullable
        java.util.Set<java.lang.String> relativeUrlParamNames;
        final retrofit2.Retrofit retrofit;
        private static final java.util.regex.Pattern PARAM_URL_REGEX = java.util.regex.Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final java.lang.String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final java.util.regex.Pattern PARAM_NAME_REGEX = java.util.regex.Pattern.compile(PARAM);

        Builder(retrofit2.Retrofit retrofit, java.lang.reflect.Method method) {
            this.retrofit = retrofit;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        retrofit2.RequestFactory build() {
            for (java.lang.annotation.Annotation annotation : this.methodAnnotations) {
                parseMethodAnnotation(annotation);
            }
            if (this.httpMethod == null) {
                throw retrofit2.Utils.methodError(this.method, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new java.lang.Object[0]);
            }
            if (!this.hasBody) {
                if (this.isMultipart) {
                    throw retrofit2.Utils.methodError(this.method, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new java.lang.Object[0]);
                }
                if (this.isFormEncoded) {
                    throw retrofit2.Utils.methodError(this.method, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new java.lang.Object[0]);
                }
            }
            int length = this.parameterAnnotationsArray.length;
            this.parameterHandlers = new retrofit2.ParameterHandler[length];
            for (int i = 0; i < length; i++) {
                this.parameterHandlers[i] = parseParameter(i, this.parameterTypes[i], this.parameterAnnotationsArray[i]);
            }
            if (this.relativeUrl == null && !this.gotUrl) {
                throw retrofit2.Utils.methodError(this.method, "Missing either @%s URL or @Url parameter.", this.httpMethod);
            }
            boolean z = this.isFormEncoded;
            if (!z && !this.isMultipart && !this.hasBody && this.gotBody) {
                throw retrofit2.Utils.methodError(this.method, "Non-body HTTP method cannot contain @Body.", new java.lang.Object[0]);
            }
            if (z && !this.gotField) {
                throw retrofit2.Utils.methodError(this.method, "Form-encoded method must contain at least one @Field.", new java.lang.Object[0]);
            }
            if (this.isMultipart && !this.gotPart) {
                throw retrofit2.Utils.methodError(this.method, "Multipart method must contain at least one @Part.", new java.lang.Object[0]);
            }
            return new retrofit2.RequestFactory(this);
        }

        private void parseMethodAnnotation(java.lang.annotation.Annotation annotation) {
            if (annotation instanceof retrofit2.http.DELETE) {
                parseHttpMethodAndPath(io.fabric.sdk.android.services.network.HttpRequest.METHOD_DELETE, ((retrofit2.http.DELETE) annotation).value(), false);
                return;
            }
            if (annotation instanceof retrofit2.http.GET) {
                parseHttpMethodAndPath(io.fabric.sdk.android.services.network.HttpRequest.METHOD_GET, ((retrofit2.http.GET) annotation).value(), false);
                return;
            }
            if (annotation instanceof retrofit2.http.HEAD) {
                parseHttpMethodAndPath(io.fabric.sdk.android.services.network.HttpRequest.METHOD_HEAD, ((retrofit2.http.HEAD) annotation).value(), false);
                return;
            }
            if (annotation instanceof retrofit2.http.PATCH) {
                parseHttpMethodAndPath("PATCH", ((retrofit2.http.PATCH) annotation).value(), true);
                return;
            }
            if (annotation instanceof retrofit2.http.POST) {
                parseHttpMethodAndPath(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST, ((retrofit2.http.POST) annotation).value(), true);
                return;
            }
            if (annotation instanceof retrofit2.http.PUT) {
                parseHttpMethodAndPath(io.fabric.sdk.android.services.network.HttpRequest.METHOD_PUT, ((retrofit2.http.PUT) annotation).value(), true);
                return;
            }
            if (annotation instanceof retrofit2.http.OPTIONS) {
                parseHttpMethodAndPath(io.fabric.sdk.android.services.network.HttpRequest.METHOD_OPTIONS, ((retrofit2.http.OPTIONS) annotation).value(), false);
                return;
            }
            if (annotation instanceof retrofit2.http.HTTP) {
                retrofit2.http.HTTP http = (retrofit2.http.HTTP) annotation;
                parseHttpMethodAndPath(http.method(), http.path(), http.hasBody());
                return;
            }
            if (annotation instanceof retrofit2.http.Headers) {
                java.lang.String[] strArrValue = ((retrofit2.http.Headers) annotation).value();
                if (strArrValue.length == 0) {
                    throw retrofit2.Utils.methodError(this.method, "@Headers annotation is empty.", new java.lang.Object[0]);
                }
                this.headers = parseHeaders(strArrValue);
                return;
            }
            if (annotation instanceof retrofit2.http.Multipart) {
                if (this.isFormEncoded) {
                    throw retrofit2.Utils.methodError(this.method, "Only one encoding annotation is allowed.", new java.lang.Object[0]);
                }
                this.isMultipart = true;
            } else if (annotation instanceof retrofit2.http.FormUrlEncoded) {
                if (this.isMultipart) {
                    throw retrofit2.Utils.methodError(this.method, "Only one encoding annotation is allowed.", new java.lang.Object[0]);
                }
                this.isFormEncoded = true;
            }
        }

        private void parseHttpMethodAndPath(java.lang.String str, java.lang.String str2, boolean z) {
            java.lang.String str3 = this.httpMethod;
            if (str3 != null) {
                throw retrofit2.Utils.methodError(this.method, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                java.lang.String strSubstring = str2.substring(iIndexOf + 1);
                if (PARAM_URL_REGEX.matcher(strSubstring).find()) {
                    throw retrofit2.Utils.methodError(this.method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.relativeUrl = str2;
            this.relativeUrlParamNames = parsePathParameters(str2);
        }

        private okhttp3.Headers parseHeaders(java.lang.String[] strArr) {
            okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
            for (java.lang.String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw retrofit2.Utils.methodError(this.method, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                java.lang.String strSubstring = str.substring(0, iIndexOf);
                java.lang.String strTrim = str.substring(iIndexOf + 1).trim();
                if (io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.contentType = okhttp3.MediaType.get(strTrim);
                    } catch (java.lang.IllegalArgumentException e) {
                        throw retrofit2.Utils.methodError(this.method, e, "Malformed content type: %s", strTrim);
                    }
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        private retrofit2.ParameterHandler<?> parseParameter(int i, java.lang.reflect.Type type, @javax.annotation.Nullable java.lang.annotation.Annotation[] annotationArr) {
            retrofit2.ParameterHandler<?> parameterHandler = null;
            if (annotationArr != null) {
                for (java.lang.annotation.Annotation annotation : annotationArr) {
                    retrofit2.ParameterHandler<?> parameterAnnotation = parseParameterAnnotation(i, type, annotationArr, annotation);
                    if (parameterAnnotation != null) {
                        if (parameterHandler != null) {
                            throw retrofit2.Utils.parameterError(this.method, i, "Multiple Retrofit annotations found, only one allowed.", new java.lang.Object[0]);
                        }
                        parameterHandler = parameterAnnotation;
                    }
                }
            }
            if (parameterHandler != null) {
                return parameterHandler;
            }
            throw retrofit2.Utils.parameterError(this.method, i, "No Retrofit annotation found.", new java.lang.Object[0]);
        }

        @javax.annotation.Nullable
        private retrofit2.ParameterHandler<?> parseParameterAnnotation(int i, java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation annotation) {
            if (annotation instanceof retrofit2.http.Url) {
                validateResolvableType(i, type);
                if (this.gotUrl) {
                    throw retrofit2.Utils.parameterError(this.method, i, "Multiple @Url method annotations found.", new java.lang.Object[0]);
                }
                if (this.gotPath) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@Path parameters may not be used with @Url.", new java.lang.Object[0]);
                }
                if (this.gotQuery) {
                    throw retrofit2.Utils.parameterError(this.method, i, "A @Url parameter must not come after a @Query.", new java.lang.Object[0]);
                }
                if (this.gotQueryName) {
                    throw retrofit2.Utils.parameterError(this.method, i, "A @Url parameter must not come after a @QueryName.", new java.lang.Object[0]);
                }
                if (this.gotQueryMap) {
                    throw retrofit2.Utils.parameterError(this.method, i, "A @Url parameter must not come after a @QueryMap.", new java.lang.Object[0]);
                }
                if (this.relativeUrl != null) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@Url cannot be used with @%s URL", this.httpMethod);
                }
                this.gotUrl = true;
                if (type == okhttp3.HttpUrl.class || type == java.lang.String.class || type == java.net.URI.class || ((type instanceof java.lang.Class) && "android.net.Uri".equals(((java.lang.Class) type).getName()))) {
                    return new retrofit2.ParameterHandler.RelativeUrl();
                }
                throw retrofit2.Utils.parameterError(this.method, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new java.lang.Object[0]);
            }
            if (annotation instanceof retrofit2.http.Path) {
                validateResolvableType(i, type);
                if (this.gotQuery) {
                    throw retrofit2.Utils.parameterError(this.method, i, "A @Path parameter must not come after a @Query.", new java.lang.Object[0]);
                }
                if (this.gotQueryName) {
                    throw retrofit2.Utils.parameterError(this.method, i, "A @Path parameter must not come after a @QueryName.", new java.lang.Object[0]);
                }
                if (this.gotQueryMap) {
                    throw retrofit2.Utils.parameterError(this.method, i, "A @Path parameter must not come after a @QueryMap.", new java.lang.Object[0]);
                }
                if (this.gotUrl) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@Path parameters may not be used with @Url.", new java.lang.Object[0]);
                }
                if (this.relativeUrl == null) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@Path can only be used with relative url on @%s", this.httpMethod);
                }
                this.gotPath = true;
                retrofit2.http.Path path = (retrofit2.http.Path) annotation;
                java.lang.String strValue = path.value();
                validatePathName(i, strValue);
                return new retrofit2.ParameterHandler.Path(strValue, this.retrofit.stringConverter(type, annotationArr), path.encoded());
            }
            if (annotation instanceof retrofit2.http.Query) {
                validateResolvableType(i, type);
                retrofit2.http.Query query = (retrofit2.http.Query) annotation;
                java.lang.String strValue2 = query.value();
                boolean zEncoded = query.encoded();
                java.lang.Class<?> rawType = retrofit2.Utils.getRawType(type);
                this.gotQuery = true;
                if (java.lang.Iterable.class.isAssignableFrom(rawType)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        throw retrofit2.Utils.parameterError(this.method, i, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)", new java.lang.Object[0]);
                    }
                    return new retrofit2.ParameterHandler.Query(strValue2, this.retrofit.stringConverter(retrofit2.Utils.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type), annotationArr), zEncoded).iterable();
                }
                if (rawType.isArray()) {
                    return new retrofit2.ParameterHandler.Query(strValue2, this.retrofit.stringConverter(boxIfPrimitive(rawType.getComponentType()), annotationArr), zEncoded).array();
                }
                return new retrofit2.ParameterHandler.Query(strValue2, this.retrofit.stringConverter(type, annotationArr), zEncoded);
            }
            if (annotation instanceof retrofit2.http.QueryName) {
                validateResolvableType(i, type);
                boolean zEncoded2 = ((retrofit2.http.QueryName) annotation).encoded();
                java.lang.Class<?> rawType2 = retrofit2.Utils.getRawType(type);
                this.gotQueryName = true;
                if (java.lang.Iterable.class.isAssignableFrom(rawType2)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        throw retrofit2.Utils.parameterError(this.method, i, rawType2.getSimpleName() + " must include generic type (e.g., " + rawType2.getSimpleName() + "<String>)", new java.lang.Object[0]);
                    }
                    return new retrofit2.ParameterHandler.QueryName(this.retrofit.stringConverter(retrofit2.Utils.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type), annotationArr), zEncoded2).iterable();
                }
                if (rawType2.isArray()) {
                    return new retrofit2.ParameterHandler.QueryName(this.retrofit.stringConverter(boxIfPrimitive(rawType2.getComponentType()), annotationArr), zEncoded2).array();
                }
                return new retrofit2.ParameterHandler.QueryName(this.retrofit.stringConverter(type, annotationArr), zEncoded2);
            }
            if (annotation instanceof retrofit2.http.QueryMap) {
                validateResolvableType(i, type);
                java.lang.Class<?> rawType3 = retrofit2.Utils.getRawType(type);
                this.gotQueryMap = true;
                if (!java.util.Map.class.isAssignableFrom(rawType3)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@QueryMap parameter type must be Map.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type supertype = retrofit2.Utils.getSupertype(type, rawType3, java.util.Map.class);
                if (!(supertype instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) supertype;
                java.lang.reflect.Type parameterUpperBound = retrofit2.Utils.getParameterUpperBound(0, parameterizedType);
                if (java.lang.String.class != parameterUpperBound) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@QueryMap keys must be of type String: " + parameterUpperBound, new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.QueryMap(this.retrofit.stringConverter(retrofit2.Utils.getParameterUpperBound(1, parameterizedType), annotationArr), ((retrofit2.http.QueryMap) annotation).encoded());
            }
            if (annotation instanceof retrofit2.http.Header) {
                validateResolvableType(i, type);
                java.lang.String strValue3 = ((retrofit2.http.Header) annotation).value();
                java.lang.Class<?> rawType4 = retrofit2.Utils.getRawType(type);
                if (java.lang.Iterable.class.isAssignableFrom(rawType4)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        throw retrofit2.Utils.parameterError(this.method, i, rawType4.getSimpleName() + " must include generic type (e.g., " + rawType4.getSimpleName() + "<String>)", new java.lang.Object[0]);
                    }
                    return new retrofit2.ParameterHandler.Header(strValue3, this.retrofit.stringConverter(retrofit2.Utils.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type), annotationArr)).iterable();
                }
                if (rawType4.isArray()) {
                    return new retrofit2.ParameterHandler.Header(strValue3, this.retrofit.stringConverter(boxIfPrimitive(rawType4.getComponentType()), annotationArr)).array();
                }
                return new retrofit2.ParameterHandler.Header(strValue3, this.retrofit.stringConverter(type, annotationArr));
            }
            if (annotation instanceof retrofit2.http.HeaderMap) {
                validateResolvableType(i, type);
                java.lang.Class<?> rawType5 = retrofit2.Utils.getRawType(type);
                if (!java.util.Map.class.isAssignableFrom(rawType5)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@HeaderMap parameter type must be Map.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type supertype2 = retrofit2.Utils.getSupertype(type, rawType5, java.util.Map.class);
                if (!(supertype2 instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) supertype2;
                java.lang.reflect.Type parameterUpperBound2 = retrofit2.Utils.getParameterUpperBound(0, parameterizedType2);
                if (java.lang.String.class != parameterUpperBound2) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@HeaderMap keys must be of type String: " + parameterUpperBound2, new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.HeaderMap(this.retrofit.stringConverter(retrofit2.Utils.getParameterUpperBound(1, parameterizedType2), annotationArr));
            }
            if (annotation instanceof retrofit2.http.Field) {
                validateResolvableType(i, type);
                if (!this.isFormEncoded) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@Field parameters can only be used with form encoding.", new java.lang.Object[0]);
                }
                retrofit2.http.Field field = (retrofit2.http.Field) annotation;
                java.lang.String strValue4 = field.value();
                boolean zEncoded3 = field.encoded();
                this.gotField = true;
                java.lang.Class<?> rawType6 = retrofit2.Utils.getRawType(type);
                if (java.lang.Iterable.class.isAssignableFrom(rawType6)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        throw retrofit2.Utils.parameterError(this.method, i, rawType6.getSimpleName() + " must include generic type (e.g., " + rawType6.getSimpleName() + "<String>)", new java.lang.Object[0]);
                    }
                    return new retrofit2.ParameterHandler.Field(strValue4, this.retrofit.stringConverter(retrofit2.Utils.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type), annotationArr), zEncoded3).iterable();
                }
                if (rawType6.isArray()) {
                    return new retrofit2.ParameterHandler.Field(strValue4, this.retrofit.stringConverter(boxIfPrimitive(rawType6.getComponentType()), annotationArr), zEncoded3).array();
                }
                return new retrofit2.ParameterHandler.Field(strValue4, this.retrofit.stringConverter(type, annotationArr), zEncoded3);
            }
            if (annotation instanceof retrofit2.http.FieldMap) {
                validateResolvableType(i, type);
                if (!this.isFormEncoded) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@FieldMap parameters can only be used with form encoding.", new java.lang.Object[0]);
                }
                java.lang.Class<?> rawType7 = retrofit2.Utils.getRawType(type);
                if (!java.util.Map.class.isAssignableFrom(rawType7)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@FieldMap parameter type must be Map.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type supertype3 = retrofit2.Utils.getSupertype(type, rawType7, java.util.Map.class);
                if (!(supertype3 instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType3 = (java.lang.reflect.ParameterizedType) supertype3;
                java.lang.reflect.Type parameterUpperBound3 = retrofit2.Utils.getParameterUpperBound(0, parameterizedType3);
                if (java.lang.String.class != parameterUpperBound3) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@FieldMap keys must be of type String: " + parameterUpperBound3, new java.lang.Object[0]);
                }
                retrofit2.Converter converterStringConverter = this.retrofit.stringConverter(retrofit2.Utils.getParameterUpperBound(1, parameterizedType3), annotationArr);
                this.gotField = true;
                return new retrofit2.ParameterHandler.FieldMap(converterStringConverter, ((retrofit2.http.FieldMap) annotation).encoded());
            }
            if (annotation instanceof retrofit2.http.Part) {
                validateResolvableType(i, type);
                if (!this.isMultipart) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@Part parameters can only be used with multipart encoding.", new java.lang.Object[0]);
                }
                retrofit2.http.Part part = (retrofit2.http.Part) annotation;
                this.gotPart = true;
                java.lang.String strValue5 = part.value();
                java.lang.Class<?> rawType8 = retrofit2.Utils.getRawType(type);
                if (strValue5.isEmpty()) {
                    if (java.lang.Iterable.class.isAssignableFrom(rawType8)) {
                        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                            throw retrofit2.Utils.parameterError(this.method, i, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new java.lang.Object[0]);
                        }
                        if (!okhttp3.MultipartBody.Part.class.isAssignableFrom(retrofit2.Utils.getRawType(retrofit2.Utils.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type)))) {
                            throw retrofit2.Utils.parameterError(this.method, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new java.lang.Object[0]);
                        }
                        return retrofit2.ParameterHandler.RawPart.INSTANCE.iterable();
                    }
                    if (rawType8.isArray()) {
                        if (!okhttp3.MultipartBody.Part.class.isAssignableFrom(rawType8.getComponentType())) {
                            throw retrofit2.Utils.parameterError(this.method, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new java.lang.Object[0]);
                        }
                        return retrofit2.ParameterHandler.RawPart.INSTANCE.array();
                    }
                    if (okhttp3.MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                        return retrofit2.ParameterHandler.RawPart.INSTANCE;
                    }
                    throw retrofit2.Utils.parameterError(this.method, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new java.lang.Object[0]);
                }
                okhttp3.Headers headersOf = okhttp3.Headers.of("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", part.encoding());
                if (java.lang.Iterable.class.isAssignableFrom(rawType8)) {
                    if (!(type instanceof java.lang.reflect.ParameterizedType)) {
                        throw retrofit2.Utils.parameterError(this.method, i, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new java.lang.Object[0]);
                    }
                    java.lang.reflect.Type parameterUpperBound4 = retrofit2.Utils.getParameterUpperBound(0, (java.lang.reflect.ParameterizedType) type);
                    if (okhttp3.MultipartBody.Part.class.isAssignableFrom(retrofit2.Utils.getRawType(parameterUpperBound4))) {
                        throw retrofit2.Utils.parameterError(this.method, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new java.lang.Object[0]);
                    }
                    return new retrofit2.ParameterHandler.Part(headersOf, this.retrofit.requestBodyConverter(parameterUpperBound4, annotationArr, this.methodAnnotations)).iterable();
                }
                if (rawType8.isArray()) {
                    java.lang.Class<?> clsBoxIfPrimitive = boxIfPrimitive(rawType8.getComponentType());
                    if (okhttp3.MultipartBody.Part.class.isAssignableFrom(clsBoxIfPrimitive)) {
                        throw retrofit2.Utils.parameterError(this.method, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new java.lang.Object[0]);
                    }
                    return new retrofit2.ParameterHandler.Part(headersOf, this.retrofit.requestBodyConverter(clsBoxIfPrimitive, annotationArr, this.methodAnnotations)).array();
                }
                if (okhttp3.MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.Part(headersOf, this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations));
            }
            if (annotation instanceof retrofit2.http.PartMap) {
                validateResolvableType(i, type);
                if (!this.isMultipart) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@PartMap parameters can only be used with multipart encoding.", new java.lang.Object[0]);
                }
                this.gotPart = true;
                java.lang.Class<?> rawType9 = retrofit2.Utils.getRawType(type);
                if (!java.util.Map.class.isAssignableFrom(rawType9)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@PartMap parameter type must be Map.", new java.lang.Object[0]);
                }
                java.lang.reflect.Type supertype4 = retrofit2.Utils.getSupertype(type, rawType9, java.util.Map.class);
                if (!(supertype4 instanceof java.lang.reflect.ParameterizedType)) {
                    throw retrofit2.Utils.parameterError(this.method, i, "Map must include generic types (e.g., Map<String, String>)", new java.lang.Object[0]);
                }
                java.lang.reflect.ParameterizedType parameterizedType4 = (java.lang.reflect.ParameterizedType) supertype4;
                java.lang.reflect.Type parameterUpperBound5 = retrofit2.Utils.getParameterUpperBound(0, parameterizedType4);
                if (java.lang.String.class != parameterUpperBound5) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@PartMap keys must be of type String: " + parameterUpperBound5, new java.lang.Object[0]);
                }
                java.lang.reflect.Type parameterUpperBound6 = retrofit2.Utils.getParameterUpperBound(1, parameterizedType4);
                if (okhttp3.MultipartBody.Part.class.isAssignableFrom(retrofit2.Utils.getRawType(parameterUpperBound6))) {
                    throw retrofit2.Utils.parameterError(this.method, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new java.lang.Object[0]);
                }
                return new retrofit2.ParameterHandler.PartMap(this.retrofit.requestBodyConverter(parameterUpperBound6, annotationArr, this.methodAnnotations), ((retrofit2.http.PartMap) annotation).encoding());
            }
            if (!(annotation instanceof retrofit2.http.Body)) {
                return null;
            }
            validateResolvableType(i, type);
            if (this.isFormEncoded || this.isMultipart) {
                throw retrofit2.Utils.parameterError(this.method, i, "@Body parameters cannot be used with form or multi-part encoding.", new java.lang.Object[0]);
            }
            if (this.gotBody) {
                throw retrofit2.Utils.parameterError(this.method, i, "Multiple @Body method annotations found.", new java.lang.Object[0]);
            }
            try {
                retrofit2.Converter converterRequestBodyConverter = this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations);
                this.gotBody = true;
                return new retrofit2.ParameterHandler.Body(converterRequestBodyConverter);
            } catch (java.lang.RuntimeException e) {
                throw retrofit2.Utils.parameterError(this.method, e, i, "Unable to create @Body converter for %s", type);
            }
        }

        private void validateResolvableType(int i, java.lang.reflect.Type type) {
            if (retrofit2.Utils.hasUnresolvableType(type)) {
                throw retrofit2.Utils.parameterError(this.method, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        private void validatePathName(int i, java.lang.String str) {
            if (!PARAM_NAME_REGEX.matcher(str).matches()) {
                throw retrofit2.Utils.parameterError(this.method, i, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
            }
            if (!this.relativeUrlParamNames.contains(str)) {
                throw retrofit2.Utils.parameterError(this.method, i, "URL \"%s\" does not contain \"{%s}\".", this.relativeUrl, str);
            }
        }

        static java.util.Set<java.lang.String> parsePathParameters(java.lang.String str) {
            java.util.regex.Matcher matcher = PARAM_URL_REGEX.matcher(str);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private static java.lang.Class<?> boxIfPrimitive(java.lang.Class<?> cls) {
            if (java.lang.Boolean.TYPE == cls) {
                return java.lang.Boolean.class;
            }
            if (java.lang.Byte.TYPE == cls) {
                return java.lang.Byte.class;
            }
            if (java.lang.Character.TYPE == cls) {
                return java.lang.Character.class;
            }
            if (java.lang.Double.TYPE == cls) {
                return java.lang.Double.class;
            }
            if (java.lang.Float.TYPE == cls) {
                return java.lang.Float.class;
            }
            if (java.lang.Integer.TYPE == cls) {
                return java.lang.Integer.class;
            }
            if (java.lang.Long.TYPE == cls) {
                return java.lang.Long.class;
            }
            return java.lang.Short.TYPE == cls ? java.lang.Short.class : cls;
        }
    }
}
