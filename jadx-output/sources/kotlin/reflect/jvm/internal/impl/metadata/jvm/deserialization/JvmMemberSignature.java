package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* JADX INFO: compiled from: JvmMemberSignature.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class JvmMemberSignature {
    public abstract java.lang.String asString();

    public abstract java.lang.String getDesc();

    public abstract java.lang.String getName();

    private JvmMemberSignature() {
    }

    public /* synthetic */ JvmMemberSignature(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class Method extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature {
        private final java.lang.String desc;
        private final java.lang.String name;

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method method = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(getName(), method.getName()) && kotlin.jvm.internal.Intrinsics.areEqual(getDesc(), method.getDesc());
        }

        public int hashCode() {
            java.lang.String name = getName();
            int iHashCode = (name != null ? name.hashCode() : 0) * 31;
            java.lang.String desc = getDesc();
            return iHashCode + (desc != null ? desc.hashCode() : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(java.lang.String name, java.lang.String desc) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
            this.name = name;
            this.desc = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public java.lang.String getDesc() {
            return this.desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public java.lang.String getName() {
            return this.name;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public java.lang.String asString() {
            return getName() + getDesc();
        }
    }

    /* JADX INFO: compiled from: JvmMemberSignature.kt */
    public static final class Field extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature {
        private final java.lang.String desc;
        private final java.lang.String name;

        public final java.lang.String component1() {
            return getName();
        }

        public final java.lang.String component2() {
            return getDesc();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field field = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(getName(), field.getName()) && kotlin.jvm.internal.Intrinsics.areEqual(getDesc(), field.getDesc());
        }

        public int hashCode() {
            java.lang.String name = getName();
            int iHashCode = (name != null ? name.hashCode() : 0) * 31;
            java.lang.String desc = getDesc();
            return iHashCode + (desc != null ? desc.hashCode() : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(java.lang.String name, java.lang.String desc) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "desc");
            this.name = name;
            this.desc = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public java.lang.String getDesc() {
            return this.desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public java.lang.String getName() {
            return this.name;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public java.lang.String asString() {
            return getName() + ':' + getDesc();
        }
    }

    public final java.lang.String toString() {
        return asString();
    }
}
