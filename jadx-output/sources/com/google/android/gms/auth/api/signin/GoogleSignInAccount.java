package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.zab();
    private static com.google.android.gms.common.util.Clock zaf = com.google.android.gms.common.util.DefaultClock.getInstance();
    private java.lang.String mId;
    private final int versionCode;
    private java.lang.String zag;
    private java.lang.String zah;
    private java.lang.String zai;
    private android.net.Uri zaj;
    private java.lang.String zak;
    private long zal;
    private java.lang.String zam;
    private java.util.List<com.google.android.gms.common.api.Scope> zan;
    private java.lang.String zao;
    private java.lang.String zap;
    private java.util.Set<com.google.android.gms.common.api.Scope> zaq = new java.util.HashSet();

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zaa(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strOptString = jSONObject.optString("photoUrl", null);
        android.net.Uri uri = !android.text.TextUtils.isEmpty(strOptString) ? android.net.Uri.parse(strOptString) : null;
        long j = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i)));
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountZaa = zaa(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), uri, java.lang.Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountZaa.zak = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccountZaa;
    }

    private static com.google.android.gms.auth.api.signin.GoogleSignInAccount zaa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.net.Uri uri, java.lang.Long l, java.lang.String str7, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? java.lang.Long.valueOf(zaf.currentTimeMillis() / 1000) : l).longValue(), com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str7), new java.util.ArrayList((java.util.Collection) com.google.android.gms.common.internal.Preconditions.checkNotNull(set)), str5, str6);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount createDefault() {
        android.accounts.Account account = new android.accounts.Account("<<default account>>", "com.google");
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, new java.util.HashSet());
    }

    GoogleSignInAccount(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j, java.lang.String str6, java.util.List<com.google.android.gms.common.api.Scope> list, java.lang.String str7, java.lang.String str8) {
        this.versionCode = i;
        this.mId = str;
        this.zag = str2;
        this.zah = str3;
        this.zai = str4;
        this.zaj = uri;
        this.zak = str5;
        this.zal = j;
        this.zam = str6;
        this.zan = list;
        this.zao = str7;
        this.zap = str8;
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public java.lang.String getIdToken() {
        return this.zag;
    }

    public java.lang.String getEmail() {
        return this.zah;
    }

    public android.accounts.Account getAccount() {
        if (this.zah == null) {
            return null;
        }
        return new android.accounts.Account(this.zah, "com.google");
    }

    public java.lang.String getDisplayName() {
        return this.zai;
    }

    public java.lang.String getGivenName() {
        return this.zao;
    }

    public java.lang.String getFamilyName() {
        return this.zap;
    }

    public android.net.Uri getPhotoUrl() {
        return this.zaj;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount requestExtraScopes(com.google.android.gms.common.api.Scope... scopeArr) {
        if (scopeArr != null) {
            java.util.Collections.addAll(this.zaq, scopeArr);
        }
        return this;
    }

    public java.lang.String getServerAuthCode() {
        return this.zak;
    }

    public boolean isExpired() {
        return zaf.currentTimeMillis() / 1000 >= this.zal - 300;
    }

    public final java.lang.String zab() {
        return this.zam;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getGrantedScopes() {
        return new java.util.HashSet(this.zan);
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getRequestedScopes() {
        java.util.HashSet hashSet = new java.util.HashSet(this.zan);
        hashSet.addAll(this.zaq);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zal);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zam, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 10, this.zan, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public int hashCode() {
        return ((this.zam.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        return googleSignInAccount.zam.equals(this.zam) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    public final java.lang.String zac() {
        org.json.JSONObject jSONObjectZad = zad();
        jSONObjectZad.remove("serverAuthCode");
        return jSONObjectZad.toString();
    }

    private final org.json.JSONObject zad() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            if (getPhotoUrl() != null) {
                jSONObject.put("photoUrl", getPhotoUrl().toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zal);
            jSONObject.put("obfuscatedIdentifier", this.zam);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List<com.google.android.gms.common.api.Scope> list = this.zan;
            com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) list.toArray(new com.google.android.gms.common.api.Scope[list.size()]);
            java.util.Arrays.sort(scopeArr, com.google.android.gms.auth.api.signin.zaa.zae);
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
