package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanSettingsEmulator {
    private io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> emulateFirstMatch;
    private final io.reactivex.Scheduler scheduler;
    private io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> emulateMatchLost = new io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.5
        @Override // io.reactivex.ObservableTransformer
        /* JADX INFO: renamed from: apply */
        public io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable) {
            return observable.debounce(10L, java.util.concurrent.TimeUnit.SECONDS, com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.this.scheduler).map(com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.this.toMatchLost());
        }
    };
    private io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> emulateFirstMatchAndMatchLost = new io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.7
        @Override // io.reactivex.ObservableTransformer
        /* JADX INFO: renamed from: apply */
        public io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable) {
            return observable.publish(new io.reactivex.functions.Function<io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>, io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.7.1
                @Override // io.reactivex.functions.Function
                public io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable2) {
                    return io.reactivex.Observable.merge(observable2.compose(com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.this.emulateFirstMatch), observable2.compose(com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.this.emulateMatchLost));
                }
            });
        }
    };

    @bleshadow.javax.inject.Inject
    public ScanSettingsEmulator(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.COMPUTATION) io.reactivex.Scheduler scheduler) {
        this.scheduler = scheduler;
        this.emulateFirstMatch = new io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>(scheduler) { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.1
            private final io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, io.reactivex.Observable<?>> emitAfterTimerFunc = new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, io.reactivex.Observable<?>>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.1.1
                @Override // io.reactivex.functions.Function
                public io.reactivex.Observable<?> apply(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult) {
                    return com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.AnonymousClass1.this.timerObservable;
                }
            };
            private final io.reactivex.functions.Function<io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>, io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>> takeFirstFromEachWindowFunc = new io.reactivex.functions.Function<io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>, io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.1.2
                @Override // io.reactivex.functions.Function
                public io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable) {
                    return observable.take(1L);
                }
            };
            private final io.reactivex.Observable<java.lang.Long> timerObservable;
            private io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> toFirstMatchFunc;
            final /* synthetic */ io.reactivex.Scheduler val$scheduler;

            {
                this.val$scheduler = scheduler;
                this.toFirstMatchFunc = com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.this.toFirstMatch();
                this.timerObservable = io.reactivex.Observable.timer(10L, java.util.concurrent.TimeUnit.SECONDS, scheduler);
            }

            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable) {
                return observable.publish(new io.reactivex.functions.Function<io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>, io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.1.3
                    @Override // io.reactivex.functions.Function
                    public io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable2) throws java.lang.Exception {
                        return observable2.window(observable2.switchMap(com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.AnonymousClass1.this.emitAfterTimerFunc)).flatMap(com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.AnonymousClass1.this.takeFirstFromEachWindowFunc).map(com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.AnonymousClass1.this.toFirstMatchFunc);
                    }
                });
            }
        };
    }

    io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> emulateScanMode(int i) {
        if (i == -1) {
            com.polidea.rxandroidble2.internal.RxBleLog.w("Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power", new java.lang.Object[0]);
        } else if (i != 0) {
            if (i == 1) {
                return scanModeBalancedTransformer();
            }
            return com.polidea.rxandroidble2.internal.util.ObservableUtil.identityTransformer();
        }
        return scanModeLowPowerTransformer();
    }

    private io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> scanModeBalancedTransformer() {
        return repeatedWindowTransformer(2500);
    }

    private io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> scanModeLowPowerTransformer() {
        return repeatedWindowTransformer(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL);
    }

    private io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> repeatedWindowTransformer(final int i) {
        final long jMax = java.lang.Math.max(java.util.concurrent.TimeUnit.SECONDS.toMillis(5L) - ((long) i), 0L);
        return new io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.2
            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable) {
                return observable.take(i, java.util.concurrent.TimeUnit.MILLISECONDS, com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.this.scheduler).repeatWhen(new io.reactivex.functions.Function<io.reactivex.Observable<java.lang.Object>, io.reactivex.ObservableSource<?>>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.2.1
                    @Override // io.reactivex.functions.Function
                    public io.reactivex.ObservableSource<?> apply(io.reactivex.Observable<java.lang.Object> observable2) throws java.lang.Exception {
                        return observable2.delay(jMax, java.util.concurrent.TimeUnit.MILLISECONDS, com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.this.scheduler);
                    }
                });
            }
        };
    }

    io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> emulateCallbackType(int i) {
        if (i == 2) {
            return splitByAddressAndForEach(this.emulateFirstMatch);
        }
        if (i == 4) {
            return splitByAddressAndForEach(this.emulateMatchLost);
        }
        if (i == 6) {
            return splitByAddressAndForEach(this.emulateFirstMatchAndMatchLost);
        }
        return com.polidea.rxandroidble2.internal.util.ObservableUtil.identityTransformer();
    }

    private io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> splitByAddressAndForEach(final io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observableTransformer) {
        return new io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.3
            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable) {
                return observable.groupBy(new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, java.lang.String>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.3.2
                    @Override // io.reactivex.functions.Function
                    public java.lang.String apply(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult) {
                        return rxBleInternalScanResult.getBluetoothDevice().getAddress();
                    }
                }).flatMap(new io.reactivex.functions.Function<io.reactivex.observables.GroupedObservable<java.lang.String, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>, io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.3.1
                    @Override // io.reactivex.functions.Function
                    public io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply(io.reactivex.observables.GroupedObservable<java.lang.String, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> groupedObservable) {
                        return groupedObservable.compose(observableTransformer);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> toFirstMatch() {
        return new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.4
            @Override // io.reactivex.functions.Function
            public com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult apply(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult) {
                return new com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult(rxBleInternalScanResult.getBluetoothDevice(), rxBleInternalScanResult.getRssi(), rxBleInternalScanResult.getTimestampNanos(), rxBleInternalScanResult.getScanRecord(), com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_FIRST_MATCH);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> toMatchLost() {
        return new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator.6
            @Override // io.reactivex.functions.Function
            public com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult apply(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult) {
                return new com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult(rxBleInternalScanResult.getBluetoothDevice(), rxBleInternalScanResult.getRssi(), rxBleInternalScanResult.getTimestampNanos(), rxBleInternalScanResult.getScanRecord(), com.polidea.rxandroidble2.scan.ScanCallbackType.CALLBACK_TYPE_MATCH_LOST);
            }
        };
    }
}
