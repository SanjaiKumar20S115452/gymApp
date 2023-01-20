package com.example.di

import com.example.repository.CardioRepository
import com.example.repository.CardioRepositoryImpl
import com.example.repository.StrengtheningRepository
import com.example.repository.StrengtheningRepositoryImpl
import org.koin.dsl.module

val cardioModule = module {
    single<CardioRepository> {
        CardioRepositoryImpl()
    }
}

val strengthModule = module {
    single<StrengtheningRepository> {
        StrengtheningRepositoryImpl()
    }
}