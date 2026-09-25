package com.super_rabbit.wheel_picker;

/* JADX INFO: compiled from: WheelAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/super_rabbit/wheel_picker/WheelAdapter;", "", "getMaxIndex", "", "getMinIndex", "getPosition", "vale", "", "getTextWithMaximumLength", "getValue", "position", "wheel_picker_release"}, k = 1, mv = {1, 1, 9})
public interface WheelAdapter {
    int getMaxIndex();

    int getMinIndex();

    int getPosition(java.lang.String vale);

    java.lang.String getTextWithMaximumLength();

    java.lang.String getValue(int position);
}
