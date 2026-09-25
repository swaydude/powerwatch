package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
final class SignatureEnhancementBuilder {
    private final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> signatures = new java.util.LinkedHashMap();

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public final class ClassEnhancementBuilder {
        private final java.lang.String className;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder this$0;

        public ClassEnhancementBuilder(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder signatureEnhancementBuilder, java.lang.String className) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(className, "className");
            this.this$0 = signatureEnhancementBuilder;
            this.className = className;
        }

        public final java.lang.String getClassName() {
            return this.className;
        }

        public final void function(java.lang.String name, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
            java.util.Map map = this.this$0.signatures;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder(this, name);
            block.invoke(functionEnhancementBuilder);
            kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> pairBuild = functionEnhancementBuilder.build();
            map.put(pairBuild.getFirst(), pairBuild.getSecond());
        }

        /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
        public final class FunctionEnhancementBuilder {
            private final java.lang.String functionName;
            private final java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> parameters;
            private kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo> returnType;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder, java.lang.String functionName) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionName, "functionName");
                this.this$0 = classEnhancementBuilder;
                this.functionName = functionName;
                this.parameters = new java.util.ArrayList();
                this.returnType = kotlin.TuplesKt.to("V", null);
            }

            public final void parameter(java.lang.String type, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers... qualifiers) {
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo typeEnhancementInfo;
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifiers, "qualifiers");
                java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> list = this.parameters;
                if (qualifiers.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    java.lang.Iterable<kotlin.collections.IndexedValue> iterableWithIndex = kotlin.collections.ArraysKt.withIndex(qualifiers);
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                    for (kotlin.collections.IndexedValue indexedValue : iterableWithIndex) {
                        linkedHashMap.put(java.lang.Integer.valueOf(indexedValue.getIndex()), (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) indexedValue.getValue());
                    }
                    typeEnhancementInfo = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo(linkedHashMap);
                }
                list.add(kotlin.TuplesKt.to(type, typeEnhancementInfo));
            }

            public final void returns(java.lang.String type, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers... qualifiers) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifiers, "qualifiers");
                java.lang.Iterable<kotlin.collections.IndexedValue> iterableWithIndex = kotlin.collections.ArraysKt.withIndex(qualifiers);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                for (kotlin.collections.IndexedValue indexedValue : iterableWithIndex) {
                    linkedHashMap.put(java.lang.Integer.valueOf(indexedValue.getIndex()), (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) indexedValue.getValue());
                }
                this.returnType = kotlin.TuplesKt.to(type, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo(linkedHashMap));
            }

            public final void returns(kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType type) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                this.returnType = kotlin.TuplesKt.to(type.getDesc(), null);
            }

            public final kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> build() {
                kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
                java.lang.String className = this.this$0.getClassName();
                java.lang.String str = this.functionName;
                java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> list = this.parameters;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getFirst());
                }
                java.lang.String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, this.returnType.getFirst()));
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo second = this.returnType.getSecond();
                java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo>> list2 = this.parameters;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) ((kotlin.Pair) it2.next()).getSecond());
                }
                return kotlin.TuplesKt.to(strSignature, new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo(second, arrayList2));
            }
        }
    }

    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo> build() {
        return this.signatures;
    }
}
