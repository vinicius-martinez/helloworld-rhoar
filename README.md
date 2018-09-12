# helloworld-rhoar

This simple HelloWorld Application using Spring Boot from Red Hat Openshift Application Runtimes can be used to explore both fabric8 maven plugin and Openshift CLI deployment strategies

## Pre Requisites

A running instance of Openshift. This example was originally built using Container Development Kit (a.k.a Minishift):

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
