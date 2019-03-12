# spring-boot-prometheus

>Setup for expose Prometheus metrics in a Spring Boot app

## Dependencies

- spring-boot-starter-actuator
- micrometer-core
- micrometer-registry-prometheus

## Installation

### Build
```console
$ mvn clean install
```

### Running
```console
$ mvn spring-boot:run
```

## Usage

### GET /metrics
```console
$ curl -X GET https://spring-boot-prometheus.herokuapp.com/metrics
```

## License
The MIT License (MIT)