package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: JavaClassFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface JavaClassFinder {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass findClass(kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request request);

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage findPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    java.util.Set<java.lang.String> knownClassNamesInPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName);

    /* JADX INFO: compiled from: JavaClassFinder.kt */
    public static final class Request {
        private final kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass outerClass;
        private final byte[] previouslyFoundClassFileContent;

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request request = (kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.classId, request.classId) && kotlin.jvm.internal.Intrinsics.areEqual(this.previouslyFoundClassFileContent, request.previouslyFoundClassFileContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.outerClass, request.outerClass);
        }

        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = this.classId;
            int iHashCode = (classId != null ? classId.hashCode() : 0) * 31;
            byte[] bArr = this.previouslyFoundClassFileContent;
            int iHashCode2 = (iHashCode + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0)) * 31;
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass = this.outerClass;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "Request(classId=" + this.classId + ", previouslyFoundClassFileContent=" + java.util.Arrays.toString(this.previouslyFoundClassFileContent) + ", outerClass=" + this.outerClass + ")";
        }

        public Request(kotlin.reflect.jvm.internal.impl.name.ClassId classId, byte[] bArr, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
            this.classId = classId;
            this.previouslyFoundClassFileContent = bArr;
            this.outerClass = javaClass;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
            return this.classId;
        }

        public /* synthetic */ Request(kotlin.reflect.jvm.internal.impl.name.ClassId classId, byte[] bArr, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i & 2) != 0 ? (byte[]) null : bArr, (i & 4) != 0 ? (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) null : javaClass);
        }
    }
}
