Feature: Registro en Utest

  Scenario Outline: Terminando el diligenciamiento

    Given Arturo quiere registrarse en la pagina de Utest
      | FirstName   | LastName   | Email   | DateOfBirthDay   | DateOfBirthMonth   | DateOfBirthYear   | City    | PostalCode   | Country   |
      | <FirstName> | <LastName> | <Email> | <DateOfBirthDay> | <DateOfBirthMonth> | <DateOfBirthYear> | <City > | <PostalCode> | <Country> |

    When Arturo completa el formulario hasta el ultimo paso
      | Computer   | VersionComputer   | LanguageComputer   | MobileDevice   | ModelMobile   | OperatingSystemMobile   | UtestPassword   | UtestConfirmPassword   |
      | <Computer> | <VersionComputer> | <LanguageComputer> | <MobileDevice> | <ModelMobile> | <OperatingSystemMobile> | <UtestPassword> | <UtestConfirmPassword> |

    Then Arturo presiona el boton de terminar configuracion
      | UtestPassword   | UtestConfirmPassword   |
      | <UtestPassword> | <UtestConfirmPassword> |
    Examples:
      | FirstName | LastName | Email | DateOfBirthDay | DateOfBirthMonth | DateOfBirthYear | City | PostalCode | Country | Computer | VersionComputer | LanguageComputer | MobileDevice | ModelMobile | OperatingSystemMobile | UtestPassword | UtestConfirmPassword |
      | Arturo   |    Mendez | of@gmail.com |  30     |      8          |    2003          |  Bogotá|   250054 |  Colombia| Windows |   10            |    español       |     Huawei   |  P20 lite     |      Android 10     |  pass123      |  pass123             |


