package kotlin.io;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", com.google.android.gms.fitness.FitnessActivities.OTHER, "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/io/FilesKt")
class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {
    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = (java.lang.String) null;
        }
        if ((i & 4) != 0) {
            file = (java.io.File) null;
        }
        return kotlin.io.FilesKt.createTempDir(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final java.io.File createTempDir(java.lang.String prefix, java.lang.String str, java.io.File file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        java.io.File dir = java.io.File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dir, "dir");
            return dir;
        }
        throw new java.io.IOException("Unable to create temporary directory " + dir + '.');
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = (java.lang.String) null;
        }
        if ((i & 4) != 0) {
            file = (java.io.File) null;
        }
        return kotlin.io.FilesKt.createTempFile(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final java.io.File createTempFile(java.lang.String prefix, java.lang.String str, java.io.File file) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        java.io.File fileCreateTempFile = java.io.File.createTempFile(prefix, str, file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "File.createTempFile(prefix, suffix, directory)");
        return fileCreateTempFile;
    }

    public static final java.lang.String getExtension(java.io.File extension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "$this$extension");
        java.lang.String name = extension.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        return kotlin.text.StringsKt.substringAfterLast(name, '.', "");
    }

    public static final java.lang.String getInvariantSeparatorsPath(java.io.File invariantSeparatorsPath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invariantSeparatorsPath, "$this$invariantSeparatorsPath");
        if (java.io.File.separatorChar != '/') {
            java.lang.String path = invariantSeparatorsPath.getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "path");
            return kotlin.text.StringsKt.replace$default(path, java.io.File.separatorChar, '/', false, 4, (java.lang.Object) null);
        }
        java.lang.String path2 = invariantSeparatorsPath.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "path");
        return path2;
    }

    public static final java.lang.String getNameWithoutExtension(java.io.File nameWithoutExtension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameWithoutExtension, "$this$nameWithoutExtension");
        java.lang.String name = nameWithoutExtension.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        return kotlin.text.StringsKt.substringBeforeLast$default(name, ".", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final java.lang.String toRelativeString(java.io.File toRelativeString, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toRelativeString, "$this$toRelativeString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(toRelativeString, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new java.lang.IllegalArgumentException("this and base files have different roots: " + toRelativeString + " and " + base + '.');
    }

    public static final java.io.File relativeTo(java.io.File relativeTo, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTo, "$this$relativeTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        return new java.io.File(kotlin.io.FilesKt.toRelativeString(relativeTo, base));
    }

    public static final java.io.File relativeToOrSelf(java.io.File relativeToOrSelf, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeToOrSelf, "$this$relativeToOrSelf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(relativeToOrSelf, base);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new java.io.File(relativeStringOrNull$FilesKt__UtilsKt) : relativeToOrSelf;
    }

    public static final java.io.File relativeToOrNull(java.io.File relativeToOrNull, java.io.File base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeToOrNull, "$this$relativeToOrNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.lang.String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(relativeToOrNull, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new java.io.File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    private static final java.lang.String toRelativeStringOrNull$FilesKt__UtilsKt(java.io.File file, java.io.File file2) {
        kotlin.io.FilePathComponents filePathComponentsNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(kotlin.io.FilesKt.toComponents(file));
        kotlin.io.FilePathComponents filePathComponentsNormalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(kotlin.io.FilesKt.toComponents(file2));
        if (!kotlin.jvm.internal.Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt.getRoot(), filePathComponentsNormalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = filePathComponentsNormalize$FilesKt__UtilsKt2.getSize();
        int size2 = filePathComponentsNormalize$FilesKt__UtilsKt.getSize();
        int i = 0;
        int iMin = java.lang.Math.min(size2, size);
        while (i < iMin && kotlin.jvm.internal.Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt.getSegments().get(i), filePathComponentsNormalize$FilesKt__UtilsKt2.getSegments().get(i))) {
            i++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = size - 1;
        if (i2 >= i) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt2.getSegments().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(java.io.File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < size2) {
            if (i < size) {
                sb.append(java.io.File.separatorChar);
            }
            java.lang.String str = java.io.File.separator;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "File.separator");
            kotlin.collections.CollectionsKt.joinTo(kotlin.collections.CollectionsKt.drop(filePathComponentsNormalize$FilesKt__UtilsKt.getSegments(), i), sb, (112 & 2) != 0 ? ", " : str, (112 & 4) != 0 ? "" : null, (112 & 8) != 0 ? "" : null, (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? (kotlin.jvm.functions.Function1) null : null);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File file, java.io.File file2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return kotlin.io.FilesKt.copyTo(file, file2, z, i);
    }

    public static final java.io.File copyTo(java.io.File copyTo, java.io.File target, boolean z, int i) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        if (!copyTo.exists()) {
            throw new kotlin.io.NoSuchFileException(copyTo, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z) {
                throw new kotlin.io.FileAlreadyExistsException(copyTo, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new kotlin.io.FileAlreadyExistsException(copyTo, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (copyTo.isDirectory()) {
            if (!target.mkdirs()) {
                throw new kotlin.io.FileSystemException(copyTo, target, "Failed to create target directory.");
            }
        } else {
            java.io.File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(copyTo);
            java.lang.Throwable th = (java.lang.Throwable) null;
            try {
                java.io.FileInputStream fileInputStream2 = fileInputStream;
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(target);
                java.lang.Throwable th2 = (java.lang.Throwable) null;
                try {
                    kotlin.io.ByteStreamsKt.copyTo(fileInputStream2, fileOutputStream, i);
                    kotlin.io.CloseableKt.closeFinally(fileOutputStream, th2);
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, th);
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        kotlin.io.CloseableKt.closeFinally(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (java.lang.Throwable th5) {
                try {
                    throw th5;
                } catch (java.lang.Throwable th6) {
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, th5);
                    throw th6;
                }
            }
        }
        return target;
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File file, java.io.File file2, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: kotlin.io.FilesKt__UtilsKt.copyRecursively.1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Void invoke(java.io.File file3, java.io.IOException exception) throws java.io.IOException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file3, "<anonymous parameter 0>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return kotlin.io.FilesKt.copyRecursively(file, file2, z, function2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    public static final boolean copyRecursively(java.io.File copyRecursively, java.io.File target, boolean z, final kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> onError) {
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(copyRecursively, "$this$copyRecursively");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "onError");
        if (!copyRecursively.exists()) {
            return onError.invoke(copyRecursively, new kotlin.io.NoSuchFileException(copyRecursively, null, "The source file doesn't exist.", 2, null)) != kotlin.io.OnErrorAction.TERMINATE;
        }
        try {
            for (java.io.File file : kotlin.io.FilesKt.walkTopDown(copyRecursively).onFail(new kotlin.jvm.functions.Function2<java.io.File, java.io.IOException, kotlin.Unit>() { // from class: kotlin.io.FilesKt__UtilsKt.copyRecursively.2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.io.File file2, java.io.IOException iOException) throws kotlin.io.TerminateException {
                    invoke2(file2, iOException);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.io.File f, java.io.IOException e) throws kotlin.io.TerminateException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "f");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
                    if (((kotlin.io.OnErrorAction) onError.invoke(f, e)) == kotlin.io.OnErrorAction.TERMINATE) {
                        throw new kotlin.io.TerminateException(f);
                    }
                }
            })) {
                if (!file.exists()) {
                    if (onError.invoke(file, new kotlin.io.NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) == kotlin.io.OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    java.io.File file2 = new java.io.File(target, kotlin.io.FilesKt.toRelativeString(file, copyRecursively));
                    if (file2.exists() && (!file.isDirectory() || !file2.isDirectory())) {
                        if (!z) {
                            z2 = true;
                        } else if (file2.isDirectory()) {
                            if (kotlin.io.FilesKt.deleteRecursively(file2)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (file2.delete()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            if (onError.invoke(file2, new kotlin.io.FileAlreadyExistsException(file, file2, "The destination file already exists.")) == kotlin.io.OnErrorAction.TERMINATE) {
                                return false;
                            }
                        }
                    }
                    if (file.isDirectory()) {
                        file2.mkdirs();
                    } else if (kotlin.io.FilesKt.copyTo$default(file, file2, z, 0, 4, null).length() != file.length() && onError.invoke(file, new java.io.IOException("Source file wasn't copied completely, length of destination file differs.")) == kotlin.io.OnErrorAction.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (kotlin.io.TerminateException unused) {
            return false;
        }
    }

    public static final boolean deleteRecursively(java.io.File deleteRecursively) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteRecursively, "$this$deleteRecursively");
        while (true) {
            boolean z = true;
            for (java.io.File file : kotlin.io.FilesKt.walkBottomUp(deleteRecursively)) {
                if (file.delete() || !file.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean startsWith(java.io.File startsWith, java.io.File other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startsWith, "$this$startsWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(startsWith);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(other);
        if (!(!kotlin.jvm.internal.Intrinsics.areEqual(components.getRoot(), components2.getRoot())) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final boolean startsWith(java.io.File startsWith, java.lang.String other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startsWith, "$this$startsWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.io.FilesKt.startsWith(startsWith, new java.io.File(other));
    }

    public static final boolean endsWith(java.io.File endsWith, java.io.File other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endsWith, "$this$endsWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(endsWith);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(other);
        if (components2.isRooted()) {
            return kotlin.jvm.internal.Intrinsics.areEqual(endsWith, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final boolean endsWith(java.io.File endsWith, java.lang.String other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endsWith, "$this$endsWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return kotlin.io.FilesKt.endsWith(endsWith, new java.io.File(other));
    }

    public static final java.io.File normalize(java.io.File normalize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalize, "$this$normalize");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(normalize);
        java.io.File root = components.getRoot();
        java.util.List<java.io.File> listNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        java.lang.String str = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "File.separator");
        return kotlin.io.FilesKt.resolve(root, kotlin.collections.CollectionsKt.joinToString$default(listNormalize$FilesKt__UtilsKt, str, null, null, 0, null, null, 62, null));
    }

    private static final kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt(kotlin.io.FilePathComponents filePathComponents) {
        return new kotlin.io.FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt(filePathComponents.getSegments()));
    }

    private static final java.util.List<java.io.File> normalize$FilesKt__UtilsKt(java.util.List<? extends java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.io.File file : list) {
            java.lang.String name = file.getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode == 46) {
                    if (name.equals(".")) {
                    }
                } else if (iHashCode == 1472 && name.equals("..")) {
                    if (arrayList.isEmpty() || !(!kotlin.jvm.internal.Intrinsics.areEqual(((java.io.File) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getName(), ".."))) {
                        arrayList.add(file);
                    } else {
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    public static final java.io.File resolve(java.io.File resolve, java.io.File relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolve, "$this$resolve");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        if (kotlin.io.FilesKt.isRooted(relative)) {
            return relative;
        }
        java.lang.String string = resolve.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "this.toString()");
        java.lang.String str = string;
        if ((str.length() == 0) || kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str, java.io.File.separatorChar, false, 2, (java.lang.Object) null)) {
            return new java.io.File(string + relative);
        }
        return new java.io.File(string + java.io.File.separatorChar + relative);
    }

    public static final java.io.File resolve(java.io.File resolve, java.lang.String relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolve, "$this$resolve");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        return kotlin.io.FilesKt.resolve(resolve, new java.io.File(relative));
    }

    public static final java.io.File resolveSibling(java.io.File resolveSibling, java.io.File relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolveSibling, "$this$resolveSibling");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(resolveSibling);
        return kotlin.io.FilesKt.resolve(kotlin.io.FilesKt.resolve(components.getRoot(), components.getSize() == 0 ? new java.io.File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final java.io.File resolveSibling(java.io.File resolveSibling, java.lang.String relative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolveSibling, "$this$resolveSibling");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relative, "relative");
        return kotlin.io.FilesKt.resolveSibling(resolveSibling, new java.io.File(relative));
    }
}
