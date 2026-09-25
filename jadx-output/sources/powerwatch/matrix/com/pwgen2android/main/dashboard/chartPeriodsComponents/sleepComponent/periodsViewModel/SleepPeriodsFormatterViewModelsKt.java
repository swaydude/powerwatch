package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel;

/* JADX INFO: compiled from: SleepPeriodsFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001aL\u0010\u000f\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00070\u00100\u00070\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0014\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0015H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"AWAKE_Y", "", "DEEP_Y", "LIGHT_Y", "RESTLESS_Y", "splitSleepDayToSleepSessions", "Lio/reactivex/Observable;", "", "Lcom/github/mikephil/charting/data/Entry;", "sleepDay", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "sleepLogsAdjustment", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;", "hourOffset", "", "splitSleepDaysToSleepSessions", "Lkotlin/Pair;", "", "sleepDays", "yValue", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class SleepPeriodsFormatterViewModelsKt {
    public static final float AWAKE_Y = 150.0f;
    public static final float DEEP_Y = 0.0f;
    public static final float LIGHT_Y = 50.0f;
    public static final float RESTLESS_Y = 100.0f;

    /* JADX INFO: compiled from: SleepPeriodsFormatterViewModels.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.RESTLESS.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.DEEP.ordinal()] = 2;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.LIGHT.ordinal()] = 3;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float yValue(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod sleepBasePeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepBasePeriod, "<this>");
        int i = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.WhenMappings.$EnumSwitchMapping$0[sleepBasePeriod.getSleepType().ordinal()];
        if (i == 1) {
            return 100.0f;
        }
        if (i == 2) {
            return 0.0f;
        }
        if (i == 3) {
            return 50.0f;
        }
        if (i == 4) {
            return 150.0f;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final float yValue(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod) {
        int i = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.WhenMappings.$EnumSwitchMapping$0[sleepFiveMinPeriod.getSleepType().ordinal()];
        if (i == 1) {
            return 100.0f;
        }
        if (i == 2) {
            return 0.0f;
        }
        if (i == 3) {
            return 50.0f;
        }
        if (i == 4) {
            return 150.0f;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    static /* synthetic */ io.reactivex.Observable splitSleepDayToSleepSessions$default(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return splitSleepDayToSleepSessions(sleepDayPeriod, sleepLogsAdjustment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.Observable<java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>> splitSleepDayToSleepSessions(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod, final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, final int i) {
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours = sleepDayPeriod.getSleepHours();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = sleepHours.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) it.next()).getSleepFiveMins());
        }
        io.reactivex.Observable<java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>> observableDoOnError = io.reactivex.rxkotlin.ObservableKt.toObservable(kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt$splitSleepDayToSleepSessions$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) t).getStartTime()), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) t2).getStartTime()));
            }
        })).reduce(new java.util.ArrayList(), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepPeriodsFormatterViewModelsKt$Ev6I0eCiMGhof8IB1nLVO0wUxNE
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.m1763splitSleepDayToSleepSessions$lambda2(sleepLogsAdjustment, (java.util.List) obj, (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepPeriodsFormatterViewModelsKt$7SLoH0MYhvZK2vZGtp53QQLry4A
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.m1764splitSleepDayToSleepSessions$lambda5(sleepLogsAdjustment, i, (java.util.List) obj);
            }
        }).toObservable().doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepPeriodsFormatterViewModelsKt$tdYFH8PzGSqV31wkwUOf9OBHHf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnError, "sleepDay.sleepHours\n            .flatMap { it.sleepFiveMins }\n            .sortedBy { it.startTime }\n            .toObservable()\n            .reduce(mutableListOf<MutableList<SleepFiveMinPeriod>>(), { accumulator, next ->\n                val lastSession = accumulator.lastOrNull()\n\n\n                // this means it is first fiveMinPeriod\n                if (lastSession == null) {\n                    accumulator.add(mutableListOf(next))\n                } else {\n\n                    val lastEntry = lastSession.last()\n                    if (next.startTime - lastEntry.endTime > 60000) {\n                        val newSession = mutableListOf(next)\n\n                        if (sleepLogsAdjustment.adjustSessions(lastSession, newSession)) {\n                            accumulator.add(newSession)\n                        }\n\n                    } else {\n                        lastSession.add(next)\n                    }\n                }\n                accumulator\n            })\n            .map {\n                sleepLogsAdjustment.adjustInitialAndFinalSessions(it, hourOffset)\n\n                it.map {\n                    Log.d(\"SleepSessionTracker\", \"--------------------------------------------------------------\")\n                    it.map {\n                        val entry = (it.fiveMinsInHour.toFloat() + it.startTime.toCalendar().hourInDay(hourOffset) * 60)\n                        Log.d(\"SleepSessionTracker\", \"FiveMinsInHour: ${it.fiveMinsInHour.toFloat()}, hourInDay: ${it.startTime.toCalendar().hourInDay(hourOffset)}, \" +\n                                \"start: ${it.startTime}, end: ${it.endTime}, state: ${it.sleepType.name}, entryValue: $entry\")\n                        Entry(entry, it.yValue())\n                    }.sortedWith(EntryXComparator())\n                }\n            }.toObservable().doOnError {\n                it.printStackTrace()\n            }");
        return observableDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: splitSleepDayToSleepSessions$lambda-2, reason: not valid java name */
    public static final java.util.List m1763splitSleepDayToSleepSessions$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, java.util.List accumulator, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod next) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogsAdjustment, "$sleepLogsAdjustment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accumulator, "accumulator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> list = (java.util.List) kotlin.collections.CollectionsKt.lastOrNull(accumulator);
        if (list == null) {
            accumulator.add(kotlin.collections.CollectionsKt.mutableListOf(next));
        } else if (next.getStartTime() - ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) kotlin.collections.CollectionsKt.last((java.util.List) list)).getEndTime() > 60000) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> listMutableListOf = kotlin.collections.CollectionsKt.mutableListOf(next);
            if (sleepLogsAdjustment.adjustSessions(list, listMutableListOf)) {
                accumulator.add(listMutableListOf);
            }
        } else {
            list.add(next);
        }
        return accumulator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: splitSleepDayToSleepSessions$lambda-5, reason: not valid java name */
    public static final java.util.List m1764splitSleepDayToSleepSessions$lambda5(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, int i, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogsAdjustment, "$sleepLogsAdjustment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        sleepLogsAdjustment.adjustInitialAndFinalSessions(it, i);
        java.util.List<java.util.List> list = it;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (java.util.List list2 : list) {
            android.util.Log.d("SleepSessionTracker", "--------------------------------------------------------------");
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> list3 = list2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod : list3) {
                float fiveMinsInHour = sleepFiveMinPeriod.getFiveMinsInHour() + (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(sleepFiveMinPeriod.getStartTime()), i) * 60);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("FiveMinsInHour: ");
                sb.append(sleepFiveMinPeriod.getFiveMinsInHour());
                sb.append(", hourInDay: ");
                sb.append(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(sleepFiveMinPeriod.getStartTime()), i));
                sb.append(", start: ");
                sb.append(sleepFiveMinPeriod.getStartTime());
                sb.append(", end: ");
                sb.append(sleepFiveMinPeriod.getEndTime());
                sb.append(", state: ");
                sb.append(sleepFiveMinPeriod.getSleepType().name());
                sb.append(", entryValue: ");
                sb.append(fiveMinsInHour);
                android.util.Log.d("SleepSessionTracker", sb.toString());
                arrayList2.add(new com.github.mikephil.charting.data.Entry(fiveMinsInHour, yValue(sleepFiveMinPeriod)));
            }
            arrayList.add(kotlin.collections.CollectionsKt.sortedWith(arrayList2, new com.github.mikephil.charting.utils.EntryXComparator()));
        }
        return arrayList;
    }

    static /* synthetic */ io.reactivex.Observable splitSleepDaysToSleepSessions$default(java.util.List list, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return splitSleepDaysToSleepSessions(list, sleepLogsAdjustment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.reactivex.Observable<java.util.List<kotlin.Pair<java.lang.String, java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>>>> splitSleepDaysToSleepSessions(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> list, final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, final int i) {
        io.reactivex.Observable<java.util.List<kotlin.Pair<java.lang.String, java.util.List<java.util.List<com.github.mikephil.charting.data.Entry>>>>> observable = io.reactivex.rxkotlin.ObservableKt.toObservable(list).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepPeriodsFormatterViewModelsKt$WYJxn5EY_zU0zWC4pzuacg_urQc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.m1766splitSleepDaysToSleepSessions$lambda10(sleepLogsAdjustment, (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepPeriodsFormatterViewModelsKt$zSJzdvXUzVn-ApY5oj_4tBNmtzI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.m1768splitSleepDaysToSleepSessions$lambda11(sleepLogsAdjustment, i, (java.util.List) obj);
            }
        }).toList().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepPeriodsFormatterViewModelsKt$rFPzZEmoW73pd0UnwQW3S-lEr6Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.m1769splitSleepDaysToSleepSessions$lambda17(i, (java.util.List) obj);
            }
        }).toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "sleepDays\n            .toObservable()\n            .flatMap {\n                if (it.sleepHours.isEmpty()) {\n                    val emptySleepData = mutableListOf<MutableList<SleepFiveMinPeriod>>()\n                    Observable.just(emptySleepData)\n                } else {\n                    it.sleepHours.flatMap { it.sleepFiveMins }.sortedBy { it.startTime }\n                            .toObservable()\n                            .reduce(mutableListOf<MutableList<SleepFiveMinPeriod>>()) { accumulator, next ->\n                                val lastSession = accumulator.lastOrNull()\n                                // this means it is first fiveMinPeriod\n                                if (lastSession == null) {\n                                    accumulator.add(mutableListOf(next))\n                                } else {\n\n                                    val lastEntry = lastSession.last()\n                                    if (next.startTime - lastEntry.endTime > 60000) {\n                                        val newSession = mutableListOf(next)\n\n                                        if (sleepLogsAdjustment.adjustSessions(lastSession, newSession)) {\n                                            accumulator.add(newSession)\n                                        }\n\n                                    } else {\n                                        lastSession.add(next)\n                                    }\n                                }\n                                accumulator\n                            }.toObservable()\n                }\n            }\n            .doOnNext {\n                sleepLogsAdjustment.adjustInitialAndFinalSessions(it, hourOffset)\n            }\n            .toList()\n            .map { days ->\n                val entries = days.mapIndexed { dayIndex, daySessions ->\n                    val daySessionsEntries = daySessions.map {\n                        val data = it\n                                .map {\n                                    Entry(((it.fiveMinsInHour.toFloat() + it.startTime.toCalendar().hourInDay(hourOffset) * 60) / 60), it.yValue() + dayIndex * 260)\n                                }.sortedWith(EntryXComparator())\n\n\n                        data\n                    }\n                    val durationNum = daySessions.flatten().filter { it.sleepType != SleepType.SLEEP_AWAKE }.sumBy { it.minsInPeriod }\n                    val durationLabel = if (durationNum == 0) \"\" else durationNum.minutesToHoursAndMinutesFormat()\n                    Pair(durationLabel, daySessionsEntries)\n                }\n                entries\n            }.toObservable()");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: splitSleepDaysToSleepSessions$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1766splitSleepDaysToSleepSessions$lambda10(final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod it) {
        io.reactivex.Observable observable;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogsAdjustment, "$sleepLogsAdjustment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.getSleepHours().isEmpty()) {
            observable = io.reactivex.Observable.just(new java.util.ArrayList());
        } else {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours = it.getSleepHours();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it2 = sleepHours.iterator();
            while (it2.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) it2.next()).getSleepFiveMins());
            }
            observable = io.reactivex.rxkotlin.ObservableKt.toObservable(kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt$splitSleepDaysToSleepSessions$lambda-10$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) t).getStartTime()), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) t2).getStartTime()));
                }
            })).reduce(new java.util.ArrayList(), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepPeriodsFormatterViewModelsKt$ImEV7OJH1u0b5H8q67YaqPrsGqQ
                @Override // io.reactivex.functions.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.m1767splitSleepDaysToSleepSessions$lambda10$lambda9(sleepLogsAdjustment, (java.util.List) obj, (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) obj2);
                }
            }).toObservable();
        }
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: splitSleepDaysToSleepSessions$lambda-10$lambda-9, reason: not valid java name */
    public static final java.util.List m1767splitSleepDaysToSleepSessions$lambda10$lambda9(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, java.util.List accumulator, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod next) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogsAdjustment, "$sleepLogsAdjustment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accumulator, "accumulator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> list = (java.util.List) kotlin.collections.CollectionsKt.lastOrNull(accumulator);
        if (list == null) {
            accumulator.add(kotlin.collections.CollectionsKt.mutableListOf(next));
        } else if (next.getStartTime() - ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) kotlin.collections.CollectionsKt.last((java.util.List) list)).getEndTime() > 60000) {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> listMutableListOf = kotlin.collections.CollectionsKt.mutableListOf(next);
            if (sleepLogsAdjustment.adjustSessions(list, listMutableListOf)) {
                accumulator.add(listMutableListOf);
            }
        } else {
            list.add(next);
        }
        return accumulator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: splitSleepDaysToSleepSessions$lambda-11, reason: not valid java name */
    public static final void m1768splitSleepDaysToSleepSessions$lambda11(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, int i, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogsAdjustment, "$sleepLogsAdjustment");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        sleepLogsAdjustment.adjustInitialAndFinalSessions(it, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: splitSleepDaysToSleepSessions$lambda-17, reason: not valid java name */
    public static final java.util.List m1769splitSleepDaysToSleepSessions$lambda17(int i, java.util.List days) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "days");
        java.util.List list = days;
        int i2 = 10;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i3 = 0;
        for (java.lang.Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.util.List daySessions = (java.util.List) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(daySessions, "daySessions");
            java.util.List<java.util.List> list2 = daySessions;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, i2));
            for (java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> list3 : list2) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, i2));
                for (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod : list3) {
                    arrayList3.add(new com.github.mikephil.charting.data.Entry((sleepFiveMinPeriod.getFiveMinsInHour() + (powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourInDay(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(sleepFiveMinPeriod.getStartTime()), i) * 60)) / 60, yValue(sleepFiveMinPeriod) + (i3 * 260)));
                }
                arrayList2.add(kotlin.collections.CollectionsKt.sortedWith(arrayList3, new com.github.mikephil.charting.utils.EntryXComparator()));
                i2 = 10;
            }
            java.util.ArrayList arrayList4 = arrayList2;
            java.util.List listFlatten = kotlin.collections.CollectionsKt.flatten(list2);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it = listFlatten.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) next).getSleepType() != powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE) {
                    arrayList5.add(next);
                }
            }
            java.util.Iterator it2 = arrayList5.iterator();
            int minsInPeriod = 0;
            while (it2.hasNext()) {
                minsInPeriod += ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) it2.next()).getMinsInPeriod();
            }
            arrayList.add(new kotlin.Pair(minsInPeriod == 0 ? "" : powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minutesToHoursAndMinutesFormat$default(minsInPeriod, false, 1, null), arrayList4));
            i3 = i4;
            i2 = 10;
        }
        return arrayList;
    }
}
