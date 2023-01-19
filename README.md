# AI-Planning As CSP for a Delivery Robot

This repository contains a solution for an AI delivery robot that navigates through a space using CSP (Constraint Satisfaction Problem) and STRIP (STRIPS Planning) models to deliver objects to the goal node. The solution is implemented in Java.


<img src=https://user-images.githubusercontent.com/84153519/213351840-b83f4a66-eada-4615-860f-9af0222d64e9.png" width="500" height="300">


## Getting Started

### Prerequisites

- Java 8 or later
- Any Java IDE (Eclipse, IntelliJ, etc.)
- Any Constraint Solver library (Choco, JaCoP, etc.)
- Any Graph Library (JGraphT, etc.)

### Installation

Clone the repository and import it into your Java IDE.


### Usage

To run the robot, run the main class and provide the necessary input data such as the space map and object locations. The robot will navigate through the space using the CSP model to find a feasible path and the STRIP model to plan and execute actions to deliver the objects to the goal node. The progress of the robot can be visualized using the provided visualization tool.

## Algorithm

The CSP model is used to find a feasible path for the robot through the space by taking into account constraints such as obstacles and other potential hazards. The STRIP model is used to plan and execute actions for the robot to pick up and deliver objects along the path.

## Data

The space and object data used in this solution is a sample set and should be replaced with actual data for a more accurate solution. The visualization tool uses any graph library

## Conclusion

This solution uses CSP and STRIP models to navigate an AI delivery robot through a space and deliver objects to the goal node. This approach provides a flexible and efficient way to plan and execute actions for the robot while taking into account constraints in the environment. However, it's important to note that this is just one approach and other optimization techniques such as Dijstra's algorithm, A* algorithm or  Rapidly-exploring Random Trees (RRT) could also be used. The sample dataset used here is for demonstration purposes and should be replaced with actual data for better results.



