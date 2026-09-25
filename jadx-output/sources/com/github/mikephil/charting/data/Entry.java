package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class Entry extends com.github.mikephil.charting.data.BaseEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.github.mikephil.charting.data.Entry> CREATOR = new android.os.Parcelable.Creator<com.github.mikephil.charting.data.Entry>() { // from class: com.github.mikephil.charting.data.Entry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.github.mikephil.charting.data.Entry createFromParcel(android.os.Parcel parcel) {
            return new com.github.mikephil.charting.data.Entry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.github.mikephil.charting.data.Entry[] newArray(int i) {
            return new com.github.mikephil.charting.data.Entry[i];
        }
    };
    private float x;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry() {
        this.x = 0.0f;
    }

    public Entry(float f, float f2) {
        super(f2);
        this.x = 0.0f;
        this.x = f;
    }

    public Entry(float f, float f2, java.lang.Object obj) {
        super(f2, obj);
        this.x = 0.0f;
        this.x = f;
    }

    public Entry(float f, float f2, android.graphics.drawable.Drawable drawable) {
        super(f2, drawable);
        this.x = 0.0f;
        this.x = f;
    }

    public Entry(float f, float f2, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f2, drawable, obj);
        this.x = 0.0f;
        this.x = f;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float f) {
        this.x = f;
    }

    public com.github.mikephil.charting.data.Entry copy() {
        return new com.github.mikephil.charting.data.Entry(this.x, getY(), getData());
    }

    public boolean equalTo(com.github.mikephil.charting.data.Entry entry) {
        return entry != null && entry.getData() == getData() && java.lang.Math.abs(entry.x - this.x) <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON && java.lang.Math.abs(entry.getY() - getY()) <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON;
    }

    public java.lang.String toString() {
        return "Entry, x: " + this.x + " y: " + getY();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(getY());
        if (getData() != null) {
            if (getData() instanceof android.os.Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((android.os.Parcelable) getData(), i);
                return;
            }
            throw new android.os.ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }

    protected Entry(android.os.Parcel parcel) {
        this.x = 0.0f;
        this.x = parcel.readFloat();
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(java.lang.Object.class.getClassLoader()));
        }
    }
}
