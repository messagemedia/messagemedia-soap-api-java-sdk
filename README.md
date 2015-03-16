# MessageMedia Java SDK
This library provides a simple interface for sending and receiving messages using the [MessageMedia SOAP API](http://www.messagemedia.com.au/wp-content/uploads/2013/05/MessageMedia_Messaging_Web_Service.pdf?eacfbb).

If you have any issue using this sample code, or would like to report a defect, you could [create a new Issue](https://github.com/messagemedia/messagemedia-java/issues/new) in Github or [Contact us](http://www.messagemedia.com.au/contact-us).

## Installation 
1. Run Ant build process with build.xml (default task create_run_jar) to produce messagemedia-java.jar. (http://ant.apache.org/): ```ant -buildfile build.xml```
2. You may need to install Ant
     * on Debian/Ubuntu run ```sudo apt-get install ant```
     * on Redhat/CentOS run ```sudo yum install ant```
3. You may need to install java-jre-7 eg
     * on Debian/Ubuntu run ```sudo apt-get install openjdk-7-jdk```

## Usage
   2. Execute example program with: ```java -jar messagemedia-java.jar```
   3. Input your MessageMedia User ID and Password when prompted. Press login.
   4. Four panels will appear. These allow you to:<br>
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
