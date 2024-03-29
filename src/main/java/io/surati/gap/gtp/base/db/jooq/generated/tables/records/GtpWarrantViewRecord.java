/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.gtp.base.db.jooq.generated.tables.records;


import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpWarrantView;

import java.time.LocalDate;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GtpWarrantViewRecord extends TableRecordImpl<GtpWarrantViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.gtp_warrant_view.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.type_id</code>.
     */
    public void setTypeId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.type_id</code>.
     */
    public String getTypeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.date</code>.
     */
    public void setDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.reference</code>.
     */
    public void setReference(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.reference</code>.
     */
    public String getReference() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.object</code>.
     */
    public void setObject(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.object</code>.
     */
    public String getObject() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.place</code>.
     */
    public void setPlace(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.place</code>.
     */
    public String getPlace() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.amount</code>.
     */
    public void setAmount(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.amount</code>.
     */
    public Double getAmount() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.deposit_date</code>.
     */
    public void setDepositDate(LocalDate value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.deposit_date</code>.
     */
    public LocalDate getDepositDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.entry_date</code>.
     */
    public void setEntryDate(LocalDate value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.entry_date</code>.
     */
    public LocalDate getEntryDate() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.issuer_id</code>.
     */
    public void setIssuerId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.issuer_id</code>.
     */
    public Long getIssuerId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.other_reference</code>.
     */
    public void setOtherReference(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.other_reference</code>.
     */
    public String getOtherReference() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.status_id</code>.
     */
    public void setStatusId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.status_id</code>.
     */
    public String getStatusId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.step_id</code>.
     */
    public void setStepId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.step_id</code>.
     */
    public String getStepId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.amount_paid</code>.
     */
    public void setAmountPaid(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.amount_paid</code>.
     */
    public Double getAmountPaid() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.amount_left</code>.
     */
    public void setAmountLeft(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.amount_left</code>.
     */
    public Double getAmountLeft() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.advanced_amount</code>.
     */
    public void setAdvancedAmount(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.advanced_amount</code>.
     */
    public Double getAdvancedAmount() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.author_id</code>.
     */
    public void setAuthorId(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.author_id</code>.
     */
    public Long getAuthorId() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.worker_id</code>.
     */
    public void setWorkerId(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.worker_id</code>.
     */
    public Long getWorkerId() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.name_issuer</code>.
     */
    public void setNameIssuer(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.name_issuer</code>.
     */
    public String getNameIssuer() {
        return (String) get(18);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.abbreviated_issuer</code>.
     */
    public void setAbbreviatedIssuer(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.abbreviated_issuer</code>.
     */
    public String getAbbreviatedIssuer() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.code_issuer</code>.
     */
    public void setCodeIssuer(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.code_issuer</code>.
     */
    public String getCodeIssuer() {
        return (String) get(20);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.debit_account_pec</code>.
     */
    public void setDebitAccountPec(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.debit_account_pec</code>.
     */
    public String getDebitAccountPec() {
        return (String) get(21);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.credit_account_pec</code>.
     */
    public void setCreditAccountPec(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.credit_account_pec</code>.
     */
    public String getCreditAccountPec() {
        return (String) get(22);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.date_pec</code>.
     */
    public void setDatePec(LocalDate value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.date_pec</code>.
     */
    public LocalDate getDatePec() {
        return (LocalDate) get(23);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.title</code>.
     */
    public void setTitle(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.title</code>.
     */
    public String getTitle() {
        return (String) get(24);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.section</code>.
     */
    public void setSection(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.section</code>.
     */
    public String getSection() {
        return (String) get(25);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.chapter</code>.
     */
    public void setChapter(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.chapter</code>.
     */
    public String getChapter() {
        return (String) get(26);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.sub_chapter</code>.
     */
    public void setSubChapter(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.sub_chapter</code>.
     */
    public String getSubChapter() {
        return (String) get(27);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.line</code>.
     */
    public void setLine(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.line</code>.
     */
    public String getLine() {
        return (String) get(28);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.bundle</code>.
     */
    public void setBundle(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.bundle</code>.
     */
    public String getBundle() {
        return (String) get(29);
    }

    /**
     * Setter for <code>public.gtp_warrant_view.imputation</code>.
     */
    public void setImputation(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.gtp_warrant_view.imputation</code>.
     */
    public String getImputation() {
        return (String) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GtpWarrantViewRecord
     */
    public GtpWarrantViewRecord() {
        super(GtpWarrantView.GTP_WARRANT_VIEW);
    }

    /**
     * Create a detached, initialised GtpWarrantViewRecord
     */
    public GtpWarrantViewRecord(Long id, String typeId, LocalDate date, String reference, String object, String place, Double amount, LocalDate depositDate, LocalDate entryDate, Long issuerId, String otherReference, String statusId, String stepId, Double amountPaid, Double amountLeft, Double advancedAmount, Long authorId, Long workerId, String nameIssuer, String abbreviatedIssuer, String codeIssuer, String debitAccountPec, String creditAccountPec, LocalDate datePec, String title, String section, String chapter, String subChapter, String line, String bundle, String imputation) {
        super(GtpWarrantView.GTP_WARRANT_VIEW);

        setId(id);
        setTypeId(typeId);
        setDate(date);
        setReference(reference);
        setObject(object);
        setPlace(place);
        setAmount(amount);
        setDepositDate(depositDate);
        setEntryDate(entryDate);
        setIssuerId(issuerId);
        setOtherReference(otherReference);
        setStatusId(statusId);
        setStepId(stepId);
        setAmountPaid(amountPaid);
        setAmountLeft(amountLeft);
        setAdvancedAmount(advancedAmount);
        setAuthorId(authorId);
        setWorkerId(workerId);
        setNameIssuer(nameIssuer);
        setAbbreviatedIssuer(abbreviatedIssuer);
        setCodeIssuer(codeIssuer);
        setDebitAccountPec(debitAccountPec);
        setCreditAccountPec(creditAccountPec);
        setDatePec(datePec);
        setTitle(title);
        setSection(section);
        setChapter(chapter);
        setSubChapter(subChapter);
        setLine(line);
        setBundle(bundle);
        setImputation(imputation);
    }
}
