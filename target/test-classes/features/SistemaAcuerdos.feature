Feature: Login And Altas

  Background:
    Given nos encontramos en la pagina principal de Sistema de Acuerdos
    When nos logueamos rellenando el modal con los siguientes datos: "VICTOR222" "abc"
    Then deberíamos visualizar el mensaje de bienvenida: "SISTEMA ACUERDOS"

  @AltaPerfiles
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar alta a un Perfil
    #ENTONCES
    When el usuario selecciona el boton "ALTAS" y el desplegable "PERFILES"
    Then deberíamos dirigirnos hacia la seccion: "Alta de Perfiles"
    And rellenamos el formulario con los siguientes datos: "<CodigoPerfil>" "<NombreDePerfil>" "<Delegacion>"
    And  le damos guadar perfil
    Then deberíamos visualizar una alerta que diga: "Perfil cargado correctamente"


    Examples:
      | CodigoPerfil | NombreDePerfil | Delegacion |
      | zzzzz3       | zazz3          | LA RIOJA   |


  @AltaUsuarios
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar alta a un usuario
    #ENTONCES
    When el usuario selecciona el boton "ALTAS" y el desplegable "USUARIOS"
    Then deberíamos dirigirnos ha la seccion: "Alta de Usuarios"
    And rellenamos el formulario con los siguientes datos: "<NameUser>" "<name>" "<apellido>" "<DNI>" "<Telefono>" "<direccion>" "<perfil>" "<contrasenia>"
    And le damos guardar usuario
    Then deberíamos visualizar un alert exitoso que diga: "Usuario Cargado Correctamente!"

    Examples:
      | NameUser | name  | apellido   | DNI  | Telefono | direccion | perfil        | contrasenia |
      | BASE     | Alf04 | Mtrciano02 | 4789101112 | 2040007  | 1999      | administrador | 123         |


  @AltaTiposDeAcuerdo
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar alta tipo de acuerdo

    #ENTONCES
    When el usuario selecciona el boton "ALTAS" y el desplegable "TIPOS DE ACUERDO"
    Then debemos dirigirnos hacia la seccion: "Alta Tipos de Acuerdo"
    And rellenamos el formulario con los siguientes datos: "<Codigo>" "<TiposDeAcuerdo>"
    And le damos guardar tipo de acuerdo
    Then deberíamos visualizar un alert que diga: "Tipo Acuerdo registrado correctamente!"

    Examples:
      | Codigo | TiposDeAcuerdo |
      | CoasZ4 | horas4         |

  @AltaDelegaciones
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar Alta una Delegacion
    #ENTONCES
    When el usuario selecciona el boton "ALTAS" y el desplegable "DELEGACIONES"
    Then deberíamos dirigirnos hasta la seccion: "Alta de Delegaciones"
    And rellenamos el form con los siguientes datos: "<CodigoDelegacion>" "<NombreDelegacion>"
    And le damos guardar delegacion
    Then deberíamos visualizar un alerta que diga: "Delegacion cargada correctamente!"

    Examples:
      | CodigoDelegacion | NombreDelegacion |
      | Deleg01          | del01            |

  @AltaEstadoDeExpedientes
  Scenario Outline:
    #Como un usuario administrador
    #Quiero loguearme y realizar Alta de Estado de Expedientes
    #ENTONCES
    When el usuario selecciona el boton "ALTAS" y el desplegable "ESTADO EXPEDIENTES"
    Then tenemos que dirigirnos hasta la seccion: "Alta de Estados de Expedientes"
    And rellenamos el formu con los siguientes datos: "<CodigoEstado>" "<NombreEstado>"
    And le damos guardar estados de expedientes
    Then debemos visualizar un alerta que diga: "Estado de expediente cargado correctamente!"

    Examples:
      | CodigoEstado | NombreEstado |
      | Esta07       | Esta07       |

