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

 Date: 25/09/2018 10:25:32
*/


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
  "pers_formees_tech_aq" numeric(16),
  "prop_pers_formees_tech_aq" float8,
  "pers_formees_tech_collect" varchar(5) COLLATE "pg_catalog"."default",
  "pers_notion_algo_cv_pnls" varchar(5) COLLATE "pg_catalog"."default",
  "strategie_fosa" text COLLATE "pg_catalog"."default"
)
;

-- ----------------------------
-- Records of survey
-- ----------------------------
INSERT INTO "public"."survey" VALUES ('rndoma54-35-30-CB-CE-251537799127570', '2018-09-01', 'Hornel', 'Lama - Program manager', 'Grace - Communication manager', 'Shukran-Téa - IT', 'Cliniques Spécialisées', 'Structure confessionnelle', 'Non', 'Non', 'Oui', 'Non', 'Non', 'Non', 'Non', 'Non', 'Oui', '', 'Oui', 'Non', 'Non', '', '', '', '', '', '', 'Oui', 'Non', 'Non', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 1455, 'Oui', 'Entre 1 à 3 mois ', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 555, 555, 4, 10, 85, 58, 21, 'Oui', 'Non', 'Test d''implémentation');
INSERT INTO "public"."survey" VALUES ('rndoma54-35-30-CB-CE-251537847469485', '2018-09-11', 'Toto', 'Bobo - Laboratin', 'Alice - IT', 'James - Medecin', 'Cliniques Spécialisées', 'Structure publique', 'Non', 'Oui', 'Non', 'Non', 'Non', 'Non', 'Non', 'Oui', 'Non', '', 'Non', 'Oui', 'Non', '', '', '', '', '', '', 'Non', '', '', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 88, 'Non', 'Plus de 3 mois', 'Non', 'Non', '', 'Non', '', 12, 57, 44, 45, 45, 14, 12.5, 'Oui', 'Non', 'Je fais juste un test. Merci!');
INSERT INTO "public"."survey" VALUES ('rndoma54-35-30-CB-CE-251537786649540', '2018-09-01', 'Josué elombe', 'Jorina - IT', 'Esther - IT', 'Lucas - IT', 'Centre de santé', 'Structure privée', 'Non', 'Oui', 'Non', 'Non', 'Non', 'Non', 'Non', 'Oui', 'Non', '', 'Oui', 'Oui', 'Oui', 'Non', 'Oui', 'Oui', 'Oui', 'Oui', 'Non', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Non', 'Non', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 155, 'Oui', 'Entre 1 à 3 mois ', 'Oui', 'Oui', 'Oui', 'Oui', 'Oui', 15, 5, 5, 5, 5, 5, 23.8, 'Oui', 'Oui', 'RAS');

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

-- ----------------------------
-- Alter sequences owned by
-- ----------------------------
ALTER SEQUENCE "public"."users_userid_seq"
OWNED BY "public"."users"."userid";
SELECT setval('"public"."users_userid_seq"', 5, true);

-- ----------------------------
-- Primary Key structure for table survey
-- ----------------------------
ALTER TABLE "public"."survey" ADD CONSTRAINT "survey_pkey" PRIMARY KEY ("surveyid");

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE "public"."users" ADD CONSTRAINT "users_pkey" PRIMARY KEY ("userid");
