-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema ingenia
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ingenia
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ingenia` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `ingenia` ;

-- -----------------------------------------------------
-- Table `ingenia`.`curso`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`curso` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`curso` (
  `idcurso` INT NOT NULL,
  `nombre` VARCHAR(65) NOT NULL,
  `descripcion` VARCHAR(300) NULL,
  `activo` TINYINT(1) NULL,
  `estado` VARCHAR(5) NULL,
  PRIMARY KEY (`idcurso`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ingenia`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`usuario` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`usuario` (
  `idusuario` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `genero` VARCHAR(45) NULL,
  `correo` VARCHAR(45) NULL,
  `fecha_creacion` DATETIME NULL DEFAULT now(),
  `fecha_ultimo_ingreso` DATETIME NOT NULL DEFAULT now(),
  `clave` VARCHAR(45) NULL,
  `alias` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ingenia`.`curso_estudiante`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`curso_estudiante` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`curso_estudiante` (
  `idcurso` INT NOT NULL,
  `idusuario` INT NOT NULL,
  `puntaje` INT NULL COMMENT 'puntaje obtenido por un jugador en un curso.',
  PRIMARY KEY (`idcurso`, `idusuario`),
  INDEX `fk_curso_estudiante_usuario1_idx` (`idusuario` ASC),
  CONSTRAINT `fk_curso_estudiante_curso`
    FOREIGN KEY (`idcurso`)
    REFERENCES `ingenia`.`curso` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_curso_estudiante_usuario1`
    FOREIGN KEY (`idusuario`)
    REFERENCES `ingenia`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ingenia`.`tipo_actividad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`tipo_actividad` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`tipo_actividad` (
  `idtipo_actividad` INT NOT NULL,
  `nombre` VARCHAR(65) NULL,
  PRIMARY KEY (`idtipo_actividad`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ingenia`.`actividad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`actividad` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`actividad` (
  `idactividad` INT NOT NULL,
  `idtipo_actividad` INT NOT NULL,
  `activo` TINYINT(1) NULL COMMENT 'estado activo o inactivo',
  `publicado` TINYINT(1) NULL,
  `idactividad_autocompletar` INT NOT NULL,
  `enunciado` VARCHAR(45) NULL,
  PRIMARY KEY (`idactividad`),
  INDEX `fk_actividad_tipo_actividad1_idx` (`idtipo_actividad` ASC),
  CONSTRAINT `fk_actividad_tipo_actividad1`
    FOREIGN KEY (`idtipo_actividad`)
    REFERENCES `ingenia`.`tipo_actividad` (`idtipo_actividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ingenia`.`curso_actividad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`curso_actividad` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`curso_actividad` (
  `idcurso` INT NOT NULL,
  `idactividad` INT NOT NULL,
  `posicion` INT NULL COMMENT 'posicion dentro de la secuencia de actividades que deben aparecer en un curso.\n',
  PRIMARY KEY (`idcurso`, `idactividad`),
  INDEX `fk_curso_actividad_actividad1_idx` (`idactividad` ASC),
  CONSTRAINT `fk_curso_actividad_curso1`
    FOREIGN KEY (`idcurso`)
    REFERENCES `ingenia`.`curso` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_curso_actividad_actividad1`
    FOREIGN KEY (`idactividad`)
    REFERENCES `ingenia`.`actividad` (`idactividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ingenia`.`mensaje`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`mensaje` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`mensaje` (
  `idmensaje` INT NOT NULL,
  `idusuario_origen` INT NOT NULL,
  `idusuario_destino` INT NOT NULL,
  PRIMARY KEY (`idmensaje`),
  INDEX `fk_mensaje_usuario1_idx` (`idusuario_origen` ASC),
  INDEX `fk_mensaje_usuario2_idx` (`idusuario_destino` ASC),
  CONSTRAINT `fk_mensaje_usuario1`
    FOREIGN KEY (`idusuario_origen`)
    REFERENCES `ingenia`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mensaje_usuario2`
    FOREIGN KEY (`idusuario_destino`)
    REFERENCES `ingenia`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ingenia`.`respuesta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ingenia`.`respuesta` ;

CREATE TABLE IF NOT EXISTS `ingenia`.`respuesta` (
  `idrespuesta` INT NOT NULL,
  `idactividad` INT NOT NULL,
  `valor` VARCHAR(45) NULL COMMENT 'opcion de respuesta, algunas no seran verdaderas. Corresponde a las opciones que el usuario tiene para seleccionar la respuesta correcta.',
  `verdadero` TINYINT(1) NULL COMMENT 'identifica si esta es la respuesta correcta',
  `orden` INT NULL,
  PRIMARY KEY (`idrespuesta`, `idactividad`),
  INDEX `fk_respuestas_actividad1_idx` (`idactividad` ASC),
  CONSTRAINT `fk_respuestas_actividad1`
    FOREIGN KEY (`idactividad`)
    REFERENCES `ingenia`.`actividad` (`idactividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
