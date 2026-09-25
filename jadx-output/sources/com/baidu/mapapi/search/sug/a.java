package com.baidu.mapapi.search.sug;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.search.sug.SuggestionResult> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.sug.SuggestionResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.sug.SuggestionResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.sug.SuggestionResult[] newArray(int i) {
        return new com.baidu.mapapi.search.sug.SuggestionResult[i];
    }
}
