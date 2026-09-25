package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface HistoryApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> deleteData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> insertData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSet dataSet);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DailyTotalResult> readDailyTotal(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DailyTotalResult> readDailyTotalFromLocalDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataReadResult> readData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataReadRequest dataReadRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerDataUpdateListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterDataUpdateListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> updateData(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class ViewIntentBuilder {
        private final android.content.Context zzhy;
        private final com.google.android.gms.fitness.data.DataType zzhz;
        private com.google.android.gms.fitness.data.DataSource zzia;
        private long zzib;
        private long zzic;
        private java.lang.String zzid;

        public ViewIntentBuilder(android.content.Context context, com.google.android.gms.fitness.data.DataType dataType) {
            this.zzhy = context;
            this.zzhz = dataType;
        }

        public com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder setTimeInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            this.zzib = timeUnit.toMillis(j);
            this.zzic = timeUnit.toMillis(j2);
            return this;
        }

        public com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder setDataSource(com.google.android.gms.fitness.data.DataSource dataSource) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(dataSource.getDataType().equals(this.zzhz), "Data source %s is not for the data type %s", dataSource, this.zzhz);
            this.zzia = dataSource;
            return this;
        }

        public com.google.android.gms.fitness.HistoryApi.ViewIntentBuilder setPreferredApplication(java.lang.String str) {
            this.zzid = str;
            return this;
        }

        public android.content.Intent build() {
            android.content.Intent intent;
            android.content.pm.ResolveInfo resolveInfoResolveActivity;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzib > 0, "Start time must be set");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzic > this.zzib, "End time must be set and after start time");
            android.content.Intent intent2 = new android.content.Intent(com.google.android.gms.fitness.Fitness.ACTION_VIEW);
            intent2.setType(com.google.android.gms.fitness.data.DataType.getMimeType(this.zzia.getDataType()));
            intent2.putExtra(com.google.android.gms.fitness.Fitness.EXTRA_START_TIME, this.zzib);
            intent2.putExtra(com.google.android.gms.fitness.Fitness.EXTRA_END_TIME, this.zzic);
            com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this.zzia, intent2, com.google.android.gms.fitness.data.DataSource.EXTRA_DATA_SOURCE);
            if (this.zzid == null || (resolveInfoResolveActivity = this.zzhy.getPackageManager().resolveActivity((intent = new android.content.Intent(intent2).setPackage(this.zzid)), 0)) == null) {
                return intent2;
            }
            intent.setComponent(new android.content.ComponentName(this.zzid, resolveInfoResolveActivity.activityInfo.name));
            return intent;
        }
    }
}
