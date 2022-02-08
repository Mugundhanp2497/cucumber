@people
Feature: to validate login page
  
    Background:
          Given user have to enter FaceBook login page
     @people1
     Scenario:
          first one
       Then press login
        And get currentURL
        
   
     @people2 
      Scenario:
         second one
      
       And have to max 
       Then press login
        And get currentURL
     
     
     
     
     Scenario Outline: 
        validate user by more users
     
     Given user have to enter FaceBook login page
     When  valid user invalid pass "<email>" and "<pass>"
     And have to max 
     Then press login
     And get currentURL
    
    
    Examples:
    |email|pass|
    |mugu@4321|12345|
    |mu@7654|87654|
    |kuku@654|765|
    |er@5432345|0998|

