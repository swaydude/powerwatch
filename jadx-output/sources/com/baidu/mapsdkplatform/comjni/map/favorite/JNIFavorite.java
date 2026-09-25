package com.baidu.mapsdkplatform.comjni.map.favorite;

/* JADX INFO: loaded from: classes.dex */
public class JNIFavorite {
    public native boolean Add(long j, java.lang.String str, java.lang.String str2);

    public native boolean Clear(long j);

    public native long Create();

    public native int GetAll(long j, android.os.Bundle bundle);

    public native java.lang.String GetValue(long j, java.lang.String str);

    public native boolean IsExist(long j, java.lang.String str);

    public native boolean Load(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3);

    public native int Release(long j);

    public native boolean Remove(long j, java.lang.String str);

    public native boolean SaveCache(long j);

    public native boolean SetType(long j, int i);

    public native boolean Update(long j, java.lang.String str, java.lang.String str2);
}
