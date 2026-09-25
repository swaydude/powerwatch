package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
final class zzh implements java.util.Comparator<com.google.android.gms.location.DetectedActivity> {
    zzh() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.location.DetectedActivity detectedActivity, com.google.android.gms.location.DetectedActivity detectedActivity2) {
        com.google.android.gms.location.DetectedActivity detectedActivity3 = detectedActivity;
        com.google.android.gms.location.DetectedActivity detectedActivity4 = detectedActivity2;
        int iCompareTo = java.lang.Integer.valueOf(detectedActivity4.getConfidence()).compareTo(java.lang.Integer.valueOf(detectedActivity3.getConfidence()));
        return iCompareTo == 0 ? java.lang.Integer.valueOf(detectedActivity3.getType()).compareTo(java.lang.Integer.valueOf(detectedActivity4.getType())) : iCompareTo;
    }
}
