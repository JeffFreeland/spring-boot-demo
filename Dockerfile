FROM ghcr.io/graalvm/graalvm-ce:latest AS builder

WORKDIR /app

RUN gu install native-image

COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

RUN native-image --static --no-fallback -jar ./demo-0.0.1-SNAPSHOT.jar -H:Name=output

FROM scratch

COPY  --from=builder /app/output output

CMD ["/output"]