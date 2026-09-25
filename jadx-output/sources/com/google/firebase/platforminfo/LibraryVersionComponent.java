package com.google.firebase.platforminfo;

/* JADX INFO: compiled from: com.google.firebase:firebase-common@@19.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class LibraryVersionComponent {
    private LibraryVersionComponent() {
    }

    public static com.google.firebase.components.Component<?> create(java.lang.String str, java.lang.String str2) {
        return com.google.firebase.components.Component.intoSet(com.google.firebase.platforminfo.LibraryVersion.create(str, str2), com.google.firebase.platforminfo.LibraryVersion.class);
    }
}
