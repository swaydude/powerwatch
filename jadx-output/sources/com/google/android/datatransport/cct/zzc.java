package com.google.android.datatransport.cct;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements com.google.android.datatransport.runtime.backends.TransportBackend {
    private final android.net.ConnectivityManager zzb;
    private final com.google.android.datatransport.runtime.time.Clock zzd;
    private final com.google.android.datatransport.runtime.time.Clock zze;
    private final com.google.firebase.encoders.DataEncoder zza = com.google.android.datatransport.cct.a.zzs.zza();
    final java.net.URL zzc = zza(com.google.android.datatransport.cct.CCTDestination.zza);
    private final int zzf = 40000;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zza {
        final java.net.URL zza;
        final com.google.android.datatransport.cct.a.zzo zzb;
        final java.lang.String zzc;

        zza(java.net.URL url, com.google.android.datatransport.cct.a.zzo zzoVar, java.lang.String str) {
            this.zza = url;
            this.zzb = zzoVar;
            this.zzc = str;
        }

        com.google.android.datatransport.cct.zzc.zza zza(java.net.URL url) {
            return new com.google.android.datatransport.cct.zzc.zza(url, this.zzb, this.zzc);
        }
    }

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zzb {
        final int zza;
        final java.net.URL zzb;
        final long zzc;

        zzb(int i, java.net.URL url, long j) {
            this.zza = i;
            this.zzb = url;
            this.zzc = j;
        }
    }

    zzc(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2) {
        this.zzb = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.zzd = clock2;
        this.zze = clock;
    }

    private static java.net.URL zza(java.lang.String str) {
        try {
            return new java.net.URL(str);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public com.google.android.datatransport.runtime.EventInternal decorate(com.google.android.datatransport.runtime.EventInternal eventInternal) {
        int subtype;
        android.net.NetworkInfo activeNetworkInfo = this.zzb.getActiveNetworkInfo();
        com.google.android.datatransport.runtime.EventInternal.Builder builderAddMetadata = eventInternal.toBuilder().addMetadata("sdk-version", android.os.Build.VERSION.SDK_INT).addMetadata("model", android.os.Build.MODEL).addMetadata("hardware", android.os.Build.HARDWARE).addMetadata("device", android.os.Build.DEVICE).addMetadata("product", android.os.Build.PRODUCT).addMetadata("os-uild", android.os.Build.ID).addMetadata("manufacturer", android.os.Build.MANUFACTURER).addMetadata("fingerprint", android.os.Build.FINGERPRINT);
        java.util.Calendar.getInstance();
        com.google.android.datatransport.runtime.EventInternal.Builder builderAddMetadata2 = builderAddMetadata.addMetadata("tz-offset", java.util.TimeZone.getDefault().getOffset(java.util.Calendar.getInstance().getTimeInMillis()) / 1000).addMetadata("net-type", activeNetworkInfo == null ? com.google.android.datatransport.cct.a.zzy.zzc.zzs.zza() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            subtype = com.google.android.datatransport.cct.a.zzy.zzb.zza.zza();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = com.google.android.datatransport.cct.a.zzy.zzb.zzu.zza();
            } else if (com.google.android.datatransport.cct.a.zzy.zzb.zza(subtype) == null) {
                subtype = 0;
            }
        }
        return builderAddMetadata2.addMetadata("mobile-subtype", subtype).build();
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest backendRequest) {
        com.google.android.datatransport.cct.a.zzt.zza zzaVarZza;
        java.util.HashMap map = new java.util.HashMap();
        for (com.google.android.datatransport.runtime.EventInternal eventInternal : backendRequest.getEvents()) {
            java.lang.String transportName = eventInternal.getTransportName();
            if (map.containsKey(transportName)) {
                ((java.util.List) map.get(transportName)).add(eventInternal);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(eventInternal);
                map.put(transportName, arrayList);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            com.google.android.datatransport.runtime.EventInternal eventInternal2 = (com.google.android.datatransport.runtime.EventInternal) ((java.util.List) entry.getValue()).get(0);
            com.google.android.datatransport.cct.a.zzv.zza zzaVarZza2 = com.google.android.datatransport.cct.a.zzv.zza().zza(com.google.android.datatransport.cct.a.zzaa.zza).zza(this.zze.getTime()).zzb(this.zzd.getTime()).zza(com.google.android.datatransport.cct.a.zzq.zza().zza(com.google.android.datatransport.cct.a.zzq.zzb.zzb).zza(com.google.android.datatransport.cct.a.zza.zza().zza(eventInternal2.getInteger("sdk-version")).zze(eventInternal2.get("model")).zzc(eventInternal2.get("hardware")).zza(eventInternal2.get("device")).zzg(eventInternal2.get("product")).zzf(eventInternal2.get("os-uild")).zzd(eventInternal2.get("manufacturer")).zzb(eventInternal2.get("fingerprint")).zza()).zza());
            try {
                zzaVarZza2.zzb(java.lang.Integer.valueOf((java.lang.String) entry.getKey()).intValue());
            } catch (java.lang.NumberFormatException unused) {
                zzaVarZza2.zzb((java.lang.String) entry.getKey());
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (com.google.android.datatransport.runtime.EventInternal eventInternal3 : (java.util.List) entry.getValue()) {
                com.google.android.datatransport.runtime.EncodedPayload encodedPayload = eventInternal3.getEncodedPayload();
                com.google.android.datatransport.Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(com.google.android.datatransport.Encoding.of("proto"))) {
                    zzaVarZza = com.google.android.datatransport.cct.a.zzt.zza(encodedPayload.getBytes());
                } else if (encoding.equals(com.google.android.datatransport.Encoding.of("json"))) {
                    zzaVarZza = com.google.android.datatransport.cct.a.zzt.zza(new java.lang.String(encodedPayload.getBytes(), java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8)));
                } else {
                    com.google.android.datatransport.runtime.logging.Logging.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                zzaVarZza.zza(eventInternal3.getEventMillis()).zzb(eventInternal3.getUptimeMillis()).zzc(eventInternal3.getLong("tz-offset")).zza(com.google.android.datatransport.cct.a.zzy.zza().zza(com.google.android.datatransport.cct.a.zzy.zzc.zza(eventInternal3.getInteger("net-type"))).zza(com.google.android.datatransport.cct.a.zzy.zzb.zza(eventInternal3.getInteger("mobile-subtype"))).zza());
                if (eventInternal3.getCode() != null) {
                    zzaVarZza.zza(eventInternal3.getCode().intValue());
                }
                arrayList3.add(zzaVarZza.zza());
            }
            zzaVarZza2.zza(arrayList3);
            arrayList2.add(zzaVarZza2.zza());
        }
        com.google.android.datatransport.cct.a.zzo zzoVarZza = com.google.android.datatransport.cct.a.zzo.zza(arrayList2);
        java.lang.String aPIKey = null;
        java.net.URL urlZza = this.zzc;
        if (backendRequest.getExtras() != null) {
            try {
                com.google.android.datatransport.cct.CCTDestination cCTDestinationFromByteArray = com.google.android.datatransport.cct.CCTDestination.fromByteArray(backendRequest.getExtras());
                aPIKey = cCTDestinationFromByteArray.getAPIKey() != null ? cCTDestinationFromByteArray.getAPIKey() : null;
                if (cCTDestinationFromByteArray.getEndPoint() != null) {
                    urlZza = zza(cCTDestinationFromByteArray.getEndPoint());
                }
            } catch (java.lang.IllegalArgumentException unused2) {
                return com.google.android.datatransport.runtime.backends.BackendResponse.fatalError();
            }
        }
        try {
            com.google.android.datatransport.cct.zzc.zzb zzbVar = (com.google.android.datatransport.cct.zzc.zzb) com.google.android.datatransport.runtime.retries.Retries.retry(5, new com.google.android.datatransport.cct.zzc.zza(urlZza, zzoVarZza, aPIKey), com.google.android.datatransport.cct.zza.zza(this), com.google.android.datatransport.cct.zzb.zza());
            if (zzbVar.zza == 200) {
                return com.google.android.datatransport.runtime.backends.BackendResponse.ok(zzbVar.zzc);
            }
            int i = zzbVar.zza;
            if (i < 500 && i != 404) {
                return com.google.android.datatransport.runtime.backends.BackendResponse.fatalError();
            }
            return com.google.android.datatransport.runtime.backends.BackendResponse.transientError();
        } catch (java.io.IOException e) {
            com.google.android.datatransport.runtime.logging.Logging.e("CctTransportBackend", "Could not make request to the backend", e);
            return com.google.android.datatransport.runtime.backends.BackendResponse.transientError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.datatransport.cct.zzc.zzb zza(com.google.android.datatransport.cct.zzc.zza zzaVar) throws java.io.IOException {
        java.io.InputStream inputStream;
        com.google.android.datatransport.runtime.logging.Logging.d("CctTransportBackend", "Making request to: %s", zzaVar.zza);
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) zzaVar.zza.openConnection();
        httpURLConnection.setConnectTimeout(com.baidu.mapapi.UIMsg.m_AppUI.MSG_RADAR_SEARCH_RETURN_RESULT);
        httpURLConnection.setReadTimeout(this.zzf);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", java.lang.String.format("datatransport/%s android/", "2.2.0"));
        httpURLConnection.setRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_ENCODING, io.fabric.sdk.android.services.network.HttpRequest.ENCODING_GZIP);
        httpURLConnection.setRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty(io.fabric.sdk.android.services.network.HttpRequest.HEADER_ACCEPT_ENCODING, io.fabric.sdk.android.services.network.HttpRequest.ENCODING_GZIP);
        java.lang.String str = zzaVar.zzc;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        java.nio.channels.WritableByteChannel writableByteChannelNewChannel = java.nio.channels.Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    this.zza.encode(zzaVar.zzb, new java.io.OutputStreamWriter(gZIPOutputStream));
                    gZIPOutputStream.close();
                    writableByteChannelNewChannel.write(java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                    int responseCode = httpURLConnection.getResponseCode();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Status Code: ");
                    sb.append(responseCode);
                    com.google.android.datatransport.runtime.logging.Logging.i("CctTransportBackend", sb.toString());
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("Content-Type: ");
                    sb2.append(httpURLConnection.getHeaderField(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE));
                    com.google.android.datatransport.runtime.logging.Logging.i("CctTransportBackend", sb2.toString());
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append("Content-Encoding: ");
                    sb3.append(httpURLConnection.getHeaderField(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_ENCODING));
                    com.google.android.datatransport.runtime.logging.Logging.i("CctTransportBackend", sb3.toString());
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            com.google.android.datatransport.cct.zzc.zzb zzbVar = new com.google.android.datatransport.cct.zzc.zzb(responseCode, null, 0L);
                            writableByteChannelNewChannel.close();
                            return zzbVar;
                        }
                        java.lang.String headerField = httpURLConnection.getHeaderField(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_ENCODING);
                        if (headerField != null && headerField.equals(io.fabric.sdk.android.services.network.HttpRequest.ENCODING_GZIP)) {
                            inputStream = new java.util.zip.GZIPInputStream(httpURLConnection.getInputStream());
                        } else {
                            inputStream = httpURLConnection.getInputStream();
                        }
                        try {
                            com.google.android.datatransport.cct.zzc.zzb zzbVar2 = new com.google.android.datatransport.cct.zzc.zzb(responseCode, null, com.google.android.datatransport.cct.a.zzx.zza(new java.io.InputStreamReader(inputStream)).zza());
                            inputStream.close();
                            writableByteChannelNewChannel.close();
                            return zzbVar2;
                        } catch (java.lang.Throwable th) {
                            inputStream.close();
                            throw th;
                        }
                    }
                    com.google.android.datatransport.cct.zzc.zzb zzbVar3 = new com.google.android.datatransport.cct.zzc.zzb(responseCode, new java.net.URL(httpURLConnection.getHeaderField(io.fabric.sdk.android.services.network.HttpRequest.HEADER_LOCATION)), 0L);
                    writableByteChannelNewChannel.close();
                    return zzbVar3;
                } catch (java.lang.Throwable th2) {
                    gZIPOutputStream.close();
                    throw th2;
                }
            } catch (com.google.firebase.encoders.EncodingException | java.io.IOException e) {
                com.google.android.datatransport.runtime.logging.Logging.e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                com.google.android.datatransport.cct.zzc.zzb zzbVar4 = new com.google.android.datatransport.cct.zzc.zzb(400, null, 0L);
                gZIPOutputStream.close();
                writableByteChannelNewChannel.close();
                return zzbVar4;
            }
        } catch (java.lang.Throwable th3) {
            writableByteChannelNewChannel.close();
            throw th3;
        }
    }

    static /* synthetic */ com.google.android.datatransport.cct.zzc.zza zza(com.google.android.datatransport.cct.zzc.zza zzaVar, com.google.android.datatransport.cct.zzc.zzb zzbVar) {
        java.net.URL url = zzbVar.zzb;
        if (url == null) {
            return null;
        }
        com.google.android.datatransport.runtime.logging.Logging.d("CctTransportBackend", "Following redirect to: %s", url);
        return zzaVar.zza(zzbVar.zzb);
    }
}
