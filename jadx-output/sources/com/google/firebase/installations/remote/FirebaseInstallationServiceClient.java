package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationServiceClient {
    private static final java.lang.String ACCEPT_HEADER_KEY = "Accept";
    private static final java.lang.String API_KEY_HEADER = "x-goog-api-key";
    private static final java.lang.String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final java.lang.String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final java.lang.String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final java.lang.String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final java.lang.String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final java.lang.String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final java.lang.String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final java.lang.String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final java.lang.String FIS_TAG = "Firebase-Installations";
    private static final java.lang.String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final java.lang.String GZIP_CONTENT_ENCODING = "gzip";
    private static final java.lang.String HEART_BEAT_HEADER = "x-firebase-client-log-type";
    private static final java.lang.String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;
    static final java.lang.String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final java.lang.String SDK_VERSION_PREFIX = "a:";
    private static final java.lang.String USER_AGENT_HEADER = "x-firebase-client";
    private static final java.lang.String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final java.lang.String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final java.lang.String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private final android.content.Context context;
    private final com.google.firebase.heartbeatinfo.HeartBeatInfo heartbeatInfo;
    private final com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher;
    private static final java.util.regex.Pattern EXPIRATION_TIMESTAMP_PATTERN = java.util.regex.Pattern.compile("[0-9]+s");
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);

    public FirebaseInstallationServiceClient(android.content.Context context, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo) {
        this.context = context;
        this.userAgentPublisher = userAgentPublisher;
        this.heartbeatInfo = heartBeatInfo;
    }

    public com.google.firebase.installations.remote.InstallationResponse createFirebaseInstallation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) throws java.io.IOException {
        int i = 0;
        java.net.URL url = new java.net.URL(java.lang.String.format("https://%s/%s/%s", FIREBASE_INSTALLATIONS_API_DOMAIN, FIREBASE_INSTALLATIONS_API_VERSION, java.lang.String.format(CREATE_REQUEST_RESOURCE_NAME_FORMAT, str3)));
        while (i <= 1) {
            java.net.HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(url, str);
            try {
                httpURLConnectionOpenHttpURLConnection.setRequestMethod(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST);
                httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                if (str5 != null) {
                    httpURLConnectionOpenHttpURLConnection.addRequestProperty(X_ANDROID_IID_MIGRATION_KEY, str5);
                }
                writeFIDCreateRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection, str2, str4);
                int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    return readCreateResponse(httpURLConnectionOpenHttpURLConnection);
                }
                logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, str4, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    logBadConfigError();
                    return com.google.firebase.installations.remote.InstallationResponse.builder().setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG).build();
                }
                i++;
            } finally {
                httpURLConnectionOpenHttpURLConnection.disconnect();
            }
        }
        throw new java.io.IOException();
    }

    private void writeFIDCreateRequestBodyToOutputStream(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
    }

    private static byte[] getJsonBytes(org.json.JSONObject jSONObject) throws java.io.IOException {
        return jSONObject.toString().getBytes(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    }

    private static void writeRequestBodyToOutputStream(java.net.URLConnection uRLConnection, byte[] bArr) throws java.io.IOException {
        java.io.OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new java.io.IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static org.json.JSONObject buildCreateFirebaseInstallationRequestBody(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", FIREBASE_INSTALLATION_AUTH_VERSION);
            jSONObject.put("sdkVersion", "a:16.3.1");
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static org.json.JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.1");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void deleteFirebaseInstallation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws com.google.firebase.FirebaseException, java.io.IOException {
        int i = 0;
        java.net.URL url = new java.net.URL(java.lang.String.format("https://%s/%s/%s", FIREBASE_INSTALLATIONS_API_DOMAIN, FIREBASE_INSTALLATIONS_API_VERSION, java.lang.String.format(DELETE_REQUEST_RESOURCE_NAME_FORMAT, str3, str2)));
        while (i <= 1) {
            java.net.HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(url, str);
            try {
                httpURLConnectionOpenHttpURLConnection.setRequestMethod(io.fabric.sdk.android.services.network.HttpRequest.METHOD_DELETE);
                httpURLConnectionOpenHttpURLConnection.addRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, "FIS_v2 " + str4);
                int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                    logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        logBadConfigError();
                        throw new com.google.firebase.installations.FirebaseInstallationsException("Bad config while trying to delete FID", com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG);
                    }
                    i++;
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                }
                httpURLConnectionOpenHttpURLConnection.disconnect();
                return;
            } catch (java.lang.Throwable th) {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                throw th;
            }
        }
        throw new java.io.IOException();
    }

    public com.google.firebase.installations.remote.TokenResult generateAuthToken(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.io.IOException {
        int i = 0;
        java.net.URL url = new java.net.URL(java.lang.String.format("https://%s/%s/%s", FIREBASE_INSTALLATIONS_API_DOMAIN, FIREBASE_INSTALLATIONS_API_VERSION, java.lang.String.format(GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT, str3, str2)));
        while (i <= 1) {
            java.net.HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(url, str);
            try {
                httpURLConnectionOpenHttpURLConnection.setRequestMethod(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST);
                httpURLConnectionOpenHttpURLConnection.addRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, "FIS_v2 " + str4);
                writeGenerateAuthTokenRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection);
                int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    return readGenerateAuthTokenResponse(httpURLConnectionOpenHttpURLConnection);
                }
                logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                if (responseCode != 401 && responseCode != 404) {
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        logBadConfigError();
                        return com.google.firebase.installations.remote.TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG).build();
                    }
                    i++;
                }
                return com.google.firebase.installations.remote.TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR).build();
            } finally {
                httpURLConnectionOpenHttpURLConnection.disconnect();
            }
        }
        throw new java.io.IOException();
    }

    private static void logBadConfigError() {
        android.util.Log.e(FIS_TAG, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private java.net.HttpURLConnection openHttpURLConnection(java.net.URL url, java.lang.String str) throws java.io.IOException {
        com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat heartBeatCode;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty(X_ANDROID_PACKAGE_HEADER_KEY, this.context.getPackageName());
        com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo = this.heartbeatInfo;
        if (heartBeatInfo != null && this.userAgentPublisher != null && (heartBeatCode = heartBeatInfo.getHeartBeatCode(FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG)) != com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE) {
            httpURLConnection.addRequestProperty(USER_AGENT_HEADER, this.userAgentPublisher.getUserAgent());
            httpURLConnection.addRequestProperty(HEART_BEAT_HEADER, java.lang.Integer.toString(heartBeatCode.getCode()));
        }
        httpURLConnection.addRequestProperty(X_ANDROID_CERT_HEADER_KEY, getFingerprintHashForPackage());
        httpURLConnection.addRequestProperty(API_KEY_HEADER, str);
        return httpURLConnection;
    }

    private com.google.firebase.installations.remote.InstallationResponse readCreateResponse(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream, UTF_8));
        com.google.firebase.installations.remote.TokenResult.Builder builder = com.google.firebase.installations.remote.TokenResult.builder();
        com.google.firebase.installations.remote.InstallationResponse.Builder builder2 = com.google.firebase.installations.remote.InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (strNextName.equals(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                builder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK).build();
    }

    private com.google.firebase.installations.remote.TokenResult readGenerateAuthTokenResponse(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream, UTF_8));
        com.google.firebase.installations.remote.TokenResult.Builder builder = com.google.firebase.installations.remote.TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.OK).build();
    }

    private java.lang.String getFingerprintHashForPackage() {
        try {
            android.content.Context context = this.context;
            byte[] packageCertificateHashBytes = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                android.util.Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.context.getPackageName());
                return null;
            }
            return com.google.android.gms.common.util.Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("ContentValues", "No such package: " + this.context.getPackageName(), e);
            return null;
        }
    }

    static long parseTokenExpirationTimestamp(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), PARSING_EXPIRATION_TIME_ERROR_MESSAGE);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return java.lang.Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static void logFisCommunicationError(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String errorResponse = readErrorResponse(httpURLConnection);
        if (android.text.TextUtils.isEmpty(errorResponse)) {
            return;
        }
        android.util.Log.w(FIS_TAG, errorResponse);
        android.util.Log.w(FIS_TAG, availableFirebaseOptions(str, str2, str3));
    }

    private static java.lang.String availableFirebaseOptions(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (android.text.TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return java.lang.String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static java.lang.String readErrorResponse(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(errorStream, UTF_8));
        try {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                    return null;
                }
                java.lang.String str = java.lang.String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", java.lang.Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused) {
                }
                return str;
            } catch (java.io.IOException unused2) {
            }
        } catch (java.io.IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused4) {
            }
            throw th;
        }
    }
}
