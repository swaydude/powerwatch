package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: EnvelopeDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;", "Lcom/google/gson/JsonDeserializer;", "", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "map", "Ljava/util/HashMap;", "", "Ljava/lang/reflect/Type;", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "context", "Lcom/google/gson/JsonDeserializationContext;", "fillUpBasicData", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;", "envelopeType", "payload", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EnvelopeDeserializer implements com.google.gson.JsonDeserializer<java.lang.Object> {
    private final com.google.gson.Gson gson;
    private final java.util.HashMap<java.lang.String, java.lang.reflect.Type> map;

    public EnvelopeDeserializer(com.google.gson.Gson gson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "gson");
        this.gson = gson;
        java.util.HashMap<java.lang.String, java.lang.reflect.Type> map = new java.util.HashMap<>();
        this.map = map;
        java.lang.String type = powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.WebLogRequest.INSTANCE.getType();
        java.lang.reflect.Type type2 = new com.google.gson.reflect.TypeToken<powerwatch.matrix.com.pwgen2android.shared.logger.WebLog>() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeDeserializer.1
        }.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<WebLog>() {}.type");
        map.put(type, type2);
    }

    private final powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope fillUpBasicData(java.lang.String envelopeType, java.lang.Object payload) {
        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope(envelopeType, payload);
    }

    @Override // com.google.gson.JsonDeserializer
    public java.lang.Object deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.google.gson.JsonObject asJsonObject = json.getAsJsonObject();
        java.lang.Package r6 = ((java.lang.Class) typeOfT).getPackage();
        java.lang.String name = r6 == null ? null : r6.getName();
        java.lang.String str = "";
        java.lang.String type = asJsonObject.get("envelopeType") == null ? "" : asJsonObject.get("envelopeType").getAsString();
        com.google.gson.JsonElement jsonElement = asJsonObject.get("payload");
        try {
            if (!this.map.containsKey(type)) {
                name = "java.lang";
                str = "Object";
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.WebLogRequest.INSTANCE.getType())) {
                java.lang.Object objFromJson = this.gson.fromJson(jsonElement, this.map.get(type));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(payloadElement, turnsType)");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "type");
                return fillUpBasicData(type, objFromJson);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "type");
            java.lang.Object objDeserialize = context.deserialize(jsonElement, java.lang.Class.forName(((java.lang.Object) name) + '.' + str));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objDeserialize, "context.deserialize(payloadElement, Class.forName(\"$packageName.$className\"))");
            return fillUpBasicData(type, objDeserialize);
        } catch (java.lang.ClassNotFoundException e) {
            throw new com.google.gson.JsonParseException(kotlin.jvm.internal.Intrinsics.stringPlus("Unknown payloadElement type: ", ""), e);
        }
    }
}
