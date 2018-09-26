/*
 Navicat PostgreSQL Data Transfer

 Source Server         : local_instance
 Source Server Type    : PostgreSQL
 Source Server Version : 100004
 Source Host           : localhost:5432
 Source Catalog        : pvvih
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 100004
 File Encoding         : 65001

 Date: 26/09/2018 16:40:42
*/


-- ----------------------------
-- Sequence structure for fosa_fosaid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."fosa_fosaid_seq";
CREATE SEQUENCE "public"."fosa_fosaid_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for province_provinceid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."province_provinceid_seq";
CREATE SEQUENCE "public"."province_provinceid_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for users_userid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."users_userid_seq";
CREATE SEQUENCE "public"."users_userid_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;

-- ----------------------------
-- Sequence structure for zone_zoneid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "public"."zone_zoneid_seq";
CREATE SEQUENCE "public"."zone_zoneid_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 32767
START 1
CACHE 1;

-- ----------------------------
-- Table structure for fosa
-- ----------------------------
DROP TABLE IF EXISTS "public"."fosa";
CREATE TABLE "public"."fosa" (
  "fosaid" int4 NOT NULL DEFAULT nextval('fosa_fosaid_seq'::regclass),
  "nom" varchar(50) COLLATE "pg_catalog"."default",
  "zoneid" int4
)
;

-- ----------------------------
-- Records of fosa
-- ----------------------------
INSERT INTO "public"."fosa" VALUES (1, 'Katuba HGR
', 1);
INSERT INTO "public"."fosa" VALUES (2, 'Betty HGR
', 2);
INSERT INTO "public"."fosa" VALUES (3, 'St Charles CS', 2);
INSERT INTO "public"."fosa" VALUES (4, 'Mama Wa Huruma', 3);
INSERT INTO "public"."fosa" VALUES (5, 'St Francois D''assise', 4);
INSERT INTO "public"."fosa" VALUES (6, 'SNCC - Lubumbashi HGR', 5);
INSERT INTO "public"."fosa" VALUES (7, 'Mfinda', 6);
INSERT INTO "public"."fosa" VALUES (8, 'St Christophe', 6);
INSERT INTO "public"."fosa" VALUES (9, 'Kimbanguiste HGR', 7);
INSERT INTO "public"."fosa" VALUES (10, 'Bolingo-Masina 1', 8);
INSERT INTO "public"."fosa" VALUES (11, 'Etonga', 9);

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS "public"."province";
CREATE TABLE "public"."province" (
  "provinceid" int4 NOT NULL DEFAULT nextval('province_provinceid_seq'::regclass),
  "nom" varchar(50) COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO "public"."province" VALUES (1, 'Katanga
');
INSERT INTO "public"."province" VALUES (2, 'Kinshasa');

-- ----------------------------
-- Table structure for survey
-- ----------------------------
DROP TABLE IF EXISTS "public"."survey";
CREATE TABLE "public"."survey" (
  "surveyid" varchar(50) COLLATE "pg_catalog"."default" NOT NULL,
  "date_eval" date,
  "nom_enqueteurs" varchar(50) COLLATE "pg_catalog"."default",
  "nom_titre_enqute1" varchar(50) COLLATE "pg_catalog"."default",
  "nom_titre_enqute2" varchar(50) COLLATE "pg_catalog"."default",
  "nom_titre_enqute3" varchar(50) COLLATE "pg_catalog"."default",
  "categ_site_pyramide" varchar(50) COLLATE "pg_catalog"."default",
  "categ_site" varchar(50) COLLATE "pg_catalog"."default",
  "service_cdv" varchar(5) COLLATE "pg_catalog"."default",
  "service_dcip" varchar(5) COLLATE "pg_catalog"."default",
  "service_ptme" varchar(5) COLLATE "pg_catalog"."default",
  "service_tarv" varchar(5) COLLATE "pg_catalog"."default",
  "service_labo" varchar(5) COLLATE "pg_catalog"."default",
  "service_pair_educ" varchar(5) COLLATE "pg_catalog"."default",
  "service_inf_tb_vih" varchar(5) COLLATE "pg_catalog"."default",
  "service_com_visit" varchar(5) COLLATE "pg_catalog"."default",
  "service_com_podi" varchar(5) COLLATE "pg_catalog"."default",
  "service_autres" varchar(5) COLLATE "pg_catalog"."default",
  "process_qualite" varchar(5) COLLATE "pg_catalog"."default",
  "point_focal_aq" varchar(5) COLLATE "pg_catalog"."default",
  "eaq_fonctionne" varchar(5) COLLATE "pg_catalog"."default",
  "planing_reunion" varchar(5) COLLATE "pg_catalog"."default",
  "plan_action_aq" varchar(5) COLLATE "pg_catalog"."default",
  "pv_reunion" varchar(5) COLLATE "pg_catalog"."default",
  "doc_initiative_aq" varchar(5) COLLATE "pg_catalog"."default",
  "implication_zs" varchar(5) COLLATE "pg_catalog"."default",
  "implication_fosa" varchar(5) COLLATE "pg_catalog"."default",
  "fosa_charge_viral" varchar(5) COLLATE "pg_catalog"."default",
  "ref_patient" varchar(5) COLLATE "pg_catalog"."default",
  "collecter_ref_echant" varchar(5) COLLATE "pg_catalog"."default",
  "fosa_systeme_poc" varchar(5) COLLATE "pg_catalog"."default",
  "refrig_control_temp" varchar(5) COLLATE "pg_catalog"."default",
  "transport_echant_froid" varchar(5) COLLATE "pg_catalog"."default",
  "point_focal_upec" varchar(5) COLLATE "pg_catalog"."default",
  "triage_notif_patient_arv" varchar(5) COLLATE "pg_catalog"."default",
  "triage_documente_regis" varchar(5) COLLATE "pg_catalog"."default",
  "regis_resu_date_prelev" varchar(5) COLLATE "pg_catalog"."default",
  "date_prelev_enregis" varchar(5) COLLATE "pg_catalog"."default",
  "regis_resu_date_retour" varchar(5) COLLATE "pg_catalog"."default",
  "date_retour_enregis" varchar(5) COLLATE "pg_catalog"."default",
  "pourcent_resu_documentes" float8,
  "regis_resu_cv1000" varchar(5) COLLATE "pg_catalog"."default",
  "temps_estime_retour_resu" varchar(50) COLLATE "pg_catalog"."default",
  "process_suivi_resu" varchar(5) COLLATE "pg_catalog"."default",
  "process_renfor_counseling" varchar(5) COLLATE "pg_catalog"."default",
  "process_renfor_documente" varchar(5) COLLATE "pg_catalog"."default",
  "systeme_group_soutien" varchar(5) COLLATE "pg_catalog"."default",
  "systeme_group_soutien_documente" varchar(5) COLLATE "pg_catalog"."default",
  "patient_activ_arv_1an" numeric(16),
  "patient_arv_12mois_prelev_cv" numeric(16),
  "patient_arv_12mois_prelev_cv12mois" numeric(16),
  "patient_cv_non_detectable" numeric(16),
  "pers_pec_pvvih_structure" numeric(16),
  "pers_formees_12mois_tech_aq" varchar(5) COLLATE "pg_catalog"."default",
  "pers_formees_tech_aq" numeric(16),
  "prop_pers_formees_tech_aq" float8,
  "pers_formees_tech_collect" varchar(5) COLLATE "pg_catalog"."default",
  "pers_notion_algo_cv_pnls" varchar(5) COLLATE "pg_catalog"."default",
  "strategie_fosa" text COLLATE "pg_catalog"."default",
  "fosaid" int4
)
;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS "public"."users";
CREATE TABLE "public"."users" (
  "userid" int4 NOT NULL DEFAULT nextval('users_userid_seq'::regclass),
  "prenom" varchar(45) COLLATE "pg_catalog"."default" NOT NULL,
  "nom" varchar(45) COLLATE "pg_catalog"."default" NOT NULL,
  "username" varchar(10) COLLATE "pg_catalog"."default" NOT NULL,
  "password" varchar(8) COLLATE "pg_catalog"."default" NOT NULL,
  "status" bool NOT NULL,
  "role" varchar(45) COLLATE "pg_catalog"."default" NOT NULL
)
;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO "public"."users" VALUES (2, 'GRACE', 'NDOMA', 'gndoma', '12345', 't', 'Data clerck');
INSERT INTO "public"."users" VALUES (3, 'SHUKRANI-TÉA', 'NDOMA', 'stndoma', '12345', 't', 'Data clerck');
INSERT INTO "public"."users" VALUES (1, 'riddy', 'ndoma', 'rndoma', '12345', 't', 'Admin');
INSERT INTO "public"."users" VALUES (4, 'HORNEL', 'LAMA', 'hlama', '12345', 't', 'Data clerck');
INSERT INTO "public"."users" VALUES (5, 'BERTILLE', 'ILOMBA', 'bilomba', '12345', 't', 'Data clerck');

-- ----------------------------
-- Table structure for zone
-- ----------------------------
DROP TABLE IF EXISTS "public"."zone";
CREATE TABLE "public"."zone" (
  "zoneid" int2 NOT NULL DEFAULT nextval('zone_zoneid_seq'::regclass),
  "nom" varchar(50) COLLATE "pg_catalog"."default",
  "provinceid" int4
)
;

-- ----------------------------
-- Records of zone
-- ----------------------------
INSERT INTO "public"."zone" VALUES (1, 'Katuba
', 1);
INSERT INTO "public"."zone" VALUES (2, 'Kipushi
', 1);
INSERT INTO "public"."zone" VALUES (3, 'Kisanga', 1);
INSERT INTO "public"."zone" VALUES (4, 'Mumbunda', 1);
INSERT INTO "public"."zone" VALUES (5, 'Tshamilemba', 1);
INSERT INTO "public"."zone" VALUES (6, 'Binza Ozone', 2);
INSERT INTO "public"."zone" VALUES (7, 'Kimbanseke', 2);
INSERT INTO "public"."zone" VALUES (8, 'Masina1', 2);
INSERT INTO "public"."zone" VALUES (9, 'Nsele', 2);

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."fosa_fosaid_seq"
OWNED BY "public"."fosa"."fosaid";
SELECT setval('"public"."fosa_fosaid_seq"', 12, true);
ALTER SEQUENCE "public"."province_provinceid_seq"
OWNED BY "public"."province"."provinceid";
SELECT setval('"public"."province_provinceid_seq"', 3, true);
ALTER SEQUENCE "public"."users_userid_seq"
OWNED BY "public"."users"."userid";
SELECT setval('"public"."users_userid_seq"', 6, true);
ALTER SEQUENCE "public"."zone_zoneid_seq"
OWNED BY "public"."zone"."zoneid";
SELECT setval('"public"."zone_zoneid_seq"', 10, true);

-- ----------------------------
-- Primary Key structure for table fosa
-- ----------------------------
ALTER TABLE "public"."fosa" ADD CONSTRAINT "fosa_pkey" PRIMARY KEY ("fosaid");

-- ----------------------------
-- Primary Key structure for table province
-- ----------------------------
ALTER TABLE "public"."province" ADD CONSTRAINT "province_pkey" PRIMARY KEY ("provinceid");

-- ----------------------------
-- Primary Key structure for table survey
-- ----------------------------
ALTER TABLE "public"."survey" ADD CONSTRAINT "survey_pkey" PRIMARY KEY ("surveyid");

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE "public"."users" ADD CONSTRAINT "users_pkey" PRIMARY KEY ("userid");

-- ----------------------------
-- Primary Key structure for table zone
-- ----------------------------
ALTER TABLE "public"."zone" ADD CONSTRAINT "zone_pkey" PRIMARY KEY ("zoneid");

-- ----------------------------
-- Foreign Keys structure for table fosa
-- ----------------------------
ALTER TABLE "public"."fosa" ADD CONSTRAINT "fk_fosa_zone" FOREIGN KEY ("zoneid") REFERENCES "public"."zone" ("zoneid") ON DELETE NO ACTION ON UPDATE CASCADE;

-- ----------------------------
-- Foreign Keys structure for table survey
-- ----------------------------
ALTER TABLE "public"."survey" ADD CONSTRAINT "fk_survey_fosa" FOREIGN KEY ("fosaid") REFERENCES "public"."fosa" ("fosaid") ON DELETE NO ACTION ON UPDATE CASCADE;

-- ----------------------------
-- Foreign Keys structure for table zone
-- ----------------------------
ALTER TABLE "public"."zone" ADD CONSTRAINT "fk_zone_province" FOREIGN KEY ("provinceid") REFERENCES "public"."province" ("provinceid") ON DELETE NO ACTION ON UPDATE CASCADE;
