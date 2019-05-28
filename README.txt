SE environment the following features of Weld are available:

   1. Managed beans with @PostConstruct and @PreDestroy lifecycle callbacks
   2. Dependency injection with qualifiers and alternatives
   3. @Application, @Dependent and @Singleton scopes
   4. Interceptors and decorators
   5. Stereotypes
   6. Events
   7. Portable extension support 

NOTE : ejb beans are not supported.

Case 1 : 
--------------------------------------------------
  When Dependency is compatible with cdi statndards 
  = Default Construcotr

@Inject

Case 2 : 
--------------------------------------------------
  When Dependency does not have default constructor
