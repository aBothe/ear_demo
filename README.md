This small demo is the result of day-long research on how to get 
gradle build Enterprise Application/ear for Websphere Liberty projects effortlessly.

This setup includes
* using Java EE & JPA Api
* standard folder structures expected by the gradle java, war & ear plugins
* hints on where to put usual configuration files (persistence.xml, web.xml, beans.xml)
* explicitly naming an ear file so it fits deployment targets
* overriding the context-root of the deployed application
* including resources that are located next to source java files into the war file
* running unit tests

Just build everything via executing `gradle build` and enjoy simplicity.
You will find the final ear file under `ear/build/libs`.

Please explore the full folder structure to get hints on where to put things!
