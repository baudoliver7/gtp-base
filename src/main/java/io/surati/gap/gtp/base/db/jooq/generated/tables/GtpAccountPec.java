/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.gtp.base.db.jooq.generated.tables;


import io.surati.gap.gtp.base.db.jooq.generated.Keys;
import io.surati.gap.gtp.base.db.jooq.generated.Public;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpAccountPecRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GtpAccountPec extends TableImpl<GtpAccountPecRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.gtp_account_pec</code>
     */
    public static final GtpAccountPec GTP_ACCOUNT_PEC = new GtpAccountPec();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GtpAccountPecRecord> getRecordType() {
        return GtpAccountPecRecord.class;
    }

    /**
     * The column <code>public.gtp_account_pec.code</code>.
     */
    public final TableField<GtpAccountPecRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>public.gtp_account_pec.name</code>.
     */
    public final TableField<GtpAccountPecRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>public.gtp_account_pec.notes</code>.
     */
    public final TableField<GtpAccountPecRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.VARCHAR(250), this, "");

    private GtpAccountPec(Name alias, Table<GtpAccountPecRecord> aliased) {
        this(alias, aliased, null);
    }

    private GtpAccountPec(Name alias, Table<GtpAccountPecRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.gtp_account_pec</code> table reference
     */
    public GtpAccountPec(String alias) {
        this(DSL.name(alias), GTP_ACCOUNT_PEC);
    }

    /**
     * Create an aliased <code>public.gtp_account_pec</code> table reference
     */
    public GtpAccountPec(Name alias) {
        this(alias, GTP_ACCOUNT_PEC);
    }

    /**
     * Create a <code>public.gtp_account_pec</code> table reference
     */
    public GtpAccountPec() {
        this(DSL.name("gtp_account_pec"), null);
    }

    public <O extends Record> GtpAccountPec(Table<O> child, ForeignKey<O, GtpAccountPecRecord> key) {
        super(child, key, GTP_ACCOUNT_PEC);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<GtpAccountPecRecord> getPrimaryKey() {
        return Keys.GTP_ACCOUNT_PEC_PKEY;
    }

    @Override
    public List<UniqueKey<GtpAccountPecRecord>> getKeys() {
        return Arrays.<UniqueKey<GtpAccountPecRecord>>asList(Keys.GTP_ACCOUNT_PEC_PKEY);
    }

    @Override
    public GtpAccountPec as(String alias) {
        return new GtpAccountPec(DSL.name(alias), this);
    }

    @Override
    public GtpAccountPec as(Name alias) {
        return new GtpAccountPec(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GtpAccountPec rename(String name) {
        return new GtpAccountPec(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GtpAccountPec rename(Name name) {
        return new GtpAccountPec(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}