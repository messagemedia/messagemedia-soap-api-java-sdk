# MessageMedia Java SDK (DEPRECATED)
[![No Maintenance Intended](http://unmaintained.tech/badge.svg)](http://unmaintained.tech/)

This is no longer supported, please consider using https://github.com/messagemedia/messages-java-sdk instead.
T̶h̶i̶s̶ ̶l̶i̶b̶r̶a̶r̶y̶ ̶p̶r̶o̶v̶i̶d̶e̶s̶ ̶a̶ ̶s̶i̶m̶p̶l̶e̶ ̶i̶n̶t̶e̶r̶f̶a̶c̶e̶ ̶f̶o̶r̶ ̶s̶e̶n̶d̶i̶n̶g̶ ̶a̶n̶d̶ ̶r̶e̶c̶e̶i̶v̶i̶n̶g̶ ̶m̶e̶s̶s̶a̶g̶e̶s̶ ̶u̶s̶i̶n̶g̶ ̶t̶h̶e̶ ̶[̶M̶e̶s̶s̶a̶g̶e̶M̶e̶d̶i̶a̶ ̶S̶O̶A̶P̶ ̶A̶P̶I̶]̶(http://www.messagemedia.com.au/wp-content/uploads/2013/05/MessageMedia_Messaging_Web_Service.pdf?eacfbb).

If you have any issue using this sample code, or would like to report a defect, you could [create a new Issue](https://github.com/messagemedia/messagemedia-java/issues/new) in Github or [Contact us](http://www.messagemedia.com.au/contact-us).

## Installation 

To run the example code:<br>
   1. Run Ant build process with build.xml (default task create_run_jar) to produce messagemedia-java.jar. (http://ant.apache.org/)<br>eg ```ant -buildfile build.xml```<br>
   1.1. You may need to install Ant<br>
     * On Debian/Ubuntu run ```sudo apt-get install ant```<br>
     * On Redhat/CentOS run ```sudo yum install ant```
   2. Execute example program with: ```java -jar messagemedia-java.jar```<br>
   2.1. You may need to install java-jre-7 eg <br>
     * on Debian/Ubuntu run ```sudo apt-get install openjdk-7-jdk```<br>
     * On CentOS 5, You should have EPEL(https://fedoraproject.org/wiki/EPEL) installed eg : 
            * first install epel ```sudo rpm -Uvh http://dl.fedoraproject.org/pub/epel/5/x86_64/epel-release-5-4.noarch.rpm```
            * then install java openjdk ```sudo yum install java-1.7.0-openjdk-devel```
## Usage
   1. Execute example program with: ```java -jar messagemedia-java.jar```
   2. Input your MessageMedia User ID and Password when prompted. Press login.<br>
   3. Four panels will appear. These allow you to:<br>
     * send messages.<br>
     * view (and confirm reciept of) replies to previously sent messages.<br>
     * view (and confirm reciept of) delivery reports from previously sent messages.<br>
     * view and manage blocked numbers.<br>

## Contributing
We welcome contributions from our users. Contributing is easy:

  1.  Fork this repo
  2.  Create your feature branch (`git checkout -b my-new-feature`)
  3.  Commit your changes (`git commit -am 'Add some feature'`)
  4.  Push to the branch (`git push origin my-new-feature`)
  5.  Create a Pull Request
