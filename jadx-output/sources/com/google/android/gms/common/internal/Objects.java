package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Objects {
    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper(java.lang.Object obj) {
        return new com.google.android.gms.common.internal.Objects.ToStringHelper(obj);
    }

    public static final class ToStringHelper {
        private final java.util.List<java.lang.String> zzer;
        private final java.lang.Object zzes;

        private ToStringHelper(java.lang.Object obj) {
            this.zzes = com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
            this.zzer = new java.util.ArrayList();
        }

        public final com.google.android.gms.common.internal.Objects.ToStringHelper add(java.lang.String str, java.lang.Object obj) {
            java.util.List<java.lang.String> list = this.zzer;
            java.lang.String str2 = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            java.lang.String strValueOf = java.lang.String.valueOf(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(strValueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(strValueOf);
            list.add(sb.toString());
            return this;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
            sb.append(this.zzes.getClass().getSimpleName());
            sb.append('{');
            int size = this.zzer.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.zzer.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new java.lang.AssertionError("Uninstantiable");
    }
}
