/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.gtp.base.db.jooq.generated;


import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpAccountPec;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpBundle;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpChapter;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpLine;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpSection;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpSubChapter;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpTitle;
import io.surati.gap.gtp.base.db.jooq.generated.tables.GtpWarrant;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpAccountPecRecord;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpBundleRecord;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpChapterRecord;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpLineRecord;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpSectionRecord;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpSubChapterRecord;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpTitleRecord;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpWarrantRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<GtpAccountPecRecord> GTP_ACCOUNT_PEC_PKEY = Internal.createUniqueKey(GtpAccountPec.GTP_ACCOUNT_PEC, DSL.name("gtp_account_pec_pkey"), new TableField[] { GtpAccountPec.GTP_ACCOUNT_PEC.CODE }, true);
    public static final UniqueKey<GtpBundleRecord> GTP_BUNDLE_PKEY = Internal.createUniqueKey(GtpBundle.GTP_BUNDLE, DSL.name("gtp_bundle_pkey"), new TableField[] { GtpBundle.GTP_BUNDLE.CODE }, true);
    public static final UniqueKey<GtpChapterRecord> GTP_CHAPTER_PKEY = Internal.createUniqueKey(GtpChapter.GTP_CHAPTER, DSL.name("gtp_chapter_pkey"), new TableField[] { GtpChapter.GTP_CHAPTER.CODE }, true);
    public static final UniqueKey<GtpLineRecord> GTP_LINE_PKEY = Internal.createUniqueKey(GtpLine.GTP_LINE, DSL.name("gtp_line_pkey"), new TableField[] { GtpLine.GTP_LINE.CODE }, true);
    public static final UniqueKey<GtpSectionRecord> GTP_SECTION_PKEY = Internal.createUniqueKey(GtpSection.GTP_SECTION, DSL.name("gtp_section_pkey"), new TableField[] { GtpSection.GTP_SECTION.CODE }, true);
    public static final UniqueKey<GtpSubChapterRecord> GTP_SUB_CHAPTER_PKEY = Internal.createUniqueKey(GtpSubChapter.GTP_SUB_CHAPTER, DSL.name("gtp_sub_chapter_pkey"), new TableField[] { GtpSubChapter.GTP_SUB_CHAPTER.CODE }, true);
    public static final UniqueKey<GtpTitleRecord> GTP_TITLE_PKEY = Internal.createUniqueKey(GtpTitle.GTP_TITLE, DSL.name("gtp_title_pkey"), new TableField[] { GtpTitle.GTP_TITLE.CODE }, true);
    public static final UniqueKey<GtpWarrantRecord> GTP_WARRANT_PKEY = Internal.createUniqueKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_pkey"), new TableField[] { GtpWarrant.GTP_WARRANT.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<GtpWarrantRecord, GtpBundleRecord> GTP_WARRANT__GTP_WARRANT_BUNDLE_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_bundle_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.BUNDLE }, Keys.GTP_BUNDLE_PKEY, new TableField[] { GtpBundle.GTP_BUNDLE.CODE }, true);
    public static final ForeignKey<GtpWarrantRecord, GtpChapterRecord> GTP_WARRANT__GTP_WARRANT_CHAPTER_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_chapter_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.CHAPTER }, Keys.GTP_CHAPTER_PKEY, new TableField[] { GtpChapter.GTP_CHAPTER.CODE }, true);
    public static final ForeignKey<GtpWarrantRecord, GtpAccountPecRecord> GTP_WARRANT__GTP_WARRANT_CREDIT_ACCOUNT_PEC_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_credit_account_pec_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.CREDIT_ACCOUNT_PEC }, Keys.GTP_ACCOUNT_PEC_PKEY, new TableField[] { GtpAccountPec.GTP_ACCOUNT_PEC.CODE }, true);
    public static final ForeignKey<GtpWarrantRecord, GtpAccountPecRecord> GTP_WARRANT__GTP_WARRANT_DEBIT_ACCOUNT_PEC_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_debit_account_pec_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.DEBIT_ACCOUNT_PEC }, Keys.GTP_ACCOUNT_PEC_PKEY, new TableField[] { GtpAccountPec.GTP_ACCOUNT_PEC.CODE }, true);
    public static final ForeignKey<GtpWarrantRecord, GtpSectionRecord> GTP_WARRANT__GTP_WARRANT_SECTION_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_section_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.SECTION }, Keys.GTP_SECTION_PKEY, new TableField[] { GtpSection.GTP_SECTION.CODE }, true);
    public static final ForeignKey<GtpWarrantRecord, GtpSubChapterRecord> GTP_WARRANT__GTP_WARRANT_SUB_CHAPTER_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_sub_chapter_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.SUB_CHAPTER }, Keys.GTP_SUB_CHAPTER_PKEY, new TableField[] { GtpSubChapter.GTP_SUB_CHAPTER.CODE }, true);
    public static final ForeignKey<GtpWarrantRecord, GtpLineRecord> GTP_WARRANT__GTP_WARRANT_SUB_LINE_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_sub_line_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.LINE }, Keys.GTP_LINE_PKEY, new TableField[] { GtpLine.GTP_LINE.CODE }, true);
    public static final ForeignKey<GtpWarrantRecord, GtpTitleRecord> GTP_WARRANT__GTP_WARRANT_TITLE_FKEY = Internal.createForeignKey(GtpWarrant.GTP_WARRANT, DSL.name("gtp_warrant_title_fkey"), new TableField[] { GtpWarrant.GTP_WARRANT.TITLE }, Keys.GTP_TITLE_PKEY, new TableField[] { GtpTitle.GTP_TITLE.CODE }, true);
}