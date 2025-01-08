/*
 * This file is generated by jOOQ.
 */
package jooq.main


import jooq.main.sequences.ENTITY_ID_SEQ
import jooq.main.tables.Article
import jooq.main.tables.ArticleAuthor
import jooq.main.tables.ArticleKotlinVersion
import jooq.main.tables.ArticleLibrary
import jooq.main.tables.ArticleTopic
import jooq.main.tables.Book
import jooq.main.tables.BookLibrary
import jooq.main.tables.BookSpeaker
import jooq.main.tables.Bookmark
import jooq.main.tables.Comment
import jooq.main.tables.Company
import jooq.main.tables.Course
import jooq.main.tables.CourseLibrary
import jooq.main.tables.CourseSpeaker
import jooq.main.tables.DmLikes
import jooq.main.tables.EntityTopic
import jooq.main.tables.FlywaySchemaHistory
import jooq.main.tables.GithubAuth
import jooq.main.tables.KotlinVersion
import jooq.main.tables.Kotliner
import jooq.main.tables.KotlinerLikeEntityState
import jooq.main.tables.KotlinerReadEntityState
import jooq.main.tables.Kug
import jooq.main.tables.KugEvent
import jooq.main.tables.KugMember
import jooq.main.tables.Library
import jooq.main.tables.LibraryVersion
import jooq.main.tables.Repository
import jooq.main.tables.Topic
import jooq.main.tables.Vacancy
import jooq.main.tables.Video
import jooq.main.tables.VideoLibrary
import jooq.main.tables.VideoSpeaker

import kotlin.collections.List

import org.jooq.Catalog
import org.jooq.Sequence
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Public : SchemaImpl("public", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>public</code>
         */
        val PUBLIC: Public = Public()
    }

    /**
     * The table <code>public.article</code>.
     */
    val ARTICLE: Article get() = Article.ARTICLE

    /**
     * The table <code>public.article_author</code>.
     */
    val ARTICLE_AUTHOR: ArticleAuthor get() = ArticleAuthor.ARTICLE_AUTHOR

    /**
     * The table <code>public.article_kotlin_version</code>.
     */
    val ARTICLE_KOTLIN_VERSION: ArticleKotlinVersion get() = ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION

    /**
     * The table <code>public.article_library</code>.
     */
    val ARTICLE_LIBRARY: ArticleLibrary get() = ArticleLibrary.ARTICLE_LIBRARY

    /**
     * The table <code>public.article_topic</code>.
     */
    val ARTICLE_TOPIC: ArticleTopic get() = ArticleTopic.ARTICLE_TOPIC

    /**
     * The table <code>public.book</code>.
     */
    val BOOK: Book get() = Book.BOOK

    /**
     * The table <code>public.book_library</code>.
     */
    val BOOK_LIBRARY: BookLibrary get() = BookLibrary.BOOK_LIBRARY

    /**
     * The table <code>public.book_speaker</code>.
     */
    val BOOK_SPEAKER: BookSpeaker get() = BookSpeaker.BOOK_SPEAKER

    /**
     * The table <code>public.bookmark</code>.
     */
    val BOOKMARK: Bookmark get() = Bookmark.BOOKMARK

    /**
     * The table <code>public.comment</code>.
     */
    val COMMENT: Comment get() = Comment.COMMENT

    /**
     * The table <code>public.company</code>.
     */
    val COMPANY: Company get() = Company.COMPANY

    /**
     * The table <code>public.course</code>.
     */
    val COURSE: Course get() = Course.COURSE

    /**
     * The table <code>public.course_library</code>.
     */
    val COURSE_LIBRARY: CourseLibrary get() = CourseLibrary.COURSE_LIBRARY

    /**
     * The table <code>public.course_speaker</code>.
     */
    val COURSE_SPEAKER: CourseSpeaker get() = CourseSpeaker.COURSE_SPEAKER

    /**
     * The table <code>public.dm_likes</code>.
     */
    val DM_LIKES: DmLikes get() = DmLikes.DM_LIKES

    /**
     * The table <code>public.entity_topic</code>.
     */
    val ENTITY_TOPIC: EntityTopic get() = EntityTopic.ENTITY_TOPIC

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    val FLYWAY_SCHEMA_HISTORY: FlywaySchemaHistory get() = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY

    /**
     * The table <code>public.github_auth</code>.
     */
    val GITHUB_AUTH: GithubAuth get() = GithubAuth.GITHUB_AUTH

    /**
     * The table <code>public.kotlin_version</code>.
     */
    val KOTLIN_VERSION: KotlinVersion get() = KotlinVersion.KOTLIN_VERSION

    /**
     * The table <code>public.kotliner</code>.
     */
    val KOTLINER: Kotliner get() = Kotliner.KOTLINER

    /**
     * The table <code>public.kotliner_like_entity_state</code>.
     */
    val KOTLINER_LIKE_ENTITY_STATE: KotlinerLikeEntityState get() = KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE

    /**
     * The table <code>public.kotliner_read_entity_state</code>.
     */
    val KOTLINER_READ_ENTITY_STATE: KotlinerReadEntityState get() = KotlinerReadEntityState.KOTLINER_READ_ENTITY_STATE

    /**
     * The table <code>public.kug</code>.
     */
    val KUG: Kug get() = Kug.KUG

    /**
     * The table <code>public.kug_event</code>.
     */
    val KUG_EVENT: KugEvent get() = KugEvent.KUG_EVENT

    /**
     * The table <code>public.kug_member</code>.
     */
    val KUG_MEMBER: KugMember get() = KugMember.KUG_MEMBER

    /**
     * The table <code>public.library</code>.
     */
    val LIBRARY: Library get() = Library.LIBRARY

    /**
     * The table <code>public.library_version</code>.
     */
    val LIBRARY_VERSION: LibraryVersion get() = LibraryVersion.LIBRARY_VERSION

    /**
     * The table <code>public.repository</code>.
     */
    val REPOSITORY: Repository get() = Repository.REPOSITORY

    /**
     * The table <code>public.topic</code>.
     */
    val TOPIC: Topic get() = Topic.TOPIC

    /**
     * The table <code>public.vacancy</code>.
     */
    val VACANCY: Vacancy get() = Vacancy.VACANCY

    /**
     * The table <code>public.video</code>.
     */
    val VIDEO: Video get() = Video.VIDEO

    /**
     * The table <code>public.video_library</code>.
     */
    val VIDEO_LIBRARY: VideoLibrary get() = VideoLibrary.VIDEO_LIBRARY

    /**
     * The table <code>public.video_speaker</code>.
     */
    val VIDEO_SPEAKER: VideoSpeaker get() = VideoSpeaker.VIDEO_SPEAKER

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getSequences(): List<Sequence<*>> = listOf(
        ENTITY_ID_SEQ
    )

    override fun getTables(): List<Table<*>> = listOf(
        Article.ARTICLE,
        ArticleAuthor.ARTICLE_AUTHOR,
        ArticleKotlinVersion.ARTICLE_KOTLIN_VERSION,
        ArticleLibrary.ARTICLE_LIBRARY,
        ArticleTopic.ARTICLE_TOPIC,
        Book.BOOK,
        BookLibrary.BOOK_LIBRARY,
        BookSpeaker.BOOK_SPEAKER,
        Bookmark.BOOKMARK,
        Comment.COMMENT,
        Company.COMPANY,
        Course.COURSE,
        CourseLibrary.COURSE_LIBRARY,
        CourseSpeaker.COURSE_SPEAKER,
        DmLikes.DM_LIKES,
        EntityTopic.ENTITY_TOPIC,
        FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
        GithubAuth.GITHUB_AUTH,
        KotlinVersion.KOTLIN_VERSION,
        Kotliner.KOTLINER,
        KotlinerLikeEntityState.KOTLINER_LIKE_ENTITY_STATE,
        KotlinerReadEntityState.KOTLINER_READ_ENTITY_STATE,
        Kug.KUG,
        KugEvent.KUG_EVENT,
        KugMember.KUG_MEMBER,
        Library.LIBRARY,
        LibraryVersion.LIBRARY_VERSION,
        Repository.REPOSITORY,
        Topic.TOPIC,
        Vacancy.VACANCY,
        Video.VIDEO,
        VideoLibrary.VIDEO_LIBRARY,
        VideoSpeaker.VIDEO_SPEAKER
    )
}
