# Project Documentation

In this `docs` module we describe the requirements and architecture of the application.
For this we use/follow the [arc42](https://docs.arc42.org/home/) framework for the architectural documentation and 
picked parts, were inspired by the [req42](https://req42.de/en/req42-at-a-glance) framework for the documentation of the requirements

Structure:

* `arc42` - software architecture documentation and overview
* `requirements` - documentation of the requirements

Generate the single HTML document from the project root with:

```shell
./gradlew :docs:asciidoctorHtml
```

The result is written to `docs/build/docs/asciidoc/html/index.html`.
