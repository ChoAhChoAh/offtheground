SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX challenge_id_idx ON challenge;
DROP INDEX challenge_code ON challenge;
DROP INDEX challenge_name_idx ON challenge;
DROP INDEX challenge_add_date_idx ON challenge;
DROP INDEX challenge_update_date_idx ON challenge;
DROP INDEX chanllenge_operation_id_idx ON challenge_operation;
DROP INDEX challenge_operation_date_idx ON challenge_operation;
DROP INDEX city_id_idx ON city;
DROP INDEX city_code_idx ON city;
DROP INDEX city_provience_idx ON city;
DROP INDEX city_name_idx ON city;
DROP INDEX code_type_idx ON code;
DROP INDEX code_name_value_idx ON code;
DROP INDEX district_id_idx ON district;
DROP INDEX district_code_idx ON district;
DROP INDEX district_city_idx ON district;
DROP INDEX district_name_idx ON district;
DROP INDEX domain_id_idx ON domain;
DROP INDEX domain_code_idx ON domain;
DROP INDEX domain_name_idx ON domain;
DROP INDEX location_id_idx ON location;
DROP INDEX location_code_idx ON location;
DROP INDEX location_district_idx ON location;
DROP INDEX location_operation_id_idx ON location_operation;
DROP INDEX location_operation_date_idx ON location_operation;
DROP INDEX uid_idx ON otg_user;
DROP INDEX user_name_idx ON otg_user;
DROP INDEX nick_name_idx ON otg_user;
DROP INDEX otg_user_add_date_idx ON otg_user;
DROP INDEX picture_id_idx ON picture;
DROP INDEX picture_code_idx ON picture;
DROP INDEX picture_related_type_idx ON picture;
DROP INDEX picture_related_idx ON picture;
DROP INDEX provience_id_idx ON provience;
DROP INDEX provience_code_idx ON provience;
DROP INDEX provience_domain_idx ON provience;
DROP INDEX provience_name_idx ON provience;
DROP INDEX resource_operation_id_idx ON resource_operation;
DROP INDEX resource_operation_date_idx ON resource_operation;
DROP INDEX user_challenge_id_idx ON user_challenge;
DROP INDEX user_challenge_uid_idx ON user_challenge;
DROP INDEX user_challenge_cid_idx ON user_challenge;
DROP INDEX user_challenge_add_date_idx ON user_challenge;
DROP INDEX user_challenge_update_date_idx ON user_challenge;
DROP INDEX user_operation_uid_idx ON user_operation;
DROP INDEX user_operation_idx ON user_operation;
DROP INDEX video_id_idx ON video;
DROP INDEX video_code_idx ON video;
DROP INDEX video_related_id_idx ON video;
DROP INDEX video_related_type_idx ON video;



/* Drop Tables */

DROP TABLE IF EXISTS challenge;
DROP TABLE IF EXISTS challenge_operation;
DROP TABLE IF EXISTS city;
DROP TABLE IF EXISTS code;
DROP TABLE IF EXISTS district;
DROP TABLE IF EXISTS domain;
DROP TABLE IF EXISTS location;
DROP TABLE IF EXISTS location_operation;
DROP TABLE IF EXISTS otg_user;
DROP TABLE IF EXISTS picture;
DROP TABLE IF EXISTS provience;
DROP TABLE IF EXISTS resource_operation;
DROP TABLE IF EXISTS user_challenge;
DROP TABLE IF EXISTS user_operation;
DROP TABLE IF EXISTS video;




/* Create Tables */

CREATE TABLE challenge
(
	-- primary id of challenge
	-- 
	challenge_id int NOT NULL AUTO_INCREMENT COMMENT 'primary id of challenge
',
	-- code of challenge
	challenge_code varchar(36) NOT NULL COMMENT 'code of challenge',
	-- name of challenge
	challenge_name varchar(512) NOT NULL COMMENT 'name of challenge',
	-- introduce of challenge
	challenge_descritpion varchar(1024) NOT NULL COMMENT 'introduce of challenge',
	location_id int,
	add_date datetime NOT NULL,
	update_date datetime NOT NULL,
	PRIMARY KEY (challenge_id),
	UNIQUE (challenge_id),
	UNIQUE (challenge_code)
);


CREATE TABLE challenge_operation
(
	challenge_id int NOT NULL,
	operation_type varchar(32) NOT NULL,
	operation_desc varchar(2048) NOT NULL,
	operation_date datetime NOT NULL
);


CREATE TABLE city
(
	-- unique id of city
	city_id int NOT NULL AUTO_INCREMENT COMMENT 'unique id of city',
	-- code of city
	city_code varchar(36) NOT NULL COMMENT 'code of city',
	-- name of city
	city_name varchar(128) NOT NULL COMMENT 'name of city',
	-- municipality directly under the Central Government
	direct_flag boolean NOT NULL COMMENT 'municipality directly under the Central Government',
	-- provience unique id
	provience_id int NOT NULL COMMENT 'provience unique id',
	add_date datetime NOT NULL,
	update_date datetime NOT NULL,
	PRIMARY KEY (city_id),
	UNIQUE (city_id),
	UNIQUE (city_code)
);


CREATE TABLE code
(
	code_id int NOT NULL,
	code_type varchar(32) NOT NULL,
	code_name varchar(64) NOT NULL,
	code_value varchar(64) NOT NULL,
	code_description varchar(128),
	add_date datetime NOT NULL,
	update_date datetime NOT NULL
);


CREATE TABLE district
(
	-- unique id of distince
	district_id int NOT NULL AUTO_INCREMENT COMMENT 'unique id of distince',
	-- code of district
	-- 
	district_code varchar(36) NOT NULL COMMENT 'code of district
',
	-- name if district
	district_name varchar(512) NOT NULL COMMENT 'name if district',
	city_id int NOT NULL,
	add_date datetime,
	update_date datetime,
	PRIMARY KEY (district_id),
	UNIQUE (district_id),
	UNIQUE (district_code)
);


CREATE TABLE domain
(
	domain_id int NOT NULL AUTO_INCREMENT,
	domain_code varchar(36) NOT NULL,
	domain_name varchar(128) NOT NULL,
	add_date datetime NOT NULL,
	update_date datetime NOT NULL,
	PRIMARY KEY (domain_id),
	UNIQUE (domain_id),
	UNIQUE (domain_code)
);


CREATE TABLE location
(
	-- unique id of location
	location_id int NOT NULL AUTO_INCREMENT COMMENT 'unique id of location',
	-- unique code of location
	location_code varchar(36) NOT NULL COMMENT 'unique code of location',
	-- location name
	location_name varchar(512) NOT NULL COMMENT 'location name',
	district_id int NOT NULL,
	longitude varchar(64),
	latitude varchar(64),
	add_date datetime,
	update_date datetime,
	PRIMARY KEY (location_id),
	UNIQUE (location_id),
	UNIQUE (location_code)
);


CREATE TABLE location_operation
(
	id int NOT NULL,
	operation_type varchar(32) NOT NULL,
	-- city,provience,distirct,location
	type varchar(64) COMMENT 'city,provience,distirct,location',
	operation_desc varchar(1024) NOT NULL,
	operation_date datetime NOT NULL
);


CREATE TABLE otg_user
(
	-- user unique id
	uid int NOT NULL AUTO_INCREMENT COMMENT 'user unique id',
	-- user login name
	user_name varchar(48) NOT NULL COMMENT 'user login name',
	-- login password
	password varchar(512) NOT NULL COMMENT 'login password',
	-- show to other user ,if null will show username
	nick_name varchar(64) COMMENT 'show to other user ,if null will show username',
	-- age
	age int COMMENT 'age',
	-- gender/sexuality
	gender varchar(4) COMMENT 'gender/sexuality',
	-- personal introdiction
	introduction varchar(1024) COMMENT 'personal introdiction',
	add_date datetime NOT NULL,
	PRIMARY KEY (uid),
	UNIQUE (uid),
	UNIQUE (user_name)
);


CREATE TABLE picture
(
	picture_id int NOT NULL AUTO_INCREMENT,
	picture_code varchar(36) NOT NULL,
	picture_url varchar(1024) NOT NULL,
	-- location 
	-- user
	-- challenge
	relate_type varchar(10) COMMENT 'location 
user
challenge',
	relate_id int,
	add_date datetime NOT NULL,
	update_date datetime NOT NULL,
	PRIMARY KEY (picture_id),
	UNIQUE (picture_id),
	UNIQUE (picture_code)
);


CREATE TABLE provience
(
	-- unique id of provience
	provience_id int NOT NULL AUTO_INCREMENT COMMENT 'unique id of provience',
	provience_code varchar(36) NOT NULL,
	-- name of provience
	provience_name varchar(128) NOT NULL COMMENT 'name of provience',
	-- huadong,huanan... etc
	domain_id int COMMENT 'huadong,huanan... etc',
	add_date datetime NOT NULL,
	update_date datetime NOT NULL,
	PRIMARY KEY (provience_id),
	UNIQUE (provience_id),
	UNIQUE (provience_code),
	UNIQUE (provience_name)
);


CREATE TABLE resource_operation
(
	id int NOT NULL,
	operation_type varchar(32) NOT NULL,
	type varchar(64),
	operation_desc varchar(2048) NOT NULL,
	operation_date datetime NOT NULL
);


CREATE TABLE user_challenge
(
	uc_id int NOT NULL AUTO_INCREMENT,
	uid int NOT NULL,
	challenge_id int NOT NULL,
	support int,
	add_date datetime NOT NULL,
	update_date datetime NOT NULL,
	PRIMARY KEY (uc_id),
	UNIQUE (uc_id)
);


CREATE TABLE user_operation
(
	uid int NOT NULL,
	operation_type varchar(32) NOT NULL,
	operation_desc varchar(1024) NOT NULL,
	operation_date datetime NOT NULL
);


CREATE TABLE video
(
	video_id int NOT NULL AUTO_INCREMENT,
	video_code varchar(36) NOT NULL,
	video_url varchar(1024) NOT NULL,
	relate_type varchar(10),
	relate_id int,
	add_date datetime NOT NULL,
	update_date datetime NOT NULL,
	PRIMARY KEY (video_id),
	UNIQUE (video_id),
	UNIQUE (video_code)
);



/* Create Indexes */

CREATE UNIQUE INDEX challenge_id_idx USING BTREE ON challenge (challenge_id ASC);
CREATE UNIQUE INDEX challenge_code USING BTREE ON challenge (challenge_code ASC);
CREATE INDEX challenge_name_idx USING BTREE ON challenge (challenge_name ASC);
CREATE INDEX challenge_add_date_idx USING BTREE ON challenge (add_date ASC);
CREATE INDEX challenge_update_date_idx USING BTREE ON challenge (update_date ASC);
CREATE INDEX chanllenge_operation_id_idx USING BTREE ON challenge_operation (challenge_id ASC);
CREATE INDEX challenge_operation_date_idx USING BTREE ON challenge_operation (operation_date ASC);
CREATE UNIQUE INDEX city_id_idx USING BTREE ON city (city_id ASC);
CREATE UNIQUE INDEX city_code_idx USING BTREE ON city (city_code ASC);
CREATE INDEX city_provience_idx ON city (provience_id ASC);
CREATE INDEX city_name_idx USING BTREE ON city (city_name ASC);
CREATE UNIQUE INDEX code_type_idx USING BTREE ON code (code_type ASC);
CREATE INDEX code_name_value_idx USING BTREE ON code (code_name ASC, code_value ASC);
CREATE UNIQUE INDEX district_id_idx ON district (district_id ASC);
CREATE UNIQUE INDEX district_code_idx USING BTREE ON district (district_code ASC);
CREATE INDEX district_city_idx USING BTREE ON district (city_id ASC);
CREATE INDEX district_name_idx USING BTREE ON district (district_name ASC);
CREATE UNIQUE INDEX domain_id_idx USING BTREE ON domain (domain_id ASC);
CREATE UNIQUE INDEX domain_code_idx USING BTREE ON domain (domain_code ASC);
CREATE INDEX domain_name_idx USING BTREE ON domain (domain_name ASC);
CREATE UNIQUE INDEX location_id_idx USING BTREE ON location (location_id ASC);
CREATE UNIQUE INDEX location_code_idx USING BTREE ON location (location_code ASC);
CREATE INDEX location_district_idx ON location (district_id ASC);
CREATE INDEX location_operation_id_idx USING BTREE ON location_operation (id ASC);
CREATE INDEX location_operation_date_idx USING BTREE ON location_operation (operation_date ASC);
CREATE UNIQUE INDEX uid_idx USING BTREE ON otg_user (uid ASC);
CREATE UNIQUE INDEX user_name_idx USING BTREE ON otg_user (user_name ASC);
CREATE INDEX nick_name_idx USING BTREE ON otg_user (nick_name ASC);
CREATE INDEX otg_user_add_date_idx USING BTREE ON otg_user (add_date ASC);
CREATE UNIQUE INDEX picture_id_idx USING BTREE ON picture (picture_id ASC);
CREATE UNIQUE INDEX picture_code_idx USING BTREE ON picture (picture_code ASC);
CREATE INDEX picture_related_type_idx ON picture (relate_type ASC);
CREATE INDEX picture_related_idx ON picture (relate_id ASC);
CREATE UNIQUE INDEX provience_id_idx USING BTREE ON provience (provience_id ASC);
CREATE UNIQUE INDEX provience_code_idx USING BTREE ON provience (provience_code ASC);
CREATE INDEX provience_domain_idx ON provience (domain_id ASC);
CREATE INDEX provience_name_idx USING BTREE ON provience (provience_name ASC);
CREATE INDEX resource_operation_id_idx USING BTREE ON resource_operation (id ASC);
CREATE INDEX resource_operation_date_idx USING BTREE ON resource_operation (operation_date ASC);
CREATE UNIQUE INDEX user_challenge_id_idx USING BTREE ON user_challenge (uc_id ASC);
CREATE INDEX user_challenge_uid_idx USING BTREE ON user_challenge (uid ASC);
CREATE INDEX user_challenge_cid_idx USING BTREE ON user_challenge (challenge_id ASC);
CREATE INDEX user_challenge_add_date_idx ON user_challenge (add_date ASC);
CREATE INDEX user_challenge_update_date_idx ON user_challenge (update_date ASC);
CREATE INDEX user_operation_uid_idx USING BTREE ON user_operation (uid ASC);
CREATE INDEX user_operation_idx USING BTREE ON user_operation (operation_date ASC);
CREATE UNIQUE INDEX video_id_idx USING BTREE ON video (video_id ASC);
CREATE UNIQUE INDEX video_code_idx USING BTREE ON video (video_code ASC);
CREATE INDEX video_related_id_idx ON video (relate_id ASC);
CREATE INDEX video_related_type_idx USING BTREE ON video (relate_type ASC);



