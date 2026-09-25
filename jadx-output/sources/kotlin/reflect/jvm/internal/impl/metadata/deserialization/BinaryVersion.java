package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: BinaryVersion.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BinaryVersion {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion.Companion(null);
    private final int major;
    private final int minor;
    private final int[] numbers;
    private final int patch;
    private final java.util.List<java.lang.Integer> rest;

    public BinaryVersion(int... numbers) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(numbers, "numbers");
        this.numbers = numbers;
        java.lang.Integer orNull = kotlin.collections.ArraysKt.getOrNull(numbers, 0);
        this.major = orNull != null ? orNull.intValue() : -1;
        java.lang.Integer orNull2 = kotlin.collections.ArraysKt.getOrNull(numbers, 1);
        this.minor = orNull2 != null ? orNull2.intValue() : -1;
        java.lang.Integer orNull3 = kotlin.collections.ArraysKt.getOrNull(numbers, 2);
        this.patch = orNull3 != null ? orNull3.intValue() : -1;
        this.rest = numbers.length > 3 ? kotlin.collections.CollectionsKt.toList(kotlin.collections.ArraysKt.asList(numbers).subList(3, numbers.length)) : kotlin.collections.CollectionsKt.emptyList();
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    protected final boolean isCompatibleTo(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion ourVersion) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(ourVersion, "ourVersion");
        int i = this.major;
        if (i == 0) {
            if (ourVersion.major == 0 && this.minor == ourVersion.minor) {
                return true;
            }
        } else if (i == ourVersion.major && this.minor <= ourVersion.minor) {
            return true;
        }
        return false;
    }

    public final boolean isAtLeast(kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion version) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(version, "version");
        return isAtLeast(version.major, version.minor, version.patch);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.patch >= i3;
    }

    public java.lang.String toString() {
        int[] array = toArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int i2 = array[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(java.lang.Integer.valueOf(i2));
        }
        java.util.ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ? "unknown" : kotlin.collections.CollectionsKt.joinToString$default(arrayList2, ".", null, null, 0, null, null, 62, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), obj.getClass())) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion) obj;
            if (this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && kotlin.jvm.internal.Intrinsics.areEqual(this.rest, binaryVersion.rest)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.major;
        int i2 = i + (i * 31) + this.minor;
        int i3 = i2 + (i2 * 31) + this.patch;
        return i3 + (i3 * 31) + this.rest.hashCode();
    }

    /* JADX INFO: compiled from: BinaryVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
