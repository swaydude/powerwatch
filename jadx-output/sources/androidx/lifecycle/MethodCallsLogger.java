package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class MethodCallsLogger {
    private java.util.Map<java.lang.String, java.lang.Integer> mCalledMethods = new java.util.HashMap();

    public boolean approveCall(java.lang.String str, int i) {
        java.lang.Integer num = this.mCalledMethods.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z = (iIntValue & i) != 0;
        this.mCalledMethods.put(str, java.lang.Integer.valueOf(i | iIntValue));
        return !z;
    }
}
