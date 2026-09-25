.method public login(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
            ">;"
        }
    .end annotation

    # --- Bypass: return hardcoded User (test@test.com / test1234) ---
    # Store a valid token so isLoggedIn() is happy for subsequent checks
    const-string v1, "accessToken_patch"
    const-string v2, "Bearer"
    const-string v3, "refreshToken_patch"
    const-wide/16 v4, 0xe10    ; // expiresIn = 3600
    const-string v6, "read write"
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    move-result-wide v7
    const-wide/16 v9, 0x15180    ; // 86400000 ms = 24h
    add-long/2addr v7, v9
    const-string v8, "test@test.com"
    const-string v11, "test1234"
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
    invoke-direct {v12, p0, v1, v2, v3, v4, v6, v7, v8, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;->tokenProvider:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;
    invoke-virtual {v0, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;->add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)Lio/reactivex/Completable;

    # Build a hardcoded User:
    #   User(uid=1, enabled=true, name="Test", email="test@test.com", password="test1234",
    #        age=25, height=180, weight=80.0f, gender="Male", shouldSync=false, accountSettings=...)
    new-instance v0, Ljava/lang/String;
    const-string v1, "Test"
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    const-string v1, "test@test.com"
    const-string v2, "test1234"
    const/4 v3, 0x19          ; // age = 25
    const/16 v4, 0xb4         ; // height = 180
    const/16 v5, 0x50
    const/16 v6, 0x40
    const-float v7, 8.0e+01f    ; // weight = 80.0f
    const-string v8, "Male"
    const/4 v9, 0x0            ; // shouldSync = false
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;
    const-string v11, "en_US"
    const-string v12, "metric"
    const/4 v13, 0x0
    invoke-direct {v10, v11, v12, v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
    const-wide/16 v11, 0x1      ; // uid = 1L
    const/4 v12, 0x1            ; // enabled = true
    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;
    invoke-direct/range {v13 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;)V

    invoke-static {v13}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;
    move-result-object v0
    return-object v0
.end method