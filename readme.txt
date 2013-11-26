* Written by Anders Asperheim 2013-11-25

* Generate the Blob Class
java -jar .\lib\avro-tools-1.7.5.jar compile schema src\main\avro\AndersProtokollen.avro src\main\java\

* Generate IDL Protocol file 

java -jar .\lib\avro-tools-1.7.5.jar idl src\main\avro\AndersProtokollen.avro src\main\java\
