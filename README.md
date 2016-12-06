# cucumber-performance

A plugin for the Jenkins continuous integration tool which allows for reporting over time of the performance of tests executed using the Cucumber-JVM framework.

## This project is now unmaintained

Due to pressures of time, along with lack of access to a large-scale Cucumber project to facilitate testing, I'm no longer in a position to maintain this project. Thank you to everyone who provided feedback and assistance.

Should anyone wish to take over as maintainer, please contact me on jegallagher@gmail.com - all welcome!

<table>
<tr><th>Version</th><th>Release Date</th></tr>
<tr><td>2.0.8</td><td>6th December 2016</td></tr>
<tr><td>2.0.7</td><td>18th November 2016 - not published to maven</td></tr>
<tr><td>2.0.6</td><td>14th July 2014</td></tr>
<tr><td>1.3.1</td><td>5th August 2013</td></tr>
<tr><td>1.2</td><td>31st July 2013</td></tr>
</table>

This plugin reports on the performance over time of testing jobs run by Jenkins containing tests using the Cucumber-JVM framework.

It works by parsing the relevant output files from Cucumber-JVM, aggregating the information and presenting it in a coherent and easy-to-understand format.

The main report is a graphical representation of the time taken by successful builds of that project, and from there it's possible to drill down into the features of that project, and onwards to scenarios and steps.

Any suggestions for future features will be most welcome - please use the issue reporting tool in GitHub to send me these. Bug reports are also welcome!

The code is contained in this GitHub repo (https://github.com/jenkinsci/cucumber-performance-plugin), with the latest released version on the master branch, and a named branch for the latest version under development (currently V1.3). 

This project owes a lot to the excellent Cucumber-JVM reporting plugins developed by Kingsley Hendrickse and Masterthought, and available at https://github.com/masterthought

Many thanks to them for their hard work!

## Jenkins build status for master branch


[![Build Status](https://jenkins.ci.cloudbees.com/job/plugins/job/cucumber-performance-plugin/badge/icon)](https://jenkins.ci.cloudbees.com/job/plugins/job/cucumber-performance-plugin/)

## How to use this plugin

<ol>
<li>Install it from the Jenkins plugin update screen, then re-start Jenkins.
<li>In the Post-Build Actions of the job that executes the Cucumber tests, add "Generate Cucumber performance reports" as an action.
<li>Optionally, update the following pieces of config (by clicking the Advanced button):
    <ul><li>The path relative to the workspace of the json reports generated by cucumber-jvm e.g. target/report - leave empty to let the plugin find them automagically.
    <li>The name of the file containing json reports generated by cucumber-jvm - leave empty to use the default name of cucumber.json
    <li>The number of items to display on the Sorted Reports screen - setting this to too high a number will cause performance issues.
    </ul>
</ol>

## What you see


The main report view is:

![Project View](images/projectview.png)

The links on the Summary and the sections of the Pie Chart provide the ability to drill down into the Feature -> Scenario - > Step views, and the same level of information is presented, where appropriate.

The other form of information presented is the worst-performing one, indicating which features/scenarios/steps are consistently the worst performers.

![Project View](images/sortedview.png)


## Change History


This list starts with V2.0.6 only

<table>
<tr><th>Version</th><th>Change Detail</th></tr>
<tr>
    <td>2.0.9</td>
    <td>
        <ul>
            <li>Remove distributionManagement from pom.xml</li>
        </ul>
    </td>
</tr>
<tr>
    <td>2.0.8</td>
    <td>
        <ul>
            <li>Update parent pom so releases hopefully work again.</li>
            <li>Fix all issues found by findbugs</li>
            <li>Fix build status badge</li>
        </ul>
    </td>
</tr>
<tr>
    <td>2.0.7</td>
    <td>
        <ul>
            <li>Fixed issues with how jQuery is called. jQuery() -> $()</li>
            <li>Updated jelly files to escape by default</li>
            <li>Fixed styling issues on sorted page</li>
            <li>Upgraded junit to 4.12</li>
            <li>Bumped minimum jenkins version to 1.557 so tests work with java 8</li>
        </ul>
    </td>
</tr>
<tr>
    <td>2.0.6</td>
    <td>
        <ul>
           <li>changed the plugin processing to separate data generation from report presentation</li>
           <li>introduced use of Jackson to produce JSON outputs where necessary</li>
           <li>persisted the plugin data using XStream</li>
           <li>totally revamped the UI to make the plugin fit better into the Jenkins look & feel.</li>
           <li>removed Velocity and other non-required libraries</li>
       </ul>
    </td>
</tr>
</table>
