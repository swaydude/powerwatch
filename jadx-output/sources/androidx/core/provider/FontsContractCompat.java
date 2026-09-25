package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public class FontsContractCompat {
    private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;
    public static final java.lang.String PARCEL_FONT_RESULTS = "font_results";
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
    static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = new androidx.collection.LruCache<>(16);
    private static final androidx.core.provider.SelfDestructiveThread sBackgroundThread = new androidx.core.provider.SelfDestructiveThread("fonts", 10, 10000);
    static final java.lang.Object sLock = new java.lang.Object();
    static final androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult>>> sPendingReplies = new androidx.collection.SimpleArrayMap<>();
    private static final java.util.Comparator<byte[]> sByteArrayComparator = new java.util.Comparator<byte[]>() { // from class: androidx.core.provider.FontsContractCompat.5
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length != bArr2.length) {
                length = bArr.length;
                length2 = bArr2.length;
            } else {
                for (int i = 0; i < bArr.length; i++) {
                    if (bArr[i] != bArr2[i]) {
                        length = bArr[i];
                        length2 = bArr2[i];
                    }
                }
                return 0;
            }
            return length - length2;
        }
    };

    public static final class Columns implements android.provider.BaseColumns {
        public static final java.lang.String FILE_ID = "file_id";
        public static final java.lang.String ITALIC = "font_italic";
        public static final java.lang.String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final java.lang.String TTC_INDEX = "font_ttc_index";
        public static final java.lang.String VARIATION_SETTINGS = "font_variation_settings";
        public static final java.lang.String WEIGHT = "font_weight";
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        public static final int RESULT_OK = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i) {
        }

        public void onTypefaceRetrieved(android.graphics.Typeface typeface) {
        }
    }

    private FontsContractCompat() {
    }

    static androidx.core.provider.FontsContractCompat.TypefaceResult getFontInternal(android.content.Context context, androidx.core.provider.FontRequest fontRequest, int i) {
        try {
            androidx.core.provider.FontsContractCompat.FontFamilyResult fontFamilyResultFetchFonts = fetchFonts(context, null, fontRequest);
            if (fontFamilyResultFetchFonts.getStatusCode() == 0) {
                android.graphics.Typeface typefaceCreateFromFontInfo = androidx.core.graphics.TypefaceCompat.createFromFontInfo(context, null, fontFamilyResultFetchFonts.getFonts(), i);
                return new androidx.core.provider.FontsContractCompat.TypefaceResult(typefaceCreateFromFontInfo, typefaceCreateFromFontInfo != null ? 0 : -3);
            }
            return new androidx.core.provider.FontsContractCompat.TypefaceResult(null, fontFamilyResultFetchFonts.getStatusCode() == 1 ? -2 : -3);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return new androidx.core.provider.FontsContractCompat.TypefaceResult(null, -1);
        }
    }

    private static final class TypefaceResult {
        final int mResult;
        final android.graphics.Typeface mTypeface;

        TypefaceResult(android.graphics.Typeface typeface, int i) {
            this.mTypeface = typeface;
            this.mResult = i;
        }
    }

    public static void resetCache() {
        sTypefaceCache.evictAll();
    }

    public static android.graphics.Typeface getFontSync(final android.content.Context context, final androidx.core.provider.FontRequest fontRequest, final androidx.core.content.res.ResourcesCompat.FontCallback fontCallback, final android.os.Handler handler, boolean z, int i, final int i2) {
        final java.lang.String str = fontRequest.getIdentifier() + "-" + i2;
        android.graphics.Typeface typeface = sTypefaceCache.get(str);
        if (typeface != null) {
            if (fontCallback != null) {
                fontCallback.onFontRetrieved(typeface);
            }
            return typeface;
        }
        if (z && i == -1) {
            androidx.core.provider.FontsContractCompat.TypefaceResult fontInternal = getFontInternal(context, fontRequest, i2);
            if (fontCallback != null) {
                if (fontInternal.mResult == 0) {
                    fontCallback.callbackSuccessAsync(fontInternal.mTypeface, handler);
                } else {
                    fontCallback.callbackFailAsync(fontInternal.mResult, handler);
                }
            }
            return fontInternal.mTypeface;
        }
        java.util.concurrent.Callable<androidx.core.provider.FontsContractCompat.TypefaceResult> callable = new java.util.concurrent.Callable<androidx.core.provider.FontsContractCompat.TypefaceResult>() { // from class: androidx.core.provider.FontsContractCompat.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public androidx.core.provider.FontsContractCompat.TypefaceResult call() throws java.lang.Exception {
                androidx.core.provider.FontsContractCompat.TypefaceResult fontInternal2 = androidx.core.provider.FontsContractCompat.getFontInternal(context, fontRequest, i2);
                if (fontInternal2.mTypeface != null) {
                    androidx.core.provider.FontsContractCompat.sTypefaceCache.put(str, fontInternal2.mTypeface);
                }
                return fontInternal2;
            }
        };
        if (z) {
            try {
                return ((androidx.core.provider.FontsContractCompat.TypefaceResult) sBackgroundThread.postAndWait(callable, i)).mTypeface;
            } catch (java.lang.InterruptedException unused) {
                return null;
            }
        }
        androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult> replyCallback = fontCallback == null ? null : new androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult>() { // from class: androidx.core.provider.FontsContractCompat.2
            @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
            public void onReply(androidx.core.provider.FontsContractCompat.TypefaceResult typefaceResult) {
                if (typefaceResult == null) {
                    fontCallback.callbackFailAsync(1, handler);
                } else if (typefaceResult.mResult == 0) {
                    fontCallback.callbackSuccessAsync(typefaceResult.mTypeface, handler);
                } else {
                    fontCallback.callbackFailAsync(typefaceResult.mResult, handler);
                }
            }
        };
        synchronized (sLock) {
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult>>> simpleArrayMap = sPendingReplies;
            java.util.ArrayList<androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult>> arrayList = simpleArrayMap.get(str);
            if (arrayList != null) {
                if (replyCallback != null) {
                    arrayList.add(replyCallback);
                }
                return null;
            }
            if (replyCallback != null) {
                java.util.ArrayList<androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult>> arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(replyCallback);
                simpleArrayMap.put(str, arrayList2);
            }
            sBackgroundThread.postAndReply(callable, new androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult>() { // from class: androidx.core.provider.FontsContractCompat.3
                @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
                public void onReply(androidx.core.provider.FontsContractCompat.TypefaceResult typefaceResult) {
                    synchronized (androidx.core.provider.FontsContractCompat.sLock) {
                        java.util.ArrayList<androidx.core.provider.SelfDestructiveThread.ReplyCallback<androidx.core.provider.FontsContractCompat.TypefaceResult>> arrayList3 = androidx.core.provider.FontsContractCompat.sPendingReplies.get(str);
                        if (arrayList3 == null) {
                            return;
                        }
                        androidx.core.provider.FontsContractCompat.sPendingReplies.remove(str);
                        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                            arrayList3.get(i3).onReply(typefaceResult);
                        }
                    }
                }
            });
            return null;
        }
    }

    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final android.net.Uri mUri;
        private final int mWeight;

        public FontInfo(android.net.Uri uri, int i, int i2, boolean z, int i3) {
            this.mUri = (android.net.Uri) androidx.core.util.Preconditions.checkNotNull(uri);
            this.mTtcIndex = i;
            this.mWeight = i2;
            this.mItalic = z;
            this.mResultCode = i3;
        }

        public android.net.Uri getUri() {
            return this.mUri;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public int getResultCode() {
            return this.mResultCode;
        }
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final androidx.core.provider.FontsContractCompat.FontInfo[] mFonts;
        private final int mStatusCode;

        public FontFamilyResult(int i, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
            this.mStatusCode = i;
            this.mFonts = fontInfoArr;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        public androidx.core.provider.FontsContractCompat.FontInfo[] getFonts() {
            return this.mFonts;
        }
    }

    public static void requestFont(android.content.Context context, androidx.core.provider.FontRequest fontRequest, androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback, android.os.Handler handler) {
        requestFontInternal(context.getApplicationContext(), fontRequest, fontRequestCallback, handler);
    }

    private static void requestFontInternal(final android.content.Context context, final androidx.core.provider.FontRequest fontRequest, final androidx.core.provider.FontsContractCompat.FontRequestCallback fontRequestCallback, android.os.Handler handler) {
        final android.os.Handler handler2 = new android.os.Handler();
        handler.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    androidx.core.provider.FontsContractCompat.FontFamilyResult fontFamilyResultFetchFonts = androidx.core.provider.FontsContractCompat.fetchFonts(context, null, fontRequest);
                    if (fontFamilyResultFetchFonts.getStatusCode() != 0) {
                        int statusCode = fontFamilyResultFetchFonts.getStatusCode();
                        if (statusCode == 1) {
                            handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-2);
                                }
                            });
                            return;
                        } else if (statusCode == 2) {
                            handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                            return;
                        } else {
                            handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                            return;
                        }
                    }
                    androidx.core.provider.FontsContractCompat.FontInfo[] fonts = fontFamilyResultFetchFonts.getFonts();
                    if (fonts == null || fonts.length == 0) {
                        handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.5
                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRequestFailed(1);
                            }
                        });
                        return;
                    }
                    for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fonts) {
                        if (fontInfo.getResultCode() != 0) {
                            final int resultCode = fontInfo.getResultCode();
                            if (resultCode < 0) {
                                handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.6
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        fontRequestCallback.onTypefaceRequestFailed(-3);
                                    }
                                });
                                return;
                            } else {
                                handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.7
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        fontRequestCallback.onTypefaceRequestFailed(resultCode);
                                    }
                                });
                                return;
                            }
                        }
                    }
                    final android.graphics.Typeface typefaceBuildTypeface = androidx.core.provider.FontsContractCompat.buildTypeface(context, null, fonts);
                    if (typefaceBuildTypeface == null) {
                        handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.8
                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRequestFailed(-3);
                            }
                        });
                    } else {
                        handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.9
                            @Override // java.lang.Runnable
                            public void run() {
                                fontRequestCallback.onTypefaceRetrieved(typefaceBuildTypeface);
                            }
                        });
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    handler2.post(new java.lang.Runnable() { // from class: androidx.core.provider.FontsContractCompat.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fontRequestCallback.onTypefaceRequestFailed(-1);
                        }
                    });
                }
            }
        });
    }

    public static android.graphics.Typeface buildTypeface(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr) {
        return androidx.core.graphics.TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> prepareFontData(android.content.Context context, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, android.os.CancellationSignal cancellationSignal) {
        java.util.HashMap map = new java.util.HashMap();
        for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            if (fontInfo.getResultCode() == 0) {
                android.net.Uri uri = fontInfo.getUri();
                if (!map.containsKey(uri)) {
                    map.put(uri, androidx.core.graphics.TypefaceCompatUtil.mmap(context, cancellationSignal, uri));
                }
            }
        }
        return java.util.Collections.unmodifiableMap(map);
    }

    public static androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontRequest fontRequest) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        if (provider == null) {
            return new androidx.core.provider.FontsContractCompat.FontFamilyResult(1, null);
        }
        return new androidx.core.provider.FontsContractCompat.FontFamilyResult(0, getFontFromProvider(context, fontRequest, provider.authority, cancellationSignal));
    }

    public static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager packageManager, androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String providerAuthority = fontRequest.getProviderAuthority();
        android.content.pm.ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
        }
        java.util.List<byte[]> listConvertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        java.util.Collections.sort(listConvertToByteArrayList, sByteArrayComparator);
        java.util.List<java.util.List<byte[]>> certificates = getCertificates(fontRequest, resources);
        for (int i = 0; i < certificates.size(); i++) {
            java.util.ArrayList arrayList = new java.util.ArrayList(certificates.get(i));
            java.util.Collections.sort(arrayList, sByteArrayComparator);
            if (equalsByteArrayList(listConvertToByteArrayList, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return androidx.core.content.res.FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> list, java.util.List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!java.util.Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] signatureArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    static androidx.core.provider.FontsContractCompat.FontInfo[] getFontFromProvider(android.content.Context context, androidx.core.provider.FontRequest fontRequest, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        android.net.Uri uriWithAppendedId;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT).authority(str).build();
        android.net.Uri uriBuild2 = new android.net.Uri.Builder().scheme(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT).authority(str).appendPath("file").build();
        android.database.Cursor cursorQuery = null;
        try {
            if (android.os.Build.VERSION.SDK_INT > 16) {
                cursorQuery = context.getContentResolver().query(uriBuild, new java.lang.String[]{"_id", androidx.core.provider.FontsContractCompat.Columns.FILE_ID, androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX, androidx.core.provider.FontsContractCompat.Columns.VARIATION_SETTINGS, androidx.core.provider.FontsContractCompat.Columns.WEIGHT, androidx.core.provider.FontsContractCompat.Columns.ITALIC, androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE}, "query = ?", new java.lang.String[]{fontRequest.getQuery()}, null, cancellationSignal);
            } else {
                cursorQuery = context.getContentResolver().query(uriBuild, new java.lang.String[]{"_id", androidx.core.provider.FontsContractCompat.Columns.FILE_ID, androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX, androidx.core.provider.FontsContractCompat.Columns.VARIATION_SETTINGS, androidx.core.provider.FontsContractCompat.Columns.WEIGHT, androidx.core.provider.FontsContractCompat.Columns.ITALIC, androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE}, "query = ?", new java.lang.String[]{fontRequest.getQuery()}, null);
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.FILE_ID);
                int columnIndex4 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX);
                int columnIndex5 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.WEIGHT);
                int columnIndex6 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.ITALIC);
                while (cursorQuery.moveToNext()) {
                    int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        uriWithAppendedId = android.content.ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                    } else {
                        uriWithAppendedId = android.content.ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                    }
                    arrayList2.add(new androidx.core.provider.FontsContractCompat.FontInfo(uriWithAppendedId, i2, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (androidx.core.provider.FontsContractCompat.FontInfo[]) arrayList.toArray(new androidx.core.provider.FontsContractCompat.FontInfo[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
