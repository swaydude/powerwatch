#!/usr/bin/env python3
"""Short-circuit all Matrix-cloud HTTP in HttpClientImpl.smali for offline operation.

Replaces the bodies of the 8 network methods so they return an immediate
Single.error / Completable.error WITHOUT touching the Retrofit HTTP client or
opening any socket. `this` and params are never referenced -> register-safe.
"""
import sys

F = "apktool-output/smali_classes3/powerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl.smali"

# (exact .method header, RxJava type)
METHODS = [
    (".method public download(Ljava/lang/String;)Lio/reactivex/Single;", "Single"),
    (".method public downloadJSON(Ljava/lang/String;Ljava/lang/reflect/Type;)Lio/reactivex/Single;", "Single"),
    (".method public get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/reflect/Type;)Lio/reactivex/Single;", "Single"),
    (".method public getCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/reactivex/Completable;", "Completable"),
    (".method public postCompletable(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;", "Completable"),
    (".method public postMultiPart(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;)Lio/reactivex/Completable;", "Completable"),
    (".method public postMultiPartWithResponse(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lokhttp3/MultipartBody$Part;Ljava/lang/Class;)Lio/reactivex/Single;", "Single"),
    (".method public postSingle(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;", "Single"),
]


def body_for(header, rx):
    return [
        header,
        "    .locals 2",
        "    # OFFLINE PATCH: short-circuit cloud HTTP - no network call is made",
        "    new-instance v0, Ljava/lang/RuntimeException;",
        '    const-string v1, "powerwatch offline: network disabled"',
        "    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V",
        "    invoke-static {v0}, Lio/reactivex/%s;->error(Ljava/lang/Throwable;)Lio/reactivex/%s;" % (rx, rx),
        "    move-result-object v0",
        "    return-object v0",
        ".end method",
    ]


def main():
    with open(F) as fh:
        lines = fh.read().split("\n")

    replaced = []
    for header, rx in METHODS:
        start = None
        for i, ln in enumerate(lines):
            if ln.strip() == header:
                start = i
                break
        if start is None:
            print("NOT FOUND:", header)
            sys.exit(1)
        end = None
        for j in range(start + 1, len(lines)):
            if lines[j].strip() == ".end method":
                end = j
                break
        if end is None:
            print("NO .end method for:", header)
            sys.exit(1)
        lines[start:end + 1] = body_for(header, rx)
        replaced.append(header.split(" public ")[1].split("(")[0])

    with open(F, "w") as fh:
        fh.write("\n".join(lines))

    print("patched %d methods: %s" % (len(replaced), ", ".join(replaced)))


if __name__ == "__main__":
    main()
