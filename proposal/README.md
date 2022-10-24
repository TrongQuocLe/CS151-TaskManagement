# CS 151- Final Project Proposal

## Title: Task Management

### Group 3: Trong Le, Glenn Veloya, Kyle Lo

### Problem:
In a world of multiple technologies and different operations, the most important foundation for success is accountability. Accountability can mean accountability in communicating with your fellow developers, or accountability for a project you are leading. There are different methodologies for project management and we want to create a platform that allows the integration of different services that ties in together everything you need for success. Yes there are already companies that have task management tools, but we were thinking simpler and more intuitive. Something that students can use, something that programmers can use, something that management can use. We aren't "reinventing the wheel, " we are making it simpler.

### Previous/Similar Works:
Clickup, ProofHub, Asana, Trello, Monday

### Assumptions/Operating Environment/Intended Usage:
The Assumptions here is that the user is in need of staying on top of his/her classes/projects. That is our intended audience. Even if the user might not need the application, my end goal is to have this application not have to be a thought in someone's mind. It should be as intuitive as opening a terminal in your current working directory and type one command to push the folder structure into our application that will organize it based on your needs or template. Operating environment is web and if time permits, mobile.

### Applications:
Companies where there might be a lot of developers on a project.
Management to prioritize what needs to be done.
Collaboration for people who might not have the same skill sets as people they are working with.
Students to finish up homework or manage tasks for the semester/quarter. (We will be focusing on this first)
Gig workers
Simplified way to reorganize or transition from one platform or another
 
### High Level Solutions: 
High level functionality we hope to address
A web based app that makes it easy for people to collaborate and for individuals that want to create self-fulfilling tasks (For business and personal).
A simple way to add tasks or upload tasks from another source. (Integration is the end goal here)
Ability to have a modular Workspace but with the familiarity of working with different outlines. I should be able to switch between SCRUM or waterfall without a hassle.

## Top level/Operations:
Have a side panel with different workspaces and a main dashboard

Users can choose which template they want and should be able to change back and forth between certain templates. (i.e you would be able to change between a Gantt chart and waterfall dashboard seamlessly)

Once a workspace has been created, users can create containers which will then hold their compartments and then tasks. The idea of this is to keep everything simple so modularity can be achieved.

### Purpose:
The purpose of this application is to have a high level and lower level UI that lets management know the state of the tasks but also your peers working on the same project. This necessarily isn't just for team members, but also for students and people who might want an automated way to self-manage. The scope of this is big; however I believe that there is a general approach in which we can use this and have features that can benefit both software developers as well as your everyday person. You have many other applications like monday or Trello, but when asking my fellow peers, they don't use these apps or websites. What is preventing them from using these productivity tools? The main purpose of this is to actually be palatable to the average consumer.

### Functionality:
We need this to be a Web browser because people are less inclined to download something on their computer and to have it run. We can have an "offline" version which is an app, but we will focus mainly on the web application part. This web application can be a web browser extension of chrome or it can be a standalone that has a side panel and a deck that manages everything on a dashboard. You can start by creating your domain/workspace, then create the containers inside each domain and workspace. The task can then be delegated and you can assign it points. Each point should be calculated in terms of hours spent. 1pt=1hr. Give your project a total number of points then you can press a button that assigns the tasks randomly or you can choose. You can then have a limit on how many hours (load) you can handle every sprint (Assuming you are doing agile scrum) or semester. Aka, you say that for CS151 you are required to dedicate 20hrs a week, so in a sprint 40hrs, and each task such as hw/quiz/midterm will have a dedicated amount of points you can automate, or you can assign personalized points to it. 


### UML Diagram: 
|Diagram|Summary Description|
|--|--|
|[Class](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/TaskManagementClassDiagram.pdf) |Contains `Workspace` interface and three classes included `Container`, `Compartments`, `Taks`.
|[State](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/Trong_Le_TaskManagement_StateDiagram.pdf) |Contains `Task Management System` and `Task Modification`.
|[Use Case](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/Use%20Case%20Diagram.pdf) |Allow main student doing all the tasks, but limit to other added student. 
