package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class SearchEvent extends com.crashlytics.android.answers.PredefinedEvent<com.crashlytics.android.answers.SearchEvent> {
    static final java.lang.String QUERY_ATTRIBUTE = "query";
    static final java.lang.String TYPE = "search";

    @Override // com.crashlytics.android.answers.PredefinedEvent
    java.lang.String getPredefinedType() {
        return "search";
    }

    public com.crashlytics.android.answers.SearchEvent putQuery(java.lang.String str) {
        this.predefinedAttributes.put("query", str);
        return this;
    }
}
