Feature: Validation of the login page
  # Elmer Valencia Ledezma
  # 1
  Scenario: Validate “ADD” button enables the ADD ADMIN form.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'ADD' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 2
  Scenario: Validate 'PRINT' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'PRINT' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 3
  Scenario: Validate 'EXPORT INTO CSV' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'EXPORT INTO CSV' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 4
  Scenario: Validate 'DESC' and 'ASC' order option when select each column
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'First Name' column on header list to 'desc' order
    And Click 'First Name' column on header list to 'asc' order
    And Click 'Last Name' column on header list to 'desc' order
    And Click 'Last Name' column on header list to 'asc' order
    And Click 'Email' column on header list to 'desc' order
    And Click 'Email' column on header list to 'asc' order
    And Click 'Active' column on header list to 'desc' order
    And Click 'Active' column on header list to 'asc' order
    And Click 'Last Login' column on header list to 'desc' order
    And Click 'Last Login' column on header list to 'asc' order
    And Click 'Logout' button on 'Header' page
  # 5
  Scenario: Validate the 'Pagination' of the list change the list
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click '10' button to display the list on 10 to 10
    And Click '25' button to display the list on 25 to 25
    And Click '50' button to display the list on 50 to 50
    And Click '100' button to display the list on 100 to 100
    And Click 'Logout' button on 'Header' page
  # 6
  Scenario: Validate 'EDIT' button in the 'ADMINS MANAGEMENT' page
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'EDIT' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 7
  Scenario: Validate 'SEARCH' Button enables the Search form.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'SEARCH' button to display the SEARCH form
    And Click 'Logout' button on 'Header' page
  # 8
  Scenario: Validate that display 'ALERT' when try to delete a admin
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'DELETE' button on 'admin management' page
    And Click 'Logout' button on 'Header' page
  # 9
  Scenario: Validate 'ALL' button to display all admins
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'All' button to display all admins
    And Click 'Logout' button on 'Header' page
  # 10
  Scenario: Validate 'GO' Button in the search form
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Accounts' link on 'Left Panel' Page
    And Click 'Admins' link on 'Accounts Expand'
    And Click 'SEARCH' button to display the SEARCH form
    And Set parameters on 'SEARCH' form
    And Click 'GO' button to search
    And Click 'Logout' button on 'Header' page

    #QUIZ
  #Scenario: Validate the 'URL' is the same
   #Given I load API NASA Page
    #And Click NASA API Listing
    #And Click NASA API Listing One More
    #And click Earth Option on Left Panel
    #And click Imagery Option On Sub Menu
    #And Obtener el siguiente link de la seccion: GET https://api.nasa.gov/planetary/earth/imagery
    #And Comparar con el texto "GET https://api.nasa.gov/planetary/earth/imagery" si es igual
