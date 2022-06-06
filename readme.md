# Example application using Spring boot with DynamoDB

### Prerequisites

1. JVM(of-course)
2. Docker

### How to run this application

- (1) Add execute permissions to two files.

```shell
chmod +x ./gradlew
chmod +x ./scripts/create-dynamodb-table.sh
```

- (2) Run docker environment.

```shell
docker compose -f docker-compose.yml up -d
```

- (3) Configure DynamodB environment.

```shell
./scripts/create-dynamodb-table.sh
```

- (4) Run application.

```shell
./gradlew bootRun
```

---