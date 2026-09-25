package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface KotlinClassFinder extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder {
    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass);

    kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent(kotlin.reflect.jvm.internal.impl.name.ClassId classId);

    /* JADX INFO: compiled from: KotlinClassFinder.kt */
    public static abstract class Result {
        private Result() {
        }

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass kotlinClass = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass) (!(this instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass) ? null : this);
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class KotlinClass extends kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result {
            private final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass;

            public boolean equals(java.lang.Object obj) {
                if (this != obj) {
                    return (obj instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.kotlinJvmBinaryClass, ((kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.KotlinClass) obj).kotlinJvmBinaryClass);
                }
                return true;
            }

            public int hashCode() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass = this.kotlinJvmBinaryClass;
                if (kotlinJvmBinaryClass != null) {
                    return kotlinJvmBinaryClass.hashCode();
                }
                return 0;
            }

            public java.lang.String toString() {
                return "KotlinClass(kotlinJvmBinaryClass=" + this.kotlinJvmBinaryClass + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.kotlinJvmBinaryClass = kotlinJvmBinaryClass;
            }

            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.kotlinJvmBinaryClass;
            }
        }

        /* JADX INFO: compiled from: KotlinClassFinder.kt */
        public static final class ClassFileContent extends kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result {
            private final byte[] content;

            public boolean equals(java.lang.Object obj) {
                if (this != obj) {
                    return (obj instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, ((kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent) obj).content);
                }
                return true;
            }

            public int hashCode() {
                byte[] bArr = this.content;
                if (bArr != null) {
                    return java.util.Arrays.hashCode(bArr);
                }
                return 0;
            }

            public java.lang.String toString() {
                return "ClassFileContent(content=" + java.util.Arrays.toString(this.content) + ")";
            }

            public final byte[] getContent() {
                return this.content;
            }
        }
    }
}
