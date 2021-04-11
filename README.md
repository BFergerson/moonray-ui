## Setup

### Requirements
- Docker
- Docker Compose

### Load containers
```sh
git clone https://github.com/sourceplusplus/orbital
cd orbital/docker
docker-compose up
```

### Setup Superset
- Execute `setup-superset.sh`
- Add SkyWalking database to Superset
  - `postgresql+psycopg2://postgres:123456@postgres:5432/postgres`

### Available Services
- Apache Superset: http://localhost:8888
- Apache SkyWalking: http://localhost:9999
