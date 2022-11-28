# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

cd student-submission

if [ -e "ListExamples.java" ];
then
    cd ..
    cp ./student-submission/ListExamples.java ListExamples.java
else    
    echo "The ListExamples.java file does not exist in the submission"
fi

javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar TestListExamples.java TestListExamples.java; [ $? -eq 0 ] || echo "The file did not compile successfully"
java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestListExamples


