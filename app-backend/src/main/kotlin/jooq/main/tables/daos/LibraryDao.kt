/*
 * This file is generated by jOOQ.
 */
package jooq.main.tables.daos


import jooq.main.tables.Library
import jooq.main.tables.records.LibraryRecord

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class LibraryDao(configuration: Configuration?) : DAOImpl<LibraryRecord, jooq.main.tables.pojos.Library, Long>(Library.LIBRARY, jooq.main.tables.pojos.Library::class.java, configuration) {

    /**
     * Create a new LibraryDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: jooq.main.tables.pojos.Library): Long? = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Long?, upperInclusive: Long?): List<jooq.main.tables.pojos.Library> = fetchRange(Library.LIBRARY.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Long): List<jooq.main.tables.pojos.Library> = fetch(Library.LIBRARY.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Long): jooq.main.tables.pojos.Library? = fetchOne(Library.LIBRARY.ID, value)

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfTitle(lowerInclusive: String?, upperInclusive: String?): List<jooq.main.tables.pojos.Library> = fetchRange(Library.LIBRARY.TITLE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    fun fetchByTitle(vararg values: String): List<jooq.main.tables.pojos.Library> = fetch(Library.LIBRARY.TITLE, *values)
}
