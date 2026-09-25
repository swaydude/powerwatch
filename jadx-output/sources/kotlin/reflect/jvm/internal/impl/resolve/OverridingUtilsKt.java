package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: compiled from: overridingUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> java.util.Collection<H> selectMostSpecificInEachOverridableGroup(java.util.Collection<? extends H> selectMostSpecificInEachOverridableGroup, kotlin.jvm.functions.Function1<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> descriptorByHandle) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptorByHandle, "descriptorByHandle");
        if (selectMostSpecificInEachOverridableGroup.size() <= 1) {
            return selectMostSpecificInEachOverridableGroup;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(selectMostSpecificInEachOverridableGroup);
        kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSetCreate = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
        while (true) {
            java.util.LinkedList linkedList2 = linkedList;
            if (!linkedList2.isEmpty()) {
                java.lang.Object objFirst = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) linkedList);
                final kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSetCreate2 = kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion.create();
                java.util.Collection<android.R.bool> collectionExtractMembersOverridableInBothWays = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.extractMembersOverridableInBothWays(objFirst, linkedList2, descriptorByHandle, new kotlin.jvm.functions.Function1<H, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                        invoke2(obj);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(H it) {
                        kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSet = smartSetCreate2;
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        smartSet.add(it);
                    }
                });
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionExtractMembersOverridableInBothWays, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
                if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                    java.lang.Object objSingle = kotlin.collections.CollectionsKt.single(collectionExtractMembersOverridableInBothWays);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "overridableGroup.single()");
                    smartSetCreate.add(objSingle);
                } else {
                    android.R.bool boolVar = (java.lang.Object) kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, descriptorByHandle);
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(boolVar, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptorInvoke = descriptorByHandle.invoke(boolVar);
                    for (android.R.bool it : collectionExtractMembersOverridableInBothWays) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        if (!kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.isMoreSpecific(callableDescriptorInvoke, descriptorByHandle.invoke(it))) {
                            smartSetCreate2.add(it);
                        }
                    }
                    kotlin.reflect.jvm.internal.impl.utils.SmartSet smartSet = smartSetCreate2;
                    if (!smartSet.isEmpty()) {
                        smartSetCreate.addAll(smartSet);
                    }
                    smartSetCreate.add(boolVar);
                }
            } else {
                return smartSetCreate;
            }
        }
    }

    public static final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> void retainMostSpecificInEachOverridableGroup(java.util.Collection<D> retainMostSpecificInEachOverridableGroup) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(retainMostSpecificInEachOverridableGroup, "$this$retainMostSpecificInEachOverridableGroup");
        java.util.Collection<?> collectionSelectMostSpecificInEachOverridableGroup = selectMostSpecificInEachOverridableGroup(retainMostSpecificInEachOverridableGroup, new kotlin.jvm.functions.Function1<D, D>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$retainMostSpecificInEachOverridableGroup$newResult$1
            /* JADX WARN: Incorrect return type in method signature: (TD;)TD; */
            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor receiver) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
                return receiver;
            }
        });
        if (retainMostSpecificInEachOverridableGroup.size() == collectionSelectMostSpecificInEachOverridableGroup.size()) {
            return;
        }
        retainMostSpecificInEachOverridableGroup.retainAll(collectionSelectMostSpecificInEachOverridableGroup);
    }
}
