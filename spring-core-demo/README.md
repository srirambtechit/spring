# Spring Core Tutorial

## Spring Container
- It is a place where Spring maintain object life cycle

## Different context
- BeanFactory
- ApplicationContext 
- ConfigurableApplicationContext 
- WebApplicationContext
- AnnotationConfigApplicationContext
- ClassPathXmlApplicationContext
- FileSystemXmlApplicationContext
- AnnotationConfigWebApplicationContext
- XmlWebApplicationContext 

## Spring Bean
- It is POJO object

## Bean Scope
- singleton 
    1. Only one instance of the bean will be created for each container. 
    2. This is the default scope for the spring beans. 
    3. bean doesn’t have shared instance variables otherwise it might lead to data inconsistency issues.
	 
- prototype
    1. A new instance will be created every time the bean is requested.

- request
    1. This is same as prototype scope, however it’s meant to be used for web applications.
    2. A new instance of the bean will be created for each HTTP request.
          
- session
    1. A new bean will be created for each HTTP session by the container.
     
- global-session
    1. This is used to create global session beans for Portlet applications.
