package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Response;", "DATA_PAYLOAD", "", "responseType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "data", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getResponseType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "component1", "component2", "copy", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Response;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2Response<DATA_PAYLOAD> {
    private final DATA_PAYLOAD data;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType responseType;

    /* JADX WARN: Multi-variable type inference failed */
    public Gen2Response() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Response copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Response gen2Response, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType responseType, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            responseType = gen2Response.responseType;
        }
        if ((i & 2) != 0) {
            obj = gen2Response.data;
        }
        return gen2Response.copy(responseType, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType getResponseType() {
        return this.responseType;
    }

    public final DATA_PAYLOAD component2() {
        return this.data;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Response<DATA_PAYLOAD> copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType responseType, DATA_PAYLOAD data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseType, "responseType");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Response<>(responseType, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Response)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Response gen2Response = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Response) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.responseType, gen2Response.responseType) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, gen2Response.data);
    }

    public int hashCode() {
        int iHashCode = this.responseType.hashCode() * 31;
        DATA_PAYLOAD data_payload = this.data;
        return iHashCode + (data_payload == null ? 0 : data_payload.hashCode());
    }

    public java.lang.String toString() {
        return "Gen2Response(responseType=" + this.responseType + ", data=" + this.data + ')';
    }

    public Gen2Response(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType responseType, DATA_PAYLOAD data_payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseType, "responseType");
        this.responseType = responseType;
        this.data = data_payload;
    }

    public /* synthetic */ Gen2Response(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.UNKNOWN unknown, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.UNKNOWN.INSTANCE : unknown, (i & 2) != 0 ? null : obj);
    }

    public final DATA_PAYLOAD getData() {
        return this.data;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType getResponseType() {
        return this.responseType;
    }
}
