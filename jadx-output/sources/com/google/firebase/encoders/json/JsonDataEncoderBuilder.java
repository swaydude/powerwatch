package com.google.firebase.encoders.json;

/* JADX INFO: compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonDataEncoderBuilder implements com.google.firebase.encoders.config.EncoderConfig<com.google.firebase.encoders.json.JsonDataEncoderBuilder> {
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders = new java.util.HashMap();
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.String> STRING_ENCODER = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$1.instance;
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.Boolean> BOOLEAN_ENCODER = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$Lambda$4.instance;
    private static final com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder TIMESTAMP_ENCODER = new com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder();

    /* JADX INFO: compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
    private static final class TimestampEncoder implements com.google.firebase.encoders.ValueEncoder<java.util.Date> {
        private static final java.text.DateFormat rfc339;

        private TimestampEncoder() {
        }

        static {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
            rfc339 = simpleDateFormat;
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(java.util.Date date, com.google.firebase.encoders.ValueEncoderContext valueEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
            valueEncoderContext.add(rfc339.format(date));
        }
    }

    static /* synthetic */ void lambda$static$1(java.lang.Boolean bool, com.google.firebase.encoders.ValueEncoderContext valueEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        valueEncoderContext.add(bool.booleanValue());
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(java.lang.String.class, (com.google.firebase.encoders.ValueEncoder) STRING_ENCODER);
        registerEncoder(java.lang.Boolean.class, (com.google.firebase.encoders.ValueEncoder) BOOLEAN_ENCODER);
        registerEncoder(java.util.Date.class, (com.google.firebase.encoders.ValueEncoder) TIMESTAMP_ENCODER);
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(java.lang.Class<T> cls, com.google.firebase.encoders.ObjectEncoder<? super T> objectEncoder) {
        if (this.objectEncoders.containsKey(cls)) {
            throw new java.lang.IllegalArgumentException("Encoder already registered for " + cls.getName());
        }
        this.objectEncoders.put(cls, objectEncoder);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(java.lang.Class<T> cls, com.google.firebase.encoders.ValueEncoder<? super T> valueEncoder) {
        if (this.valueEncoders.containsKey(cls)) {
            throw new java.lang.IllegalArgumentException("Encoder already registered for " + cls.getName());
        }
        this.valueEncoders.put(cls, valueEncoder);
        return this;
    }

    public com.google.firebase.encoders.json.JsonDataEncoderBuilder configureWith(com.google.firebase.encoders.config.Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    public com.google.firebase.encoders.DataEncoder build() {
        return new com.google.firebase.encoders.DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public void encode(java.lang.Object obj, java.io.Writer writer) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
                com.google.firebase.encoders.json.JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new com.google.firebase.encoders.json.JsonValueObjectEncoderContext(writer, com.google.firebase.encoders.json.JsonDataEncoderBuilder.this.objectEncoders, com.google.firebase.encoders.json.JsonDataEncoderBuilder.this.valueEncoders);
                jsonValueObjectEncoderContext.add(obj);
                jsonValueObjectEncoderContext.close();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public java.lang.String encode(java.lang.Object obj) throws com.google.firebase.encoders.EncodingException {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (java.io.IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }
}
