package kotlin.io.path;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 5, 1})
final class PathRelativizer {
    public static final kotlin.io.path.PathRelativizer INSTANCE = new kotlin.io.path.PathRelativizer();
    private static final java.nio.file.Path emptyPath = java.nio.file.Paths.get("", new java.lang.String[0]);
    private static final java.nio.file.Path parentPath = java.nio.file.Paths.get("..", new java.lang.String[0]);

    private PathRelativizer() {
    }

    public final java.nio.file.Path tryRelativeTo(java.nio.file.Path path, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.nio.file.Path bn = base.normalize();
        java.nio.file.Path r = path.normalize();
        java.nio.file.Path rn = bn.relativize(r);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bn, "bn");
        int nameCount = bn.getNameCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r, "pn");
        int iMin = java.lang.Math.min(nameCount, r.getNameCount());
        for (int i = 0; i < iMin; i++) {
            java.nio.file.Path name = bn.getName(i);
            java.nio.file.Path path2 = parentPath;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(name, path2)) {
                break;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(r.getName(i), path2)) {
                throw new java.lang.IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (!(!kotlin.jvm.internal.Intrinsics.areEqual(r, bn)) || !kotlin.jvm.internal.Intrinsics.areEqual(bn, emptyPath)) {
            java.lang.String string = rn.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rn, "rn");
            java.nio.file.FileSystem fileSystem = rn.getFileSystem();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileSystem, "rn.fileSystem");
            java.lang.String separator = fileSystem.getSeparator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "rn.fileSystem.separator");
            if (kotlin.text.StringsKt.endsWith$default(string, separator, false, 2, (java.lang.Object) null)) {
                java.nio.file.FileSystem fileSystem2 = rn.getFileSystem();
                java.nio.file.FileSystem fileSystem3 = rn.getFileSystem();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileSystem3, "rn.fileSystem");
                r = fileSystem2.getPath(kotlin.text.StringsKt.dropLast(string, fileSystem3.getSeparator().length()), new java.lang.String[0]);
            } else {
                r = rn;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r, "r");
        return r;
    }
}
