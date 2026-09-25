package com.baidu.platform.core.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.baidu.platform.base.a implements com.baidu.platform.core.f.a {
    private com.baidu.mapapi.search.sug.OnGetSuggestionResultListener b = null;

    @Override // com.baidu.platform.core.f.a
    public void a() {
        this.a.lock();
        this.b = null;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.f.a
    public void a(com.baidu.mapapi.search.sug.OnGetSuggestionResultListener onGetSuggestionResultListener) {
        this.a.lock();
        this.b = onGetSuggestionResultListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.core.f.a
    public boolean a(com.baidu.mapapi.search.sug.SuggestionSearchOption suggestionSearchOption) {
        com.baidu.platform.core.f.c cVar = new com.baidu.platform.core.f.c();
        cVar.a(com.baidu.platform.base.SearchType.SUGGESTION_SEARCH_TYPE);
        return a(new com.baidu.platform.core.f.d(suggestionSearchOption), this.b, cVar);
    }
}
