## Setup

### Requirements
- Docker

### Load containers
```sh
git clone https://github.com/sourceplusplus/orbital
cd orbital
./gradlew composeUp && sleep 10 && ./setup-superset.sh
```

### Available Services
- Apache Superset: http://localhost:8888
- Apache SkyWalking: http://localhost:9999

## Using Superset
- Add SkyWalking database to Superset
  - `postgresql+psycopg2://postgres:123456@postgres:5432/postgres`

## Using SkyWalking
- Click "Auto" in the top right corner if no charts displayed
- Change timezone in bottom right corner if no charts displayed
