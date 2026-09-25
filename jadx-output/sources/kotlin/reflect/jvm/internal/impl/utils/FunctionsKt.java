package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: functions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionsKt {
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> IDENTITY = new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$IDENTITY$1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return obj;
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> ALWAYS_TRUE = new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_TRUE$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(invoke2(obj));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2(java.lang.Object obj) {
            return true;
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> ALWAYS_NULL = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_NULL$1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Void invoke(java.lang.Object obj) {
            return null;
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> DO_NOTHING = new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
            invoke2(obj);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.lang.Object obj) {
        }
    };
    private static final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, kotlin.Unit> DO_NOTHING_2 = new kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke2(obj, obj2);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.lang.Object obj, java.lang.Object obj2) {
        }
    };
    private static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, kotlin.Unit> DO_NOTHING_3 = new kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            invoke2(obj, obj2, obj3);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        }
    };

    public static final <T> kotlin.jvm.functions.Function1<T, java.lang.Boolean> alwaysTrue() {
        return (kotlin.jvm.functions.Function1<T, java.lang.Boolean>) ALWAYS_TRUE;
    }

    public static final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, kotlin.Unit> getDO_NOTHING_2() {
        return DO_NOTHING_2;
    }

    public static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, kotlin.Unit> getDO_NOTHING_3() {
        return DO_NOTHING_3;
    }
}
