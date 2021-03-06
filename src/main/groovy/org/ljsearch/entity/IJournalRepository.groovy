package org.ljsearch.entity

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by Pavel on 9/29/2015.
 */
interface IJournalRepository extends JpaRepository<Journal,String> {
    List<Journal> findByPrrivate(boolean isPrivate)
}
