# Helloworld-rhoar

This simple HelloWorld Application using [Spring Boot](http://spring.io/projects/spring-boot) from Red Hat [Openshift Application Runtimes]() can be used to explore both [Fabric8 maven plugin](https://maven.fabric8.io/) and [Openshift Command Line Interface](https://docs.openshift.com/container-platform/3.10/cli_reference/index.html) deployment strategies

## Pre Requisites

A running instance of Openshift. This example was originally built using Container [Development Kit (a.k.a Minishift)](https://developers.redhat.com/products/cdk/overview/):

```
minishift version
minishift v1.20.0+1bd6d5c
CDK v3.5.0-1
```

# Project Setup #

1. In order to deploy this application, first of all you need to login on your current Openshift instance:

```
oc login $(minishift ip):8443 -u admin -p admin
```

2. Create a project/namespace (e.g rhoar)

```
oc new-project rhoar
```

3. Choose one of the following methods of Deployment

### Localhost Deployment

```
mvn spring-boot:run
```

### Openshift Deployment via Fabric8 Maven Plugin

```
mvn clean fabric8:deploy -Popenshift
```

In order to cleanup this project and explore command-line deployment strategy, just execute:

```
oc delete all --all
```

### Openshift Deployment via Openshift Commmand Line (CLI)

```
oc new-app java:8~https://github.com/vinicius-martinez/helloworld-rhoar.git
```

In order to cleanup this project and explore fabric8 deployment strategy, just execute:

```
oc delete all --all
```

## Additional References

[Spring Boot Runtime Guide](https://access.redhat.com/documentation/en-us/red_hat_openshift_application_runtimes/1/html-single/spring_boot_runtime_guide/)

[Snowdrop](http://snowdrop.me/)
