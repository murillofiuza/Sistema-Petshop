create database BDPetshop;

use BDPetshop;
 
create table servicos(
serv_cd_servico int primary key not null,
serv_ds_tipo_servico varchar(75),
serv_nr_valor decimal(9,2)
);

create table cliente(
cli_cd_cliente int primary key not null auto_increment,
cli_ds_nome varchar(75),
cli_dt_data date,
cli_nr_cpf varchar(14) not null,
cli_nr_telefone varchar (13),
cli_nr_telefone varchar (14),
cli_ds_rua varchar(60),
cli_ds_bairro varchar(60),
cli_nr_cep int(9)
);

create table animal(
ani_cd_animal int primary key not null,
ani_cd_cliente int,
ani_ds_tipo_animal varchar(75),
ani_ds_raca varchar(75),
ani_ds_nome varchar(75),
ani_ds_porte varchar(75),
ani_ds_cor varchar(75),
foreign key (ani_cd_cliente) references cliente(cli_cd_cliente)
);

create table funcionario(
fu_cd_funcionario int primary key not null,
fu_ds_nome varchar(75),
fu_nr_cpf int(14)
);

create table controle_servico(
cs_cd_controle_servico int primary key not null,
cs_cd_cliente int,
cs_cd_funcionario int,
cs_cd_servico int,
cs_dt_data date,
cs_ds_status varchar(25),
foreign key (cs_cd_cliente) references cliente (cli_cd_cliente),
foreign key (cs_cd_funcionario) references funcionario (fu_cd_funcionario),
foreign key (cs_cd_servico) references servicos (serv_cd_servico)
);

