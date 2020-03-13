This small demo is the result of day-long research on how to get 
gradle build Enterprise Application/ear for Websphere Liberty projects effortlessly.

This build.gradle setup includes
* referencing Java EE & JPA Api
* java, war & ear standard folder structures (expected by the gradle plugins)
* hints on where to put usual configuration files (persistence.xml, web.xml, beans.xml)
* setting an ear output filename (so it fits deployment targets)
* specifying the context-root of the deployed web application
* including resources that are located next to source java files into the war file
* running unit tests

Just build everything via executing `gradle build` and enjoy having a ready-to-go artifact.
You will find the ear file under `ear/build/libs`.

Please explore the full folder structure and the gradle scripts to get hints on where to put things right!
Also, consider reading the Gradle documentation & toying around for a better learning experience.
