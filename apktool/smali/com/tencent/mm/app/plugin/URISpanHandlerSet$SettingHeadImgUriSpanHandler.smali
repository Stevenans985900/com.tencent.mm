.class Lcom/tencent/mm/app/plugin/URISpanHandlerSet$SettingHeadImgUriSpanHandler;
.super Lcom/tencent/mm/app/plugin/URISpanHandlerSet$BaseUriSpanHandler;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/mm/app/plugin/URISpanHandlerSet$a;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/app/plugin/URISpanHandlerSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SettingHeadImgUriSpanHandler"
.end annotation


# instance fields
.field final synthetic apd:Lcom/tencent/mm/app/plugin/URISpanHandlerSet;


# direct methods
.method constructor <init>(Lcom/tencent/mm/app/plugin/URISpanHandlerSet;)V
    .locals 0

    .prologue
    .line 500
    iput-object p1, p0, Lcom/tencent/mm/app/plugin/URISpanHandlerSet$SettingHeadImgUriSpanHandler;->apd:Lcom/tencent/mm/app/plugin/URISpanHandlerSet;

    invoke-direct {p0, p1}, Lcom/tencent/mm/app/plugin/URISpanHandlerSet$BaseUriSpanHandler;-><init>(Lcom/tencent/mm/app/plugin/URISpanHandlerSet;)V

    return-void
.end method


# virtual methods
.method final a(Lcom/tencent/mm/pluginsdk/ui/applet/ah;Lcom/tencent/mm/pluginsdk/ui/d/f;)Z
    .locals 2

    .prologue
    .line 523
    iget v0, p1, Lcom/tencent/mm/pluginsdk/ui/applet/ah;->type:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 524
    if-eqz p2, :cond_0

    .line 525
    invoke-interface {p2, p1}, Lcom/tencent/mm/pluginsdk/ui/d/f;->a(Lcom/tencent/mm/pluginsdk/ui/applet/ah;)Ljava/lang/Object;

    .line 527
    :cond_0
    invoke-static {}, Lcom/tencent/mm/ui/LauncherUI;->aKD()Lcom/tencent/mm/ui/LauncherUI;

    move-result-object v0

    .line 528
    if-eqz v0, :cond_1

    .line 529
    const-string/jumbo v1, "tab_settings"

    invoke-virtual {v0, v1}, Lcom/tencent/mm/ui/LauncherUI;->As(Ljava/lang/String;)V

    .line 531
    :cond_1
    const/4 v0, 0x1

    .line 536
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final a(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/n;Landroid/os/Bundle;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 541
    const-string/jumbo v1, "weixin://setting/setheadimage"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 542
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 543
    const-string/jumbo v2, "Contact_User"

    invoke-static {}, Lcom/tencent/mm/model/v;->rS()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 544
    const-string/jumbo v2, "Contact_Nick"

    invoke-static {}, Lcom/tencent/mm/model/v;->rU()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 545
    const-string/jumbo v2, "User_Avatar"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 546
    iget-object v2, p0, Lcom/tencent/mm/app/plugin/URISpanHandlerSet$SettingHeadImgUriSpanHandler;->apd:Lcom/tencent/mm/app/plugin/URISpanHandlerSet;

    invoke-static {v2}, Lcom/tencent/mm/app/plugin/URISpanHandlerSet;->a(Lcom/tencent/mm/app/plugin/URISpanHandlerSet;)Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Service;

    if-eqz v2, :cond_0

    .line 547
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 549
    :cond_0
    iget-object v2, p0, Lcom/tencent/mm/app/plugin/URISpanHandlerSet$SettingHeadImgUriSpanHandler;->apd:Lcom/tencent/mm/app/plugin/URISpanHandlerSet;

    invoke-static {v2}, Lcom/tencent/mm/app/plugin/URISpanHandlerSet;->a(Lcom/tencent/mm/app/plugin/URISpanHandlerSet;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "profile"

    const-string/jumbo v4, ".ui.ContactInfoUI"

    invoke-static {v2, v3, v4, v1}, Lcom/tencent/mm/aj/c;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V

    .line 552
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final aZ(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/ui/applet/ah;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 504
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v2, "weixin://setting/setheadimage"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 505
    new-instance v0, Lcom/tencent/mm/pluginsdk/ui/applet/ah;

    const/4 v2, 0x6

    invoke-direct {v0, p1, v2, v1}, Lcom/tencent/mm/pluginsdk/ui/applet/ah;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    .line 508
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method final lL()[I
    .locals 3

    .prologue
    .line 518
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x6

    aput v2, v0, v1

    return-object v0
.end method