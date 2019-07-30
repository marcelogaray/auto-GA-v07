Feature: Validation of the login page2
    #Other functionality
    #And Click 'Cars' link on 'Left Panel' Page
    #And Move Down The Sidebar Menu
    #And Click 'Blog' link on 'Blog Categories' Page

  Scenario: Test Case 01: Verificar que el contenido del sub-menú “Blog” muestre el contenido
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu

  Scenario: Test Case 02: Verificar que el contenido del sub-menú “Blog” muestre el contenido
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page

  Scenario: Test Case 03: Verificar que al hacer click en la columna “Name” los ítems se ordenan
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Name

  Scenario: Test Case 04: Verificar que al hacer click en la columna “Name” los ítems se ordenan
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Category

  Scenario: Test Case 05: Verificar que los elementos se ordenan al hacer click en la columna “Date”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Date

  Scenario: Test Case 06: Verificar que al hacer click en la columna “Order” los elementos se ordenan.
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Order

  Scenario: Test Case 07: Verificar que los elementos se ordenan al hacer click en la columna “Status”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Status

  Scenario: Test Case 08: Verificar que los elementos se ordenan al hacer click en la columna “Thumb”
    Given I Load PHP Travels
    And Set my credentials on 'Login' page
    And Click 'Blog' menu
    And Click 'Blog' link on 'Posts' Page
    And Click 'Posts' link on Table Header Thumb

  Scenario: TestCase QUIZ: Click NASA API Listing
    Given I load NASA page
    And Click NASA API Listing
    And Click on MENU Earth


  #
    #TestCase 05
    #And Click 'Posts' link on Table Header Date

    #TestCase 06
    #And Click 'Posts' link on Table Header Order

    #TestCase 07
    #And Click 'Posts' link on Table Header Status

    #TestCase 08
    #And Click 'Posts' link on Table Header Thumb