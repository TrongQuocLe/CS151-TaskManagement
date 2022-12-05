# CS151-TaskManagement

## CS 151 Final Project - Task Management

Check [proposal](https://github.com/TrongQuocLe/CS151-TaskManagement/tree/main/proposal) folder for project details and purpose

[Link](https://docs.google.com/presentation/d/1p9u4H8ykdLlc-2W6Y19dFAVhCQ6SYjOPjosBsT9Gxd4/edit?usp=sharing) to google slides presentation

### **Group 3**: Trong Le, Glenn Veloya, Kyle Lo

Proposal written by: Kyle Lo

Project Slides Created by: Trong Le

Code and Report written by: Kyle Lo

### **Problems and Issues:**

The problem of this world is the scarcity time. We can't turn back time (at least for now), but we can help you manage your tasks to free up your time. As humans, especially college students, we tend to not focus on important tasks or we might spend too much time on certain tasks when there are more urgent tasks that are needed to be completed.

### **Previous/Similar Works:**

We are not recreating the wheel, we are trying to make it more digestible. Here is a list of similar applications already in existance:

- monday
- asana
- notion
- Workona
- ora
- ClickUp

### **Intended Usage:**

The intended use of this application is if you wish to visualize your task on the computer, you have the option to keep yourself accountable. This is a java application, so you have to open up the application. Web Application will be done in a seperte self project written in node.js. Stay tuned for more details.

### UML Diagram:

| Diagram                                                                                                                  | Summary Description                                                                            |
| ------------------------------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------- |
| [Class](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/TaskManagementClassDiagram.pdf)           | Contains `Workspace` interface and three classes included `Container`, `Compartments`, `Taks`. |
| [State](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/Trong_Le_TaskManagement_StateDiagram.pdf) | Contains `Task Management System` and `Task Modification`.                                     |
| [Use Case](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/Use%20Case%20Diagram.pdf)              | Allows main student doing all the tasks, but limit to other added student.                     |
| [Timing](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/Timing%20Diagram.drawio.pdf)             | Displays the change in state, time took in doing and access tasks or projects.                 |
| [Sequence Diagram](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/Timing%20Diagram.drawio.pdf)   | Sequence of User action and server response                                                    |

### **Functionality:**

This application will provide an orangize way to set your tasks and priority of the task so that you can self manage and keep yourself accountable.

### **Operation:**

User will create an account that will store their data. Once User Logins, You will be greeted with personalized Homepage. From the homepage you can then create a workspace to organize your tasks. Workspace would be your main or root folder and then you can create containers in your workspace. This will help students to create different containers to contain different classes and within each of these class they will have seperate components that make up that container or class. An example would be Workspace(SJSU)--has-a->Container(CS151)--has-a->Component(Homework)--has-a->Task(Homework 1).  
Top Level View of Operation: [Task Management Diagram (Top Level)](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/diagrams/Task%20Management.drawio.png)

### **Solution:**

We attempted to solve this solution by implementing the diagram above. We tried to compartmentalize necessary tasks and notify when due dates are due. The solution currently only have a way to store a task and nothing else. There is also no database so nothing is saved and will not save anything when you close the program.

### **Steps to run code:**

Go to [MainJFrame.java](https://github.com/TrongQuocLe/CS151-TaskManagement/blob/main/app/TaskManagement/src/jswing/MainJFrame.java) and run that file.  
 Or Simply Run the [TaskManagement.jar](https://github.com/TrongQuocLe/CS151-TaskManagement/tree/main/app/TaskManagement/src)

### **SnapShots of the App:**

![Login](https://github.com/lo7kyle/Cryptocurrencies/blob/main/Resources/texttonumbers.PNG)  
![HomePage](https://github.com/lo7kyle/Cryptocurrencies/blob/main/Resources/texttonumbers.PNG)  
![TaskPage](https://github.com/lo7kyle/Cryptocurrencies/blob/main/Resources/texttonumbers.PNG)  
![Create New Task](https://github.com/lo7kyle/Cryptocurrencies/blob/main/Resources/texttonumbers.PNG)  
![Update Task](https://github.com/lo7kyle/Cryptocurrencies/blob/main/Resources/texttonumbers.PNG)

### **Project SetBacks:**

As with many projects, many times they run into the issue of being too ambitious. This project is no different. There were many issues that plauged this project, one being what this app had hope to solve. That being time and task mangaement. Below is a list of what I belive are the main issues that prevented this project's success.

1. **Time/Task Management:**

   - One of the biggest problem that many college students face is that we have a lot on our plate. We are taking more than one class, we might be working full-time or even part-time, we might have social obligations, and the list goes on and on. When we don't allocate the appropriate amount of time to certain or different tasks, we fall into the trap of overestimating our abilities to finish the task at hand. We do not have an incentive to finish a task because there is no punishment. In laymans term, we know why we should go to the gym, but if we don't go to the gym or skip a day of gymming, who is actually going to tell us no? And when it is time to pay the piper, we scramble around trying to throw just "something" together. This mediocrity that we threw together is exactly what happens when there is no consequence for not finishing our tasks on time and for prioritizing all of our tasks in the wrong order.

2. **Overestimating our abilities:**

   - One of the many deadly sins of college students is overestimating our own abilities. Take for an example studying for a class. We know we should be studying and practicing that subject, but we "already know it," so we can slack off. This is one of the great sins that I commit too often and this failure of a project is a reflection on that. When you have team members with poor time management who doesn't care come and ask for help, hoping the issue can be solved 1 day before due date, they must understand that a lot of the project code and implementation took weeks to gain and that it is not as simple as dot walking for a built in method.

3. **Level of Understanding:**
   - This issue/problem is one that is hard to avoid with a diverse group of students who all learn at different pace; however this issue could have been alleviated with the two major issues listed above. Yes, it is impossible to know and understand everything, but it isn't impossible to learn. When it comes to understanding, one of the biggest issue of this project was understanding what this whole class was about, Object Oriented Design. When you have team members who doesn't understand Object Oriented Design and try to fit everything into one page of code, you know that they missed the entire point of this class. Yes, fine, we can write the entire dashboard into one file of code, but what happens if one button breaks? Then our entire app will become useless. To gain knowledge you must attempt to gain it. Just because you read lecture slides on multithreading but have never attempted it yourself, can you truly say you understand it?

• (Optional) References:  
Credit given where credit is due. There are many similar applications already built; however there is a YouTuber that have helped guide me along this process of understanding swing and the the many applications it provides.

### Ra Ven [YouTube](https://www.youtube.com/@LaingRaven) Channel[1]

### DJ-RaVen [GitHub](https://github.com/DJ-Raven) Repository [2]

Huge shoutout to this YouTbue Channel and github repository for having prebuilt JComponents and tutorials for java swing and giving me a good idea of what is capable.

[DJ-Raven GitHub Repository](https://github.com/DJ-Raven)[1]  
[Ra Ven YouTube Chanel](https://www.youtube.com/@LaingRaven)[2]
