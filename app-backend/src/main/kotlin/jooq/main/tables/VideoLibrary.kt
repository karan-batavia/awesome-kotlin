/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables


import jooq.main.Public
import jooq.main.keys.VIDEO_LIBRARY_PKEY
import jooq.main.keys.VIDEO_LIBRARY__VIDEO_LIBRARY_LIBRARY_ID_FKEY
import jooq.main.keys.VIDEO_LIBRARY__VIDEO_LIBRARY_VIDEO_ID_FKEY
import jooq.main.tables.Library.LibraryPath
import jooq.main.tables.Video.VideoPath
import jooq.main.tables.records.VideoLibraryRecord

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class VideoLibrary(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, VideoLibraryRecord>?,
    parentPath: InverseForeignKey<out Record, VideoLibraryRecord>?,
    aliased: Table<VideoLibraryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<VideoLibraryRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.video_library</code>
         */
        val VIDEO_LIBRARY: VideoLibrary = VideoLibrary()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<VideoLibraryRecord> = VideoLibraryRecord::class.java

    /**
     * The column <code>public.video_library.video_id</code>.
     */
    val VIDEO_ID: TableField<VideoLibraryRecord, Long?> = createField(DSL.name("video_id"), SQLDataType.BIGINT.nullable(false), this, "")

    /**
     * The column <code>public.video_library.library_id</code>.
     */
    val LIBRARY_ID: TableField<VideoLibraryRecord, Long?> = createField(DSL.name("library_id"), SQLDataType.BIGINT.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<VideoLibraryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<VideoLibraryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<VideoLibraryRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.video_library</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.video_library</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.video_library</code> table reference
     */
    constructor(): this(DSL.name("video_library"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, VideoLibraryRecord>?, parentPath: InverseForeignKey<out Record, VideoLibraryRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, VIDEO_LIBRARY, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class VideoLibraryPath : VideoLibrary, Path<VideoLibraryRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, VideoLibraryRecord>?, parentPath: InverseForeignKey<out Record, VideoLibraryRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<VideoLibraryRecord>): super(alias, aliased)
        override fun `as`(alias: String): VideoLibraryPath = VideoLibraryPath(DSL.name(alias), this)
        override fun `as`(alias: Name): VideoLibraryPath = VideoLibraryPath(alias, this)
        override fun `as`(alias: Table<*>): VideoLibraryPath = VideoLibraryPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<VideoLibraryRecord> = VIDEO_LIBRARY_PKEY
    override fun getReferences(): List<ForeignKey<VideoLibraryRecord, *>> = listOf(VIDEO_LIBRARY__VIDEO_LIBRARY_LIBRARY_ID_FKEY, VIDEO_LIBRARY__VIDEO_LIBRARY_VIDEO_ID_FKEY)

    private lateinit var _library: LibraryPath

    /**
     * Get the implicit join path to the <code>public.library</code> table.
     */
    fun library(): LibraryPath {
        if (!this::_library.isInitialized)
            _library = LibraryPath(this, VIDEO_LIBRARY__VIDEO_LIBRARY_LIBRARY_ID_FKEY, null)

        return _library;
    }

    val library: LibraryPath
        get(): LibraryPath = library()

    private lateinit var _video: VideoPath

    /**
     * Get the implicit join path to the <code>public.video</code> table.
     */
    fun video(): VideoPath {
        if (!this::_video.isInitialized)
            _video = VideoPath(this, VIDEO_LIBRARY__VIDEO_LIBRARY_VIDEO_ID_FKEY, null)

        return _video;
    }

    val video: VideoPath
        get(): VideoPath = video()
    override fun `as`(alias: String): VideoLibrary = VideoLibrary(DSL.name(alias), this)
    override fun `as`(alias: Name): VideoLibrary = VideoLibrary(alias, this)
    override fun `as`(alias: Table<*>): VideoLibrary = VideoLibrary(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): VideoLibrary = VideoLibrary(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): VideoLibrary = VideoLibrary(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): VideoLibrary = VideoLibrary(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): VideoLibrary = VideoLibrary(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): VideoLibrary = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): VideoLibrary = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): VideoLibrary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): VideoLibrary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): VideoLibrary = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): VideoLibrary = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): VideoLibrary = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): VideoLibrary = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): VideoLibrary = where(DSL.notExists(select))
}
