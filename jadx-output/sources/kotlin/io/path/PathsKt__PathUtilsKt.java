package kotlin.io.path;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010\"\u001aK\u0010#\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010%\u001aB\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0001\u001a\r\u0010+\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010,\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a.\u0010-\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000\u001a\"\u000200H\u0087\b¢\u0006\u0002\u00101\u001a\u001f\u0010-\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u000203H\u0087\b\u001a.\u00104\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u00105\u001a.\u00106\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u00105\u001a.\u00107\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u00105\u001a\u0015\u00108\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0087\b\u001a6\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010:\u001a\r\u0010;\u001a\u00020<*\u00020\u0002H\u0087\b\u001a\r\u0010=\u001a\u000203*\u00020\u0002H\u0087\b\u001a\u0015\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\u0087\n\u001a\u0015\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010?\u001a\u00020\u0001H\u0087\n\u001a&\u0010@\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a2\u0010C\u001a\u0002HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010F\u001a4\u0010G\u001a\u0004\u0018\u0001HD\"\n\b\u0000\u0010D\u0018\u0001*\u00020E*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010F\u001a\r\u0010H\u001a\u00020I*\u00020\u0002H\u0087\b\u001a\r\u0010J\u001a\u00020K*\u00020\u0002H\u0087\b\u001a.\u0010L\u001a\u00020<*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u00012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<0OH\u0087\bø\u0001\u0000\u001a0\u0010P\u001a\u0004\u0018\u00010Q*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010S\u001a&\u0010T\u001a\u00020U*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010V\u001a(\u0010W\u001a\u0004\u0018\u00010X*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010Y\u001a,\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010]\u001a&\u0010^\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a\r\u0010_\u001a\u000203*\u00020\u0002H\u0087\b\u001a\r\u0010`\u001a\u000203*\u00020\u0002H\u0087\b\u001a\r\u0010a\u001a\u000203*\u00020\u0002H\u0087\b\u001a&\u0010b\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a\u0015\u0010c\u001a\u000203*\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\u0087\b\u001a\r\u0010d\u001a\u000203*\u00020\u0002H\u0087\b\u001a\r\u0010e\u001a\u000203*\u00020\u0002H\u0087\b\u001a\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020g*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u0001H\u0007\u001a.\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002000\u001a\"\u000200H\u0087\b¢\u0006\u0002\u00101\u001a\u001f\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u000203H\u0087\b\u001a&\u0010i\u001a\u000203*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010B\u001a2\u0010j\u001a\u0002Hk\"\n\b\u0000\u0010k\u0018\u0001*\u00020l*\u00020\u00022\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010m\u001a<\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010Q0n*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010o\u001a\r\u0010p\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010q\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0016\u0010r\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0014\u0010s\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a8\u0010t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010R\u001a\u00020\u00012\b\u0010u\u001a\u0004\u0018\u00010Q2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0\u001a\"\u00020AH\u0087\b¢\u0006\u0002\u0010v\u001a\u0015\u0010w\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020UH\u0087\b\u001a\u0015\u0010x\u001a\u00020\u0002*\u00020\u00022\u0006\u0010u\u001a\u00020XH\u0087\b\u001a\u001b\u0010y\u001a\u00020\u0002*\u00020\u00022\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0087\b\u001a\r\u0010z\u001a\u00020\u0002*\u00020{H\u0087\b\u001a@\u0010|\u001a\u0002H}\"\u0004\b\u0000\u0010}*\u00020\u00022\b\b\u0002\u0010M\u001a\u00020\u00012\u0018\u0010~\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u007f\u0012\u0004\u0012\u0002H}0OH\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u0080\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0081\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", "path", "base", "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "absolute", "absolutePathString", "copyTo", "target", "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "", "deleteIfExists", "div", com.google.android.gms.fitness.FitnessActivities.OTHER, "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", "V", "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "Lkotlin/Function1;", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", "A", "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathUtilsKt extends kotlin.io.path.PathsKt__PathReadWriteKt {
    public static /* synthetic */ void getExtension$annotations(java.nio.file.Path path) {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    public static /* synthetic */ void getInvariantSeparatorsPath$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getInvariantSeparatorsPathString$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getName$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getNameWithoutExtension$annotations(java.nio.file.Path path) {
    }

    public static /* synthetic */ void getPathString$annotations(java.nio.file.Path path) {
    }

    public static final java.lang.String getName(java.nio.file.Path name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "$this$name");
        java.nio.file.Path fileName = name.getFileName();
        java.lang.String string = fileName != null ? fileName.toString() : null;
        return string != null ? string : "";
    }

    public static final java.lang.String getNameWithoutExtension(java.nio.file.Path nameWithoutExtension) {
        java.lang.String string;
        java.lang.String strSubstringBeforeLast$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameWithoutExtension, "$this$nameWithoutExtension");
        java.nio.file.Path fileName = nameWithoutExtension.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringBeforeLast$default = kotlin.text.StringsKt.substringBeforeLast$default(string, ".", (java.lang.String) null, 2, (java.lang.Object) null)) == null) ? "" : strSubstringBeforeLast$default;
    }

    public static final java.lang.String getExtension(java.nio.file.Path extension) {
        java.lang.String string;
        java.lang.String strSubstringAfterLast;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "$this$extension");
        java.nio.file.Path fileName = extension.getFileName();
        return (fileName == null || (string = fileName.toString()) == null || (strSubstringAfterLast = kotlin.text.StringsKt.substringAfterLast(string, '.', "")) == null) ? "" : strSubstringAfterLast;
    }

    private static final java.lang.String getPathString(java.nio.file.Path path) {
        return path.toString();
    }

    public static final java.lang.String getInvariantSeparatorsPathString(java.nio.file.Path invariantSeparatorsPathString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invariantSeparatorsPathString, "$this$invariantSeparatorsPathString");
        java.nio.file.FileSystem fileSystem = invariantSeparatorsPathString.getFileSystem();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileSystem, "fileSystem");
        java.lang.String separator = fileSystem.getSeparator();
        if (!(!kotlin.jvm.internal.Intrinsics.areEqual(separator, "/"))) {
            return invariantSeparatorsPathString.toString();
        }
        java.lang.String string = invariantSeparatorsPathString.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return kotlin.text.StringsKt.replace$default(string, separator, "/", false, 4, (java.lang.Object) null);
    }

    private static final java.lang.String getInvariantSeparatorsPath(java.nio.file.Path path) {
        return kotlin.io.path.PathsKt.getInvariantSeparatorsPathString(path);
    }

    private static final java.nio.file.Path absolute(java.nio.file.Path path) {
        java.nio.file.Path absolutePath = path.toAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    private static final java.lang.String absolutePathString(java.nio.file.Path path) {
        return path.toAbsolutePath().toString();
    }

    public static final java.nio.file.Path relativeTo(java.nio.file.Path relativeTo, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTo, "$this$relativeTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        try {
            return kotlin.io.path.PathRelativizer.INSTANCE.tryRelativeTo(relativeTo, base);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus(e.getMessage(), "\nthis path: " + relativeTo + "\nbase path: " + base), e);
        }
    }

    public static final java.nio.file.Path relativeToOrSelf(java.nio.file.Path relativeToOrSelf, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeToOrSelf, "$this$relativeToOrSelf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        java.nio.file.Path pathRelativeToOrNull = kotlin.io.path.PathsKt.relativeToOrNull(relativeToOrSelf, base);
        return pathRelativeToOrNull != null ? pathRelativeToOrNull : relativeToOrSelf;
    }

    public static final java.nio.file.Path relativeToOrNull(java.nio.file.Path relativeToOrNull, java.nio.file.Path base) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeToOrNull, "$this$relativeToOrNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base, "base");
        try {
            return kotlin.io.path.PathRelativizer.INSTANCE.tryRelativeTo(relativeToOrNull, base);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    private static final java.nio.file.Path copyTo(java.nio.file.Path path, java.nio.file.Path path2, boolean z) throws java.io.IOException {
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathCopy = java.nio.file.Files.copy(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCopy, "Files.copy(this, target, *options)");
        return pathCopy;
    }

    static /* synthetic */ java.nio.file.Path copyTo$default(java.nio.file.Path path, java.nio.file.Path path2, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathCopy = java.nio.file.Files.copy(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCopy, "Files.copy(this, target, *options)");
        return pathCopy;
    }

    private static final java.nio.file.Path copyTo(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.CopyOption... copyOptionArr) throws java.io.IOException {
        java.nio.file.Path pathCopy = java.nio.file.Files.copy(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCopy, "Files.copy(this, target, *options)");
        return pathCopy;
    }

    private static final boolean exists(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) {
        return java.nio.file.Files.exists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final boolean notExists(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) {
        return java.nio.file.Files.notExists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final boolean isRegularFile(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) {
        return java.nio.file.Files.isRegularFile(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final boolean isDirectory(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) {
        return java.nio.file.Files.isDirectory(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final boolean isSymbolicLink(java.nio.file.Path path) {
        return java.nio.file.Files.isSymbolicLink(path);
    }

    private static final boolean isExecutable(java.nio.file.Path path) {
        return java.nio.file.Files.isExecutable(path);
    }

    private static final boolean isHidden(java.nio.file.Path path) throws java.io.IOException {
        return java.nio.file.Files.isHidden(path);
    }

    private static final boolean isReadable(java.nio.file.Path path) {
        return java.nio.file.Files.isReadable(path);
    }

    private static final boolean isWritable(java.nio.file.Path path) {
        return java.nio.file.Files.isWritable(path);
    }

    private static final boolean isSameFileAs(java.nio.file.Path path, java.nio.file.Path path2) throws java.io.IOException {
        return java.nio.file.Files.isSameFile(path, path2);
    }

    public static /* synthetic */ java.util.List listDirectoryEntries$default(java.nio.file.Path path, java.lang.String str, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return kotlin.io.path.PathsKt.listDirectoryEntries(path, str);
    }

    public static final java.util.List<java.nio.file.Path> listDirectoryEntries(java.nio.file.Path listDirectoryEntries, java.lang.String glob) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listDirectoryEntries, "$this$listDirectoryEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glob, "glob");
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(listDirectoryEntries, glob);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> it = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            java.util.List<java.nio.file.Path> list = kotlin.collections.CollectionsKt.toList(it);
            kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
            return list;
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                throw th3;
            }
        }
    }

    private static final <T> T useDirectoryEntries(java.nio.file.Path path, java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<? extends java.nio.file.Path>, ? extends T> function1) throws java.io.IOException {
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, str);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> it = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            T tInvoke = function1.invoke(kotlin.collections.CollectionsKt.asSequence(it));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ java.lang.Object useDirectoryEntries$default(java.nio.file.Path path, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, str);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> it = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            java.lang.Object objInvoke = function1.invoke(kotlin.collections.CollectionsKt.asSequence(it));
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }

    private static final void forEachDirectoryEntry(java.nio.file.Path path, java.lang.String str, kotlin.jvm.functions.Function1<? super java.nio.file.Path, kotlin.Unit> function1) throws java.io.IOException {
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, str);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> it = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            java.util.Iterator<java.nio.file.Path> it2 = it.iterator();
            while (it2.hasNext()) {
                function1.invoke(it2.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }

    static /* synthetic */ void forEachDirectoryEntry$default(java.nio.file.Path path, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStreamNewDirectoryStream = java.nio.file.Files.newDirectoryStream(path, str);
        java.lang.Throwable th = (java.lang.Throwable) null;
        try {
            java.nio.file.DirectoryStream<java.nio.file.Path> it = directoryStreamNewDirectoryStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            java.util.Iterator<java.nio.file.Path> it2 = it.iterator();
            while (it2.hasNext()) {
                function1.invoke(it2.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th);
            } else if (directoryStreamNewDirectoryStream != null) {
                directoryStreamNewDirectoryStream.close();
            }
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                if (kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    kotlin.io.CloseableKt.closeFinally(directoryStreamNewDirectoryStream, th2);
                } else if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
    }

    private static final long fileSize(java.nio.file.Path path) throws java.io.IOException {
        return java.nio.file.Files.size(path);
    }

    private static final void deleteExisting(java.nio.file.Path path) throws java.io.IOException {
        java.nio.file.Files.delete(path);
    }

    private static final boolean deleteIfExists(java.nio.file.Path path) throws java.io.IOException {
        return java.nio.file.Files.deleteIfExists(path);
    }

    private static final java.nio.file.Path createDirectory(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        java.nio.file.Path pathCreateDirectory = java.nio.file.Files.createDirectory(path, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateDirectory, "Files.createDirectory(this, *attributes)");
        return pathCreateDirectory;
    }

    private static final java.nio.file.Path createDirectories(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        java.nio.file.Path pathCreateDirectories = java.nio.file.Files.createDirectories(path, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateDirectories, "Files.createDirectories(this, *attributes)");
        return pathCreateDirectories;
    }

    private static final java.nio.file.Path moveTo(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.CopyOption... copyOptionArr) throws java.io.IOException {
        java.nio.file.Path pathMove = java.nio.file.Files.move(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathMove, "Files.move(this, target, *options)");
        return pathMove;
    }

    private static final java.nio.file.Path moveTo(java.nio.file.Path path, java.nio.file.Path path2, boolean z) throws java.io.IOException {
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathMove = java.nio.file.Files.move(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathMove, "Files.move(this, target, *options)");
        return pathMove;
    }

    static /* synthetic */ java.nio.file.Path moveTo$default(java.nio.file.Path path, java.nio.file.Path path2, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            z = false;
        }
        java.nio.file.CopyOption[] copyOptionArr = z ? new java.nio.file.CopyOption[]{java.nio.file.StandardCopyOption.REPLACE_EXISTING} : new java.nio.file.CopyOption[0];
        java.nio.file.Path pathMove = java.nio.file.Files.move(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathMove, "Files.move(this, target, *options)");
        return pathMove;
    }

    private static final java.nio.file.FileStore fileStore(java.nio.file.Path path) throws java.io.IOException {
        java.nio.file.FileStore fileStore = java.nio.file.Files.getFileStore(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileStore, "Files.getFileStore(this)");
        return fileStore;
    }

    private static final java.lang.Object getAttribute(java.nio.file.Path path, java.lang.String str, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        return java.nio.file.Files.getAttribute(path, str, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final java.nio.file.Path setAttribute(java.nio.file.Path path, java.lang.String str, java.lang.Object obj, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        java.nio.file.Path attribute = java.nio.file.Files.setAttribute(path, str, obj, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attribute, "Files.setAttribute(this,…tribute, value, *options)");
        return attribute;
    }

    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V fileAttributesViewOrNull(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "V");
        return (V) java.nio.file.Files.getFileAttributeView(path, java.nio.file.attribute.FileAttributeView.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V fileAttributesView(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "V");
        V v = (V) java.nio.file.Files.getFileAttributeView(path, java.nio.file.attribute.FileAttributeView.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v != null) {
            return v;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "V");
        kotlin.io.path.PathsKt.fileAttributeViewNotAvailable(path, java.nio.file.attribute.FileAttributeView.class);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final java.lang.Void fileAttributeViewNotAvailable(java.nio.file.Path path, java.lang.Class<?> attributeViewClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeViewClass, "attributeViewClass");
        throw new java.lang.UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    private static final /* synthetic */ <A extends java.nio.file.attribute.BasicFileAttributes> A readAttributes(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "A");
        A a = (A) java.nio.file.Files.readAttributes(path, java.nio.file.attribute.BasicFileAttributes.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "Files.readAttributes(thi… A::class.java, *options)");
        return a;
    }

    private static final java.util.Map<java.lang.String, java.lang.Object> readAttributes(java.nio.file.Path path, java.lang.String str, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        java.util.Map<java.lang.String, java.lang.Object> attributes = java.nio.file.Files.readAttributes(path, str, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributes, "Files.readAttributes(this, attributes, *options)");
        return attributes;
    }

    private static final java.nio.file.attribute.FileTime getLastModifiedTime(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        java.nio.file.attribute.FileTime lastModifiedTime = java.nio.file.Files.getLastModifiedTime(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "Files.getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    private static final java.nio.file.Path setLastModifiedTime(java.nio.file.Path path, java.nio.file.attribute.FileTime fileTime) throws java.io.IOException {
        java.nio.file.Path lastModifiedTime = java.nio.file.Files.setLastModifiedTime(path, fileTime);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lastModifiedTime, "Files.setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    private static final java.nio.file.attribute.UserPrincipal getOwner(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        return java.nio.file.Files.getOwner(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final java.nio.file.Path setOwner(java.nio.file.Path path, java.nio.file.attribute.UserPrincipal userPrincipal) throws java.io.IOException {
        java.nio.file.Path owner = java.nio.file.Files.setOwner(path, userPrincipal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(owner, "Files.setOwner(this, value)");
        return owner;
    }

    private static final java.util.Set<java.nio.file.attribute.PosixFilePermission> getPosixFilePermissions(java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) throws java.io.IOException {
        java.util.Set<java.nio.file.attribute.PosixFilePermission> posixFilePermissions = java.nio.file.Files.getPosixFilePermissions(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "Files.getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    private static final java.nio.file.Path setPosixFilePermissions(java.nio.file.Path path, java.util.Set<? extends java.nio.file.attribute.PosixFilePermission> set) throws java.io.IOException {
        java.nio.file.Path posixFilePermissions = java.nio.file.Files.setPosixFilePermissions(path, set);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(posixFilePermissions, "Files.setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    private static final java.nio.file.Path createLinkPointingTo(java.nio.file.Path path, java.nio.file.Path path2) throws java.io.IOException {
        java.nio.file.Path pathCreateLink = java.nio.file.Files.createLink(path, path2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateLink, "Files.createLink(this, target)");
        return pathCreateLink;
    }

    private static final java.nio.file.Path createSymbolicLinkPointingTo(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        java.nio.file.Path pathCreateSymbolicLink = java.nio.file.Files.createSymbolicLink(path, path2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateSymbolicLink, "Files.createSymbolicLink…his, target, *attributes)");
        return pathCreateSymbolicLink;
    }

    private static final java.nio.file.Path readSymbolicLink(java.nio.file.Path path) throws java.io.IOException {
        java.nio.file.Path symbolicLink = java.nio.file.Files.readSymbolicLink(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(symbolicLink, "Files.readSymbolicLink(this)");
        return symbolicLink;
    }

    private static final java.nio.file.Path createFile(java.nio.file.Path path, java.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        java.nio.file.Path pathCreateFile = java.nio.file.Files.createFile(path, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateFile, "Files.createFile(this, *attributes)");
        return pathCreateFile;
    }

    static /* synthetic */ java.nio.file.Path createTempFile$default(java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = (java.lang.String) null;
        }
        if ((i & 2) != 0) {
            str2 = (java.lang.String) null;
        }
        java.nio.file.Path pathCreateTempFile = java.nio.file.Files.createTempFile(str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "Files.createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    private static final java.nio.file.Path createTempFile(java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        java.nio.file.Path pathCreateTempFile = java.nio.file.Files.createTempFile(str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "Files.createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile;
    }

    public static /* synthetic */ java.nio.file.Path createTempFile$default(java.nio.file.Path path, java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str = (java.lang.String) null;
        }
        if ((i & 4) != 0) {
            str2 = (java.lang.String) null;
        }
        return kotlin.io.path.PathsKt.createTempFile(path, str, str2, fileAttributeArr);
    }

    public static final java.nio.file.Path createTempFile(java.nio.file.Path path, java.lang.String str, java.lang.String str2, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            java.nio.file.Path pathCreateTempFile = java.nio.file.Files.createTempFile(path, str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile, "Files.createTempFile(dir…fix, suffix, *attributes)");
            return pathCreateTempFile;
        }
        java.nio.file.Path pathCreateTempFile2 = java.nio.file.Files.createTempFile(str, str2, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempFile2, "Files.createTempFile(prefix, suffix, *attributes)");
        return pathCreateTempFile2;
    }

    static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.lang.String str, java.nio.file.attribute.FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 1) != 0) {
            str = (java.lang.String) null;
        }
        java.nio.file.Path pathCreateTempDirectory = java.nio.file.Files.createTempDirectory(str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "Files.createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    private static final java.nio.file.Path createTempDirectory(java.lang.String str, java.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        java.nio.file.Path pathCreateTempDirectory = java.nio.file.Files.createTempDirectory(str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "Files.createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory;
    }

    public static /* synthetic */ java.nio.file.Path createTempDirectory$default(java.nio.file.Path path, java.lang.String str, java.nio.file.attribute.FileAttribute[] fileAttributeArr, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            str = (java.lang.String) null;
        }
        return kotlin.io.path.PathsKt.createTempDirectory(path, str, fileAttributeArr);
    }

    public static final java.nio.file.Path createTempDirectory(java.nio.file.Path path, java.lang.String str, java.nio.file.attribute.FileAttribute<?>... attributes) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        if (path != null) {
            java.nio.file.Path pathCreateTempDirectory = java.nio.file.Files.createTempDirectory(path, str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory, "Files.createTempDirector…ory, prefix, *attributes)");
            return pathCreateTempDirectory;
        }
        java.nio.file.Path pathCreateTempDirectory2 = java.nio.file.Files.createTempDirectory(str, (java.nio.file.attribute.FileAttribute[]) java.util.Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathCreateTempDirectory2, "Files.createTempDirectory(prefix, *attributes)");
        return pathCreateTempDirectory2;
    }

    private static final java.nio.file.Path div(java.nio.file.Path div, java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(div, "$this$div");
        java.nio.file.Path pathResolve = div.resolve(path);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    private static final java.nio.file.Path div(java.nio.file.Path div, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(div, "$this$div");
        java.nio.file.Path pathResolve = div.resolve(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pathResolve, "this.resolve(other)");
        return pathResolve;
    }

    private static final java.nio.file.Path Path(java.lang.String str) {
        java.nio.file.Path path = java.nio.file.Paths.get(str, new java.lang.String[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "Paths.get(path)");
        return path;
    }

    private static final java.nio.file.Path Path(java.lang.String str, java.lang.String... strArr) {
        java.nio.file.Path path = java.nio.file.Paths.get(str, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "Paths.get(base, *subpaths)");
        return path;
    }

    private static final java.nio.file.Path toPath(java.net.URI uri) {
        java.nio.file.Path path = java.nio.file.Paths.get(uri);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "Paths.get(this)");
        return path;
    }
}
