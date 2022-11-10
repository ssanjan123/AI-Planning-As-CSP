# AI-Planning As CSP
 An AI delivery robot, navigating in a space using CSP and delivering to the goal node.
<!-- Output copied to clipboard! -->

<!-----

You have some errors, warnings, or alerts. If you are using reckless mode, turn it off to see inline alerts.
* ERRORs: 0
* WARNINGs: 0
* ALERTS: 3

Conversion time: 1.571 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs to Markdown version 1.0β33
* Wed Nov 09 2022 20:05:30 GMT-0800 (PST)
* Source doc: Untitled document
* This document has images: check for >>>>>  gd2md-html alert:  inline image link in generated source and store images to your server. NOTE: Images in exported zip file from Google Docs may not appear in  the same order as they do in your doc. Please check the images!

----->


<p style="color: red; font-weight: bold">>>>>>  gd2md-html alert:  ERRORs: 0; WARNINGs: 0; ALERTS: 3.</p>
<ul style="color: red; font-weight: bold"><li>See top comment block for details on ERRORs and WARNINGs. <li>In the converted Markdown or HTML, search for inline alerts that start with >>>>>  gd2md-html alert:  for specific instances that need correction.</ul>

<p style="color: red; font-weight: bold">Links to alert messages:</p><a href="#gdcalert1">alert1</a>
<a href="#gdcalert2">alert2</a>
<a href="#gdcalert3">alert3</a>

<p style="color: red; font-weight: bold">>>>>> PLEASE check and correct alert issues and delete this message and the inline alerts.<hr></p>


**Coding **

**_You can use whatever programming language you like. _**

**Ques 4.[25 marks] **We want to solve the delivery robot example using planning as CSP. Remember that Rob is a delivery robot who navigates in the following environment:



<p id="gdcalert1" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image1.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert2">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](images/image1.png "image_tooltip")


The state is defined by the following variables/features:



* **RLoc** - Rob’s location
    * Domain: Coffee Shop (_cs_), Sam’s office (_off_), Mail Room (_mr_), or Laboratory (_lab_)
* **RHC** - Rob has coffee.
    * Domain: True or False
* **SWC** - Sam wants coffee.
    * Domain: True or False
* **MW** - Mail is waiting.
    * Domain: True or False
* **RHM** - Rob has mail.
    * Domain: True or False

The actions are defined by the following preconditions and results:



<p id="gdcalert2" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image2.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert3">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](images/image2.png "image_tooltip")


(a) Describe all actions using the STRIPS representation.

(b) Now you need to reformulate the STRIPS model as CSPs with different horizons, and then solve them by implementing the Arc Consistency + Domain Splitting algorithm. The pseudocode is provided in the below:



<p id="gdcalert3" ><span style="color: red; font-weight: bold">>>>>>  gd2md-html alert: inline image link here (to images/image3.png). Store image on your image server and adjust path/filename/extension if necessary. </span><br>(<a href="#">Back to top</a>)(<a href="#gdcalert4">Next alert</a>)<br><span style="color: red; font-weight: bold">>>>>> </span></p>


![alt_text](images/image3.png "image_tooltip")


Remember that if the horizon is _k_, you need to define a CSP variable for each STRIPS variable at time step 0 to _k_, and for each STRIPS action at time step 0 to _k _- 1. You also need CSP constraints for start and goal values, as well as preconditions and effects of actions. Another constraint that you have to consider is that at each time step only one action can be done (mutual exclusion.)

The initial state is **RLoc**: _off_, **RHC**: _F_, **SWC**: _T_, **MW**: _F_, and **RHM**: _T_.

The goal state is **RLoc**: _off_ and **SWC**: _F_.

(c) Your program should output the horizon of the CSP that it has solved. It should also print all the variable assignments in the solution.

For example:

_Horizon: 4_

_RLoc0 = off_

_RHC0 = F_

_etc…_

_Move0 = T_

_PUC0 = F_

_etc…_

_RLoc1 = cs_

_RHC1 = F_

_etc…_

(d) Draw the constraint network of the solution that your program has found. Specify the variable assignments in your graph.

