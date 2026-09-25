package com.baidu.mapapi.search.sug;

/* JADX INFO: loaded from: classes.dex */
public class SuggestionSearch extends com.baidu.mapapi.search.core.l {
    private boolean b = false;
    com.baidu.platform.core.f.a a = new com.baidu.platform.core.f.b();

    private SuggestionSearch() {
    }

    public static com.baidu.mapapi.search.sug.SuggestionSearch newInstance() {
        com.baidu.mapapi.BMapManager.init();
        return new com.baidu.mapapi.search.sug.SuggestionSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
        com.baidu.mapapi.BMapManager.destroy();
    }

    public boolean requestSuggestion(com.baidu.mapapi.search.sug.SuggestionSearchOption suggestionSearchOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: suggestionsearch is null, please call newInstance() first.");
        }
        if (suggestionSearchOption == null || suggestionSearchOption.mKeyword == null || suggestionSearchOption.mCity == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or keyword or city can not be null");
        }
        return this.a.a(suggestionSearchOption);
    }

    public void setOnGetSuggestionResultListener(com.baidu.mapapi.search.sug.OnGetSuggestionResultListener onGetSuggestionResultListener) {
        com.baidu.platform.core.f.a aVar = this.a;
        if (aVar == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: suggestionsearch is null, please call newInstance() first.");
        }
        if (onGetSuggestionResultListener == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetSuggestionResultListener);
    }
}
