package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataBufferSafeParcelable<T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private static final java.lang.String[] zalr = {"data"};
    private final android.os.Parcelable.Creator<T> zals;

    public DataBufferSafeParcelable(com.google.android.gms.common.data.DataHolder dataHolder, android.os.Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zals = creator;
    }

    public static com.google.android.gms.common.data.DataHolder.Builder buildDataHolder() {
        return com.google.android.gms.common.data.DataHolder.builder(zalr);
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void addValue(com.google.android.gms.common.data.DataHolder.Builder builder, T t) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        t.writeToParcel(parcelObtain, 0);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("data", parcelObtain.marshall());
        builder.withRow(contentValues);
        parcelObtain.recycle();
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public T get(int i) {
        byte[] byteArray = this.mDataHolder.getByteArray("data", i, this.mDataHolder.getWindowIndex(i));
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(byteArray, 0, byteArray.length);
        parcelObtain.setDataPosition(0);
        T tCreateFromParcel = this.zals.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return tCreateFromParcel;
    }
}
