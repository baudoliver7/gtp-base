/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.gtp.base.db.jooq.generated.tables;


import io.surati.gap.gtp.base.db.jooq.generated.Keys;
import io.surati.gap.gtp.base.db.jooq.generated.Public;
import io.surati.gap.gtp.base.db.jooq.generated.tables.records.GtpLineRecord;

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
public class GtpLine extends TableImpl<GtpLineRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.gtp_line</code>
     */
    public static final GtpLine GTP_LINE = new GtpLine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GtpLineRecord> getRecordType() {
        return GtpLineRecord.class;
    }

    /**
     * The column <code>public.gtp_line.code</code>.
     */
    public final TableField<GtpLineRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>public.gtp_line.name</code>.
     */
    public final TableField<GtpLineRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>public.gtp_line.notes</code>.
     */
    public final TableField<GtpLineRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.VARCHAR(250), this, "");

    private GtpLine(Name alias, Table<GtpLineRecord> aliased) {
        this(alias, aliased, null);
    }

    private GtpLine(Name alias, Table<GtpLineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.gtp_line</code> table reference
     */
    public GtpLine(String alias) {
        this(DSL.name(alias), GTP_LINE);
    }

    /**
     * Create an aliased <code>public.gtp_line</code> table reference
     */
    public GtpLine(Name alias) {
        this(alias, GTP_LINE);
    }

    /**
     * Create a <code>public.gtp_line</code> table reference
     */
    public GtpLine() {
        this(DSL.name("gtp_line"), null);
    }

    public <O extends Record> GtpLine(Table<O> child, ForeignKey<O, GtpLineRecord> key) {
        super(child, key, GTP_LINE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<GtpLineRecord> getPrimaryKey() {
        return Keys.GTP_LINE_PKEY;
    }

    @Override
    public List<UniqueKey<GtpLineRecord>> getKeys() {
        return Arrays.<UniqueKey<GtpLineRecord>>asList(Keys.GTP_LINE_PKEY);
    }

    @Override
    public GtpLine as(String alias) {
        return new GtpLine(DSL.name(alias), this);
    }

    @Override
    public GtpLine as(Name alias) {
        return new GtpLine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GtpLine rename(String name) {
        return new GtpLine(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GtpLine rename(Name name) {
        return new GtpLine(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}