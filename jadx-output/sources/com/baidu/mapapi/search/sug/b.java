package com.baidu.mapapi.search.sug;

/* JADX INFO: loaded from: classes.dex */
final class b implements android.os.Parcelable.Creator<com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo[i];
    }
}
