#Issues
SpringMVC does not work. 404. 

##Solutions
* Make sure to check the following...
	1. folder structure
		- In src/main/
	2. In the mvc-dispatcher-servlet.xml, make sure to check:
		- <context:component-scan base-package="com.mteng.controller" />

