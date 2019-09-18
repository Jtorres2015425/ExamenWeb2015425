-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DBRestaurante2015425
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DBRestaurante2015425
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DBRestaurante2015425` DEFAULT CHARACTER SET utf8 ;
USE `DBRestaurante2015425` ;

-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Areas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Areas` (
  `idArea` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idArea`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Mesas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Mesas` (
  `idMesa` INT NOT NULL,
  `idArea` INT NOT NULL,
  PRIMARY KEY (`idMesa`),
  INDEX `FK_AreasM_idx` (`idArea` ASC) VISIBLE,
  CONSTRAINT `FK_AreasM`
    FOREIGN KEY (`idArea`)
    REFERENCES `DBRestaurante2015425`.`Areas` (`idArea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Turnos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Turnos` (
  `idTurno` INT NOT NULL,
  `Entrada` TIME NOT NULL,
  `Salida` TIME NOT NULL,
  PRIMARY KEY (`idTurno`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Meseros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Meseros` (
  `idMesero` INT NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `idTurno` INT NOT NULL,
  PRIMARY KEY (`idMesero`),
  INDEX `FK_TurnoM_idx` (`idTurno` ASC) VISIBLE,
  CONSTRAINT `FK_TurnoM`
    FOREIGN KEY (`idTurno`)
    REFERENCES `DBRestaurante2015425`.`Turnos` (`idTurno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Clientes` (
  `idCliente` INT NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `dpi` BIGINT(15) NOT NULL,
  `telefono` INT NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`idCargoC`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`idCargoC` (
  `idCargo` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCargo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Cocineros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Cocineros` (
  `idCocinero` INT NOT NULL,
  `nombres` VARCHAR(45) NOT NULL,
  `idCargo` INT NOT NULL,
  `idTurno` INT NOT NULL,
  PRIMARY KEY (`idCocinero`),
  INDEX `FK_Cargo_idx` (`idCargo` ASC) VISIBLE,
  INDEX `FK_Turno_idx` (`idTurno` ASC) VISIBLE,
  CONSTRAINT `FK_Cargo`
    FOREIGN KEY (`idCargo`)
    REFERENCES `DBRestaurante2015425`.`idCargoC` (`idCargo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_TurnoC`
    FOREIGN KEY (`idTurno`)
    REFERENCES `DBRestaurante2015425`.`Turnos` (`idTurno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Menu` (
  `idMenu` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `descuento` VARCHAR(4) NOT NULL,
  PRIMARY KEY (`idMenu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Platillos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Platillos` (
  `idPlatillo` INT NOT NULL,
  `Descripcion` VARCHAR(100) NOT NULL,
  `idCocinero` INT NOT NULL,
  `idMenu` INT NOT NULL,
  `precio` DECIMAL NOT NULL,
  PRIMARY KEY (`idPlatillo`),
  INDEX `FK_CocineroP_idx` (`idCocinero` ASC) VISIBLE,
  INDEX `FK_MenuP_idx` (`idMenu` ASC) VISIBLE,
  CONSTRAINT `FK_CocineroP`
    FOREIGN KEY (`idCocinero`)
    REFERENCES `DBRestaurante2015425`.`Cocineros` (`idCocinero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_MenuP`
    FOREIGN KEY (`idMenu`)
    REFERENCES `DBRestaurante2015425`.`Menu` (`idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante2015425`.`Facturacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante2015425`.`Facturacion` (
  `idFacturacion` INT NOT NULL,
  `idCliente` INT NOT NULL,
  `idPlatillo` INT NOT NULL,
  `idMesero` INT NOT NULL,
  `idMesa` INT NOT NULL,
  `fechaFactura` DATETIME NOT NULL,
  PRIMARY KEY (`idFacturacion`),
  INDEX `FK_ClienteF_idx` (`idCliente` ASC) VISIBLE,
  INDEX `FK_Platillo_idx` (`idPlatillo` ASC) VISIBLE,
  INDEX `FK_MeseroF_idx` (`idMesero` ASC) VISIBLE,
  INDEX `FK_MesaF_idx` (`idMesa` ASC) VISIBLE,
  CONSTRAINT `FK_ClienteF`
    FOREIGN KEY (`idCliente`)
    REFERENCES `DBRestaurante2015425`.`Clientes` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_PlatilloF`
    FOREIGN KEY (`idPlatillo`)
    REFERENCES `DBRestaurante2015425`.`Platillos` (`idPlatillo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_MeseroF`
    FOREIGN KEY (`idMesero`)
    REFERENCES `DBRestaurante2015425`.`Meseros` (`idMesero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_MesaF`
    FOREIGN KEY (`idMesa`)
    REFERENCES `DBRestaurante2015425`.`Mesas` (`idMesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
