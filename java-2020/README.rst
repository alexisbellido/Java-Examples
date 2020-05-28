Java
===============================

`OpenJDK <https://hub.docker.com/_/openjdk>`_.

.. code :: bash

    $ docker run --rm -it -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk:14-slim-buster bash


`Oracle JDK <https://hub.docker.com/_/oracle-jdk>`_. Requires docker login before pulling.

.. code :: bash

    $ docker pull store/oracle/jdk:11
    $ docker run --rm -it -v "$PWD":/usr/src/myapp -w /usr/src/myapp store/oracle/jdk:11 bash