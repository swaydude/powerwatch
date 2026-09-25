package kotlin.internal;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class PlatformImplementationsKt {
    public static final kotlin.internal.PlatformImplementations IMPLEMENTATIONS;

    /* JADX WARN: Code duplicated, block: B:27:0x00c2 A[Catch: ClassCastException -> 0x00c7, ClassNotFoundException -> 0x0101, TRY_ENTER, TryCatch #3 {ClassCastException -> 0x00c7, blocks: (B:27:0x00c2, B:30:0x00c9, B:31:0x00ce), top: B:50:0x00c0, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9 A[Catch: ClassCastException -> 0x00c7, ClassNotFoundException -> 0x0101, TryCatch #3 {ClassCastException -> 0x00c7, blocks: (B:27:0x00c2, B:30:0x00c9, B:31:0x00ce), top: B:50:0x00c0, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        kotlin.internal.PlatformImplementations platformImplementations;
        java.lang.Object objNewInstance;
        int javaVersion = getJavaVersion();
        if (javaVersion >= 65544) {
            try {
                java.lang.Object objNewInstance2 = java.lang.Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objNewInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    try {
                        if (objNewInstance2 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        platformImplementations = (kotlin.internal.PlatformImplementations) objNewInstance2;
                    } catch (java.lang.ClassCastException e) {
                        java.lang.Throwable thInitCause = new java.lang.ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + kotlin.internal.PlatformImplementations.class.getClassLoader()).initCause(e);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause;
                    }
                } catch (java.lang.ClassNotFoundException unused) {
                    if (javaVersion >= 65543) {
                        try {
                            objNewInstance = java.lang.Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objNewInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                            try {
                                try {
                                    if (objNewInstance != null) {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                                    }
                                    platformImplementations = (kotlin.internal.PlatformImplementations) objNewInstance;
                                } catch (java.lang.ClassCastException e2) {
                                    java.lang.Throwable thInitCause2 = new java.lang.ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + kotlin.internal.PlatformImplementations.class.getClassLoader()).initCause(e2);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thInitCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                                    throw thInitCause2;
                                }
                            } catch (java.lang.ClassNotFoundException unused2) {
                                platformImplementations = new kotlin.internal.PlatformImplementations();
                            }
                        } catch (java.lang.ClassNotFoundException unused3) {
                            java.lang.Object objNewInstance3 = java.lang.Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objNewInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                            try {
                                if (objNewInstance3 == null) {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                                }
                                platformImplementations = (kotlin.internal.PlatformImplementations) objNewInstance3;
                            } catch (java.lang.ClassCastException e3) {
                                java.lang.Throwable thInitCause3 = new java.lang.ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + kotlin.internal.PlatformImplementations.class.getClassLoader()).initCause(e3);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thInitCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                                throw thInitCause3;
                            }
                        }
                    } else {
                        platformImplementations = new kotlin.internal.PlatformImplementations();
                    }
                }
            } catch (java.lang.ClassNotFoundException unused4) {
                java.lang.Object objNewInstance4 = java.lang.Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objNewInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    if (objNewInstance4 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    platformImplementations = (kotlin.internal.PlatformImplementations) objNewInstance4;
                } catch (java.lang.ClassCastException e4) {
                    java.lang.Throwable thInitCause4 = new java.lang.ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + kotlin.internal.PlatformImplementations.class.getClassLoader()).initCause(e4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thInitCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause4;
                }
            }
        } else if (javaVersion >= 65543) {
            objNewInstance = java.lang.Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objNewInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
            if (objNewInstance != null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            platformImplementations = (kotlin.internal.PlatformImplementations) objNewInstance;
        } else {
            platformImplementations = new kotlin.internal.PlatformImplementations();
        }
        IMPLEMENTATIONS = platformImplementations;
    }

    private static final /* synthetic */ <T> T castToBaseType(java.lang.Object obj) throws java.lang.Throwable {
        try {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
            return (T) obj;
        } catch (java.lang.ClassCastException e) {
            java.lang.ClassLoader classLoader = obj.getClass().getClassLoader();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            java.lang.Throwable thInitCause = new java.lang.ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + java.lang.Object.class.getClassLoader()).initCause(e);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
            throw thInitCause;
        }
    }

    private static final int getJavaVersion() {
        java.lang.String property = java.lang.System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        java.lang.String str = property;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '.', 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default < 0) {
            try {
                return java.lang.Integer.parseInt(property) * 65536;
            } catch (java.lang.NumberFormatException unused) {
                return 65542;
            }
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, '.', i, false, 4, (java.lang.Object) null);
        if (iIndexOf$default2 < 0) {
            iIndexOf$default2 = property.length();
        }
        java.util.Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = property.substring(0, iIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        java.util.Objects.requireNonNull(property, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring2 = property.substring(i, iIndexOf$default2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            return (java.lang.Integer.parseInt(strSubstring) * 65536) + java.lang.Integer.parseInt(strSubstring2);
        } catch (java.lang.NumberFormatException unused2) {
            return 65542;
        }
    }

    public static final boolean apiVersionIsAtLeast(int i, int i2, int i3) {
        return kotlin.KotlinVersion.CURRENT.isAtLeast(i, i2, i3);
    }
}
