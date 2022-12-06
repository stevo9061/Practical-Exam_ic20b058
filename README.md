# Practical-Exam_ic20b058

<h3 align="center">Software Development Process</h3>

<p align="center">DevOps methods (Continuous Integration, Continuous Delivery, ...).</p>

<!-- ABOUT THE PROJECT -->
## About The Project
I should implement a REST-based server in Java (use Spring
Boot). The service should be able to set specific messages, deliver the messages to the developer and reset the message using REST.


## Requirements
Use GitHub or Azure DevOps for the project and follow the correct DevOps procedure. Use a
Kanban board to manage your User Stories and use a git branching model (preferable
gitflow) to manage your code. Track your development process by updating your Kanban
board and write at least one unit tests for every requirement. A Continuous Integration
pipeline that produces the finished software artifact should be implemented as well.
Document
- the whole process
- the user stories
- the repository URL
- the usage of the software
  in a PDF file with screenshots and explanatory text. Submit the code (including the .git folder
  and ALM files) as a zip file (please put the PDF inside the zip file).

## To run the artifact

* java -jar *.jar

# Screenshots of the whole process

* Overview Repository
![](screenshots/img.png)

* Overview Kanban Board
![img_2.png](screenshots/img_2.png)

* Overview Issues
![img_3.png](screenshots/img_3.png)

## Process ->

* Set first user story to "In Progress"
![img_4.png](screenshots/img_4.png)


* git checkout -b develop
* git checkout -b feature/#1QueryMessages
* git checkout develop
* git merge feature/#1QueryMessages
* Set first user story to "Done" and link the Issue with Commit
* git branch -d feature/#1QueryMessages
![img.png](screenshots/img_5.png)

This process is adopted for each user story. Basically, there will
probably only two user stories due to time constraints, one for implementation and the other for unit testing.

After all features are implemented and merged into the development branch, 
the development branch is merged into the main branch. 

* git checkout main
* git merge develop
* git push // to start the builder for our deployable