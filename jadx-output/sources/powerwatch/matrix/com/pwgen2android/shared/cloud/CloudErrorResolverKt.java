package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudErrorResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"cloneResponseBody", "Lokhttp3/ResponseBody;", "rawResponse", "retrofitResponse", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class CloudErrorResolverKt {
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitResponse(java.lang.Throwable th) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody errorBody;
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unknown unknown;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "<this>");
        retrofit2.HttpException httpException = th instanceof retrofit2.HttpException ? (retrofit2.HttpException) th : null;
        if (httpException == null) {
            return null;
        }
        com.google.gson.Gson gson = new com.google.gson.Gson();
        okhttp3.ResponseBody responseBodyCloneResponseBody = cloneResponseBody(httpException.response().errorBody());
        java.lang.String strString = responseBodyCloneResponseBody == null ? null : responseBodyCloneResponseBody.string();
        if (strString != null) {
            try {
                errorBody = (powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody) gson.fromJson(strString, powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody.class);
                if (errorBody == null) {
                    errorBody = new powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody(null, null, 3, null);
                }
            } catch (com.google.gson.JsonSyntaxException unused) {
                errorBody = new powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody(null, null, 3, null);
            }
        } else {
            errorBody = new powerwatch.matrix.com.pwgen2android.shared.cloud.ErrorBody(null, null, 3, null);
        }
        int iCode = httpException.code();
        if (iCode == 400 && kotlin.jvm.internal.Intrinsics.areEqual(errorBody.getErrorMessage(), "Bad credentials")) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.BadCredentials.INSTANCE;
        } else if (iCode == 400 && kotlin.jvm.internal.Intrinsics.areEqual(errorBody.getErrorMessage(), "Password Migration Required")) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.MigrationRequired.INSTANCE;
        } else if (iCode == 400 && kotlin.jvm.internal.Intrinsics.areEqual(errorBody.getErrorMessage(), "User is disabled")) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.UserNotEnabled.INSTANCE;
        } else if (iCode == 400 && kotlin.jvm.internal.Intrinsics.areEqual(errorBody.getErrorMessage(), "Account already exists")) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.AccountAlreadyExists.INSTANCE;
        } else if (iCode == 400 && kotlin.jvm.internal.Intrinsics.areEqual(errorBody.getErrorMessage(), "Provided old password does not match.")) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordNotMatch.INSTANCE;
        } else if (iCode == 400 && kotlin.jvm.internal.Intrinsics.areEqual(errorBody.getErrorMessage(), "password: Password contains a whitespace character.")) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordEmptyChar.INSTANCE;
        } else if (iCode == 401) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unauthorized.INSTANCE;
        } else if (iCode == 403) {
            unknown = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Forbidden.INSTANCE;
        } else {
            unknown = (iCode == 400 && kotlin.jvm.internal.Intrinsics.areEqual(errorBody.getErrorType(), "invalid_grant")) ? powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.InvalidGrant.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unknown.INSTANCE;
        }
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse(httpException.code(), errorBody, unknown);
    }

    private static final okhttp3.ResponseBody cloneResponseBody(okhttp3.ResponseBody responseBody) {
        if (responseBody == null) {
            return null;
        }
        okio.Buffer bufferClone = responseBody.source().buffer().clone();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bufferClone, "responseBody.source().buffer().clone()");
        return okhttp3.ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), bufferClone);
    }
}
