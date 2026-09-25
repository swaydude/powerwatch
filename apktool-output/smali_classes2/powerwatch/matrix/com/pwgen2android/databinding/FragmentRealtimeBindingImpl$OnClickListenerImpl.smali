.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;
.super Ljava/lang/Object;
.source "FragmentRealtimeBindingImpl.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OnClickListenerImpl"
.end annotation


# instance fields
.field private value:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 498
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "arg0"
        }
    .end annotation

    .line 506
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;->value:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;->onStepsCircleClicked(Landroid/view/View;)V

    return-void
.end method

.method public setValue(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    .line 501
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBindingImpl$OnClickListenerImpl;->value:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method
