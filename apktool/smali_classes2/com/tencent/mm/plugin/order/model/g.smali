.class public final Lcom/tencent/mm/plugin/order/model/g;
.super Lcom/tencent/mm/wallet_core/b/g;
.source "SourceFile"


# instance fields
.field private bkQ:Lcom/tencent/mm/t/a;

.field private bkT:Lcom/tencent/mm/t/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 20
    invoke-direct {p0}, Lcom/tencent/mm/wallet_core/b/g;-><init>()V

    .line 21
    new-instance v0, Lcom/tencent/mm/t/a$a;

    invoke-direct {v0}, Lcom/tencent/mm/t/a$a;-><init>()V

    .line 22
    new-instance v1, Lcom/tencent/mm/protocal/b/mh;

    invoke-direct {v1}, Lcom/tencent/mm/protocal/b/mh;-><init>()V

    iput-object v1, v0, Lcom/tencent/mm/t/a$a;->byl:Lcom/tencent/mm/ax/a;

    .line 23
    new-instance v1, Lcom/tencent/mm/protocal/b/mi;

    invoke-direct {v1}, Lcom/tencent/mm/protocal/b/mi;-><init>()V

    iput-object v1, v0, Lcom/tencent/mm/t/a$a;->bym:Lcom/tencent/mm/ax/a;

    .line 24
    const-string/jumbo v1, "/cgi-bin/micromsg-bin/evaluateorder"

    iput-object v1, v0, Lcom/tencent/mm/t/a$a;->uri:Ljava/lang/String;

    .line 25
    const/16 v1, 0x247

    iput v1, v0, Lcom/tencent/mm/t/a$a;->byj:I

    .line 26
    iput v2, v0, Lcom/tencent/mm/t/a$a;->byn:I

    .line 27
    iput v2, v0, Lcom/tencent/mm/t/a$a;->byo:I

    .line 29
    invoke-virtual {v0}, Lcom/tencent/mm/t/a$a;->vA()Lcom/tencent/mm/t/a;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/mm/plugin/order/model/g;->bkQ:Lcom/tencent/mm/t/a;

    .line 30
    iget-object v0, p0, Lcom/tencent/mm/plugin/order/model/g;->bkQ:Lcom/tencent/mm/t/a;

    iget-object v0, v0, Lcom/tencent/mm/t/a;->byh:Lcom/tencent/mm/t/a$b;

    iget-object v0, v0, Lcom/tencent/mm/t/a$b;->byq:Lcom/tencent/mm/ax/a;

    check-cast v0, Lcom/tencent/mm/protocal/b/mh;

    .line 31
    iput-object p1, v0, Lcom/tencent/mm/protocal/b/mh;->jIf:Ljava/lang/String;

    .line 32
    iput-object p2, v0, Lcom/tencent/mm/protocal/b/mh;->jtJ:Ljava/lang/String;

    .line 33
    iput p3, v0, Lcom/tencent/mm/protocal/b/mh;->gdz:I

    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lcom/tencent/mm/network/e;Lcom/tencent/mm/t/d;)I
    .locals 1

    .prologue
    .line 52
    iput-object p2, p0, Lcom/tencent/mm/plugin/order/model/g;->bkT:Lcom/tencent/mm/t/d;

    .line 53
    iget-object v0, p0, Lcom/tencent/mm/plugin/order/model/g;->bkQ:Lcom/tencent/mm/t/a;

    invoke-virtual {p0, p1, v0, p0}, Lcom/tencent/mm/plugin/order/model/g;->a(Lcom/tencent/mm/network/e;Lcom/tencent/mm/network/o;Lcom/tencent/mm/network/j;)I

    move-result v0

    return v0
.end method

.method public final c(IILjava/lang/String;Lcom/tencent/mm/network/o;)V
    .locals 3

    .prologue
    .line 38
    const-string/jumbo v0, "MicroMsg.NetSceneEvaluateOrder"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "errType:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ",errCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ",errMsg"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/sdk/platformtools/v;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/tencent/mm/plugin/order/model/g;->bkT:Lcom/tencent/mm/t/d;

    invoke-interface {v0, p1, p2, p3, p0}, Lcom/tencent/mm/t/d;->onSceneEnd(IILjava/lang/String;Lcom/tencent/mm/t/j;)V

    .line 43
    return-void
.end method

.method public final getType()I
    .locals 1

    .prologue
    .line 47
    const/16 v0, 0x247

    return v0
.end method
