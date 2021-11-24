    Feature: Login And Bajas

      Background:
        Given nos encontramos en la pagina principal de Sistema de Acuerdos
        When nos logueamos rellenando el modal con los siguientes datos: "VICTOR222" "abc"
        Then deberíamos visualizar el mensaje de bienvenida: "SISTEMA ACUERDOS"


    @BajaPerfil
    Scenario:
        #Como un usuario administrador
        #Quiero loguearme y realizar una Baja de Perfil (habiliar / Deshabilitar)
        #Siempre que un perfil no este asignado a ningun usuario
        #ENTONCES
      When el usuario selecciona el boton "BAJAS" y el desplegable "PERFILES"
      Then observamos la seccion: "Baja de Perfiles"
      And hacemos clic en habilitar
      Then debemos ver un alerta que diga: "Perfil Habilitado"
      And hacemos clic en deshabilitar
      Then debemos ver nuevamente un alerta que diga: "Perfil Deshabilitado"

    @BajaUsuarios
    Scenario:
        #Como un usuario administrador
        #Quiero loguearme y realizar una Baja de Usuario (habiliar / Deshabilitar)
        #ENTONCES
    When el usuario selecciona el boton "BAJAS" y el desplegable "USUARIOS"
    Then visualizamos la seccion: "Baja de Usuarios"
    And hacemos clic en habilitar usuario
    Then debemos ver un alert que diga: "Usuario Habilitado"
    And hacemos clic en deshabilitar usuario
    Then debemos ver nuevamente un alert que diga: "Usuario Deshabilitado"

    @BajaTiposDeAcuerdo
    Scenario:
        #Como un usuario administrador
        #Quiero loguearme y realizar una Baja de Tipos de acuerdo (habiliar / Deshabilitar)
        #Siempre que el tipo de acuerdo no este asignado a uno o mas acuerdos
        #ENTONCES
    When el usuario selecciona el boton "BAJAS" y el desplegable "TIPOS DE ACUERDO"
    Then debemos visualizar la seccion: "Baja de Tipos de Acuerdo"
    And hacemos clic en habilitar tipo de acuerdo
    Then debemos ver una alerta que diga: "Tipo de Acuerdo Habilitado"
    And hacemos clic en deshabilitar tipo de acuerdo
    Then debemos visualizar nuevamente una alerta que diga: "Tipo de Acuerdo Deshabilitado"

    @BajaDelegaciones
    Scenario:
        #Como un usuario administrador
        #Quiero loguearme y realizar una Baja de Delegaciones (habiliar / Deshabilitar)
        #Siempre que la delegacion no este asignado a uno o mas usuarios
        #ENTONCES
    When el usuario selecciona el boton "BAJAS" y el desplegable "DELEGACIONES"
    Then debemos visualizar la siguiente seccion: "Baja de Delegaciones"
    And hacemos clic en habilitar delegacion
    Then debemos ver la alerta que diga: "Delegación Habilitada"
    And hacemos clic en deshabilitar delegacion
    Then debemos visualizar una alerta que diga: "Delegación Deshabilitada"

    @BajaEstadoExpedientes
    Scenario:
        #Como un usuario administrador
        #Quiero loguearme y realizar una Baja de Estado de Expedientes (habiliar / Deshabilitar)
        #ENTONCES
    When el usuario selecciona el boton "BAJAS" y el desplegable "ESTADO EXPEDIENTES"
    Then debemos visualizar a continuacion la seccion: "Baja de Estados de Expedientes"
    And hacemos clic en habilitar estado de expedientes
    Then debemos ver la siguiente alerta que diga: "Estado Expediente Habilitado"
    And hacemos clic en deshabilitar estado de expedientes
    Then debemos visualizar la siguiente alerta que diga: "Estado Expediente Deshabilitado"
