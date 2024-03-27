FROM bitnami/java:21
WORKDIR /app
ADD entrypoint.sh .
ADD src/main/resources/application.properties .
CMD ["/bin/bash", "entrypoint.sh"]
