/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables


import java.time.OffsetDateTime

import jooq.main.Public
import jooq.main.enums.KotlinerStatusEnum
import jooq.main.keys.ARTICLE_AUTHOR__ARTICLE_AUTHOR_KOTLINER_ID_FKEY
import jooq.main.keys.ARTICLE__ARTICLE_CREATED_BY_FKEY
import jooq.main.keys.ARTICLE__ARTICLE_UPDATED_BY_FKEY
import jooq.main.keys.BOOK_SPEAKER__BOOK_SPEAKER_KOTLINER_ID_FKEY
import jooq.main.keys.COMMENT__COMMENT_KOTLINER_ID_FKEY
import jooq.main.keys.COURSE_SPEAKER__COURSE_SPEAKER_KOTLINER_ID_FKEY
import jooq.main.keys.KOTLINER_LIKE_ENTITY_STATE__KOTLINER_LIKE_ENTITY_STATE_KOTLINER_ID_FKEY
import jooq.main.keys.KOTLINER_PKEY
import jooq.main.keys.KOTLINER_READ_ENTITY_STATE__KOTLINER_READ_ENTITY_STATE_KOTLINER_ID_FKEY
import jooq.main.keys.KUG_EVENT__KUG_EVENT_UPDATED_BY_FKEY
import jooq.main.keys.KUG_MEMBER__KUG_MEMBER_KOTLINER_ID_FKEY
import jooq.main.keys.KUG__KUG_CREATED_BY_FKEY
import jooq.main.keys.KUG__KUG_UPDATED_BY_FKEY
import jooq.main.keys.UNIQUE_KOTLINER_EMAIL
import jooq.main.keys.UNIQUE_KOTLINER_NICKNAME
import jooq.main.keys.VACANCY__VACANCY_KOTLINER_ID_FKEY
import jooq.main.keys.VIDEO_SPEAKER__VIDEO_SPEAKER_KOTLINER_ID_FKEY
import jooq.main.tables.Article.ArticlePath
import jooq.main.tables.ArticleAuthor.ArticleAuthorPath
import jooq.main.tables.Book.BookPath
import jooq.main.tables.BookSpeaker.BookSpeakerPath
import jooq.main.tables.Comment.CommentPath
import jooq.main.tables.Course.CoursePath
import jooq.main.tables.CourseSpeaker.CourseSpeakerPath
import jooq.main.tables.KotlinerLikeEntityState.KotlinerLikeEntityStatePath
import jooq.main.tables.KotlinerReadEntityState.KotlinerReadEntityStatePath
import jooq.main.tables.Kug.KugPath
import jooq.main.tables.KugEvent.KugEventPath
import jooq.main.tables.KugMember.KugMemberPath
import jooq.main.tables.Vacancy.VacancyPath
import jooq.main.tables.Video.VideoPath
import jooq.main.tables.VideoSpeaker.VideoSpeakerPath
import jooq.main.tables.records.KotlinerRecord

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.JSONB
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
open class Kotliner(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, KotlinerRecord>?,
    parentPath: InverseForeignKey<out Record, KotlinerRecord>?,
    aliased: Table<KotlinerRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<KotlinerRecord>(
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
         * The reference instance of <code>public.kotliner</code>
         */
        val KOTLINER: Kotliner = Kotliner()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<KotlinerRecord> = KotlinerRecord::class.java

    /**
     * The column <code>public.kotliner.id</code>.
     */
    val ID: TableField<KotlinerRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.kotliner.created</code>.
     */
    val CREATED: TableField<KotlinerRecord, OffsetDateTime?> = createField(DSL.name("created"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.updated</code>.
     */
    val UPDATED: TableField<KotlinerRecord, OffsetDateTime?> = createField(DSL.name("updated"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.status</code>.
     */
    val STATUS: TableField<KotlinerRecord, KotlinerStatusEnum?> = createField(DSL.name("status"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(KotlinerStatusEnum::class.java), this, "")

    /**
     * The column <code>public.kotliner.avatar</code>.
     */
    val AVATAR: TableField<KotlinerRecord, String?> = createField(DSL.name("avatar"), SQLDataType.VARCHAR(500), this, "")

    /**
     * The column <code>public.kotliner.description</code>.
     */
    val DESCRIPTION: TableField<KotlinerRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>public.kotliner.normalized_email</code>.
     */
    val NORMALIZED_EMAIL: TableField<KotlinerRecord, String?> = createField(DSL.name("normalized_email"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.original_email</code>.
     */
    val ORIGINAL_EMAIL: TableField<KotlinerRecord, String?> = createField(DSL.name("original_email"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.first_name</code>.
     */
    val FIRST_NAME: TableField<KotlinerRecord, String?> = createField(DSL.name("first_name"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.kotliner.last_name</code>.
     */
    val LAST_NAME: TableField<KotlinerRecord, String?> = createField(DSL.name("last_name"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.kotliner.nickname</code>.
     */
    val NICKNAME: TableField<KotlinerRecord, String?> = createField(DSL.name("nickname"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.password</code>.
     */
    val PASSWORD: TableField<KotlinerRecord, String?> = createField(DSL.name("password"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kotliner.totp</code>.
     */
    val TOTP: TableField<KotlinerRecord, String?> = createField(DSL.name("totp"), SQLDataType.VARCHAR(500), this, "")

    /**
     * The column <code>public.kotliner.meta</code>.
     */
    val META: TableField<KotlinerRecord, JSONB?> = createField(DSL.name("meta"), SQLDataType.JSONB, this, "")

    /**
     * The column <code>public.kotliner.version</code>.
     */
    val VERSION: TableField<KotlinerRecord, Long?> = createField(DSL.name("version"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.BIGINT)), this, "")

    private constructor(alias: Name, aliased: Table<KotlinerRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<KotlinerRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<KotlinerRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.kotliner</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.kotliner</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.kotliner</code> table reference
     */
    constructor(): this(DSL.name("kotliner"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, KotlinerRecord>?, parentPath: InverseForeignKey<out Record, KotlinerRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, KOTLINER, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class KotlinerPath : Kotliner, Path<KotlinerRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, KotlinerRecord>?, parentPath: InverseForeignKey<out Record, KotlinerRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<KotlinerRecord>): super(alias, aliased)
        override fun `as`(alias: String): KotlinerPath = KotlinerPath(DSL.name(alias), this)
        override fun `as`(alias: Name): KotlinerPath = KotlinerPath(alias, this)
        override fun `as`(alias: Table<*>): KotlinerPath = KotlinerPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<KotlinerRecord, Long?> = super.getIdentity() as Identity<KotlinerRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<KotlinerRecord> = KOTLINER_PKEY
    override fun getUniqueKeys(): List<UniqueKey<KotlinerRecord>> = listOf(UNIQUE_KOTLINER_EMAIL, UNIQUE_KOTLINER_NICKNAME)

    private lateinit var _articleAuthor: ArticleAuthorPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.article_author</code> table
     */
    fun articleAuthor(): ArticleAuthorPath {
        if (!this::_articleAuthor.isInitialized)
            _articleAuthor = ArticleAuthorPath(this, null, ARTICLE_AUTHOR__ARTICLE_AUTHOR_KOTLINER_ID_FKEY.inverseKey)

        return _articleAuthor;
    }

    val articleAuthor: ArticleAuthorPath
        get(): ArticleAuthorPath = articleAuthor()

    private lateinit var _articleCreatedByFkey: ArticlePath

    /**
     * Get the implicit to-many join path to the <code>public.article</code>
     * table, via the <code>article_created_by_fkey</code> key
     */
    fun articleCreatedByFkey(): ArticlePath {
        if (!this::_articleCreatedByFkey.isInitialized)
            _articleCreatedByFkey = ArticlePath(this, null, ARTICLE__ARTICLE_CREATED_BY_FKEY.inverseKey)

        return _articleCreatedByFkey;
    }

    val articleCreatedByFkey: ArticlePath
        get(): ArticlePath = articleCreatedByFkey()

    private lateinit var _articleUpdatedByFkey: ArticlePath

    /**
     * Get the implicit to-many join path to the <code>public.article</code>
     * table, via the <code>article_updated_by_fkey</code> key
     */
    fun articleUpdatedByFkey(): ArticlePath {
        if (!this::_articleUpdatedByFkey.isInitialized)
            _articleUpdatedByFkey = ArticlePath(this, null, ARTICLE__ARTICLE_UPDATED_BY_FKEY.inverseKey)

        return _articleUpdatedByFkey;
    }

    val articleUpdatedByFkey: ArticlePath
        get(): ArticlePath = articleUpdatedByFkey()

    private lateinit var _bookSpeaker: BookSpeakerPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.book_speaker</code> table
     */
    fun bookSpeaker(): BookSpeakerPath {
        if (!this::_bookSpeaker.isInitialized)
            _bookSpeaker = BookSpeakerPath(this, null, BOOK_SPEAKER__BOOK_SPEAKER_KOTLINER_ID_FKEY.inverseKey)

        return _bookSpeaker;
    }

    val bookSpeaker: BookSpeakerPath
        get(): BookSpeakerPath = bookSpeaker()

    private lateinit var _comment: CommentPath

    /**
     * Get the implicit to-many join path to the <code>public.comment</code>
     * table
     */
    fun comment(): CommentPath {
        if (!this::_comment.isInitialized)
            _comment = CommentPath(this, null, COMMENT__COMMENT_KOTLINER_ID_FKEY.inverseKey)

        return _comment;
    }

    val comment: CommentPath
        get(): CommentPath = comment()

    private lateinit var _courseSpeaker: CourseSpeakerPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.course_speaker</code> table
     */
    fun courseSpeaker(): CourseSpeakerPath {
        if (!this::_courseSpeaker.isInitialized)
            _courseSpeaker = CourseSpeakerPath(this, null, COURSE_SPEAKER__COURSE_SPEAKER_KOTLINER_ID_FKEY.inverseKey)

        return _courseSpeaker;
    }

    val courseSpeaker: CourseSpeakerPath
        get(): CourseSpeakerPath = courseSpeaker()

    private lateinit var _kotlinerLikeEntityState: KotlinerLikeEntityStatePath

    /**
     * Get the implicit to-many join path to the
     * <code>public.kotliner_like_entity_state</code> table
     */
    fun kotlinerLikeEntityState(): KotlinerLikeEntityStatePath {
        if (!this::_kotlinerLikeEntityState.isInitialized)
            _kotlinerLikeEntityState = KotlinerLikeEntityStatePath(this, null, KOTLINER_LIKE_ENTITY_STATE__KOTLINER_LIKE_ENTITY_STATE_KOTLINER_ID_FKEY.inverseKey)

        return _kotlinerLikeEntityState;
    }

    val kotlinerLikeEntityState: KotlinerLikeEntityStatePath
        get(): KotlinerLikeEntityStatePath = kotlinerLikeEntityState()

    private lateinit var _kotlinerReadEntityState: KotlinerReadEntityStatePath

    /**
     * Get the implicit to-many join path to the
     * <code>public.kotliner_read_entity_state</code> table
     */
    fun kotlinerReadEntityState(): KotlinerReadEntityStatePath {
        if (!this::_kotlinerReadEntityState.isInitialized)
            _kotlinerReadEntityState = KotlinerReadEntityStatePath(this, null, KOTLINER_READ_ENTITY_STATE__KOTLINER_READ_ENTITY_STATE_KOTLINER_ID_FKEY.inverseKey)

        return _kotlinerReadEntityState;
    }

    val kotlinerReadEntityState: KotlinerReadEntityStatePath
        get(): KotlinerReadEntityStatePath = kotlinerReadEntityState()

    private lateinit var _kugCreatedByFkey: KugPath

    /**
     * Get the implicit to-many join path to the <code>public.kug</code> table,
     * via the <code>kug_created_by_fkey</code> key
     */
    fun kugCreatedByFkey(): KugPath {
        if (!this::_kugCreatedByFkey.isInitialized)
            _kugCreatedByFkey = KugPath(this, null, KUG__KUG_CREATED_BY_FKEY.inverseKey)

        return _kugCreatedByFkey;
    }

    val kugCreatedByFkey: KugPath
        get(): KugPath = kugCreatedByFkey()

    private lateinit var _kugEvent: KugEventPath

    /**
     * Get the implicit to-many join path to the <code>public.kug_event</code>
     * table
     */
    fun kugEvent(): KugEventPath {
        if (!this::_kugEvent.isInitialized)
            _kugEvent = KugEventPath(this, null, KUG_EVENT__KUG_EVENT_UPDATED_BY_FKEY.inverseKey)

        return _kugEvent;
    }

    val kugEvent: KugEventPath
        get(): KugEventPath = kugEvent()

    private lateinit var _kugMember: KugMemberPath

    /**
     * Get the implicit to-many join path to the <code>public.kug_member</code>
     * table
     */
    fun kugMember(): KugMemberPath {
        if (!this::_kugMember.isInitialized)
            _kugMember = KugMemberPath(this, null, KUG_MEMBER__KUG_MEMBER_KOTLINER_ID_FKEY.inverseKey)

        return _kugMember;
    }

    val kugMember: KugMemberPath
        get(): KugMemberPath = kugMember()

    private lateinit var _kugUpdatedByFkey: KugPath

    /**
     * Get the implicit to-many join path to the <code>public.kug</code> table,
     * via the <code>kug_updated_by_fkey</code> key
     */
    fun kugUpdatedByFkey(): KugPath {
        if (!this::_kugUpdatedByFkey.isInitialized)
            _kugUpdatedByFkey = KugPath(this, null, KUG__KUG_UPDATED_BY_FKEY.inverseKey)

        return _kugUpdatedByFkey;
    }

    val kugUpdatedByFkey: KugPath
        get(): KugPath = kugUpdatedByFkey()

    private lateinit var _vacancy: VacancyPath

    /**
     * Get the implicit to-many join path to the <code>public.vacancy</code>
     * table
     */
    fun vacancy(): VacancyPath {
        if (!this::_vacancy.isInitialized)
            _vacancy = VacancyPath(this, null, VACANCY__VACANCY_KOTLINER_ID_FKEY.inverseKey)

        return _vacancy;
    }

    val vacancy: VacancyPath
        get(): VacancyPath = vacancy()

    private lateinit var _videoSpeaker: VideoSpeakerPath

    /**
     * Get the implicit to-many join path to the
     * <code>public.video_speaker</code> table
     */
    fun videoSpeaker(): VideoSpeakerPath {
        if (!this::_videoSpeaker.isInitialized)
            _videoSpeaker = VideoSpeakerPath(this, null, VIDEO_SPEAKER__VIDEO_SPEAKER_KOTLINER_ID_FKEY.inverseKey)

        return _videoSpeaker;
    }

    val videoSpeaker: VideoSpeakerPath
        get(): VideoSpeakerPath = videoSpeaker()

    /**
     * Get the implicit many-to-many join path to the
     * <code>public.article</code> table
     */
    val article: ArticlePath
        get(): ArticlePath = articleAuthor().article()

    /**
     * Get the implicit many-to-many join path to the <code>public.book</code>
     * table
     */
    val book: BookPath
        get(): BookPath = bookSpeaker().book()

    /**
     * Get the implicit many-to-many join path to the <code>public.course</code>
     * table
     */
    val course: CoursePath
        get(): CoursePath = courseSpeaker().course()

    /**
     * Get the implicit many-to-many join path to the <code>public.kug</code>
     * table
     */
    val kug: KugPath
        get(): KugPath = kugMember().kug()

    /**
     * Get the implicit many-to-many join path to the <code>public.video</code>
     * table
     */
    val video: VideoPath
        get(): VideoPath = videoSpeaker().video()
    override fun `as`(alias: String): Kotliner = Kotliner(DSL.name(alias), this)
    override fun `as`(alias: Name): Kotliner = Kotliner(alias, this)
    override fun `as`(alias: Table<*>): Kotliner = Kotliner(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Kotliner = Kotliner(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Kotliner = Kotliner(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Kotliner = Kotliner(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Kotliner = Kotliner(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Kotliner = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Kotliner = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Kotliner = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Kotliner = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Kotliner = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Kotliner = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Kotliner = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Kotliner = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Kotliner = where(DSL.notExists(select))
}
