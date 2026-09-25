package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
class RandomBackoff implements io.fabric.sdk.android.services.concurrency.internal.Backoff {
    final io.fabric.sdk.android.services.concurrency.internal.Backoff backoff;
    final double jitterPercent;
    final java.util.Random random;

    public RandomBackoff(io.fabric.sdk.android.services.concurrency.internal.Backoff backoff, double d) {
        this(backoff, d, new java.util.Random());
    }

    public RandomBackoff(io.fabric.sdk.android.services.concurrency.internal.Backoff backoff, double d, java.util.Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new java.lang.IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        }
        java.util.Objects.requireNonNull(backoff, "backoff must not be null");
        java.util.Objects.requireNonNull(random, "random must not be null");
        this.backoff = backoff;
        this.jitterPercent = d;
        this.random = random;
    }

    @Override // io.fabric.sdk.android.services.concurrency.internal.Backoff
    public long getDelayMillis(int i) {
        return (long) (randomJitter() * this.backoff.getDelayMillis(i));
    }

    double randomJitter() {
        double d = this.jitterPercent;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.random.nextDouble());
    }
}
