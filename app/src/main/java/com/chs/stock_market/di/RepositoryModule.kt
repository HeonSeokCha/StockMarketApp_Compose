package com.chs.stock_market.di

import com.chs.stock_market.data.csv.CSVParser
import com.chs.stock_market.data.csv.CompanyListingsParser
import com.chs.stock_market.data.csv.IntraDayInfoParser
import com.chs.stock_market.data.repository.StockRepositoryImpl
import com.chs.stock_market.domain.model.CompanyListing
import com.chs.stock_market.domain.model.IntraDayInfo
import com.chs.stock_market.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntraDayInfoParser(
        intraDayInfoParser: IntraDayInfoParser
    ): CSVParser<IntraDayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}