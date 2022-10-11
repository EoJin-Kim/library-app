package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.book.Book
import com.group.libraryapp.domain.user.loanhistory.UserLoanHistory
import org.springframework.data.jpa.repository.JpaRepository

interface UserLoanHistoryRepository : JpaRepository<UserLoanHistory,Long>{
    fun findByBookNameAndIsReturn(bookName:String,isReturn:Boolean):UserLoanHistory?
}