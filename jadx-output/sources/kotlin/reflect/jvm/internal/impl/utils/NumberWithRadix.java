package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: numbers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NumberWithRadix {
    private final java.lang.String number;
    private final int radix;

    public final java.lang.String component1() {
        return this.number;
    }

    public final int component2() {
        return this.radix;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix) {
                kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix numberWithRadix = (kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.number, numberWithRadix.number)) {
                    if (this.radix == numberWithRadix.radix) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        java.lang.String str = this.number;
        return ((str != null ? str.hashCode() : 0) * 31) + this.radix;
    }

    public java.lang.String toString() {
        return "NumberWithRadix(number=" + this.number + ", radix=" + this.radix + ")";
    }

    public NumberWithRadix(java.lang.String number, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(number, "number");
        this.number = number;
        this.radix = i;
    }
}
