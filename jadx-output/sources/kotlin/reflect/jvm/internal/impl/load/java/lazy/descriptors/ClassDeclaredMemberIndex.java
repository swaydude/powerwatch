package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ClassDeclaredMemberIndex implements kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField> fields;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean> memberFilter;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod, java.lang.Boolean> methodFilter;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod>> methods;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass jClass, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, java.lang.Boolean> memberFilter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(memberFilter, "memberFilter");
        this.jClass = jClass;
        this.memberFilter = memberFilter;
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod, java.lang.Boolean> function1 = new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod) {
                return java.lang.Boolean.valueOf(invoke2(javaMethod));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod m) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(m, "m");
                return ((java.lang.Boolean) this.this$0.memberFilter.invoke(m)).booleanValue() && !kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.isObjectMethodInInterface(m);
            }
        };
        this.methodFilter = function1;
        kotlin.sequences.Sequence sequenceFilter = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(jClass.getMethods()), function1);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : sequenceFilter) {
            kotlin.reflect.jvm.internal.impl.name.Name name = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) obj).getName();
            java.lang.Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.methods = linkedHashMap;
        kotlin.sequences.Sequence sequenceFilter2 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : sequenceFilter2) {
            linkedHashMap2.put(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) obj2).getName(), obj2);
        }
        this.fields = linkedHashMap2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> findMethodsByName(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod> listEmptyList = this.methods.get(name);
        if (listEmptyList == null) {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getMethodNames() {
        kotlin.sequences.Sequence sequenceFilter = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(this.jClass.getMethods()), this.methodFilter);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = sequenceFilter.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField findFieldByName(kotlin.reflect.jvm.internal.impl.name.Name name) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        return this.fields.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFieldNames() {
        kotlin.sequences.Sequence sequenceFilter = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(this.jClass.getFields()), this.memberFilter);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = sequenceFilter.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }
}
