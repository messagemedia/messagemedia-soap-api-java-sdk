messagemedia-java
=================

Sample Swing-based Java application demonstrating how to interact with the MessageMedia SOAP API

https://soap.m4u.com.au/?wsdl

To run the example code:<br>
   1. Run Ant build process with build.xml (default task create_run_jar) to produce messagemedia-java.jar. (http://ant.apache.org/)<br>eg ```ant -buildfile build.xml```<br>
   1.1. You may need to install Ant<br>
     * On Debian/Ubuntu run ```sudo apt-get install ant```<br>
     * On Redhat/CentOS run ```sudo yum install ant```
   2. Execute example program with: ```java -jar messagemedia-java.jar```<br>
   2.1. You may need to install java-jre-7 eg <br>
     * On Debian/Ubuntu run ```sudo apt-get install openjdk-7-jdk```<br>
     * On CentOS 5, You should have EPEL(https://fedoraproject.org/wiki/EPEL) installed eg : 
       * first install epel ```sudo rpm -Uvh http://dl.fedoraproject.org/pub/epel/5/x86_64/epel-release-5-4.noarch.rpm```
       * then install java openjdk ```sudo yum install java-1.7.0-openjdk-devel```
   3. Input your MessageMedia User ID and Password when prompted. Press login.<br>
   4. Four panels will appear. These allow you to:<br>
   4.1. send messages.<br>
   4.2. view (and confirm reciept of) replies to previously sent messages.<br>
   4.3. view (and confirm reciept of) delivery reports from previously sent messages.<br>
   4.4. view and manage blocked numbers.<br>

If you have any issues using this sample code, or would like to report a defect, please contact MessageMedia directly.
