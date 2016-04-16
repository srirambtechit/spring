# Spring Core Tutorial

## Spring Container
- It is a place where Spring maintain object life cycle

## Modules
Spring-Context
Spring-AOP
Spring-MVC
Spring-JDBC
Spring-DAO
Spring-ORM

## Spring-core
- Dependency Injection
- Inversion of Control


## Spring-AOP
- Cross cutting concerns
- Aspect
- Pointcut
- Joinpoint
- Advice 
    - Before Advice
    - After Advice
    - After Returning Advice
    - After Throwing Advice
    - Around Advice
    
- Target object
- Proxy object (JDK dynamic proxy, cglib proxy)
- Weaving (compile time, load time, runtime) Spring supports only at runtime


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

## Autowiring
- byName: happens on by variable name
- byType: happens by data type of variable (ex: java.lang.String)
- by constructor: bean class's constructor
- @Autowired and @Qualifier: annotation based wiring
