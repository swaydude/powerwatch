package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Api.ApiOptions.Optional, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> CREATOR;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_SIGN_IN;
    private static java.util.Comparator<com.google.android.gms.common.api.Scope> zaag;
    public static final com.google.android.gms.common.api.Scope zar = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.PROFILE);
    public static final com.google.android.gms.common.api.Scope zas = new com.google.android.gms.common.api.Scope("email");
    public static final com.google.android.gms.common.api.Scope zat = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.OPEN_ID);
    public static final com.google.android.gms.common.api.Scope zau;
    public static final com.google.android.gms.common.api.Scope zav;
    private final int versionCode;
    private final boolean zaaa;
    private java.lang.String zaab;
    private java.lang.String zaac;
    private java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zaad;
    private java.lang.String zaae;
    private java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zaaf;
    private final java.util.ArrayList<com.google.android.gms.common.api.Scope> zaw;
    private android.accounts.Account zax;
    private boolean zay;
    private final boolean zaz;

    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions zab(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i)));
        }
        java.lang.String strOptString = jSONObject.optString("accountName", null);
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, (java.util.ArrayList<com.google.android.gms.common.api.Scope>) new java.util.ArrayList(hashSet), !android.text.TextUtils.isEmpty(strOptString) ? new android.accounts.Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new java.util.HashMap(), (java.lang.String) null);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class Builder {
        private java.util.Set<com.google.android.gms.common.api.Scope> mScopes;
        private boolean zaaa;
        private java.lang.String zaab;
        private java.lang.String zaac;
        private java.lang.String zaae;
        private java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zaah;
        private android.accounts.Account zax;
        private boolean zay;
        private boolean zaz;

        public Builder() {
            this.mScopes = new java.util.HashSet();
            this.zaah = new java.util.HashMap();
        }

        public Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
            this.mScopes = new java.util.HashSet();
            this.zaah = new java.util.HashMap();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
            this.mScopes = new java.util.HashSet(googleSignInOptions.zaw);
            this.zaz = googleSignInOptions.zaz;
            this.zaaa = googleSignInOptions.zaaa;
            this.zay = googleSignInOptions.zay;
            this.zaab = googleSignInOptions.zaab;
            this.zax = googleSignInOptions.zax;
            this.zaac = googleSignInOptions.zaac;
            this.zaah = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa(googleSignInOptions.zaad);
            this.zaae = googleSignInOptions.zaae;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestId() {
            this.mScopes.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zat);
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestEmail() {
            this.mScopes.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zas);
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestProfile() {
            this.mScopes.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zar);
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestScopes(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
            this.mScopes.add(scope);
            this.mScopes.addAll(java.util.Arrays.asList(scopeArr));
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestIdToken(java.lang.String str) {
            this.zay = true;
            this.zaab = zac(str);
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(java.lang.String str) {
            return requestServerAuthCode(str, false);
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(java.lang.String str, boolean z) {
            this.zaz = true;
            this.zaab = zac(str);
            this.zaaa = z;
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setAccountName(java.lang.String str) {
            this.zax = new android.accounts.Account(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str), "com.google");
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setHostedDomain(java.lang.String str) {
            this.zaac = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setLogSessionId(java.lang.String str) {
            this.zaae = str;
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder addExtension(com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (this.zaah.containsKey(java.lang.Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                throw new java.lang.IllegalStateException("Only one extension per type may be added");
            }
            if (googleSignInOptionsExtension.getImpliedScopes() != null) {
                this.mScopes.addAll(googleSignInOptionsExtension.getImpliedScopes());
            }
            this.zaah.put(java.lang.Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        public final com.google.android.gms.auth.api.signin.GoogleSignInOptions build() {
            if (this.mScopes.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zav) && this.mScopes.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zau)) {
                this.mScopes.remove(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zau);
            }
            if (this.zay && (this.zax == null || !this.mScopes.isEmpty())) {
                requestId();
            }
            return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(this.mScopes), this.zax, this.zay, this.zaz, this.zaaa, this.zaab, this.zaac, this.zaah, this.zaae, null);
        }

        private final java.lang.String zac(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            java.lang.String str2 = this.zaab;
            com.google.android.gms.common.internal.Preconditions.checkArgument(str2 == null || str2.equals(str), "two different server client ids provided");
            return str;
        }
    }

    GoogleSignInOptions(int i, java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> arrayList2, java.lang.String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, zaa(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> map, java.lang.String str3) {
        this.versionCode = i;
        this.zaw = arrayList;
        this.zax = account;
        this.zay = z;
        this.zaz = z2;
        this.zaaa = z3;
        this.zaab = str;
        this.zaac = str2;
        this.zaad = new java.util.ArrayList<>(map.values());
        this.zaaf = map;
        this.zaae = str3;
    }

    public java.util.ArrayList<com.google.android.gms.common.api.Scope> getScopes() {
        return new java.util.ArrayList<>(this.zaw);
    }

    public com.google.android.gms.common.api.Scope[] getScopeArray() {
        java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList = this.zaw;
        return (com.google.android.gms.common.api.Scope[]) arrayList.toArray(new com.google.android.gms.common.api.Scope[arrayList.size()]);
    }

    public android.accounts.Account getAccount() {
        return this.zax;
    }

    public boolean isIdTokenRequested() {
        return this.zay;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zaz;
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zaaa;
    }

    public java.lang.String getServerClientId() {
        return this.zaab;
    }

    public java.lang.String getLogSessionId() {
        return this.zaae;
    }

    public java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zaad;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> zaa(java.util.List<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> list) {
        java.util.HashMap map = new java.util.HashMap();
        if (list == null) {
            return map;
        }
        for (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            map.put(java.lang.Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
        }
        return map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zaac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x008f, TryCatch #0 {ClassCastException -> 0x008f, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:29:0x0069, B:31:0x0071, B:33:0x0079, B:35:0x0081, B:27:0x005d, B:20:0x0040), top: B:41:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x008f, TryCatch #0 {ClassCastException -> 0x008f, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:29:0x0069, B:31:0x0071, B:33:0x0079, B:35:0x0081, B:27:0x005d, B:20:0x0040), top: B:41:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[Catch: ClassCastException -> 0x008f, TryCatch #0 {ClassCastException -> 0x008f, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:29:0x0069, B:31:0x0071, B:33:0x0079, B:35:0x0081, B:27:0x005d, B:20:0x0040), top: B:41:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: ClassCastException -> 0x008f, TryCatch #0 {ClassCastException -> 0x008f, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:29:0x0069, B:31:0x0071, B:33:0x0079, B:35:0x0081, B:27:0x005d, B:20:0x0040), top: B:41:0x0004 }] */
    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
            if (this.zaad.size() <= 0 && googleSignInOptions.zaad.size() <= 0 && this.zaw.size() == googleSignInOptions.getScopes().size() && this.zaw.containsAll(googleSignInOptions.getScopes())) {
                android.accounts.Account account = this.zax;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                        if (android.text.TextUtils.isEmpty(this.zaab)) {
                            if (android.text.TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                                if (this.zaaa != googleSignInOptions.isForceCodeForRefreshToken() && this.zay == googleSignInOptions.isIdTokenRequested() && this.zaz == googleSignInOptions.isServerAuthCodeRequested() && android.text.TextUtils.equals(this.zaae, googleSignInOptions.getLogSessionId())) {
                                    return true;
                                }
                            }
                        } else if (this.zaab.equals(googleSignInOptions.getServerClientId())) {
                            if (this.zaaa != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.getAccount())) {
                    if (android.text.TextUtils.isEmpty(this.zaab)) {
                        if (android.text.TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                            if (this.zaaa != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    } else if (this.zaab.equals(googleSignInOptions.getServerClientId())) {
                        if (this.zaaa != googleSignInOptions.isForceCodeForRefreshToken()) {
                        }
                    }
                }
            }
        } catch (java.lang.ClassCastException unused) {
        }
        return false;
    }

    public int hashCode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList2 = this.zaw;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.common.api.Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.getScopeUri());
        }
        java.util.Collections.sort(arrayList);
        return new com.google.android.gms.auth.api.signin.internal.HashAccumulator().addObject(arrayList).addObject(this.zax).addObject(this.zaab).zaa(this.zaaa).zaa(this.zay).zaa(this.zaz).addObject(this.zaae).hash();
    }

    public final java.lang.String zae() {
        return zad().toString();
    }

    private final org.json.JSONObject zad() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Collections.sort(this.zaw, zaag);
            java.util.ArrayList<com.google.android.gms.common.api.Scope> arrayList = this.zaw;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                com.google.android.gms.common.api.Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            android.accounts.Account account = this.zax;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zay);
            jSONObject.put("forceCodeForRefreshToken", this.zaaa);
            jSONObject.put("serverAuthRequested", this.zaz);
            if (!android.text.TextUtils.isEmpty(this.zaab)) {
                jSONObject.put("serverClientId", this.zaab);
            }
            if (!android.text.TextUtils.isEmpty(this.zaac)) {
                jSONObject.put("hostedDomain", this.zaac);
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* synthetic */ GoogleSignInOptions(int i, java.util.ArrayList arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, com.google.android.gms.auth.api.signin.zac zacVar) {
        this(3, (java.util.ArrayList<com.google.android.gms.common.api.Scope>) arrayList, account, z, z2, z3, str, str2, (java.util.Map<java.lang.Integer, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable>) map, str3);
    }

    static {
        com.google.android.gms.common.api.Scope scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES_LITE);
        zau = scope;
        zav = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES);
        DEFAULT_SIGN_IN = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder().requestId().requestProfile().build();
        DEFAULT_GAMES_SIGN_IN = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder().requestScopes(scope, new com.google.android.gms.common.api.Scope[0]).build();
        CREATOR = new com.google.android.gms.auth.api.signin.zad();
        zaag = new com.google.android.gms.auth.api.signin.zac();
    }
}
