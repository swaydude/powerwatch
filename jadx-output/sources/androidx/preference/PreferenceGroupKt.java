package androidx.preference;

/* JADX INFO: compiled from: PreferenceGroup.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002\u001a0\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\b\u001aE\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\u0086\b\u001a&\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0017*\u00020\u0002*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\n¢\u0006\u0002\u0010\u001a\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\u0002\u001a\r\u0010\u001b\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\r\u0010\u001c\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010 \u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006!"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroidx/preference/Preference;", "Landroidx/preference/PreferenceGroup;", "getChildren", "(Landroidx/preference/PreferenceGroup;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroidx/preference/PreferenceGroup;)I", "contains", "", "preference", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "forEachIndexed", "Lkotlin/Function2;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "get", "T", "key", "", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "preference-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class PreferenceGroupKt {
    public static final <T extends androidx.preference.Preference> T get(androidx.preference.PreferenceGroup get, java.lang.CharSequence key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(get, "$this$get");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return (T) get.findPreference(key);
    }

    public static final androidx.preference.Preference get(androidx.preference.PreferenceGroup get, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(get, "$this$get");
        androidx.preference.Preference preference = get.getPreference(i);
        if (preference != null) {
            return preference;
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + get.getPreferenceCount());
    }

    public static final boolean contains(androidx.preference.PreferenceGroup contains, androidx.preference.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preference, "preference");
        int preferenceCount = contains.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(contains.getPreference(i), preference)) {
                return true;
            }
        }
        return false;
    }

    public static final void plusAssign(androidx.preference.PreferenceGroup plusAssign, androidx.preference.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(plusAssign, "$this$plusAssign");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preference, "preference");
        plusAssign.addPreference(preference);
    }

    public static final void minusAssign(androidx.preference.PreferenceGroup minusAssign, androidx.preference.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(minusAssign, "$this$minusAssign");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preference, "preference");
        minusAssign.removePreference(preference);
    }

    public static final int getSize(androidx.preference.PreferenceGroup size) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(size, "$this$size");
        return size.getPreferenceCount();
    }

    public static final void forEach(androidx.preference.PreferenceGroup forEach, kotlin.jvm.functions.Function1<? super androidx.preference.Preference, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(forEach, "$this$forEach");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(action, "action");
        int preferenceCount = forEach.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            action.invoke(get(forEach, i));
        }
    }

    public static final void forEachIndexed(androidx.preference.PreferenceGroup forEachIndexed, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super androidx.preference.Preference, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(forEachIndexed, "$this$forEachIndexed");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(action, "action");
        int preferenceCount = forEachIndexed.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            action.invoke(java.lang.Integer.valueOf(i), get(forEachIndexed, i));
        }
    }

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: PreferenceGroup.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/preference/PreferenceGroupKt$iterator$1", "", "Landroidx/preference/Preference;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "hasNext", "", "next", "remove", "", "preference-ktx_release"}, k = 1, mv = {1, 1, 15})
    public static final class AnonymousClass1 implements java.util.Iterator<androidx.preference.Preference>, kotlin.jvm.internal.markers.KMutableIterator {
        final /* synthetic */ androidx.preference.PreferenceGroup $this_iterator;
        private int index;

        AnonymousClass1(androidx.preference.PreferenceGroup preferenceGroup) {
            this.$this_iterator = preferenceGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getPreferenceCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public androidx.preference.Preference next() {
            androidx.preference.PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            androidx.preference.Preference preference = preferenceGroup.getPreference(i);
            if (preference != null) {
                return preference;
            }
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            androidx.preference.PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            preferenceGroup.removePreference(preferenceGroup.getPreference(i));
        }
    }

    public static final java.util.Iterator<androidx.preference.Preference> iterator(androidx.preference.PreferenceGroup iterator) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(iterator, "$this$iterator");
        return new androidx.preference.PreferenceGroupKt.AnonymousClass1(iterator);
    }

    public static final kotlin.sequences.Sequence<androidx.preference.Preference> getChildren(final androidx.preference.PreferenceGroup children) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(children, "$this$children");
        return new kotlin.sequences.Sequence<androidx.preference.Preference>() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<androidx.preference.Preference> iterator() {
                return androidx.preference.PreferenceGroupKt.iterator(children);
            }
        };
    }

    public static final boolean isEmpty(androidx.preference.PreferenceGroup isEmpty) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isEmpty, "$this$isEmpty");
        return isEmpty.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(androidx.preference.PreferenceGroup isNotEmpty) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isNotEmpty, "$this$isNotEmpty");
        return isNotEmpty.getPreferenceCount() != 0;
    }
}
