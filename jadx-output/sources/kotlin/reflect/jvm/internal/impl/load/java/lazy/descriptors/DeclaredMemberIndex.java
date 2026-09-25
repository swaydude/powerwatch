package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DeclaredMemberIndex {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField findFieldByName(kotlin.reflect.jvm.internal.impl.name.Name name);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> findMethodsByName(kotlin.reflect.jvm.internal.impl.name.Name name);

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFieldNames();

    java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getMethodNames();

    /* JADX INFO: compiled from: DeclaredMemberIndex.kt */
    public static final class Empty implements kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField findFieldByName(kotlin.reflect.jvm.internal.impl.name.Name name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            return null;
        }

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> findMethodsByName(kotlin.reflect.jvm.internal.impl.name.Name name) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            return kotlin.collections.CollectionsKt.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getMethodNames() {
            return kotlin.collections.SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFieldNames() {
            return kotlin.collections.SetsKt.emptySet();
        }
    }
}
