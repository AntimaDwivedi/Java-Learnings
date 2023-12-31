We can also generate jar file through application by using maven.

Go to the edit configuration tab ,click on plus ,add maven inside run filed add clean package(please give space between clean and package) and run the maven build.



Error while running jar file
<b>no main manifest attribute, in C:\Users\Antima Dwivedi\Downloads\Backend Learning\JavaEssentials\BasicJava\target\BasicJava-1.0-SNAPSHOT.jar</b>
You have to add plugin to introduce the jar file from starting point inj order to execute.
   <!--     Build an executable JAR-->
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.2.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>org.example.Main</mainClass>
                        </manifest>
                    </archive>
                </configuration>

            </plugin>
        </plugins>
    </build>

Again run the maven build ,now it will create an updated jar file. and after that run the Jar.

#### Keywords
Keywords are reserved words.
Meaning of these are words are known to compiler.
Keyword can not be used as name of variable.
Keywords are case-sensitive.

Literals are the values we assigned to a variable i.e .true,false and null

Initialization is important in java ,otherwise you will get an error.


##### Declaration , assignments and initialization of variable

  int value = 2 // initialization

  int value // declaration
  value =2 //  assignment 

In java by default ,decimal point numbers are double , and we have to implicit add f to make it floating point number.
We can  only assign true and false to boolean variables ,0 and 1 are not accepted.
char datatype variable will store only a string of length 1.
String is a class
'+' is an overloaded operator,it can  add numbers and also concatenate strings.
When we are adding String and int , int  will be  implicitly cast  to string.
Can we convert String to int ?  --> Using parseInt


Java naming Conventions
https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html








