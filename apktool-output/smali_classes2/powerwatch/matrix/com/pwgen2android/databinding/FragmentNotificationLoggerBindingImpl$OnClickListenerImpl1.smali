.class public Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;
.super Ljava/lang/Object;
.source "FragmentNotificationLoggerBindingImpl.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OnClickListenerImpl1"
.end annotation


# instance fields
.field private value:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 148
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

    .line 156
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;->value:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;->onBackClicked(Landroid/view/View;)V

    return-void
.end method

.method public setValue(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;)Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "value"
        }
    .end annotation

    .line 151
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentNotificationLoggerBindingImpl$OnClickListenerImpl1;->value:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method
