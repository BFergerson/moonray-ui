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

## Configuration
- Add SkyWalking database to Superset
  - `postgresql+psycopg2://postgres:123456@postgres:5432/postgres`

- Add SkyWalking dashboards to Superset
 - Settings > Import Dashboard
   - https://github.com/sourceplusplus/moonray-ui/blob/master/dashboards/database.json
   - https://github.com/sourceplusplus/moonray-ui/blob/master/dashboards/global.json
   - https://github.com/sourceplusplus/moonray-ui/blob/master/dashboards/vm.json
