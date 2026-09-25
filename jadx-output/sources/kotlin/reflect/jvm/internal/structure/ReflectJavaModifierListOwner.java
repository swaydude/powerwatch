package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaModifierListOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public interface ReflectJavaModifierListOwner extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner {
    int getModifiers();

    /* JADX INFO: compiled from: ReflectJavaModifierListOwner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static boolean isAbstract(kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return java.lang.reflect.Modifier.isAbstract(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isStatic(kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return java.lang.reflect.Modifier.isStatic(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isFinal(kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            return java.lang.reflect.Modifier.isFinal(reflectJavaModifierListOwner.getModifiers());
        }

        public static kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility(kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            int modifiers = reflectJavaModifierListOwner.getModifiers();
            if (java.lang.reflect.Modifier.isPublic(modifiers)) {
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility, "Visibilities.PUBLIC");
                return visibility;
            }
            if (java.lang.reflect.Modifier.isPrivate(modifiers)) {
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility2, "Visibilities.PRIVATE");
                return visibility2;
            }
            if (java.lang.reflect.Modifier.isProtected(modifiers)) {
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility3 = java.lang.reflect.Modifier.isStatic(modifiers) ? kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.PROTECTED_STATIC_VISIBILITY : kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.PROTECTED_AND_PACKAGE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility3, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return visibility3;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility4 = kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.PACKAGE_VISIBILITY;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility4, "JavaVisibilities.PACKAGE_VISIBILITY");
            return visibility4;
        }
    }
}
