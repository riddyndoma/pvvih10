/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icap.pvvih.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "survey")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Survey.findAll", query = "SELECT s FROM Survey s")
    , @NamedQuery(name = "Survey.findBySurveyid", query = "SELECT s FROM Survey s WHERE s.surveyid = :surveyid")
    , @NamedQuery(name = "Survey.findByDateEval", query = "SELECT s FROM Survey s WHERE s.dateEval = :dateEval")
    , @NamedQuery(name = "Survey.findByNomEnqueteurs", query = "SELECT s FROM Survey s WHERE s.nomEnqueteurs = :nomEnqueteurs")
    , @NamedQuery(name = "Survey.findByNomTitreEnqute1", query = "SELECT s FROM Survey s WHERE s.nomTitreEnqute1 = :nomTitreEnqute1")
    , @NamedQuery(name = "Survey.findByNomTitreEnqute2", query = "SELECT s FROM Survey s WHERE s.nomTitreEnqute2 = :nomTitreEnqute2")
    , @NamedQuery(name = "Survey.findByNomTitreEnqute3", query = "SELECT s FROM Survey s WHERE s.nomTitreEnqute3 = :nomTitreEnqute3")
    , @NamedQuery(name = "Survey.findByCategSitePyramide", query = "SELECT s FROM Survey s WHERE s.categSitePyramide = :categSitePyramide")
    , @NamedQuery(name = "Survey.findByCategSite", query = "SELECT s FROM Survey s WHERE s.categSite = :categSite")
    , @NamedQuery(name = "Survey.findByServiceCdv", query = "SELECT s FROM Survey s WHERE s.serviceCdv = :serviceCdv")
    , @NamedQuery(name = "Survey.findByServiceDcip", query = "SELECT s FROM Survey s WHERE s.serviceDcip = :serviceDcip")
    , @NamedQuery(name = "Survey.findByServicePtme", query = "SELECT s FROM Survey s WHERE s.servicePtme = :servicePtme")
    , @NamedQuery(name = "Survey.findByServiceTarv", query = "SELECT s FROM Survey s WHERE s.serviceTarv = :serviceTarv")
    , @NamedQuery(name = "Survey.findByServiceLabo", query = "SELECT s FROM Survey s WHERE s.serviceLabo = :serviceLabo")
    , @NamedQuery(name = "Survey.findByServicePairEduc", query = "SELECT s FROM Survey s WHERE s.servicePairEduc = :servicePairEduc")
    , @NamedQuery(name = "Survey.findByServiceInfTbVih", query = "SELECT s FROM Survey s WHERE s.serviceInfTbVih = :serviceInfTbVih")
    , @NamedQuery(name = "Survey.findByServiceComVisit", query = "SELECT s FROM Survey s WHERE s.serviceComVisit = :serviceComVisit")
    , @NamedQuery(name = "Survey.findByServiceComPodi", query = "SELECT s FROM Survey s WHERE s.serviceComPodi = :serviceComPodi")
    , @NamedQuery(name = "Survey.findByServiceAutres", query = "SELECT s FROM Survey s WHERE s.serviceAutres = :serviceAutres")
    , @NamedQuery(name = "Survey.findByProcessQualite", query = "SELECT s FROM Survey s WHERE s.processQualite = :processQualite")
    , @NamedQuery(name = "Survey.findByPointFocalAq", query = "SELECT s FROM Survey s WHERE s.pointFocalAq = :pointFocalAq")
    , @NamedQuery(name = "Survey.findByEaqFonctionne", query = "SELECT s FROM Survey s WHERE s.eaqFonctionne = :eaqFonctionne")
    , @NamedQuery(name = "Survey.findByPlaningReunion", query = "SELECT s FROM Survey s WHERE s.planingReunion = :planingReunion")
    , @NamedQuery(name = "Survey.findByPlanActionAq", query = "SELECT s FROM Survey s WHERE s.planActionAq = :planActionAq")
    , @NamedQuery(name = "Survey.findByPvReunion", query = "SELECT s FROM Survey s WHERE s.pvReunion = :pvReunion")
    , @NamedQuery(name = "Survey.findByDocInitiativeAq", query = "SELECT s FROM Survey s WHERE s.docInitiativeAq = :docInitiativeAq")
    , @NamedQuery(name = "Survey.findByImplicationZs", query = "SELECT s FROM Survey s WHERE s.implicationZs = :implicationZs")
    , @NamedQuery(name = "Survey.findByImplicationFosa", query = "SELECT s FROM Survey s WHERE s.implicationFosa = :implicationFosa")
    , @NamedQuery(name = "Survey.findByFosaChargeViral", query = "SELECT s FROM Survey s WHERE s.fosaChargeViral = :fosaChargeViral")
    , @NamedQuery(name = "Survey.findByRefPatient", query = "SELECT s FROM Survey s WHERE s.refPatient = :refPatient")
    , @NamedQuery(name = "Survey.findByCollecterRefEchant", query = "SELECT s FROM Survey s WHERE s.collecterRefEchant = :collecterRefEchant")
    , @NamedQuery(name = "Survey.findByFosaSystemePoc", query = "SELECT s FROM Survey s WHERE s.fosaSystemePoc = :fosaSystemePoc")
    , @NamedQuery(name = "Survey.findByRefrigControlTemp", query = "SELECT s FROM Survey s WHERE s.refrigControlTemp = :refrigControlTemp")
    , @NamedQuery(name = "Survey.findByTransportEchantFroid", query = "SELECT s FROM Survey s WHERE s.transportEchantFroid = :transportEchantFroid")
    , @NamedQuery(name = "Survey.findByPointFocalUpec", query = "SELECT s FROM Survey s WHERE s.pointFocalUpec = :pointFocalUpec")
    , @NamedQuery(name = "Survey.findByTriageNotifPatientArv", query = "SELECT s FROM Survey s WHERE s.triageNotifPatientArv = :triageNotifPatientArv")
    , @NamedQuery(name = "Survey.findByTriageDocumenteRegis", query = "SELECT s FROM Survey s WHERE s.triageDocumenteRegis = :triageDocumenteRegis")
    , @NamedQuery(name = "Survey.findByRegisResuDatePrelev", query = "SELECT s FROM Survey s WHERE s.regisResuDatePrelev = :regisResuDatePrelev")
    , @NamedQuery(name = "Survey.findByDatePrelevEnregis", query = "SELECT s FROM Survey s WHERE s.datePrelevEnregis = :datePrelevEnregis")
    , @NamedQuery(name = "Survey.findByRegisResuDateRetour", query = "SELECT s FROM Survey s WHERE s.regisResuDateRetour = :regisResuDateRetour")
    , @NamedQuery(name = "Survey.findByDateRetourEnregis", query = "SELECT s FROM Survey s WHERE s.dateRetourEnregis = :dateRetourEnregis")
    , @NamedQuery(name = "Survey.findByPourcentResuDocumentes", query = "SELECT s FROM Survey s WHERE s.pourcentResuDocumentes = :pourcentResuDocumentes")
    , @NamedQuery(name = "Survey.findByRegisResuCv1000", query = "SELECT s FROM Survey s WHERE s.regisResuCv1000 = :regisResuCv1000")
    , @NamedQuery(name = "Survey.findByTempsEstimeRetourResu", query = "SELECT s FROM Survey s WHERE s.tempsEstimeRetourResu = :tempsEstimeRetourResu")
    , @NamedQuery(name = "Survey.findByProcessSuiviResu", query = "SELECT s FROM Survey s WHERE s.processSuiviResu = :processSuiviResu")
    , @NamedQuery(name = "Survey.findByProcessRenforCounseling", query = "SELECT s FROM Survey s WHERE s.processRenforCounseling = :processRenforCounseling")
    , @NamedQuery(name = "Survey.findByProcessRenforDocumente", query = "SELECT s FROM Survey s WHERE s.processRenforDocumente = :processRenforDocumente")
    , @NamedQuery(name = "Survey.findBySystemeGroupSoutien", query = "SELECT s FROM Survey s WHERE s.systemeGroupSoutien = :systemeGroupSoutien")
    , @NamedQuery(name = "Survey.findBySystemeGroupSoutienDocumente", query = "SELECT s FROM Survey s WHERE s.systemeGroupSoutienDocumente = :systemeGroupSoutienDocumente")
    , @NamedQuery(name = "Survey.findByPatientActivArv1an", query = "SELECT s FROM Survey s WHERE s.patientActivArv1an = :patientActivArv1an")
    , @NamedQuery(name = "Survey.findByPatientArv12moisPrelevCv", query = "SELECT s FROM Survey s WHERE s.patientArv12moisPrelevCv = :patientArv12moisPrelevCv")
    , @NamedQuery(name = "Survey.findByPatientArv12moisPrelevCv12mois", query = "SELECT s FROM Survey s WHERE s.patientArv12moisPrelevCv12mois = :patientArv12moisPrelevCv12mois")
    , @NamedQuery(name = "Survey.findByPatientCvNonDetectable", query = "SELECT s FROM Survey s WHERE s.patientCvNonDetectable = :patientCvNonDetectable")
    , @NamedQuery(name = "Survey.findByPersPecPvvihStructure", query = "SELECT s FROM Survey s WHERE s.persPecPvvihStructure = :persPecPvvihStructure")
    , @NamedQuery(name = "Survey.findByPersFormeesTechAq", query = "SELECT s FROM Survey s WHERE s.persFormeesTechAq = :persFormeesTechAq")
    , @NamedQuery(name = "Survey.findByPropPersFormeesTechAq", query = "SELECT s FROM Survey s WHERE s.propPersFormeesTechAq = :propPersFormeesTechAq")
    , @NamedQuery(name = "Survey.findByPersFormeesTechCollect", query = "SELECT s FROM Survey s WHERE s.persFormeesTechCollect = :persFormeesTechCollect")
    , @NamedQuery(name = "Survey.findByPersNotionAlgoCvPnls", query = "SELECT s FROM Survey s WHERE s.persNotionAlgoCvPnls = :persNotionAlgoCvPnls")
    , @NamedQuery(name = "Survey.findByStrategieFosa", query = "SELECT s FROM Survey s WHERE s.strategieFosa = :strategieFosa")})
public class Survey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "surveyid")
    private String surveyid;
    @Column(name = "date_eval")
    @Temporal(TemporalType.DATE)
    private Date dateEval;
    @Column(name = "nom_enqueteurs")
    private String nomEnqueteurs;
    @Column(name = "nom_titre_enqute1")
    private String nomTitreEnqute1;
    @Column(name = "nom_titre_enqute2")
    private String nomTitreEnqute2;
    @Column(name = "nom_titre_enqute3")
    private String nomTitreEnqute3;
    @Column(name = "categ_site_pyramide")
    private String categSitePyramide;
    @Column(name = "categ_site")
    private String categSite;
    @Column(name = "service_cdv")
    private String serviceCdv;
    @Column(name = "service_dcip")
    private String serviceDcip;
    @Column(name = "service_ptme")
    private String servicePtme;
    @Column(name = "service_tarv")
    private String serviceTarv;
    @Column(name = "service_labo")
    private String serviceLabo;
    @Column(name = "service_pair_educ")
    private String servicePairEduc;
    @Column(name = "service_inf_tb_vih")
    private String serviceInfTbVih;
    @Column(name = "service_com_visit")
    private String serviceComVisit;
    @Column(name = "service_com_podi")
    private String serviceComPodi;
    @Column(name = "service_autres")
    private String serviceAutres;
    @Column(name = "process_qualite")
    private String processQualite;
    @Column(name = "point_focal_aq")
    private String pointFocalAq;
    @Column(name = "eaq_fonctionne")
    private String eaqFonctionne;
    @Column(name = "planing_reunion")
    private String planingReunion;
    @Column(name = "plan_action_aq")
    private String planActionAq;
    @Column(name = "pv_reunion")
    private String pvReunion;
    @Column(name = "doc_initiative_aq")
    private String docInitiativeAq;
    @Column(name = "implication_zs")
    private String implicationZs;
    @Column(name = "implication_fosa")
    private String implicationFosa;
    @Column(name = "fosa_charge_viral")
    private String fosaChargeViral;
    @Column(name = "ref_patient")
    private String refPatient;
    @Column(name = "collecter_ref_echant")
    private String collecterRefEchant;
    @Column(name = "fosa_systeme_poc")
    private String fosaSystemePoc;
    @Column(name = "refrig_control_temp")
    private String refrigControlTemp;
    @Column(name = "transport_echant_froid")
    private String transportEchantFroid;
    @Column(name = "point_focal_upec")
    private String pointFocalUpec;
    @Column(name = "triage_notif_patient_arv")
    private String triageNotifPatientArv;
    @Column(name = "triage_documente_regis")
    private String triageDocumenteRegis;
    @Column(name = "regis_resu_date_prelev")
    private String regisResuDatePrelev;
    @Column(name = "date_prelev_enregis")
    private String datePrelevEnregis;
    @Column(name = "regis_resu_date_retour")
    private String regisResuDateRetour;
    @Column(name = "date_retour_enregis")
    private String dateRetourEnregis;
    @Column(name = "pourcent_resu_documentes")
    private Long pourcentResuDocumentes;
    @Column(name = "regis_resu_cv1000")
    private String regisResuCv1000;
    @Column(name = "temps_estime_retour_resu")
    private String tempsEstimeRetourResu;
    @Column(name = "process_suivi_resu")
    private String processSuiviResu;
    @Column(name = "process_renfor_counseling")
    private String processRenforCounseling;
    @Column(name = "process_renfor_documente")
    private String processRenforDocumente;
    @Column(name = "systeme_group_soutien")
    private String systemeGroupSoutien;
    @Column(name = "systeme_group_soutien_documente")
    private String systemeGroupSoutienDocumente;
    @Column(name = "patient_activ_arv_1an")
    private Long patientActivArv1an;
    @Column(name = "patient_arv_12mois_prelev_cv")
    private Long patientArv12moisPrelevCv;
    @Column(name = "patient_arv_12mois_prelev_cv12mois")
    private Long patientArv12moisPrelevCv12mois;
    @Column(name = "patient_cv_non_detectable")
    private Long patientCvNonDetectable;
    @Column(name = "pers_pec_pvvih_structure")
    private Long persPecPvvihStructure;
    @Column(name = "pers_formees_tech_aq")
    private Long persFormeesTechAq;
    @Column(name = "prop_pers_formees_tech_aq")
    private Long propPersFormeesTechAq;
    @Column(name = "pers_formees_tech_collect")
    private Long persFormeesTechCollect;
    @Column(name = "pers_notion_algo_cv_pnls")
    private Long persNotionAlgoCvPnls;
    @Column(name = "strategie_fosa")
    private String strategieFosa;

    public Survey() {
    }

    public Survey(String surveyid) {
        this.surveyid = surveyid;
    }

    public String getSurveyid() {
        return surveyid;
    }

    public void setSurveyid(String surveyid) {
        this.surveyid = surveyid;
    }

    public Date getDateEval() {
        return dateEval;
    }

    public void setDateEval(Date dateEval) {
        this.dateEval = dateEval;
    }

    public String getNomEnqueteurs() {
        return nomEnqueteurs;
    }

    public void setNomEnqueteurs(String nomEnqueteurs) {
        this.nomEnqueteurs = nomEnqueteurs;
    }

    public String getNomTitreEnqute1() {
        return nomTitreEnqute1;
    }

    public void setNomTitreEnqute1(String nomTitreEnqute1) {
        this.nomTitreEnqute1 = nomTitreEnqute1;
    }

    public String getNomTitreEnqute2() {
        return nomTitreEnqute2;
    }

    public void setNomTitreEnqute2(String nomTitreEnqute2) {
        this.nomTitreEnqute2 = nomTitreEnqute2;
    }

    public String getNomTitreEnqute3() {
        return nomTitreEnqute3;
    }

    public void setNomTitreEnqute3(String nomTitreEnqute3) {
        this.nomTitreEnqute3 = nomTitreEnqute3;
    }

    public String getCategSitePyramide() {
        return categSitePyramide;
    }

    public void setCategSitePyramide(String categSitePyramide) {
        this.categSitePyramide = categSitePyramide;
    }

    public String getCategSite() {
        return categSite;
    }

    public void setCategSite(String categSite) {
        this.categSite = categSite;
    }

    public String getServiceCdv() {
        return serviceCdv;
    }

    public void setServiceCdv(String serviceCdv) {
        this.serviceCdv = serviceCdv;
    }

    public String getServiceDcip() {
        return serviceDcip;
    }

    public void setServiceDcip(String serviceDcip) {
        this.serviceDcip = serviceDcip;
    }

    public String getServicePtme() {
        return servicePtme;
    }

    public void setServicePtme(String servicePtme) {
        this.servicePtme = servicePtme;
    }

    public String getServiceTarv() {
        return serviceTarv;
    }

    public void setServiceTarv(String serviceTarv) {
        this.serviceTarv = serviceTarv;
    }

    public String getServiceLabo() {
        return serviceLabo;
    }

    public void setServiceLabo(String serviceLabo) {
        this.serviceLabo = serviceLabo;
    }

    public String getServicePairEduc() {
        return servicePairEduc;
    }

    public void setServicePairEduc(String servicePairEduc) {
        this.servicePairEduc = servicePairEduc;
    }

    public String getServiceInfTbVih() {
        return serviceInfTbVih;
    }

    public void setServiceInfTbVih(String serviceInfTbVih) {
        this.serviceInfTbVih = serviceInfTbVih;
    }

    public String getServiceComVisit() {
        return serviceComVisit;
    }

    public void setServiceComVisit(String serviceComVisit) {
        this.serviceComVisit = serviceComVisit;
    }

    public String getServiceComPodi() {
        return serviceComPodi;
    }

    public void setServiceComPodi(String serviceComPodi) {
        this.serviceComPodi = serviceComPodi;
    }

    public String getServiceAutres() {
        return serviceAutres;
    }

    public void setServiceAutres(String serviceAutres) {
        this.serviceAutres = serviceAutres;
    }

    public String getProcessQualite() {
        return processQualite;
    }

    public void setProcessQualite(String processQualite) {
        this.processQualite = processQualite;
    }

    public String getPointFocalAq() {
        return pointFocalAq;
    }

    public void setPointFocalAq(String pointFocalAq) {
        this.pointFocalAq = pointFocalAq;
    }

    public String getEaqFonctionne() {
        return eaqFonctionne;
    }

    public void setEaqFonctionne(String eaqFonctionne) {
        this.eaqFonctionne = eaqFonctionne;
    }

    public String getPlaningReunion() {
        return planingReunion;
    }

    public void setPlaningReunion(String planingReunion) {
        this.planingReunion = planingReunion;
    }

    public String getPlanActionAq() {
        return planActionAq;
    }

    public void setPlanActionAq(String planActionAq) {
        this.planActionAq = planActionAq;
    }

    public String getPvReunion() {
        return pvReunion;
    }

    public void setPvReunion(String pvReunion) {
        this.pvReunion = pvReunion;
    }

    public String getDocInitiativeAq() {
        return docInitiativeAq;
    }

    public void setDocInitiativeAq(String docInitiativeAq) {
        this.docInitiativeAq = docInitiativeAq;
    }

    public String getImplicationZs() {
        return implicationZs;
    }

    public void setImplicationZs(String implicationZs) {
        this.implicationZs = implicationZs;
    }

    public String getImplicationFosa() {
        return implicationFosa;
    }

    public void setImplicationFosa(String implicationFosa) {
        this.implicationFosa = implicationFosa;
    }

    public String getFosaChargeViral() {
        return fosaChargeViral;
    }

    public void setFosaChargeViral(String fosaChargeViral) {
        this.fosaChargeViral = fosaChargeViral;
    }

    public String getRefPatient() {
        return refPatient;
    }

    public void setRefPatient(String refPatient) {
        this.refPatient = refPatient;
    }

    public String getCollecterRefEchant() {
        return collecterRefEchant;
    }

    public void setCollecterRefEchant(String collecterRefEchant) {
        this.collecterRefEchant = collecterRefEchant;
    }

    public String getFosaSystemePoc() {
        return fosaSystemePoc;
    }

    public void setFosaSystemePoc(String fosaSystemePoc) {
        this.fosaSystemePoc = fosaSystemePoc;
    }

    public String getRefrigControlTemp() {
        return refrigControlTemp;
    }

    public void setRefrigControlTemp(String refrigControlTemp) {
        this.refrigControlTemp = refrigControlTemp;
    }

    public String getTransportEchantFroid() {
        return transportEchantFroid;
    }

    public void setTransportEchantFroid(String transportEchantFroid) {
        this.transportEchantFroid = transportEchantFroid;
    }

    public String getPointFocalUpec() {
        return pointFocalUpec;
    }

    public void setPointFocalUpec(String pointFocalUpec) {
        this.pointFocalUpec = pointFocalUpec;
    }

    public String getTriageNotifPatientArv() {
        return triageNotifPatientArv;
    }

    public void setTriageNotifPatientArv(String triageNotifPatientArv) {
        this.triageNotifPatientArv = triageNotifPatientArv;
    }

    public String getTriageDocumenteRegis() {
        return triageDocumenteRegis;
    }

    public void setTriageDocumenteRegis(String triageDocumenteRegis) {
        this.triageDocumenteRegis = triageDocumenteRegis;
    }

    public String getRegisResuDatePrelev() {
        return regisResuDatePrelev;
    }

    public void setRegisResuDatePrelev(String regisResuDatePrelev) {
        this.regisResuDatePrelev = regisResuDatePrelev;
    }

    public String getDatePrelevEnregis() {
        return datePrelevEnregis;
    }

    public void setDatePrelevEnregis(String datePrelevEnregis) {
        this.datePrelevEnregis = datePrelevEnregis;
    }

    public String getRegisResuDateRetour() {
        return regisResuDateRetour;
    }

    public void setRegisResuDateRetour(String regisResuDateRetour) {
        this.regisResuDateRetour = regisResuDateRetour;
    }

    public String getDateRetourEnregis() {
        return dateRetourEnregis;
    }

    public void setDateRetourEnregis(String dateRetourEnregis) {
        this.dateRetourEnregis = dateRetourEnregis;
    }

    public Long getPourcentResuDocumentes() {
        return pourcentResuDocumentes;
    }

    public void setPourcentResuDocumentes(Long pourcentResuDocumentes) {
        this.pourcentResuDocumentes = pourcentResuDocumentes;
    }

    public String getRegisResuCv1000() {
        return regisResuCv1000;
    }

    public void setRegisResuCv1000(String regisResuCv1000) {
        this.regisResuCv1000 = regisResuCv1000;
    }

    public String getTempsEstimeRetourResu() {
        return tempsEstimeRetourResu;
    }

    public void setTempsEstimeRetourResu(String tempsEstimeRetourResu) {
        this.tempsEstimeRetourResu = tempsEstimeRetourResu;
    }

    public String getProcessSuiviResu() {
        return processSuiviResu;
    }

    public void setProcessSuiviResu(String processSuiviResu) {
        this.processSuiviResu = processSuiviResu;
    }

    public String getProcessRenforCounseling() {
        return processRenforCounseling;
    }

    public void setProcessRenforCounseling(String processRenforCounseling) {
        this.processRenforCounseling = processRenforCounseling;
    }

    public String getProcessRenforDocumente() {
        return processRenforDocumente;
    }

    public void setProcessRenforDocumente(String processRenforDocumente) {
        this.processRenforDocumente = processRenforDocumente;
    }

    public String getSystemeGroupSoutien() {
        return systemeGroupSoutien;
    }

    public void setSystemeGroupSoutien(String systemeGroupSoutien) {
        this.systemeGroupSoutien = systemeGroupSoutien;
    }

    public String getSystemeGroupSoutienDocumente() {
        return systemeGroupSoutienDocumente;
    }

    public void setSystemeGroupSoutienDocumente(String systemeGroupSoutienDocumente) {
        this.systemeGroupSoutienDocumente = systemeGroupSoutienDocumente;
    }

    public Long getPatientActivArv1an() {
        return patientActivArv1an;
    }

    public void setPatientActivArv1an(Long patientActivArv1an) {
        this.patientActivArv1an = patientActivArv1an;
    }

    public Long getPatientArv12moisPrelevCv() {
        return patientArv12moisPrelevCv;
    }

    public void setPatientArv12moisPrelevCv(Long patientArv12moisPrelevCv) {
        this.patientArv12moisPrelevCv = patientArv12moisPrelevCv;
    }

    public Long getPatientArv12moisPrelevCv12mois() {
        return patientArv12moisPrelevCv12mois;
    }

    public void setPatientArv12moisPrelevCv12mois(Long patientArv12moisPrelevCv12mois) {
        this.patientArv12moisPrelevCv12mois = patientArv12moisPrelevCv12mois;
    }

    public Long getPatientCvNonDetectable() {
        return patientCvNonDetectable;
    }

    public void setPatientCvNonDetectable(Long patientCvNonDetectable) {
        this.patientCvNonDetectable = patientCvNonDetectable;
    }

    public Long getPersPecPvvihStructure() {
        return persPecPvvihStructure;
    }

    public void setPersPecPvvihStructure(Long persPecPvvihStructure) {
        this.persPecPvvihStructure = persPecPvvihStructure;
    }

    public Long getPersFormeesTechAq() {
        return persFormeesTechAq;
    }

    public void setPersFormeesTechAq(Long persFormeesTechAq) {
        this.persFormeesTechAq = persFormeesTechAq;
    }

    public Long getPropPersFormeesTechAq() {
        return propPersFormeesTechAq;
    }

    public void setPropPersFormeesTechAq(Long propPersFormeesTechAq) {
        this.propPersFormeesTechAq = propPersFormeesTechAq;
    }

    public Long getPersFormeesTechCollect() {
        return persFormeesTechCollect;
    }

    public void setPersFormeesTechCollect(Long persFormeesTechCollect) {
        this.persFormeesTechCollect = persFormeesTechCollect;
    }

    public Long getPersNotionAlgoCvPnls() {
        return persNotionAlgoCvPnls;
    }

    public void setPersNotionAlgoCvPnls(Long persNotionAlgoCvPnls) {
        this.persNotionAlgoCvPnls = persNotionAlgoCvPnls;
    }

    public String getStrategieFosa() {
        return strategieFosa;
    }

    public void setStrategieFosa(String strategieFosa) {
        this.strategieFosa = strategieFosa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyid != null ? surveyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Survey)) {
            return false;
        }
        Survey other = (Survey) object;
        if ((this.surveyid == null && other.surveyid != null) || (this.surveyid != null && !this.surveyid.equals(other.surveyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.icap.pvvih.model.Survey[ surveyid=" + surveyid + " ]";
    }
    
}
