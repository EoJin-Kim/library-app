package com.group.libraryapp

import org.junit.jupiter.api.*

class JunitTest {


    companion object{
        @JvmStatic
        @BeforeAll
        fun beforeAll(){
            println("모든 테스트 시작 전")
        }

        @JvmStatic
        @AfterAll
        fun afterAll(){
            println("모든 테스트 시작 후")
        }

    }
    @BeforeEach
    fun beforeEach(){
        println("각 테스트 시작 전")
    }
    @Test
    fun Test1(){
        println("테스트 1")
    }


    @Test
    fun Test2(){
        println("테스트 2")
    }
    @AfterEach
    fun afterEach(){
        println("테스트 후")
    }
}