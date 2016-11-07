# pivotal-api-test1

WHAT IS IT?
------------

Pivotal api project has as objective to automate acceptance test cases for Pivotal tracker
endpoints (https://www.pivotaltracker.com/help/api/rest/v5#Endpoints) by using java and Cucumber technology.
Pivotal Tracker is a straightforward project-planning tool that helps software development teams form
realistic expectations about when work might be completed based on the team’s ongoing performance.
Pivotal Tracker provides an API that can be used to create, retrieve, update, and delete virtually all
of the resources stored and manipulated by the system.

FEATURES TESTED
---------------

The following features are the main that are implemented in this framework.

   Acceptance tests.

   - Project
   - Story
   - Comment

REQUIREMENTS AND SET CONFIGURATIONS
-----------------------------------

To set the configuration of this framework is required the following:

   - IntelliJ idea IDE.
   - Download Gradle 3.0 or superior: https://gradle.org/gradle-download/
   - Clone/download the project from GitHub repository: https://github.com/AT-01/pivotal-api-test1.git

Once those requirements are done, follow these steps:

   - Open the project downloaded with the IntelliJ IDE.
   - Open the Gradle properties file e.g. gradle.properties file.
   - Set the required parameters:
       * proxy = Is the proxy configuration.
       * token = Is the token generated by pivotal tracker.
       * featureFolders = name of folders to be executed (e.g. projects, comment, story)
       * cucumberOptions = Tags names used in the step definitions (e.g. @Acceptance)
   - After configuring those params the framework should be executed.
   - To execute by command line you can use the following: use proxy param if it is necessary
       * gradle check executeFeatures -Ptoken=TOKEN -Pproxy=PROXY

CONTACTS
--------

   - If you want to be informed about new code releases, bug fixes, security fixes,
   general news and information about the Mach2 UI project check to the GitHub repository
     https://github.com/AT-01/pivotal-api-test1.git

CONTRIBUTORS
------------

Current contributors:

    Lourdes Villca (lourdesVillca) https://github.com/lourdesVillca
    Ericka Viraca (ErickaViraca) https://github.com/ErickaViraca
    Angela Valdez (angy113) https://github.com/angy113
    Aldo Balderrama (mabalderramav) https://github.com/mabalderramav
    Bruno Vasquez (brunovasquez) https://github.com/brunovasquez
    Alvaro Daza (AlvaroDazaQuiroga) https://github.com/AlvaroDazaQuiroga
    Carlos Gonzales (carledriss) https://github.com/carledriss