package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: MemberSignature.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MemberSignature {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion(null);
    private final java.lang.String signature;

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, ((kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature) obj).signature);
        }
        return true;
    }

    public int hashCode() {
        java.lang.String str = this.signature;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return "MemberSignature(signature=" + this.signature + ")";
    }

    /* JADX INFO: compiled from: MemberSignature.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromMethod(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature signature) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
            return fromMethodNameAndDesc(nameResolver.getString(signature.getName()), nameResolver.getString(signature.getDesc()));
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromMethodNameAndDesc(java.lang.String name, java.lang.String desc) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature(name + desc, null);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromFieldNameAndDesc(java.lang.String name, java.lang.String desc) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature(name + '#' + desc, null);
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromJvmMemberSignature(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature signature) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
            if (signature instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method) {
                return fromMethodNameAndDesc(signature.getName(), signature.getDesc());
            }
            if (signature instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field) {
                return fromFieldNameAndDesc(signature.getName(), signature.getDesc());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        @kotlin.jvm.JvmStatic
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature fromMethodSignatureAndParameterIndex(kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature signature, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
            return new kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature(signature.getSignature$descriptors_jvm() + '@' + i, null);
        }
    }

    private MemberSignature(java.lang.String str) {
        this.signature = str;
    }

    public /* synthetic */ MemberSignature(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final java.lang.String getSignature$descriptors_jvm() {
        return this.signature;
    }
}
