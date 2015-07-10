use usuarios;
INSERT INTO `usuarios`.`rol`(`idRol`,`nombre`,`descripcion`) VALUES(1,'Administrador','Administrador del sistema');
INSERT INTO `usuarios`.`rol`(`idRol`,`nombre`,`descripcion`) VALUES(2,'Ventas','Administrador del sistema');
INSERT INTO `usuarios`.`rol`(`idRol`,`nombre`,`descripcion`) VALUES(3,'Pruebas','Administrador del sistema');
INSERT INTO `usuarios`.`rol`(`idRol`,`nombre`,`descripcion`) VALUES(4,'Cliente web','Administrador del sistema');

INSERT INTO `usuarios`.`usuario`(`idUsuario`,`nombre`,`Apellido`,`genero`,`correo`,`fecha_creacion`,`fecha_ultimo_ingreso`,`clave`,`alias`)
VALUES(1,'Albeiro','Guallon','M','test@udistrital.edu.co',now(),now(),'password','Albeiro');
INSERT INTO `usuarios`.`usuario`(`idUsuario`,`nombre`,`Apellido`,`genero`,`correo`,`fecha_creacion`,`fecha_ultimo_ingreso`,`clave`,`alias`)
VALUES(2,'Franky','Montero','M','test@udistrital.edu.co',now(),now(),'password','franky');
INSERT INTO `usuarios`.`usuario`(`idUsuario`,`nombre`,`Apellido`,`genero`,`correo`,`fecha_creacion`,`fecha_ultimo_ingreso`,`clave`,`alias`)
VALUES(3,'Sergio','Bayona','M','test@udistrital.edu.co',now(),now(),'password','sergio');
INSERT INTO `usuarios`.`usuario`(`idUsuario`,`nombre`,`Apellido`,`genero`,`correo`,`fecha_creacion`,`fecha_ultimo_ingreso`,`clave`,`alias`)
VALUES(4,'Jaime','Baez','M','test@udistrital.edu.co',now(),now(),'password','jaime');
INSERT INTO `usuarios`.`usuario`(`idUsuario`,`nombre`,`Apellido`,`genero`,`correo`,`fecha_creacion`,`fecha_ultimo_ingreso`,`clave`,`alias`)
VALUES(5,'Johann','Briñez','M','test@udistrital.edu.co',now(),now(),'password','johann');
INSERT INTO `usuarios`.`usuario`(`idUsuario`,`nombre`,`Apellido`,`genero`,`correo`,`fecha_creacion`,`fecha_ultimo_ingreso`,`clave`,`alias`)
VALUES(6,'Manuel','Castro','M','test@udistrital.edu.co',now(),now(),'password','Manuel');
INSERT INTO `usuarios`.`usuario`(`idUsuario`,`nombre`,`Apellido`,`genero`,`correo`,`fecha_creacion`,`fecha_ultimo_ingreso`,`clave`,`alias`)
VALUES(7,'Andres','Pulido','M','test@udistrital.edu.co',now(),now(),'password','Andres');

INSERT INTO `usuarios`.`usuario_rol`(`rol_idRol`,`usuario_idUsuarios`)VALUES(1,1);
INSERT INTO `usuarios`.`usuario_rol`(`rol_idRol`,`usuario_idUsuarios`)VALUES(1,2);
INSERT INTO `usuarios`.`usuario_rol`(`rol_idRol`,`usuario_idUsuarios`)VALUES(1,3);
INSERT INTO `usuarios`.`usuario_rol`(`rol_idRol`,`usuario_idUsuarios`)VALUES(1,4);
INSERT INTO `usuarios`.`usuario_rol`(`rol_idRol`,`usuario_idUsuarios`)VALUES(1,5);
INSERT INTO `usuarios`.`usuario_rol`(`rol_idRol`,`usuario_idUsuarios`)VALUES(1,6);
INSERT INTO `usuarios`.`usuario_rol`(`rol_idRol`,`usuario_idUsuarios`)VALUES(1,7);

UPDATE `usuarios`.`rol` SET `estado` = "S";

INSERT INTO `usuarios`.`opcion`
(`idopcion`,`nombre`,`descripcion`,`codigo`)
VALUES(1,"op 1","desc 1","OPC1");

INSERT INTO `usuarios`.`opcion`
(`idopcion`,`nombre`,`descripcion`,`codigo`)
VALUES(2,"op 2","desc 2","OPC2");

INSERT INTO `usuarios`.`opcion`
(`idopcion`,`nombre`,`descripcion`,`codigo`)
VALUES(3,"op 3","desc 3","OPC3");

INSERT INTO `usuarios`.`opcion`
(`idopcion`,`nombre`,`descripcion`,`codigo`)
VALUES(4,"op 4","desc 4","OPC4");

INSERT INTO `usuarios`.`opcion`
(`idopcion`,`nombre`,`descripcion`,`codigo`)
VALUES(5,"op 5","desc 5","OPC5");

INSERT INTO `usuarios`.`opcion`
(`idopcion`,`nombre`,`descripcion`,`codigo`)
VALUES(6,"op 6","desc 6","OPC6");

INSERT INTO `usuarios`.`opcion`
(`idopcion`,`nombre`,`descripcion`,`codigo`)
VALUES(7,"op 7","desc 7","OPC7");

INSERT INTO `usuarios`.`rol_opcion`(`rol_idRol`,`opcion_idopcion`) VALUES(1,1);
INSERT INTO `usuarios`.`rol_opcion`(`rol_idRol`,`opcion_idopcion`) VALUES(1,2);
INSERT INTO `usuarios`.`rol_opcion`(`rol_idRol`,`opcion_idopcion`) VALUES(1,3);
INSERT INTO `usuarios`.`rol_opcion`(`rol_idRol`,`opcion_idopcion`) VALUES(1,4);
INSERT INTO `usuarios`.`rol_opcion`(`rol_idRol`,`opcion_idopcion`) VALUES(1,5);

