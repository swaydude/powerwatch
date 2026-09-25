package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ApproximationBounds<T> {
    private final T lower;
    private final T upper;

    public final T component1() {
        return this.lower;
    }

    public final T component2() {
        return this.upper;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds approximationBounds = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.lower, approximationBounds.lower) && kotlin.jvm.internal.Intrinsics.areEqual(this.upper, approximationBounds.upper);
    }

    public int hashCode() {
        T t = this.lower;
        int iHashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.upper;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ApproximationBounds(lower=" + this.lower + ", upper=" + this.upper + ")";
    }

    public ApproximationBounds(T t, T t2) {
        this.lower = t;
        this.upper = t2;
    }

    public final T getLower() {
        return this.lower;
    }

    public final T getUpper() {
        return this.upper;
    }
}
