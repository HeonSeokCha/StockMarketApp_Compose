package com.chs.stock_market.domain.repository

import com.chs.stock_market.domain.model.CompanyInfo
import com.chs.stock_market.domain.model.CompanyListing
import com.chs.stock_market.domain.model.IntraDayInfo
import com.chs.stock_market.util.Resource
import kotlinx.coroutines.flow.Flow


interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntraDayInfo(
        symbol: String
    ): Resource<List<IntraDayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}