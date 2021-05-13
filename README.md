# MoonRay UI

> Apache SkyWalking + Apache Superset = MoonRay UI

![apm_vm](https://user-images.githubusercontent.com/3278877/118176535-89829180-b3ff-11eb-8708-6f9fd0831524.png)

## Setup

### Requirements
- JDK 11
- Git
- Docker
- Docker Compose

### Load containers
#### Linux
```sh
git clone https://github.com/sourceplusplus/orbital
cd orbital
./gradlew composeUp && sleep 10 && ./setup-superset.sh
```

#### Windows
```sh
git clone https://github.com/sourceplusplus/orbital
cd orbital
gradlew.bat composeUp && timeout 10 && setup-superset.bat
```

## Using Superset
- Add SkyWalking database to Superset
  - `postgresql+psycopg2://postgres:123456@postgres:5432/postgres`

## Using SkyWalking
- Click "Auto" in the top right corner if no charts displayed
- Change timezone in bottom right corner if no charts displayed
