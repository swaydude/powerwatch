package com.google.android.datatransport.cct;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CCTDestination implements com.google.android.datatransport.runtime.EncodedDestination {
    public static final com.google.android.datatransport.cct.CCTDestination INSTANCE;
    public static final com.google.android.datatransport.cct.CCTDestination LEGACY_INSTANCE;
    static final java.lang.String zza;
    static final java.lang.String zzb;
    private static final java.lang.String zzc;
    private static final java.util.Set<com.google.android.datatransport.Encoding> zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;

    static {
        java.lang.String strZza = com.google.android.datatransport.cct.zzd.zza("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        zza = strZza;
        java.lang.String strZza2 = com.google.android.datatransport.cct.zzd.zza("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        zzb = strZza2;
        java.lang.String strZza3 = com.google.android.datatransport.cct.zzd.zza("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        zzc = strZza3;
        zzd = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.datatransport.Encoding.of("proto"), com.google.android.datatransport.Encoding.of("json"))));
        INSTANCE = new com.google.android.datatransport.cct.CCTDestination(strZza, null);
        LEGACY_INSTANCE = new com.google.android.datatransport.cct.CCTDestination(strZza2, strZza3);
    }

    public CCTDestination(java.lang.String str, java.lang.String str2) {
        this.zze = str;
        this.zzf = str2;
    }

    public static com.google.android.datatransport.cct.CCTDestination fromByteArray(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
        if (!str.startsWith("1$")) {
            throw new java.lang.IllegalArgumentException("Version marker missing from extras");
        }
        java.lang.String[] strArrSplit = str.substring(2).split(java.util.regex.Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new java.lang.IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        java.lang.String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        java.lang.String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new com.google.android.datatransport.cct.CCTDestination(str2, str3);
    }

    public byte[] asByteArray() {
        java.lang.String str = this.zzf;
        if (str == null && this.zze == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = "1$";
        objArr[1] = this.zze;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return java.lang.String.format("%s%s%s%s", objArr).getBytes(java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
    }

    public java.lang.String getAPIKey() {
        return this.zzf;
    }

    public java.lang.String getEndPoint() {
        return this.zze;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public java.lang.String getName() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public java.util.Set<com.google.android.datatransport.Encoding> getSupportedEncodings() {
        return zzd;
    }
}
