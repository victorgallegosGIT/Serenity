    Feature: Login And Modificaciones

      Background:
        Given nos encontramos en la pagina principal de Sistema de Acuerdos
        When nos logueamos rellenando el modal con los siguientes datos: "VICTOR222" "abc"
        Then deberíamos visualizar el mensaje de bienvenida: "SISTEMA ACUERDOS"


    @ModificacionPerfiles
    Scenario Outline:
        #Como un usuario administrador
        #Quiero loguearme y realizar una modificacion de Perfil
        #ENTONCES
      When el usuario selecciona el boton "MODIFICACIONES" y el desplegable "PERFILES"
      Then deberíamos dirigirnos ah la seccion: "Modificación de Perfiles"
      And hacemos clic en editar
      And Modificamos el formulario con los siguientes datos: "<CodigoPerfil>" "<NombreDePerfil>" "<Delegacion>"
      And  le damos guadar cambios
      Then debemos visualizar un alert exitoso que diga: "Cambios Guardados"

    Examples:
      | CodigoPerfil | NombreDePerfil | Delegacion |
      | Us0zer2245   | Dufg2          | LA RIOJA   |

    @ModificacionUsuario
    Scenario Outline:
        #Como un usuario administrador
        #Quiero loguearme y realizar una modificacion de usuario
        #ENTONCES
      When el usuario selecciona el boton "MODIFICACIONES" y el desplegable "USUARIOS"
      Then debemos dirigirnos ah la seccion: "Modificación de Usuarios"
      And hacemos clic en editar usuario
      And Modificamos el formulario de usuario con los siguientes datos: "<NameUser>" "<name>" "<apellido>" "<DNI>" "<Telefono>" "<direccion>" "<perfil>" "<contrasenia>"
      And  click guadar cambios
      Then visualizamos alerta exitoso que diga: "Usuario guardado correctamente"

    Examples:
        | NameUser      | name       | apellido     | DNI          | Telefono | direccion   | perfil        | contrasenia |
        | User103456034 | Alf2466724 | Marcianu6244 | 500967012433 | 0923     | 1999 23 asd | administrador | 123         |

    @ModificacionTiposDeAcuerdo
    Scenario Outline:
        #Como un usuario administrador
        #Quiero loguearme y realizar una modificacion tipo de acuerdo

        #ENTONCES
      When el usuario selecciona el boton "MODIFICACIONES" y el desplegable "TIPOS DE ACUERDO"
      Then deberiamos dirigirnos hacia la seccion: "Modificación de Tipos de Acuerdo"
      And hacemos click en editar tipo de acuerdo
      And modificamos el formulario con los siguientes datos: "<Codigo>" "<TiposDeAcuerdo>"
      And le damos guardar cambios tipo de acuerdo
      Then debemos visualizar un alert que diga: "Cambios Guardados"

    Examples:
        | Codigo     | TiposDeAcuerdo |
        | Modificato | TiDAcuyrdo     |


    @ModificacionDelegacion
    Scenario Outline:
        #Como un usuario administrador
        #Quiero loguearme y realizar una modificacion de Delegaciones

        #ENTONCES
      When el usuario selecciona el boton "MODIFICACIONES" y el desplegable "DELEGACIONES"
     Then deberiamos dirigirnos hasta la seccion: "Modificación de Delegaciones"
     And hacemos click en editar delegacion
     And modificamos el formulario de delegacion con los siguientes datos: "<CodigoDelegacion>" "<NombreDelegacion>"
     And le damos guardar cambios delegacion
     Then visualizaremos un alert que diga: "Cambios Guardados"

    Examples:
        | CodigoDelegacion | NombreDelegacion |
        | 00789            | Roja             |

   @ModificacionEstadoDeExpedientes
     Scenario Outline:
        #Como un usuario administrador
        #Quiero loguearme y realizar una modificacion de Estados de Expedientes

        #ENTONCES
    When el usuario selecciona el boton "MODIFICACIONES" y el desplegable "ESTADO EXPEDIENTES"
    Then deberiamos ir hasta la seccion: "Modificación de Estados de Expedientes"
    And hacemos click en editar estados de expedientes
    And modificamos el formulario de estados de expedientes con los siguientes datos: "<CodigoEstado>" "<NombreEstado>"
    And le damos guardar cambios estados de expedientes
    Then visualizaremos una alerta que diga: "Cambios Guardados"

    Examples:
        | CodigoEstado | NombreEstado |
        | Estad345348  | Estado315    |