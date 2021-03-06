CREATE TABLE T_COMMUNE (
  ACTUAL   varchar(1)  DEFAULT NULL, 
  CHEFLIEU varchar(1)  DEFAULT NULL,
  CDC      varchar(1)  DEFAULT NULL,  
  RANG     integer     DEFAULT NULL, 
  REG      varchar(2)  NOT NULL, 
  DEP      varchar(3)  NOT NULL, 
  COM      varchar(3)  NOT NULL, 
  AR       varchar(1)  DEFAULT NULL, 
  CT       varchar(2)  DEFAULT NULL, 
  MODIF    varchar(1)  DEFAULT NULL, 
  POLE     varchar(5)  DEFAULT NULL, 
  TNCC     varchar(1)  DEFAULT NULL, 
  ARTMAJ   varchar(5)  DEFAULT NULL, 
  NCC      varchar(70) DEFAULT NULL, 
  ARTMIN   varchar(5)  DEFAULT NULL, 
  NCCENR   varchar(70) DEFAULT NULL, 
  ARTICLCT varchar(5)  DEFAULT NULL, 
  NCCCT    varchar(70) DEFAULT NULL, 
  CONSTRAINT pk_commune PRIMARY KEY (REG,DEP,COM,CT)
)