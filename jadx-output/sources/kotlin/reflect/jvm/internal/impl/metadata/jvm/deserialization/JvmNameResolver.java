package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* JADX INFO: compiled from: JvmNameResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmNameResolver implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver {
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver.Companion Companion = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver.Companion(null);
    private static final java.util.List<java.lang.String> PREDEFINED_STRINGS;
    private static final java.util.Map<java.lang.String, java.lang.Integer> PREDEFINED_STRINGS_MAP;
    private final java.util.Set<java.lang.Integer> localNameIndices;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record> records;
    private final java.lang.String[] strings;
    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes types;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
        }
    }

    public JvmNameResolver(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes types, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(strings, "strings");
        this.types = types;
        this.strings = strings;
        java.util.List<java.lang.Integer> localNameList = types.getLocalNameList();
        this.localNameIndices = localNameList.isEmpty() ? kotlin.collections.SetsKt.emptySet() : kotlin.collections.CollectionsKt.toSet(localNameList);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record> recordList = types.getRecordList();
        arrayList.ensureCapacity(recordList.size());
        for (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record record : recordList) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(record, "record");
            int range = record.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        this.records = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public java.lang.String getString(int i) {
        java.lang.String string;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record record = this.records.get(i);
        if (record.hasString()) {
            string = record.getString();
        } else if (record.hasPredefinedIndex()) {
            java.util.List<java.lang.String> list = PREDEFINED_STRINGS;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex >= 0 && size > predefinedIndex) {
                string = list.get(record.getPredefinedIndex());
            } else {
                string = this.strings[i];
            }
        } else {
            string = this.strings[i];
        }
        if (record.getSubstringIndexCount() >= 2) {
            java.util.List<java.lang.Integer> substringIndexList = record.getSubstringIndexList();
            java.lang.Integer begin = substringIndexList.get(0);
            java.lang.Integer end = substringIndexList.get(1);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(begin, "begin");
            if (kotlin.jvm.internal.Intrinsics.compare(0, begin.intValue()) <= 0) {
                int iIntValue = begin.intValue();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(end, "end");
                if (kotlin.jvm.internal.Intrinsics.compare(iIntValue, end.intValue()) <= 0 && kotlin.jvm.internal.Intrinsics.compare(end.intValue(), string.length()) <= 0) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "string");
                    int iIntValue2 = begin.intValue();
                    int iIntValue3 = end.intValue();
                    if (string == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    string = string.substring(iIntValue2, iIntValue3);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        java.lang.String string2 = string;
        if (record.getReplaceCharCount() >= 2) {
            java.util.List<java.lang.Integer> replaceCharList = record.getReplaceCharList();
            java.lang.Integer num = replaceCharList.get(0);
            java.lang.Integer num2 = replaceCharList.get(1);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string2, "string");
            string2 = kotlin.text.StringsKt.replace$default(string2, (char) num.intValue(), (char) num2.intValue(), false, 4, (java.lang.Object) null);
        }
        java.lang.String string3 = string2;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver.WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i2 == 2) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string3, "string");
            string3 = kotlin.text.StringsKt.replace$default(string3, kotlin.text.Typography.dollar, '.', false, 4, (java.lang.Object) null);
        } else if (i2 == 3) {
            if (string3.length() >= 2) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string3, "string");
                int length = string3.length() - 1;
                if (string3 == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                string3 = string3.substring(1, length);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            java.lang.String string4 = string3;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string4, "string");
            string3 = kotlin.text.StringsKt.replace$default(string4, kotlin.text.Typography.dollar, '.', false, 4, (java.lang.Object) null);
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string3, "string");
        return string3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public java.lang.String getQualifiedClassName(int i) {
        return getString(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(java.lang.Integer.valueOf(i));
    }

    /* JADX INFO: compiled from: JvmNameResolver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.util.List<java.lang.String> listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator"});
        PREDEFINED_STRINGS = listListOf;
        java.lang.Iterable<kotlin.collections.IndexedValue> iterableWithIndex = kotlin.collections.CollectionsKt.withIndex(listListOf);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (kotlin.collections.IndexedValue indexedValue : iterableWithIndex) {
            linkedHashMap.put((java.lang.String) indexedValue.getValue(), java.lang.Integer.valueOf(indexedValue.getIndex()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }
}
