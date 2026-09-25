package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    public static java.util.Set<com.google.android.gms.common.api.Scope> fromScopeString(java.util.Collection<java.lang.String> collection) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(collection, "scopeStrings can't be null.");
        return fromScopeString((java.lang.String[]) collection.toArray(new java.lang.String[collection.size()]));
    }

    public static java.util.Set<com.google.android.gms.common.api.Scope> fromScopeString(java.lang.String... strArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr, "scopeStrings can't be null.");
        java.util.HashSet hashSet = new java.util.HashSet(strArr.length);
        for (java.lang.String str : strArr) {
            if (!android.text.TextUtils.isEmpty(str)) {
                hashSet.add(new com.google.android.gms.common.api.Scope(str));
            }
        }
        return hashSet;
    }

    public static java.lang.String[] toScopeString(com.google.android.gms.common.api.Scope[] scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scopeArr, "scopes can't be null.");
        java.lang.String[] strArr = new java.lang.String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].getScopeUri();
        }
        return strArr;
    }

    public static java.lang.String[] toScopeString(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(set, "scopes can't be null.");
        return toScopeString((com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[set.size()]));
    }
}
