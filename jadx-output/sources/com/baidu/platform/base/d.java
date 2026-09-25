package com.baidu.platform.base;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    protected com.baidu.platform.base.SearchType a;

    public abstract com.baidu.mapapi.search.core.SearchResult a(java.lang.String str);

    public com.baidu.platform.base.SearchType a() {
        return this.a;
    }

    public abstract void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj);

    public void a(com.baidu.platform.base.SearchType searchType) {
        this.a = searchType;
    }

    protected boolean a(java.lang.String str, com.baidu.mapapi.search.core.SearchResult searchResult, boolean z) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    int iOptInt = new org.json.JSONObject(str).optInt(z ? "status" : "status_sp");
                    if (iOptInt == 0) {
                        return false;
                    }
                    if (iOptInt != 200 && iOptInt != 230) {
                        switch (iOptInt) {
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                                errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                                break;
                            default:
                                errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                                break;
                        }
                    } else {
                        errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.KEY_ERROR;
                    }
                    searchResult.error = errorno;
                    return true;
                }
            } catch (org.json.JSONException e) {
                e.printStackTrace();
                searchResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return true;
            }
        }
        searchResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
        return true;
    }
}
