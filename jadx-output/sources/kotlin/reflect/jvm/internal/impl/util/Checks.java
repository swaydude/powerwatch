package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Checks {
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> additionalCheck;
    private final kotlin.reflect.jvm.internal.impl.util.Check[] checks;
    private final kotlin.reflect.jvm.internal.impl.name.Name name;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> nameList;
    private final kotlin.text.Regex regex;

    /* JADX WARN: Multi-variable type inference failed */
    private Checks(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.text.Regex regex, java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> function1, kotlin.reflect.jvm.internal.impl.util.Check... checkArr) {
        this.name = name;
        this.regex = regex;
        this.nameList = collection;
        this.additionalCheck = function1;
        this.checks = checkArr;
    }

    public final boolean isApplicable(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        if (this.name != null && (!kotlin.jvm.internal.Intrinsics.areEqual(functionDescriptor.getName(), this.name))) {
            return false;
        }
        if (this.regex != null) {
            java.lang.String strAsString = functionDescriptor.getName().asString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "functionDescriptor.name.asString()");
            if (!this.regex.matches(strAsString)) {
                return false;
            }
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> collection = this.nameList;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public final kotlin.reflect.jvm.internal.impl.util.CheckResult checkAll(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionDescriptor, "functionDescriptor");
        for (kotlin.reflect.jvm.internal.impl.util.Check check : this.checks) {
            java.lang.String strInvoke = check.invoke(functionDescriptor);
            if (strInvoke != null) {
                return new kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalSignature(strInvoke);
            }
        }
        java.lang.String strInvoke2 = this.additionalCheck.invoke(functionDescriptor);
        if (strInvoke2 != null) {
            return new kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalSignature(strInvoke2);
        }
        return kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck.INSTANCE;
    }

    public /* synthetic */ Checks(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.reflect.jvm.internal.impl.util.Checks.AnonymousClass2 anonymousClass2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>) ((i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                return null;
            }
        } : anonymousClass2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.util.Check[] checks, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> additionalChecks) {
        this(name, (kotlin.text.Regex) null, (java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>) null, additionalChecks, (kotlin.reflect.jvm.internal.impl.util.Check[]) java.util.Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(checks, "checks");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(kotlin.text.Regex regex, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.reflect.jvm.internal.impl.util.Checks.AnonymousClass3 anonymousClass3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>) ((i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                return null;
            }
        } : anonymousClass3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(kotlin.text.Regex regex, kotlin.reflect.jvm.internal.impl.util.Check[] checks, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> additionalChecks) {
        this((kotlin.reflect.jvm.internal.impl.name.Name) null, regex, (java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>) null, additionalChecks, (kotlin.reflect.jvm.internal.impl.util.Check[]) java.util.Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(regex, "regex");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(checks, "checks");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(java.util.Collection collection, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.reflect.jvm.internal.impl.util.Checks.AnonymousClass4 anonymousClass4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>) collection, checkArr, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>) ((i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                return null;
            }
        } : anonymousClass4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> nameList, kotlin.reflect.jvm.internal.impl.util.Check[] checks, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> additionalChecks) {
        this((kotlin.reflect.jvm.internal.impl.name.Name) null, (kotlin.text.Regex) null, nameList, additionalChecks, (kotlin.reflect.jvm.internal.impl.util.Check[]) java.util.Arrays.copyOf(checks, checks.length));
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameList, "nameList");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(checks, "checks");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(additionalChecks, "additionalChecks");
    }
}
