package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSearchResult {
    public static final int STATUS_CODE_NETWORK_ERROR = -3;
    public static final int STATUS_CODE_NETWORK_TIME_OUT = -2;
    public static final int STATUS_CODE_PARAM_ERROR = 2;
    public static final int STATUS_CODE_PERMISSION_UNFINISHED = -4;
    public static final int STATUS_CODE_RESULT_NOTFOUND = -1;
    public static final int STATUS_CODE_SEARVER_ERROR = 1;
    public static final int STATUS_CODE_SUCCEED = 0;
    public int size;
    public int status = -1;
    public int total;

    public void parseFromJSON(org.json.JSONObject jSONObject) throws org.json.JSONException {
        int iOptInt = jSONObject.optInt("status");
        this.status = iOptInt;
        if (iOptInt == 1233 || iOptInt == 2) {
            this.status = 2;
        }
        this.size = jSONObject.optInt("size");
        this.total = jSONObject.optInt("total");
    }
}
