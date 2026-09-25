package com.mlsdev.rximagepicker;

/* JADX INFO: compiled from: RxImagePicker.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0012\u0010 \u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0002J\"\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010$\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010)\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002J+\u0010+\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0-2\u0006\u0010.\u001a\u00020/H\u0016¢\u0006\u0002\u00100J\b\u00101\u001a\u00020\u0018H\u0002J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e032\u0006\u00104\u001a\u00020\fJ\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e032\u0006\u00104\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001003H\u0007J\b\u00106\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/mlsdev/rximagepicker/RxImagePicker;", "Landroidx/fragment/app/Fragment;", "()V", "allowMultipleImages", "", "attachedSubject", "Lio/reactivex/subjects/PublishSubject;", "canceledSubject", "", "chooserTitle", "", "imageSource", "Lcom/mlsdev/rximagepicker/Sources;", "publishSubject", "Landroid/net/Uri;", "publishSubjectMultipleImages", "", "checkPermission", "createChooserIntent", "Landroid/content/Intent;", "createImageUri", "createPickFromDocumentsIntent", "createPickFromGalleryIntent", "grantWritePermission", "", "context", "Landroid/content/Context;", "intent", "uri", "handleGalleryResult", "data", "initSubjects", "isPhoto", "onActivityResult", "requestCode", "resultCode", "onAttach", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onImagePicked", "onImagesPicked", "uris", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "pickImage", "requestImage", "Lio/reactivex/Observable;", com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE, "requestMultipleImages", "requestPickImage", "Companion", "library_release"}, k = 1, mv = {1, 1, 13})
public final class RxImagePicker extends androidx.fragment.app.Fragment {
    private static final int CHOOSER = 102;
    private static final int SELECT_PHOTO = 100;
    private static final int TAKE_PHOTO = 101;
    private static android.net.Uri cameraPictureUrl;
    private java.util.HashMap _$_findViewCache;
    private boolean allowMultipleImages;
    private io.reactivex.subjects.PublishSubject<java.lang.Boolean> attachedSubject;
    private io.reactivex.subjects.PublishSubject<java.lang.Integer> canceledSubject;
    private java.lang.String chooserTitle;
    private com.mlsdev.rximagepicker.Sources imageSource;
    private io.reactivex.subjects.PublishSubject<android.net.Uri> publishSubject;
    private io.reactivex.subjects.PublishSubject<java.util.List<android.net.Uri>> publishSubjectMultipleImages;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.mlsdev.rximagepicker.RxImagePicker.Companion INSTANCE = new com.mlsdev.rximagepicker.RxImagePicker.Companion(null);
    private static final java.lang.String TAG = com.mlsdev.rximagepicker.RxImagePicker.class.getSimpleName();

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.mlsdev.rximagepicker.Sources.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[com.mlsdev.rximagepicker.Sources.CAMERA.ordinal()] = 1;
            iArr[com.mlsdev.rximagepicker.Sources.GALLERY.ordinal()] = 2;
            iArr[com.mlsdev.rximagepicker.Sources.DOCUMENTS.ordinal()] = 3;
            iArr[com.mlsdev.rximagepicker.Sources.CHOOSER.ordinal()] = 4;
        }
    }

    public void _$_clearFindViewByIdCache() {
        java.util.HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public android.view.View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new java.util.HashMap();
        }
        android.view.View view = (android.view.View) this._$_findViewCache.get(java.lang.Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        android.view.View view2 = getView();
        if (view2 == null) {
            return null;
        }
        android.view.View viewFindViewById = view2.findViewById(i);
        this._$_findViewCache.put(java.lang.Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ io.reactivex.subjects.PublishSubject access$getAttachedSubject$p(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
        io.reactivex.subjects.PublishSubject<java.lang.Boolean> publishSubject = rxImagePicker.attachedSubject;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("attachedSubject");
        }
        return publishSubject;
    }

    public static final /* synthetic */ io.reactivex.subjects.PublishSubject access$getCanceledSubject$p(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubject = rxImagePicker.canceledSubject;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("canceledSubject");
        }
        return publishSubject;
    }

    public static final /* synthetic */ io.reactivex.subjects.PublishSubject access$getPublishSubject$p(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
        io.reactivex.subjects.PublishSubject<android.net.Uri> publishSubject = rxImagePicker.publishSubject;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubject");
        }
        return publishSubject;
    }

    public static final /* synthetic */ io.reactivex.subjects.PublishSubject access$getPublishSubjectMultipleImages$p(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
        io.reactivex.subjects.PublishSubject<java.util.List<android.net.Uri>> publishSubject = rxImagePicker.publishSubjectMultipleImages;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubjectMultipleImages");
        }
        return publishSubject;
    }

    public final io.reactivex.Observable<android.net.Uri> requestImage(com.mlsdev.rximagepicker.Sources source, java.lang.String chooserTitle) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
        this.chooserTitle = chooserTitle;
        return requestImage(source);
    }

    public final io.reactivex.Observable<android.net.Uri> requestImage(com.mlsdev.rximagepicker.Sources source) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(source, "source");
        initSubjects();
        this.allowMultipleImages = false;
        this.imageSource = source;
        requestPickImage();
        io.reactivex.subjects.PublishSubject<android.net.Uri> publishSubject = this.publishSubject;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubject");
        }
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubject2 = this.canceledSubject;
        if (publishSubject2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("canceledSubject");
        }
        io.reactivex.Observable<android.net.Uri> observableTakeUntil = publishSubject.takeUntil(publishSubject2);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableTakeUntil, "publishSubject.takeUntil(canceledSubject)");
        return observableTakeUntil;
    }

    public final io.reactivex.Observable<java.util.List<android.net.Uri>> requestMultipleImages() {
        initSubjects();
        this.imageSource = com.mlsdev.rximagepicker.Sources.GALLERY;
        this.allowMultipleImages = true;
        requestPickImage();
        io.reactivex.subjects.PublishSubject<java.util.List<android.net.Uri>> publishSubject = this.publishSubjectMultipleImages;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubjectMultipleImages");
        }
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubject2 = this.canceledSubject;
        if (publishSubject2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("canceledSubject");
        }
        io.reactivex.Observable<java.util.List<android.net.Uri>> observableTakeUntil = publishSubject.takeUntil(publishSubject2);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableTakeUntil, "publishSubjectMultipleIm…akeUntil(canceledSubject)");
        return observableTakeUntil;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    private final void initSubjects() {
        io.reactivex.subjects.PublishSubject<android.net.Uri> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(publishSubjectCreate, "PublishSubject.create()");
        this.publishSubject = publishSubjectCreate;
        io.reactivex.subjects.PublishSubject<java.lang.Boolean> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(publishSubjectCreate2, "PublishSubject.create()");
        this.attachedSubject = publishSubjectCreate2;
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubjectCreate3 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(publishSubjectCreate3, "PublishSubject.create()");
        this.canceledSubject = publishSubjectCreate3;
        io.reactivex.subjects.PublishSubject<java.util.List<android.net.Uri>> publishSubjectCreate4 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(publishSubjectCreate4, "PublishSubject.create()");
        this.publishSubjectMultipleImages = publishSubjectCreate4;
    }

    /* JADX INFO: renamed from: com.mlsdev.rximagepicker.RxImagePicker$onAttach$1, reason: invalid class name */
    /* JADX INFO: compiled from: RxImagePicker.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    final class AnonymousClass1 extends kotlin.jvm.internal.MutablePropertyReference0 {
        AnonymousClass1(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
            super(rxImagePicker);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public java.lang.String getName() {
            return "attachedSubject";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.mlsdev.rximagepicker.RxImagePicker.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public java.lang.String getSignature() {
            return "getAttachedSubject()Lio/reactivex/subjects/PublishSubject;";
        }

        @Override // kotlin.reflect.KProperty0
        public java.lang.Object get() {
            return com.mlsdev.rximagepicker.RxImagePicker.access$getAttachedSubject$p((com.mlsdev.rximagepicker.RxImagePicker) this.receiver);
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(java.lang.Object obj) {
            ((com.mlsdev.rximagepicker.RxImagePicker) this.receiver).attachedSubject = (io.reactivex.subjects.PublishSubject) obj;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        com.mlsdev.rximagepicker.RxImagePicker rxImagePicker = this;
        if ((!(rxImagePicker.canceledSubject != null)) | (!(rxImagePicker.attachedSubject != null)) | (!(rxImagePicker.publishSubject != null)) | (!(rxImagePicker.publishSubjectMultipleImages != null))) {
            initSubjects();
        }
        io.reactivex.subjects.PublishSubject<java.lang.Boolean> publishSubject = this.attachedSubject;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("attachedSubject");
        }
        publishSubject.onNext(true);
        io.reactivex.subjects.PublishSubject<java.lang.Boolean> publishSubject2 = this.attachedSubject;
        if (publishSubject2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("attachedSubject");
        }
        publishSubject2.onComplete();
    }

    /* JADX INFO: renamed from: com.mlsdev.rximagepicker.RxImagePicker$onAttach$2, reason: invalid class name */
    /* JADX INFO: compiled from: RxImagePicker.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    final class AnonymousClass2 extends kotlin.jvm.internal.MutablePropertyReference0 {
        AnonymousClass2(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
            super(rxImagePicker);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public java.lang.String getName() {
            return "publishSubject";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.mlsdev.rximagepicker.RxImagePicker.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public java.lang.String getSignature() {
            return "getPublishSubject()Lio/reactivex/subjects/PublishSubject;";
        }

        @Override // kotlin.reflect.KProperty0
        public java.lang.Object get() {
            return com.mlsdev.rximagepicker.RxImagePicker.access$getPublishSubject$p((com.mlsdev.rximagepicker.RxImagePicker) this.receiver);
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(java.lang.Object obj) {
            ((com.mlsdev.rximagepicker.RxImagePicker) this.receiver).publishSubject = (io.reactivex.subjects.PublishSubject) obj;
        }
    }

    /* JADX INFO: renamed from: com.mlsdev.rximagepicker.RxImagePicker$onAttach$3, reason: invalid class name */
    /* JADX INFO: compiled from: RxImagePicker.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    final class AnonymousClass3 extends kotlin.jvm.internal.MutablePropertyReference0 {
        AnonymousClass3(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
            super(rxImagePicker);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public java.lang.String getName() {
            return "publishSubjectMultipleImages";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.mlsdev.rximagepicker.RxImagePicker.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public java.lang.String getSignature() {
            return "getPublishSubjectMultipleImages()Lio/reactivex/subjects/PublishSubject;";
        }

        @Override // kotlin.reflect.KProperty0
        public java.lang.Object get() {
            return com.mlsdev.rximagepicker.RxImagePicker.access$getPublishSubjectMultipleImages$p((com.mlsdev.rximagepicker.RxImagePicker) this.receiver);
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(java.lang.Object obj) {
            ((com.mlsdev.rximagepicker.RxImagePicker) this.receiver).publishSubjectMultipleImages = (io.reactivex.subjects.PublishSubject) obj;
        }
    }

    /* JADX INFO: renamed from: com.mlsdev.rximagepicker.RxImagePicker$onAttach$4, reason: invalid class name */
    /* JADX INFO: compiled from: RxImagePicker.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    final class AnonymousClass4 extends kotlin.jvm.internal.MutablePropertyReference0 {
        AnonymousClass4(com.mlsdev.rximagepicker.RxImagePicker rxImagePicker) {
            super(rxImagePicker);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public java.lang.String getName() {
            return "canceledSubject";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.mlsdev.rximagepicker.RxImagePicker.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public java.lang.String getSignature() {
            return "getCanceledSubject()Lio/reactivex/subjects/PublishSubject;";
        }

        @Override // kotlin.reflect.KProperty0
        public java.lang.Object get() {
            return com.mlsdev.rximagepicker.RxImagePicker.access$getCanceledSubject$p((com.mlsdev.rximagepicker.RxImagePicker) this.receiver);
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(java.lang.Object obj) {
            ((com.mlsdev.rximagepicker.RxImagePicker) this.receiver).canceledSubject = (io.reactivex.subjects.PublishSubject) obj;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(grantResults, "grantResults");
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            pickImage();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        if (resultCode == -1) {
            switch (requestCode) {
                case 100:
                    handleGalleryResult(data);
                    break;
                case 101:
                    onImagePicked(cameraPictureUrl);
                    break;
                case 102:
                    if (isPhoto(data)) {
                        onImagePicked(cameraPictureUrl);
                    } else {
                        handleGalleryResult(data);
                    }
                    break;
            }
        }
        io.reactivex.subjects.PublishSubject<java.lang.Integer> publishSubject = this.canceledSubject;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("canceledSubject");
        }
        publishSubject.onNext(java.lang.Integer.valueOf(requestCode));
    }

    private final boolean isPhoto(android.content.Intent data) {
        return data == null || (data.getData() == null && data.getClipData() == null);
    }

    private final void handleGalleryResult(android.content.Intent data) {
        if (!this.allowMultipleImages) {
            if (data == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            onImagePicked(data.getData());
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (data == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        android.content.ClipData clipData = data.getClipData();
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                android.content.ClipData.Item itemAt = clipData.getItemAt(i);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(itemAt, "clipData.getItemAt(i)");
                arrayList.add(itemAt.getUri());
            }
        } else {
            arrayList.add(data.getData());
        }
        onImagesPicked(arrayList);
    }

    private final void requestPickImage() {
        if (!isAdded()) {
            io.reactivex.subjects.PublishSubject<java.lang.Boolean> publishSubject = this.attachedSubject;
            if (publishSubject == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("attachedSubject");
            }
            publishSubject.subscribe(new io.reactivex.functions.Consumer<java.lang.Boolean>() { // from class: com.mlsdev.rximagepicker.RxImagePicker.requestPickImage.1
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Boolean bool) {
                    com.mlsdev.rximagepicker.RxImagePicker.this.pickImage();
                }
            });
            return;
        }
        pickImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pickImage() {
        if (checkPermission()) {
            int i = 0;
            android.content.Intent intent = (android.content.Intent) null;
            com.mlsdev.rximagepicker.Sources sources = this.imageSource;
            if (sources != null) {
                int i2 = com.mlsdev.rximagepicker.RxImagePicker.WhenMappings.$EnumSwitchMapping$0[sources.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        intent = createPickFromGalleryIntent();
                    } else if (i2 == 3) {
                        intent = createPickFromDocumentsIntent();
                    } else if (i2 == 4) {
                        intent = createChooserIntent(this.chooserTitle);
                        i = 102;
                    }
                    i = 100;
                } else {
                    cameraPictureUrl = createImageUri();
                    intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", cameraPictureUrl);
                    android.content.Context context = getContext();
                    if (context == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                    android.net.Uri uri = cameraPictureUrl;
                    if (uri == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    grantWritePermission(context, intent, uri);
                    i = 101;
                }
            }
            startActivityForResult(intent, i);
        }
    }

    private final android.content.Intent createChooserIntent(java.lang.String chooserTitle) {
        cameraPictureUrl = createImageUri();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
        android.content.Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
        for (android.content.pm.ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            java.lang.String str = resolveInfo.activityInfo.packageName;
            android.content.Intent intent2 = new android.content.Intent(intent);
            intent2.setComponent(new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            intent2.setPackage(str);
            intent2.putExtra("output", cameraPictureUrl);
            android.content.Context context2 = getContext();
            if (context2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
            android.net.Uri uri = cameraPictureUrl;
            if (uri == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            grantWritePermission(context2, intent2, uri);
            arrayList.add(intent2);
        }
        android.content.Intent chooserIntent = android.content.Intent.createChooser(createPickFromDocumentsIntent(), chooserTitle);
        java.lang.Object[] array = arrayList.toArray(new android.content.Intent[0]);
        if (array != null) {
            chooserIntent.putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[]) array);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(chooserIntent, "chooserIntent");
            return chooserIntent;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final android.content.Intent createPickFromGalleryIntent() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.allowMultipleImages);
        }
        return intent;
    }

    private final android.content.Intent createPickFromDocumentsIntent() {
        android.content.Intent intent;
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            intent = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.allowMultipleImages);
            intent.addFlags(64);
        } else {
            intent = new android.content.Intent("android.intent.action.GET_CONTENT");
        }
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.addFlags(1);
        intent.setType("image/*");
        return intent;
    }

    private final boolean checkPermission() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        if (androidx.core.content.ContextCompat.checkSelfPermission(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        requestPermissions(new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 0);
        return false;
    }

    private final android.net.Uri createImageUri() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        android.content.ContentResolver contentResolver = activity.getContentResolver();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, new java.text.SimpleDateFormat("yyyyMMdd_HHmmss", java.util.Locale.getDefault()).format(new java.util.Date()));
        return contentResolver.insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    private final void grantWritePermission(android.content.Context context, android.content.Intent intent, android.net.Uri uri) {
        java.util.Iterator<android.content.pm.ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    private final void onImagesPicked(java.util.List<? extends android.net.Uri> uris) {
        io.reactivex.subjects.PublishSubject<java.util.List<android.net.Uri>> publishSubject = this.publishSubjectMultipleImages;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubjectMultipleImages");
        }
        publishSubject.onNext(uris);
        io.reactivex.subjects.PublishSubject<java.util.List<android.net.Uri>> publishSubject2 = this.publishSubjectMultipleImages;
        if (publishSubject2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubjectMultipleImages");
        }
        publishSubject2.onComplete();
    }

    private final void onImagePicked(android.net.Uri uri) {
        io.reactivex.subjects.PublishSubject<android.net.Uri> publishSubject = this.publishSubject;
        if (publishSubject == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubject");
        }
        if (uri == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        publishSubject.onNext(uri);
        io.reactivex.subjects.PublishSubject<android.net.Uri> publishSubject2 = this.publishSubject;
        if (publishSubject2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("publishSubject");
        }
        publishSubject2.onComplete();
    }

    /* JADX INFO: compiled from: RxImagePicker.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mlsdev/rximagepicker/RxImagePicker$Companion;", "", "()V", "CHOOSER", "", "SELECT_PHOTO", "TAG", "", "kotlin.jvm.PlatformType", "TAKE_PHOTO", "cameraPictureUrl", "Landroid/net/Uri;", "with", "Lcom/mlsdev/rximagepicker/RxImagePicker;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "library_release"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.mlsdev.rximagepicker.RxImagePicker with(androidx.fragment.app.FragmentManager fragmentManager) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
            com.mlsdev.rximagepicker.RxImagePicker rxImagePicker = (com.mlsdev.rximagepicker.RxImagePicker) fragmentManager.findFragmentByTag(com.mlsdev.rximagepicker.RxImagePicker.TAG);
            if (rxImagePicker != null) {
                return rxImagePicker;
            }
            com.mlsdev.rximagepicker.RxImagePicker rxImagePicker2 = new com.mlsdev.rximagepicker.RxImagePicker();
            fragmentManager.beginTransaction().add(rxImagePicker2, com.mlsdev.rximagepicker.RxImagePicker.TAG).commit();
            return rxImagePicker2;
        }
    }
}
